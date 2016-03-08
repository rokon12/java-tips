package com.bazlur.tips;


import java.io.*;
import java.rmi.Remote;

/**
 * @author Bazlur Rahman Rokon
 * @since 4/7/16.
 */
public class Person implements Serializable, Cloneable, Remote{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public static void main(String[] args) {
        String filename = "person.ser";

        Person p = new Person("Bazlur", "Rahman");
        System.out.println("Before Serialization: ");
        System.out.println("name: " + p.getFirstName() + " " + p.getLastName());

        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(p);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fis);
            Person fromSerializedPerson = (Person) in.readObject();
            in.close();
            System.out.println("Restored from Serialization: ");
            System.out.println("name: " + fromSerializedPerson.getFirstName() + " " + fromSerializedPerson.getLastName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
