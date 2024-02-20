/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author gills
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Choose your favourite genre from the following list:");
        System.out.println("1. Action\n2. Comedy\n3. Drama\n4. Fantasy");
        System.out.print("Enter the number of your choice: ");
        int choice = scanner.nextInt();
        String genre;
        switch (choice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Fantasy";
                break;
            default:
                genre = "Unknown";
                break;
        }
        System.out.println("UserProfile created for " + name + " with favourite genre: " + genre);
        scanner.close();
    }
}
