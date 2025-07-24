package designpatterns.builder;

public class User {
    private String name;
    private int age;

    private User(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder{
        private String name;
        private int age;
        private String address;
        private long securityNumber;
        public Builder name(String name){this.name = name; return this;}
        public Builder age(int age){this.age = age; return this;}
        public Builder address(String address){this.address = address; return this;}
        public Builder securityNumber(long securityNumber){this.securityNumber = securityNumber; return this;}
        public User build(){return new User(this);}
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        User user = new Builder()
                .name("Nicolas")
                .age(42)
                .address("Tribulato 746")
                .securityNumber(111)
                .build();
        System.out.println(user.toString());
    }
}