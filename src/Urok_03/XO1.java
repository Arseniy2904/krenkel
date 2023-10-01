package Urok_03;

import java.util.Scanner;

public class XO1 {
    static Scanner scanner;
    static char[][] map;

    static final int MAP_SISE = 3;
    static final char EMPTY_ICHEIKA = '*';
    static final char X_ICHEIKA = 'X';
    static final char O_ICHEIKA = 'O';

    public static void main(String[] args) {
        init();
        printMap();
        while (true) {
            playerOne();
            printMap();
            if (check()) {
                System.out.println("ничья");
            }


            playerItTechnologies();
            printMap();
            if (check()) {
                System.out.println("ничья");
            }
        }

    }

    private static boolean check() {
        for (int i = 0; i < MAP_SISE; i++) {
            for (int j = 0; j < MAP_SISE; j++) {
                if (map[i][j] == EMPTY_ICHEIKA) {
                    return false;
                }

            }

        }
        return true;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= MAP_SISE || y >= MAP_SISE) {
            return false;
        }
        if (map[x][y] != EMPTY_ICHEIKA) {
            return false;
        }
        return true;

    }

    public static void playerItTechnologies() {
        int x, y;
        System.out.println("Ход компьютера!");
        do {

            x = (int) (Math.random() * MAP_SISE);
            y = (int) (Math.random() * MAP_SISE);
        } while (!isCellValid(x, y));
        map[x][y] = O_ICHEIKA;

    }

    public static void playerOne() {
        int x, y;
        do {
            System.out.println("Введите координаты вашего хода (х и у)");
            System.out.println("Ход игрока!");

            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = X_ICHEIKA;

    }

    private static void printMap() {
        for (int i = 0; i <= MAP_SISE; i++) {
            System.out.print(i + "  ");

        }
        System.out.println();
        for (int i = 0; i < MAP_SISE; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < MAP_SISE; j++) {
                System.out.print(map[i][j] + "  ");

            }
            System.out.println();

        }
        System.out.println();

    }

    public static void init() {
        map = new char[MAP_SISE][MAP_SISE];
        for (int i = 0; i < MAP_SISE; i++) {
            for (int j = 0; j < MAP_SISE; j++) {
                map[i][j] = EMPTY_ICHEIKA;

            }

        }
        scanner = new Scanner(System.in);
    }
}
