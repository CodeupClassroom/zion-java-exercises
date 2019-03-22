public class StringCheese {
    public static void main(String[] args) {
        String cheese = "cheese";
//        System.out.println(cheese);
//        char letter = cheese.charAt(1);
//        System.out.println(letter);
//        int index = cheese.indexOf('s');
//        System.out.println(index);

        String cheese2 = "chees";
        cheese2 += 'e';
        System.out.printf("cheese = %s%n", cheese);
        System.out.printf("cheese2 = %s%n", cheese2);
        if (cheese.equals(cheese2)) {
            System.out.println("cheese is cheese");
        } else {
            System.out.println("can't compare strings like that");
        }

//        System.out.println(cheese.charAt(cheese.length() - 1));
//        System.out.println(cheese.substring(cheese.length() - 1));
        if (cheese.endsWith("esee"))
            System.out.println("snap");
        else
            System.out.println("doh");
//        System.out.println(cheese.substring(2).toUpperCase());

//        .equals()
        // .equalsIgnoreCase()
        // .substring(int)
        // .substring(int,int)
        // .toUpperCase()
        // .toLowerCase()
        // .indexOf(
        // .charAt(int)
        // .startsWith(String)
        // .endsWith(String)
    }
}
