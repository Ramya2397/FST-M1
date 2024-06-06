package org.example;

public class Activity5 {
    abstract static class Book {
        String title;
        //Abstract method
        abstract void setTitle(String s);

        //Concrete method
        String getTitle() {
            return title;
        }
    }

    static class MyBook extends Book {
        //Define abstract method
        public void setTitle(String s) {
            title = s;
        }
    }


    public static void main(String[] args) {


            //Initialize title of the book
            String title = "Hover Car Racer";
            //Create object for MyBook
            Book newNovel = new MyBook();
            //Set title
            newNovel.setTitle(title);

            //Print result
            System.out.println("The title is: " + newNovel.getTitle());
        }
    }

