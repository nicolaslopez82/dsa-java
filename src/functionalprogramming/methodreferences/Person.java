package functionalprogramming.methodreferences;

public class Person {
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age) {}

    public void showInfo(String name, int age) {
        System.out.println("Hello, " + name + " " + age);
    }

    public String showName(String name){
        return name;
    }

    public String getName() {
        System.out.println(this.name);
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {this.age = age;}

    public void greeting(){
        System.out.println("Hello, " + this.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
