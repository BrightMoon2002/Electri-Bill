package view;

import control.Manager;
import model.Guest;
import model.Speedometer;

import java.util.ArrayList;
import java.util.Scanner;

public class MainElectricBill {
    public static void main(String[] args) {
        System.out.println("Electric Manager: Author is Nguyễn Hoàng Duy - C0821H1");


        ArrayList<Guest> guestArrayList = new ArrayList<>();
        ArrayList<Speedometer> speedometerArrayList = new ArrayList<>();
        Manager HDElectric = new Manager(guestArrayList, speedometerArrayList);
        menuElectric(HDElectric);


    }

    public static void menuElectric(Manager manager) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add new Guest");
            System.out.println("2.  remove new Guest");
            System.out.println("3. set Guest by index");
            System.out.println("4. calculator Bill");
            System.out.println("5. Display list Guest");
            System.out.println("6. Display list Bill");
            System.out.println("Enter your choice:");
            System.out.println("5. Exit");
            Scanner inputChoice = new Scanner(System.in);
            int choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    manager.addGuest(creatNewGuest());
                    break;
                case 2:
                    manager.removeGuest(getIndex());
                    break;
                case 3:
                    manager.setGuest(getIndex(), creatNewGuest());
                    break;
                case 4:
                    checkBill(manager);
                    break;
                case 5:
                    manager.showAllGuestList();
                    break;
                case 6:
                    manager.showAllMeterList();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void checkBill(Manager manager) {
        String codeGuest = inputCodeGuest();
        Guest guest = manager.searchGuest(codeGuest);
        if (guest != null) {
            double money = calculatorBill(manager, guest);
            System.out.println(money);
        } else {
            System.out.println("No Guest has this code");
        }
    }

    private static String inputCodeGuest() {
        System.out.println("Enter code of Guest:");
        Scanner inputCodeGuest = new Scanner(System.in);
        return inputCodeGuest.nextLine();
    }

    private static double calculatorBill(Manager manager, Guest guest) {
        System.out.println("Enter the old number:");
        Scanner inputOldNumber = new Scanner(System.in);
        int oldNumber = inputOldNumber.nextInt();
        System.out.println("Enter the new number:");
        Scanner inputNewNumber = new Scanner(System.in);
        int newNumber = inputNewNumber.nextInt();
        Speedometer speedometer = new Speedometer(oldNumber, newNumber, guest);
        manager.addMeter(speedometer);
        return speedometer.getRealMoney();
    }

    private static int getIndex() {
        System.out.println("Enter the index of Guest who you want to remove");
        Scanner inputIndexRemove = new Scanner(System.in);
        return inputIndexRemove.nextInt();
    }

    private static Guest creatNewGuest() {
        System.out.println("Enter the Guest Name:");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        System.out.println("Enter the number House:");
        Scanner inputNumber = new Scanner(System.in);
        String number = inputNumber.nextLine();
        System.out.println("Enter the codeMeter");
        Scanner inputCode = new Scanner(System.in);
        String code = inputCode.nextLine();
        return new Guest(name, number, code);
    }
}
