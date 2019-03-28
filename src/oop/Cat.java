package oop;

public class Cat extends Animal {
    public String name;

    public Cat() {
//        super();
        this.name = "cat";
        this.species = "cat";
    }

    public Cat(String name) {
        //super();
        this.name = name;
        this.species = "cat";
    }

    public void purr() {
        System.out.printf("purrrrrrr\n");
    }

    public void eat(String food) {
        System.out.printf("Meow. %s eats the %s\n",
                this.name, food);
    }

    public void goToTheBathroom() {
        System.out.printf("%s uses the kitty litter box.",
                this.name);
    }

    void run(){
        super.eat("catfood");
        System.out.printf("Run %s run!%n", this.name);
        super.run();
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Chewie");
//        Cat cat = new Cat();
//        cat.species = "cat";
        cat.eat("catfood");
        cat.purr();
        cat.run();
//        cat.goToBathroom();
//        System.out.println(cat.birthdate);
    }
}
