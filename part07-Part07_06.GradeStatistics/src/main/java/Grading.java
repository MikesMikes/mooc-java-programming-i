
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author micha
 */
public class Grading {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Grading() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoints(int points) {
        this.points.add(points);
    }

    public double average() {
        int sum = 0;
        for (int i : points) {
            sum += i;
        }

        return (1.0 * sum) / points.size();
    }

    public double passingAvg() {
        double passed = 0.0;
        int numOfPassed = 0;
        for (int i : points) {
            if (i >= 50) {
                passed += i;
                numOfPassed++;
            }
        }

        if (passed < 50) {
            return -1;
        }

        return passed / numOfPassed;
    }

    public double passPercentage() {
        int i = 0;
        for (int j : points) {
            if (j >= 50) {
                i++;
            }
        }
        return 100.0 * i / points.size();
    }

    public void addPointsToGrades(int points) {
        this.grades.add(pointsToGrade(points));
    }

    public int pointsToGrade(int point) {

        if (point >= 90) {
            return 5;
        }
        if (point >= 80) {
            return 4;
        }
        if (point >= 70) {
            return 3;
        }
        if (point >= 60) {
            return 2;
        }
        if (point >= 50) {
            return 1;
        }
        return 0;

    }

    public void printGrades() {
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j : grades) {
                if (j == i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }

}
