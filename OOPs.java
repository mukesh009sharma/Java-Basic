//Question: Create a Person class with attributes name and age. Create a subclass Employee that adds an attribute salary. Write methods to display the details of both Person and Employee



import java.util.Scanner;

class Person {

    private String name;
    private int age;

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class Employee extends Person {

    int Salary;

    Employee(String name, int age, int Salary) {
        setDetails(name, age);
        this.Salary = Salary;
    }

    String getDetails() {
        return "Name: " + getName() + " Age: " + getAge() + " Salary: " + this.Salary;
    }

}

public class _1_Driver_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your Salary: ");
        int Salary = scanner.nextInt();

        Employee employee = new Employee(name, age, Salary);

        System.out.println(employee.getDetails());
        scanner.close();
    }
}
