package com.riadsafowan.calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GraphCalculator {
    private static final int X = 200; //length of x-axis
    private static final int Y = 100; //length of y-axis

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
            System.out.println("9 -> Draw Differential curve");
            System.out.println("0 -> Close application");

            System.out.print("Select: ");

            switch (scanner.nextInt()) {
                case 1 -> {
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
                }
                case 2 -> {
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
                }
                case 3 -> {
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
                }
                case 4 -> {
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
                }
                case 5 -> {
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
                }
                case 6 -> {
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
                }
                case 7 -> {
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
                }
                case 8 -> {
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
                }
                case 9 -> {
                    drawDifferentialCurve(points);
                    points.clear();
                    hasGraph = false;
                }
                case 0 -> {
                    isDone = true;
                }
            }
        }
    }

    // for drawing an array of point
    private static void drawArray(ArrayList<Point> points) {
        int x;
        int y;
        String buffer = " ";
        StringBuilder graph = new StringBuilder();
        boolean isPoint = false;
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                x = j - X / 2;
                y = Y / 2 - i;
                for (Point point : points) {
                    if (point.x == x) {
                        if (point.y == y) {
                            isPoint = true;
                        }
                    }
                }
                if (isPoint) {
                    graph.append("$").append(buffer);
                    isPoint = false;
                } else if (i == Y / 2 && j == X / 2) {
                    graph.append("0").append(buffer);
                } else if (j == X / 2 || i == Y / 2) {
                    if (j % 10 == 0 && j != X / 2) {
                        graph.append("|").append(buffer);
                    } else {
                        if (i % 10 == 0 && i != Y / 2) {
                            graph.append("|").append(buffer);
                        } else {
                            graph.append("*").append(buffer);
                        }
                    }
                } else {
                    graph.append(" ").append(buffer);
                }
            }
            graph.append("\n");
        }
        System.out.println(graph);
        try {
            FileWriter myWriter = new FileWriter("graph_board.txt");
            myWriter.write(String.valueOf(graph));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void drawDifferentialCurve(ArrayList<Point> points) {
        int size = points.size();
        int y;
        for (int i = 1; i < size - 1; i++) {
            y = ((points.get(i).y - points.get(i - 1).y) / (points.get(i).x - points.get(i - 1).x) +
                    (points.get(i + 1).y - points.get(i).y) / (points.get(i + 1).x - points.get(i).x)) / 2;
            points.add(new Point(points.get(i).x, y));
        }
        drawArray(points);
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

