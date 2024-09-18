package org.example;

public class Person { // org.example paketi altında Person isimli bir sınıf tanımlayınız.

    /*
    Sınıf için 3 tane instance variable tanımlayınız.

    firstname String olmalı, lastName String olmalı age int olmalı.

    Kendiniz Person isimli bir sınıfta olmasını isteyeceğiniz
    3 adet daha instance variable ekleyiniz.

     */

    String firstName;
    String lastName;
    int age;
    int weight;
    int height;
    String gender;


    public Person() {
        System.out.println("Person Constructor");
    }


    // Bu sınıf için firstname, lastname ve age değerlerini alabileceğiniz bir constructor tanımlayınız.
    public Person (String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    /*
    Kendi eklediğiniz parametreleri de kullandığınız bir
    adet daha constructor ekleyerek overloading yapınız.
    Toplamda minimum 2 tane constructor olmalı.
     */

    public Person(String firstName, String lastName, int age, int weight, int height, String gender) {
       /*
       Eklediğiniz constructor metodlarından birinin içerisinden diğerini
       çağırarak constructor chaining yapınız.
        */

        this(firstName , lastName , age);
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public int getAge () {
        return age ;
    }

    public boolean isTeen () {
        return age >= 13 && age < 19;
    }

    public String toString () {
        return firstName + " " + lastName + " " + age + " " + weight + " " + height + " " + gender;
    }

}
