package Week02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input!");
                continue;
            }

            switch (choice) {

                case 1:
                    try {
                        System.out.print("Enter Book ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();

                        System.out.print("Enter ISBN: ");
                        String isbn = sc.nextLine();

                        System.out.print("Enter Publication Year: ");
                        int year = Integer.parseInt(sc.nextLine());

                        library.addBook(
                                new Book(id, title, author, isbn, year));

                    } catch (Exception e) {
                        System.out.println("Invalid data entered!");
                    }
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    try {
                        System.out.print("Enter Book ID to update: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter New Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter New Author: ");
                        String author = sc.nextLine();

                        System.out.print("Enter New ISBN: ");
                        String isbn = sc.nextLine();

                        System.out.print("Enter New Publication Year: ");
                        int year = Integer.parseInt(sc.nextLine());

                        library.updateBook(id, title, author, isbn, year);

                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Enter Book ID to delete: ");
                        int id = Integer.parseInt(sc.nextLine());

                        library.deleteBook(id);

                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}