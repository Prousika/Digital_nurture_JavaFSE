package junitDemo;

import java.util.ArrayList;

public class Library {

    private ArrayList<String> books=new ArrayList<>();

    public void addBook(String book){

        books.add(book);

    }

    public boolean removeBook(String book){

        return books.remove(book);

    }

    public boolean searchBook(String book){

        return books.contains(book);

    }

    public int getBookCount(){

        return books.size();

    }

}
