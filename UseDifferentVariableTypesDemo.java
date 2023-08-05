import java.util.Scanner;

public class UseDifferentVariableTypesDemo {
    public static void main(String[] args) {
        //Write a Java program to display your name, age, date of birth, educational
        //qualification, Mobile number, height, and weight using variables.

        String name;
        int age;
        String educationalQualification;
        String mobileNumber;
        String dob;
        float height;
        float weight;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter educationalQualification: ");
        educationalQualification = scanner.nextLine();

        System.out.print("Enter dateOfBirth: ");
        dob = scanner.nextLine();

        System.out.print("Enter mobileNumber: ");
        mobileNumber = scanner.nextLine();

        System.out.print("Enter height: ");
        height = scanner.nextFloat();

        System.out.print("Enter weight: ");
        weight = scanner.nextFloat();

        System.out.print("Enter age: ");
        age = scanner.nextInt();

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("dateOfBrith: " + dob);
        System.out.println("educationalQualification: " + educationalQualification);
        System.out.println("mobileNumber " + mobileNumber);
        System.out.println("height: " + height);
        System.out.println("weight: " + weight);
        
        if(scanner != null) {
        	scanner.close();
        }
    }
}
