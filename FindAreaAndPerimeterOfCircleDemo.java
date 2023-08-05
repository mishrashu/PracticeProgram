public class FindAreaAndPerimeterOfCircleDemo {
    public static void main(String[] args) {
        //Write a Java program to find the Area and Perimeter of a circle whose diameter
        //is 14m.(take π value as 3.14)

        double PI = 3.14;
        int diameter = 14;
        System.out.println();
        System.out.println("Area of circle: " + (PI * (diameter / 2) * (diameter / 2)));
        System.out.println("Perimeter of circle: " + (2 * PI * (diameter / 2)));

    }
}
