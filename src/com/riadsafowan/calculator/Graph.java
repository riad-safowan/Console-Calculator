package com.riadsafowan.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
    private static final int X = 100; //size of graph
    private static final int Y = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Point> points = new ArrayList<>();
        float m, r, a, b;
        char ch;
        boolean isDone = false;
        boolean hasGraph = false;
        while (!isDone) {
            System.out.println("1 -> y=mx+b");
            System.out.println("2 -> y=m(x+a)^2+b");
            System.out.println("3 -> y=m(x+a)^3+b");
            System.out.println("4 -> y=+-(r^2-x^2)^.5");
            System.out.println("5 -> y=sin(x)");
            System.out.println("6 -> y=cos(x)");
            System.out.println("7 -> y=tan(x)");
            System.out.println("8 -> y=e^x");
            System.out.println("0 -> Close application");

            System.out.print("Select: ");

            switch (scanner.nextInt()) {
                case 1: {
                    System.out.print("Enter m: ");
                    m = scanner.nextFloat();
                    System.out.print("Enter b: ");
                    b = scanner.nextFloat();
                    if (hasGraph) {
                        System.out.print("Do you want to keep the old graph? y/n : ");
                        ch = scanner.next().charAt(0);
                        if (ch == 'n' || ch == 'N') {
                            points.clear();
                        }
                    }
                    for (int i = -X / 2; i < X / 2; i++) {
                        points.add(new Point(i, (int) (m * i + b)));
                    }
                    hasGraph = true;
                    drawArray(points);
                    break;
                }
                case 2: {
                    System.out.print("Enter m: ");
                    m = scanner.nextFloat();
                    System.out.print("Enter a: ");
                    a = scanner.nextFloat();
                    System.out.print("Enter b: ");
                    b = scanner.nextFloat();
                    if (hasGraph) {
                        System.out.print("Do you want to keep the old graph? y/n : ");
                        ch = scanner.next().charAt(0);
                        if (ch == 'n' || ch == 'N') {
                            points.clear();
                        }
                    }
                    for (int i = -X / 2; i < X / 2; i++) {
                        points.add(new Point(i, (int) (m * Math.pow(i + a, 2) + b)));
                    }
                    hasGraph = true;
                    drawArray(points);
                    break;
                }
                case 3: {
                    System.out.print("Enter m: ");
                    m = scanner.nextFloat();
                    System.out.print("Enter a: ");
                    a = scanner.nextFloat();
                    System.out.print("Enter b: ");
                    b = scanner.nextFloat();
                    if (hasGraph) {
                        System.out.print("Do you want to keep the old graph? y/n : ");
                        ch = scanner.next().charAt(0);
                        if (ch == 'n' || ch == 'N') {
                            points.clear();
                        }
                    }
                    for (int i = -X / 2; i < X / 2; i++) {
                        points.add(new Point(i, (int) (m * Math.pow(i + a, 3) + b)));
                    }
                    hasGraph = true;
                    drawArray(points);
                    break;
                }
                case 4: {
                    System.out.print("Enter r: ");
                    r = scanner.nextFloat();
                    System.out.print("Enter a: ");
                    a = scanner.nextFloat();
                    System.out.print("Enter b: ");
                    b = scanner.nextFloat();
                    if (hasGraph) {
                        System.out.print("Do you want to keep the old graph? y/n : ");
                        ch = scanner.next().charAt(0);
                        if (ch == 'n' || ch == 'N') {
                            points.clear();
                        }
                    }
                    for (int i = -X / 2; i < X / 2; i++) {
                        if (i >= -r && i <= r) {
                            points.add(new Point((int) (i - a), (int) ((int) (Math.pow(Math.pow(r, 2) - Math.pow((i), 2), 0.5)) + b))); //y=+-(r^2-x^2)^.5"
                            points.add(new Point((int) (i - a), (int) ((-1 * (int) (Math.pow(Math.pow(r, 2) - Math.pow((i), 2), 0.5))) + b))); //y=+-(r^2-x^2)^.5"
                        }
                    }
                    hasGraph = true;
                    drawArray(points);
                    break;
                }
                case 5: {
                    if (hasGraph) {
                        System.out.print("Do you want to keep the old graph? y/n : ");
                        ch = scanner.next().charAt(0);
                        if (ch == 'n' || ch == 'N') {
                            points.clear();
                        }
                    }
                    for (int i = -X / 2; i < X / 2; i++) {
                        points.add(new Point(i, (int) (10 * Math.sin(i * .3))));
                    }
                    hasGraph = true;
                    drawArray(points);
                    break;
                }
                case 6: {
                    if (hasGraph) {
                        System.out.print("Do you want to keep the old graph? y/n : ");
                        ch = scanner.next().charAt(0);
                        if (ch == 'n' || ch == 'N') {
                            points.clear();
                        }
                    }
                    for (int i = -X / 2; i < X / 2; i++) {
                        points.add(new Point(i, (int) (10 * Math.cos(i * .3))));
                    }
                    hasGraph = true;
                    drawArray(points);
                    break;
                }
                case 7: {
                    if (hasGraph) {
                        System.out.print("Do you want to keep the old graph? y/n : ");
                        ch = scanner.next().charAt(0);
                        if (ch == 'n' || ch == 'N') {
                            points.clear();
                        }
                    }
                    for (int i = -X / 2; i < X / 2; i++) {
                        points.add(new Point(i, (int) (10 * Math.tan(i * .3))));
                    }
                    hasGraph = true;
                    drawArray(points);
                    break;
                }
                case 8: {
                    if (hasGraph) {
                        System.out.print("Do you want to keep the old graph? y/n : ");
                        ch = scanner.next().charAt(0);
                        if (ch == 'n' || ch == 'N') {
                            points.clear();
                        }
                    }
                    for (int i = -X / 2; i < X / 2; i++) {
                        points.add(new Point(i, (int) Math.ceil(10 * Math.exp(i * .1))));
                    }
                    hasGraph = true;
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
                for (Point point : points) {
                    if (point.x == x) {
                        if (point.y == y) {
                            isPoint = true;
                        }
                    }
                }
                if (isPoint) {
                    System.out.print("$  ");
                    isPoint = false;
                } else if (i == Y / 2 && j == X / 2) {
                    System.out.print("0  ");
                } else if (j == X / 2 || i == Y / 2) {
                    if (j % 10 == 0 && j != X / 2) {
                        System.out.print("|  ");
                    } else {
                        if (i % 10 == 0 && i != Y / 2) {
                            System.out.print("@  ");
                        } else {
                            System.out.print("*  ");
                        }
                    }
                } else {
                    System.out.print("   ");
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

