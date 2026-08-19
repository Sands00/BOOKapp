/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop.books;

/**
 *
 * @author Sandiso
 */
public class book {
    
    private String title;
    private Author writer;

    public book(String title, Author writer) {
        this.title = title;
        this.writer = writer;
    }

    public book(String title, String name) {
        this.title = title;
        Author writer = new Author(name);
        this.writer=writer;
    }
    

    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getWriter() {
        return writer;
    }

    public void setWriter(Author writer) {
        this.writer = writer;
    }
    
    
}
