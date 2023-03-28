package Final_Exam_4;

import java.util.*;

public class P03_HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> heroesMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] inputData = scanner.nextLine().split(" ");
            //"{hero name} {HP} {MP}"
            String heroName = inputData[0];
            int hitPoints = Integer.parseInt(inputData[1]);
            int manaPoints = Integer.parseInt(inputData[2]);

            heroesMap.putIfAbsent(heroName, new ArrayList<>());
            heroesMap.get(heroName).add(0, hitPoints);
            heroesMap.get(heroName).add(1, manaPoints);
        }

        String commands = scanner.nextLine();
        while (!commands.equals("End")) {
            if (commands.contains("CastSpell")) {
                castSpell(heroesMap, commands);
            } else if (commands.contains("TakeDamage")) {
                takeDamage(heroesMap, commands);
            } else if (commands.contains("Recharge")) {
                rechargeMP(heroesMap, commands);
            } else if (commands.contains("Heal")) {
                heal(heroesMap, commands);
            }
            commands = scanner.nextLine();
        }
        printAll(heroesMap);

    }

    private static void printAll(Map<String, List<Integer>> heroesMap) {
        heroesMap.forEach((key, value) -> {
            System.out.println(key);
            System.out.println("  HP: " + value.get(0));
            System.out.println("  MP: " + value.get(1));
        });
    }

    private static void heal(Map<String, List<Integer>> heroesMap, String commands) {
        //"Heal – {hero name} – {amount}"
        String heroName = commands.split(" - ")[1];
        int hitPoints = Integer.parseInt(commands.split(" - ")[2]);

        int currentHP = heroesMap.get(heroName).get(0);

        int totalHP = currentHP + hitPoints;

        if (totalHP > 100) {
            totalHP = 100;
        }

        System.out.printf("%s healed for %d HP!%n", heroName, totalHP - currentHP);
        heroesMap.get(heroName).set(0, totalHP);
    }

    private static void rechargeMP(Map<String, List<Integer>> heroesMap, String commands) {
        //"Recharge – {hero name} – {amount}"
        String heroName = commands.split(" - ")[1];
        int manaPoints = Integer.parseInt(commands.split(" - ")[2]);

        int currentMP = heroesMap.get(heroName).get(1);

        int totalMP = currentMP + manaPoints;

        if (totalMP > 200) {
            totalMP = 200;
        }
        System.out.printf("%s recharged for %d MP!%n", heroName, totalMP - currentMP);
        heroesMap.get(heroName).set(1, totalMP);
    }

    private static void takeDamage(Map<String, List<Integer>> heroesMap, String commands) {
        //"TakeDamage – {hero name} – {damage} – {attacker}"
        String heroName = commands.split(" - ")[1];
        int damage = Integer.parseInt(commands.split(" - ")[2]);
        String attacker = commands.split(" - ")[3];

        int currentHP = heroesMap.get(heroName).get(0);

        int hpLeft = currentHP - damage;

        if (hpLeft > 0) {
            heroesMap.get(heroName).set(0, hpLeft);
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, hpLeft);
        } else {
            System.out.printf("%s has been killed by %s!%n", heroName, attacker);
            heroesMap.remove(heroName);
        }
    }

    private static void castSpell(Map<String, List<Integer>> heroesMap, String commands) {
        //"CastSpell – {hero name} – {MP needed} – {spell name}"
        String heroName = commands.split(" - ")[1];
        int manaPoints = Integer.parseInt(commands.split(" - ")[2]);
        String spellName = commands.split(" - ")[3];

        int currentMP = heroesMap.get(heroName).get(1);

        if (currentMP >= manaPoints) {
            int leftMP = currentMP - manaPoints;
            heroesMap.get(heroName).set(1, leftMP);
            System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, leftMP);
        } else {
            System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
        }
    }
}
