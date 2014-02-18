package com.LibrarySystem.tutorial;

/**
 * Created with IntelliJ IDEA.
 * User: julina
 * Date: 2/18/14
 * Time: 12:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    String tittle;
    String author;
    Person person;
    public Book(String value)
    {
        this.tittle=value;
        this.author="unknownauthor";

    }
    public String getTittle(){
        return  tittle;
    }
    public void setTittle(String value)
    {
        this.tittle=value;
    }

    public String getAuthor()
    {
        return  author;

    }
    public void setAuthor (String value)
    {
        this.author=value;
    }


    public Person getPerson()
    {
        return this.person;
    }

    public void setPerson(Person P1)
    {
        this.person= P1;
    }



}
