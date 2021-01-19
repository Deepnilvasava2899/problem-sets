import java.util.Scanner;

class Scanto {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();
	float weight = myObj.nextFloat();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
	System.out.println("Weight" + weight);
    System.out.println("Salary: " + salary);
  }
}