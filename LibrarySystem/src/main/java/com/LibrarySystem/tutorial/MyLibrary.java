package com.LibrarySystem.tutorial;

import com.LibrarySystem.tutorial.*;
//import com.sun.java.util.jar.pack.Instruction;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: julina
 * Date: 2/18/14
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyLibrary {

    ArrayList<Book> books;
    private ArrayList<Person> people;
    private String name;

    public MyLibrary(String value)
    {
        this.name=value;
        books= new ArrayList<Book>();
        people= new ArrayList<Person>();

    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Book> getBooks()
    {
        return books;
    }

    public void addBooks(Book b1)
    {
        this.books.add(b1);
    }

    public ArrayList<Person> getPeople()
    {
        return people;
    }

    public void addPerson(Person p1)
    {
        this.people.add(p1);
    }

    public void removeBooks(Book b2)
    {
        this.books.remove(b2);
    }

    public  void removePerson(Person p2)
    {
        this.people.remove(p2);

    }
    public boolean checkOut(Book b,Person p)   //assign the book b to person p if book b has not been taken by anyone
                                                //and person p has not taken book more than 3
    {
        int noOfBooks= this.getBooksForPerson(p).size();

        if (b.getPerson()==null && noOfBooks<p.getMaximumBooks())
        {
            b.setPerson(p);
            return  true;
        }
        else
            return false;

    }

    public  boolean checkIn(Book b)                     //release the book
    {
        if(b.getPerson()!= null)
        {
            b.setPerson(null);
            return true;
        }
        else
            return false;
    }

    public ArrayList<Book> getBooksForPerson(Person p)
    {
       ArrayList<Book> result = new ArrayList<Book>();
        for (Book tmp:this.getBooks())
        {
                if (tmp.getPerson()!=null && (tmp.getPerson().getName().equals(p.getName())))
                {
                    result.add(tmp);
                }
        }

        return  result;
    }


    public  ArrayList<Book> getAvailableBooks()
    {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book tmp:this.getBooks())
        {
            if(tmp.getPerson()==null)
            {
                result.add(tmp);
            }

        }
        return result;
    }

    public  ArrayList<Book> getNotAvailableBooks()
    {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book tmp:this.getBooks())
        {
            if(tmp.getPerson()!=null)
            {
                result.add(tmp);

            }
        }
        return  result;
    }

    public String toString()
    {
        return this.getName()+":"+
                this.getBooks().size()+":"+
                this.getPeople().size();
    }

    public static void main(String[] args) {
        MyLibrary M1= new MyLibrary("Test Library");

        Book b1= new Book("Apache Hadoop");
        Book b2= new Book("Websphere MQTT");
        b1.setAuthor("Michelle");
        b2.setAuthor("Julina");
        M1.addBooks(b1);
        M1.addBooks(b2);

        System.out.println("Enter Tittle of Book");
        Scanner input1 = new Scanner(System.in);
        String tittle = input1.nextLine();
        Book b= new Book(tittle);
        M1.addBooks(b);

        Person p1 = new Person();
        Person p2 = new Person();
        p1.setName("Aman");
        p2.setName("Hari");
        M1.addPerson(p1);
        M1.addPerson(p2);

       /* System.out.println("Enter Name of person");
        Scanner input = new Scanner(System.in);
        String name= input.nextLine();
        Person p3= new Person();
        p3.setName(name);*/

        b1.setPerson(p1);
        System.out.println("No of Persons:"+M1.getPeople().size()+"\nNo of Books:"+M1.getBooks().size());

        System.out.println("No of Available Books:"+M1.getAvailableBooks().size());
        System.out.println("No of Booked Books:"+M1.getNotAvailableBooks().size() );




        /*for(Book tmp:M1.getAvailableBooks())
        {
            System.out.println("\nAvailable Books:"+tmp);
        }
        for(Book tmp: M1.getNotAvailableBooks())
        {

        System.out.println("Booked Books:"+tmp);
        }*/

/*
        System.out.println("Press 1: To enter the records" +
                "\n \t 2: To edit the records" +
                "\n \t 3: To view the records");
        Scanner ip= new Scanner(System.in);
        int s= Integer.parseInt(ip.nextLine());


        switch (s)
        {
            case 1:
                System.out.println("Press 1: To enter Person's Record" +
                        "\n \t 2: To enter Book's Record");
                Scanner ip1 = new Scanner(System.in);
                int s1 =Integer.parseInt(ip1.nextLine());
                //    M1.doit(s1);
                break;

            case 2:

                break;
            case 3:
                System.out.println("No of Persons:"+M1.getPeople().size()+"\nNo of Books:"+M1.getBooks().size());

                System.out.println("No of Available Books:"+M1.getAvailableBooks().size());
                System.out.println("No of Booked Books:"+M1.getNotAvailableBooks().size() );
                break;
            default:
                System.out.println("Please select correct option");
                break;
        }


    }*/
    /*public void doit(int s)
    {

        switch (s)
        {
            case 1:
                System.out.println("Enter Name of person");
                Scanner input = new Scanner(System.in);
                String name= input.nextLine();
                Person p3= new Person();
                p3.setName(name);
                break;
            case 2:
                System.out.println("Enter Tittle of Book");
                Scanner input1 = new Scanner(System.in);
                String tittle = input1.nextLine();
                Book b= new Book(tittle);
               // b.setTittle(tittle);
                break;
            default:
                System.out.println("Please select correct option");
                break;


        } */
    }


}
