package EXAMS;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class thirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> priceRating = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeOfItems = scanner.nextLine();


        int leftSum = 0;
        int rightSum = 0;

        int twoSumCompare = priceRating.get(entryPoint);
        String position = "";

        switch (typeOfItems) {
            case "cheap":
                for (int leftIndex = entryPoint - 1; leftIndex >= 0; leftIndex--) {
                    int currentElement = priceRating.get(leftIndex);
                    if (twoSumCompare > currentElement) {
                        leftSum += currentElement;
                    }
                }

                for (int rightIndex = entryPoint + 1; rightIndex < priceRating.size(); rightIndex++) {
                    int currentElement = priceRating.get(rightIndex);
                    if (twoSumCompare > currentElement){
                        rightSum += currentElement;
                    }
                }

                break;

            case "expensive":

                for (int leftIndex = entryPoint - 1; leftIndex >= 0; leftIndex--) {
                    int currentElement = priceRating.get(leftIndex);
                    if (twoSumCompare <= currentElement) {
                        leftSum += currentElement;
                    }
                }

                for (int rightIndex = entryPoint + 1; rightIndex < priceRating.size(); rightIndex++) {
                    int currentElement = priceRating.get(rightIndex);
                    if (twoSumCompare <= currentElement){
                        rightSum += currentElement;
                    }
                }

                break;
        }


        if (leftSum >= rightSum) {
            System.out.printf("Left - %d", leftSum);
        } else {
            System.out.printf("Right - %d", rightSum);
        }

    }
}
