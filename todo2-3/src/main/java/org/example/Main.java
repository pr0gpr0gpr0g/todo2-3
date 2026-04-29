package org.example;

import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int exit;

        do {
            System.out.println("\nМеню");
            System.out.println("1. Добавить");
            System.out.println("2. Просмотреть");
            System.out.println("3. Удалить");
            System.out.println("4. Выход");
            System.out.print("Напишите номер необходимого действия: ");
            exit = scanner.nextInt();
            scanner.nextLine();

            switch (exit) {
                case 1:
                    addTask(scanner, tasks);
                    break;
                case 2:
                    viewTasks(tasks);
                    break;
                case 3:
                    deleteTask(scanner, tasks);
                    break;
                case 4:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Введите другой номер действи: ");
            }
        } while (exit != 4);
    }

    public static void addTask(Scanner scanner, ArrayList<String> tasks) {
        System.out.print("Введите данные: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Задача добавлена");
    }

    public static void viewTasks(ArrayList<String> tasks) {
        System.out.println("Список задач: ");
        if (tasks.isEmpty()) {
            System.out.println("Задач не обнаружено");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void deleteTask(Scanner scanner, ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("Задач не обнаружено");
        } else {
            System.out.println("Введите номер задачи: ");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
            int index = scanner.nextInt();
            scanner.nextLine();
            if (index > 0 && index <= tasks.size()) {
                tasks.remove(index - 1);
                System.out.println("Задача удалена");
            } else {
                System.out.println("Такой задачи не найдено");
            }
        }
    }
}
