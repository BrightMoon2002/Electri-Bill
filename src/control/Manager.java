package control;

import model.Guest;
import model.Speedometer;

import java.util.ArrayList;

public class Manager {

    ArrayList<Guest> guestArrayList = new ArrayList<Guest>();
    ArrayList<Speedometer> speedometerArrayList = new ArrayList<>();

    public Manager(ArrayList<Guest> guestArrayList) {
        this.guestArrayList = guestArrayList;
    }



    public Manager() {
    }

    public Manager(ArrayList<Guest> guestArrayList, ArrayList<Speedometer> speedometerArrayList) {
        this.guestArrayList = guestArrayList;
        this.speedometerArrayList = speedometerArrayList;
    }

   public void addGuest(Guest newGuest) {
        guestArrayList.add(newGuest);
   }

   public void removeGuest(int index) {
        guestArrayList.remove(index);
   }

   public void setGuest(int index, Guest guest) {
        guestArrayList.set(index, guest);
   }

   public void addMeter(Speedometer newMeter) {
        speedometerArrayList.add(newMeter);
   }

   public void removeMeterByIndex(int index) {
        speedometerArrayList.remove(index);
   }

   public void setMeterByIndex(int index, Speedometer newMeter) {
        speedometerArrayList.set(index, newMeter);
   }

   public Guest searchGuest(String codeGuest) {
        int index = -1;
        Guest guest = null;
        for (int i = 0; i < speedometerArrayList.size(); i++) {
            if (codeGuest.equals(speedometerArrayList.get(i).getGuest().getNumberHouse())) {
                index = i;
                guest = speedometerArrayList.get(index).getGuest();
            }
        }

       return guest;
   }

   public void showAllGuestList() {
       for (Guest guest: guestArrayList
            ) {
           System.out.println(guest);
       }
   }

   public void showAllMeterList() {
       for (Speedometer speed: speedometerArrayList
            ) {
           System.out.println(speed);
       }
   }

   public double getMoneyByGuest(String codeGuest) {
        double money = -1;
        if (searchGuest(codeGuest) != null) {
           money =  speedometerArrayList.get(speedometerArrayList.indexOf(searchGuest(codeGuest))).getRealMoney();
        }
       return money;
   }


}

