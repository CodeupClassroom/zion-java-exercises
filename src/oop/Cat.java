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

    protected void goToTheBathroom() {
        System.out.printf("%s uses the kitty litter box.",
                this.name);
    }

    void run(){
        super.eat("catfood");
        System.out.printf("Run %s run!%n", this.name);
        super.run();
    }

    private void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        final Cat cat = new Cat("Chewie");
        Dog dog = new Dog();
        dog.species = "dog";
        Animal fish = new Animal();
        fish.species = "fish";
        Animal horse = new Animal();
        horse.species = "horse";
        cat.setName("Smudge");

        Animal[] zoo = //new Animal[4];
                {cat,dog,fish,horse};

        for (Animal animal : zoo) {
            animal.eat("food");
        }
//        cat.eat("catfood");

//        cat.run();
//        cat.goToBathroom();
//        System.out.println(cat.birthdate);
    }
}
