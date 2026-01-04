package com.linkedlist.doublylinkedlist.moviemanagement;

import java.util.Scanner;

//Main class to run Movie Management System
public class MovieApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     MovieDoublyLinkedList movies =
             new MovieDoublyLinkedList();

     int choice;

     do {
         System.out.println("\nMovie Management Menu");
         System.out.println("1. Add Movie at Beginning");
         System.out.println("2. Add Movie at End");
         System.out.println("3. Add Movie at Position");
         System.out.println("4. Remove Movie by Title");
         System.out.println("5. Search Movie");
         System.out.println("6. Update Movie Rating");
         System.out.println("7. Display Movies Forward");
         System.out.println("8. Display Movies Reverse");
         System.out.println("9. Exit");
         System.out.print("Enter your choice: ");

         choice = sc.nextInt();
         sc.nextLine();

         switch (choice) {

             case 1:
             case 2:
             case 3:
                 if (choice == 3) {
                     System.out.print("Position: ");
                     int pos = sc.nextInt();
                     sc.nextLine();
                     addMovie(sc, movies, choice, pos);
                 } else {
                     addMovie(sc, movies, choice, 0);
                 }
                 break;

             case 4:
                 System.out.print("Enter Movie Title: ");
                 movies.removeByTitle(sc.nextLine());
                 break;

             case 5:
                 System.out.print("Director: ");
                 String dir = sc.nextLine();
                 System.out.print("Rating: ");
                 double rate = sc.nextDouble();
                 movies.searchMovie(dir, rate);
                 break;

             case 6:
                 System.out.print("Movie Title: ");
                 String title = sc.nextLine();
                 System.out.print("New Rating: ");
                 double newRate = sc.nextDouble();
                 movies.updateRating(title, newRate);
                 break;

             case 7:
                 movies.displayForward();
                 break;

             case 8:
                 movies.displayReverse();
                 break;

             case 9:
                 System.out.println("Exiting Movie Management System");
                 break;

             default:
                 System.out.println("Invalid choice");
         }

     } while (choice != 9);

     sc.close();
 }

 // Helper method to take movie input
 private static void addMovie(Scanner sc,
                              MovieDoublyLinkedList movies,
                              int choice, int position) {

     System.out.print("Movie Title: ");
     String title = sc.nextLine();

     System.out.print("Director: ");
     String director = sc.nextLine();

     System.out.print("Release Year: ");
     int year = sc.nextInt();

     System.out.print("Rating: ");
     double rating = sc.nextDouble();
     sc.nextLine();

     if (choice == 1) {
         movies.addAtBeginning(title, director, year, rating);
     } else if (choice == 2) {
         movies.addAtEnd(title, director, year, rating);
     } else {
         movies.addAtPosition(position, title, director, year, rating);
     }
 }
}

