package oop;

public class RestTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 3000;
        dish.wouldRecommend = true;
        dish.eat();

        System.out.printf("%n%d %s %b",
                dish.costInCents,
                dish.nameOfDish,
                dish.wouldRecommend);

    }
}
