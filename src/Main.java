import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        StepTracker stepTracker = new StepTracker();
        stepTracker.setStepsPerDay(10, 6, 666);

        stepTracker.printDays(7);


    }


    private static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println();

        System.out.println("1. Ввести количество шагов за определенный день");
        System.out.println("2. Напечатать статистику за определенный месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("4. Выйти из приложения");
    }
}
