package main;

import service.BoardService;
import model.Status;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BoardService service = new BoardService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Move Task");
            System.out.println("3. View Board");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();
                    service.addTask(title);
                    break;

                case 2:
                    System.out.print("Enter task ID: ");
                    int id = sc.nextInt();

                    System.out.println("1. TODO  2. IN_PROGRESS  3. DONE");
                    int statusChoice = sc.nextInt();

                    Status status = Status.values()[statusChoice - 1];
                    service.moveTask(id, status);
                    break;

                case 3:
                    service.displayBoard();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}