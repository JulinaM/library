package com.LibrarySystem.tutorial;

/**
 * Created with IntelliJ IDEA.
 * User: julina
 * Date: 2/18/14
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private String name;
    private int maximumBooks;

    public Person(){
        name="unknown name";
        maximumBooks =3;

    }
    public String getName()
    {
        return name;
    }
    public void setName(String anyname)
    {
        this.name=anyname;
    }

    public int getMaximumBooks()
    {
        return maximumBooks;
    }

    public void setMaximumBooks( int value)
    {
        this.maximumBooks=value;
    }

    public String toString() {
        return this.getName() + " (" + this.getMaximumBooks() +
                " books)";
    }


}
