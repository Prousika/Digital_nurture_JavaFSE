package com.library.service;

import org.springframework.stereotype.Component;

@Component
public class LibraryService {

    public void issueBook(){
        System.out.println("Book Issued");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){

        }
    }

}
