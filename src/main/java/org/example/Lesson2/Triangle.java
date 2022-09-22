package org.example.Lesson2;

public class Triangle {
    public static void main(String[] args) {

        double rectangle1width = 5.5;
        double rectangle1length = 6;

        double rectanglearea = rectangle1length * rectangle1width;
        double rectangleAreaUsingFunction =  CalculaterectangleArea(rectangle1length, rectangle1width);

        System.out.println(rectanglearea);

        System.out.println(rectangleAreaUsingFunction);

        int trianglelength = 4;
        int trianglewidth = 5;

        int trianglearea = Calculatetrianglearea(trianglelength, trianglewidth);

        System.out.println(trianglearea);

    }

    public static double CalculaterectangleArea(double rectanglelength, double rectanglewidth){
        double rectanglarea = rectanglelength * rectanglewidth + 1;
        return rectanglarea;
    }

    public static int Calculatetrianglearea(int trianglelength, int trianglewidth){
        int trianglearea = trianglelength * trianglewidth / 2;
        return trianglearea;
    }


    public static boolean isRectangelBiggerThanTriangle(double rectnagelWidth,
                                                        double rectangleLength,
                                                        int triangleLength,
                                                        int triangleWidth) {
        int areaOfTriangele = Calculatetrianglearea(triangleLength, triangleWidth);
        double areaOfRectangel = CalculaterectangleArea(rectnagelWidth, rectangleLength);

        if (areaOfRectangel > areaOfTriangele) {
            return true;
        } else {
            return false;
        }
    }

}