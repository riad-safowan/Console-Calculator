package com.riadsafowan.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
    private static final int X = 100; //size of graph
    private static final int Y = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Point> points = new ArrayList<>();
        float m, c;
        boolean isDone = false;
        while (!isDone) {
            System.out.println("1 -> y=mx+c");
            System.out.println("2 -> y=mx^2+c");
            System.out.println("3 -> y=x^3");
            System.out.println("0 -> Close application");

            System.out.print("Select: ");

            switch (scanner.nextInt()) {
                case 1: {
                    System.out.print("Enter m: ");
                    m = scanner.nextFloat();
                    System.out.print("Enter c: ");
                    c = scanner.nextFloat();
                    points.clear();
                    for (int i = -X / 2; i < X / 2; i++) {
                        points.add(new Point(i, (int) (m * i + c)));
                    }
                    drawArray(points);
                    break;
                }
                case 2: {
                    System.out.print("Enter m: ");
                    m = scanner.nextFloat();
                    System.out.print("Enter c: ");
                    c = scanner.nextFloat();
                    points.clear();
                    for (int i = -X / 2; i < X / 2; i++) {
                        points.add(new Point(i, (int) (m * i * i + c)));
                    }
                    drawArray(points);
                    break;
                }
                case 3: {
                    System.out.print("Enter m: ");
                    m = scanner.nextFloat();
                    System.out.print("Enter c: ");
                    c = scanner.nextFloat();
                    points.clear();
                    for (int i = -X / 2; i < X / 2; i++) {
                        points.add(new Point(i, (int) (m * i * i * i + c)));
                    }
                    drawArray(points);
                    break;
                }
                case 0: {
                    isDone = true;
                }
            }
        }
    }

    // for drawing an array of point
    private static void drawArray(ArrayList<Point> points) {
        int x;
        int y;
        boolean isPoint = false;
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                x = j - Y / 2;
                y = X / 2 - i;
                for (int p = 0; p < points.size(); p++) {
                    if (points.get(p).x == x) {
                        if (points.get(p).y == y) {
                            isPoint = true;
                        }
                    }
                }
                if (isPoint) {
                    System.out.print("$ ");
                    isPoint = false;
                } else if (i == Y / 2 && j == X / 2) {
                    System.out.print("0 ");
                } else if (j == X / 2 || i == Y / 2) {
                    if (j % 10 == 0 && j != X / 2) {
                        System.out.print("| ");
                    } else {
                        if (i % 10 == 0 && i != Y / 2) {
                            System.out.print("@ ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

