/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xlumi
 */
public class Book {
    private String title;
    private String pages;
    private String publication;
    
    public Book (String title, String pages, String publication) {
        this.title = title;
        this.pages = pages;
        this.publication = publication;
    }
    
    public String getName() {
    return this.title;
    }
    
    public String getPages(){
        return this.pages + " pages";
    }
    
    public String getPublication(){
        return this.publication;
    }
    
}
