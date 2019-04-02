package oop;

import java.util.Date;

 public  class Animal  {
    public String species;
    public Date birthdate;

    public Animal() {
        this.birthdate = new Date();
    }

    protected void goToBathroom(int number) {
        if (number == 1)
            System.out.printf("Every body does it");
        else
            System.out.printf("Yeah, sorry");
    }

    void run() {
        System.out.printf("See the %s run%n", this.species);
    }

    public void eat(String food) {
        System.out.printf("The %s eats the %s\n", this.species, food);
    }
    //public  void breathe();
}
