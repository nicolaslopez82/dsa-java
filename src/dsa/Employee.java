package dsa;

import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int age;
    private long salary;

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getId() - employee.getId();
    }

    public static Comparator<Employee> COMPARATOR_BY_NAME = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Employee> COMPARATOR_BY_AGE = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getAge() - o2.getAge();
        }
    };

    public static Comparator<Employee> COMPARATOR_BY_SALARY = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            //return (int) (o1.getSalary() - o2.getSalary());
            return Math.toIntExact((int) o1.getSalary() - o2.getSalary());
        }
    };

    public static Comparator<Employee> COMPARATOR_BY_ID_AND_NAME = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if(o1.getId() - o2.getId() == 0){
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getId() - o2.getId();
            }
        }
    };

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        //sorting custom object array
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);
        empArr[4] = new Employee(1, "Nicolas", 42, 100000);

        //Comparable.
        Arrays.sort(empArr);
        System.out.println("Sort by Comparable.");
        System.out.println(Arrays.toString(empArr));

        //Comparator by Name.
        Arrays.sort(empArr, COMPARATOR_BY_NAME);
        System.out.println("Sort by COMPARATOR_BY_NAME.");
        System.out.println(Arrays.toString(empArr));

        //Comparator by Age.
        Arrays.sort(empArr, COMPARATOR_BY_AGE);
        System.out.println("Sort by COMPARATOR_BY_AGE.");
        System.out.println(Arrays.toString(empArr));

        //Comparator by Salary.
        Arrays.sort(empArr, COMPARATOR_BY_SALARY);
        System.out.println("Sort by COMPARATOR_BY_SALARY.");
        System.out.printf(Arrays.toString(empArr));

        System.out.println("");
        //Comparator by Id and Salary if the Id is equal.
        Arrays.sort(empArr, COMPARATOR_BY_ID_AND_NAME);
        System.out.println("Sort by COMPARATOR_BY_ID_AND_NAME.");
        System.out.printf(Arrays.toString(empArr));
    }
}
