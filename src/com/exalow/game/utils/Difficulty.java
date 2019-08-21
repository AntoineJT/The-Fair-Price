package com.exalow.game.utils;

import java.util.*;

public class Difficulty {

    public enum Difficulties {
        EASY(1),
        MEDIUM(5000),
        HARD(10000);

        private int maxPrice;

        Difficulties(int maxPrice) {
            this.maxPrice = maxPrice;
        }

        public int getMaxPrice() {
            return maxPrice;
        }
    }

    private Difficulties d;
    private static String selectedDifficulty;

    public void Difficulty() {

        List<String> difficulties = Arrays.asList("EASY", "MEDIUM", "HARD");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Difficulty : ");

        for (Difficulties d : Difficulties.values()) {
            StringBuilder stringBuilder = new StringBuilder(" - ")
                    .append(d);
            System.out.println(stringBuilder);
        }

        do {
            System.out.print(" \nDifficulty -> ");
            selectedDifficulty = scanner.nextLine().toUpperCase();
        }while (!difficulties.contains(selectedDifficulty));

        System.out.println("\nYou have selected " + selectedDifficulty);

    }

    public static String getSelectedDifficulty() {
        return selectedDifficulty;
    }
}
