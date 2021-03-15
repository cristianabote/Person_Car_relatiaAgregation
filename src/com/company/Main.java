package com.company;

class Person{
    String name;
    int age;

    Person (String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString (){     // functie de printare
        return  "Numele: "+ this.name+", varsta: "+age;
    }
}
class Car{
    String brand;
    int yearModel;
    Person passanger=null; // Agregation - excludem soferul , pasageri sunt doar restul persoanelor aflate in masina

    Car( String brand, int yearModel, Person passanger){
        this.brand=brand;
        this.yearModel=yearModel;
        this.passanger=passanger;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getYearModel(){
        return this.yearModel;
    }
    public Person getPerson(){
        if(passanger!=null) {
            return this.passanger;
        }
        else{
            System.out.println("Nu exista pasageri in masina.");
            return null;
        }

    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person newPerson=new Person("Ionut", 29);
        Car bmw=new Car("BMW", 2018, newPerson);
        System.out.println(bmw.getBrand());
        System.out.println("Pasagerul din masina este "+bmw.getPerson());
        //bmw=null;
        //System.out.println(bmw.getBrand());
        //System.out.println(newPerson);   //Instanta de tip Person nu este stearsa
    }
}
