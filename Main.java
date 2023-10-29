package Lib_Management;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryDaoIntr l1=new LibraryDao();
        System.out.println("Welcome to library management system");
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\n1.Enter a book to enter into library\n2.Show all book in the library\n3.Issue Books from the library\n4.Return issued Book\n5.Delete Book from the library\n6.exit");
            System.out.println("\nEnter Your Choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    Library l=new Library();
                    System.out.println("Enter book id");
                    int id=sc.nextInt();
                    System.out.println("Enter name of book");
                    String name=sc.next();
                    System.out.println("Enter the name of author");
                    String auth= sc.next();
                    l.setId(id);
                    l.setBname(name);
                    l.setAuth(auth);
                    l1.insertBook(l);
                    break;
                case 2:
                    l1.showBooks();
                    break;
                case 3:
                    System.out.println("Enter the id of the book you want to issue");
                    int id1= sc.nextInt();
                    l1.issueBook(id1);
                    break;
                case 4:
                    Library l2=new Library();
                    System.out.println("Enter the id of book you want to return");
                    int id3=sc.nextInt();
                    System.out.println("Enter the name of the book you want to return");
                    String name2=sc.next();
                    System.out.println("What is the name of the author of the book you are returning");
                    String auth2=sc.next();
                    l2.setId(id3);
                    l2.setBname(name2);
                    l2.setAuth(auth2);
                    l1.returnBook(l2);
                    break;
                case 5:
                    System.out.println("Enter the id of the book you want to delete");
                    int id4= sc.nextInt();
                    l1.deleteBook(id4);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct choice");
            }
        }while(true);
    }
}
