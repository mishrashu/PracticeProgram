public class FindAreaAndPerimeterOfRectangleDemo {
    public static void main(String[] args) {
        //Write a Java program to find the Area and perimeter of a rectangle whose length
        //and breadth are 1.7m and 2.2m respectively

        float area;
        float perimeter;
        float length = 1.7f;
        float breadth = 2.2f;

        area = (length * breadth);
        perimeter = 2 * (length + breadth);

        System.out.println("Area: " + area + "\nPerimeter: " + perimeter);

    }
}
