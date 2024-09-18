package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John" , "Doe" , 20 ,25 , 90 ,"Female");


        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println(person);

        System.out.println("-----------------");

        Person person2 = new Person("Ufuk" , "Akın" , 10 ,92 , 185 , "Male");

        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println(person2);

        System.out.println("-------------------");

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());



    }
}
