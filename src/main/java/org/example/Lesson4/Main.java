package org.example.Lesson4;

public class Main {


    public static void main(String[] args) {
        int newYposition = moveRobot(0,0);

        newYposition = moveRobot(0,newYposition);


        newYposition =  moveRobot(0,newYposition);


        newYposition = moveRobot(0,newYposition);

        boolean canMove = canRobotMove(2, 2, 0, newYposition);
        if (canMove) {
            moveRobot(0, newYposition);
        }

        boolean isRobotOnTable = isRobotOnTable(2,2, 0, newYposition);

        System.out.println(isRobotOnTable);

    }

    private static boolean isRobotOnTable(int length, int width, int x, int y) {

        if (y < length) {
            return true;
        }

        return false;
    }

    public static boolean canRobotMove(int length, int width, int x, int y) {

        if (y > length) {
            return false;
        }

        if (x > width) {
            return false;
        }

        return true;
    }

    public static int moveRobot(int x, int y) {
        int newYPosition = y + 1;
        return newYPosition;
    }
}
