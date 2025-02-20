package ru.ifellow.JSchool.introdution;

public class Main {
    public static void main(String[] args) {
        int[][] aNums = {
                {43, 32, 21},
                {18, 56, 12, 11},
                {5, 4, 3, 1},
        };
        FirstSteps fs = new FirstSteps();
        boolean result = fs.isSortedDescendant(aNums);
        System.out.println(result);
    }
}
