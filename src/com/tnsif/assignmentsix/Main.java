package com.tnsif.assignmentsix;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the size of array
        int n = sc.nextInt();

        // Step 2: Create an array to store student scores
        int[] scores = new int[n];

        // Step 3: Input n scores
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Step 4: Create an ArrayList to store scores
        ArrayList<Integer> scoreList = new ArrayList<>();

        // Step 5: Add array elements to ArrayList
        for (int i = 0; i < n; i++) {
            scoreList.add(scores[i]);
        }

        // Step 6: Display the scores from ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int score : scoreList) {
            System.out.println(score);
        }

        sc.close();
    }
}

