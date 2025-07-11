package practice;

// Define a record named 'Student' with components 'name' (String) and 'age' (int)
record Student(String name, int age) { }

public class RecordImplExample {

    public static void main(String[] args) {
        // Create an instance of the Student record
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        Student student3 = new Student("Alice", 20);

        // Access components using accessor methods (automatically generated)
        /*System.out.println("Student 1 Name: " + student1.name());
        System.out.println("Student 1 Age: " + student1.age());

        System.out.println("Student 2 Name: " + student2.name());
        System.out.println("Student 2 Age: " + student2.age());

        System.out.println("Student 3 Name: " + student3.name());
        System.out.println("Student 3 Age: " + student3.age());*/

        // Records automatically provide equals(), hashCode(), and toString()
        System.out.println("student1 -> " + student1); // Output: Student[name=Alice, age=20]
        System.out.println("student2 -> " + student2); // Output: Student[name=Bob, age=22]
        System.out.println("student3 -> " + student3); // Output: Student[name=Alice, age=20]
        System.out.println("Are student1 and student2 equal? // Output: false --> " + student1.equals(student2)); // Output: false
        System.out.println("Are student1 and student3 equal? // Output: true --> " + student1.equals(student3)); // Output: true
    }

}
