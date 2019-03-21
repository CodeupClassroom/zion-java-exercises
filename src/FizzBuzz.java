public class FizzBuzz {

    public static void main(String[] args) {
//        int top = 60;
//        int i = 1;
//        while (i < top) {
//            String message = "";
//            if (i % 3 == 0) {
//                message += "Fizz";
//            }
//            if (i % 5 == 0) {
//                message += "Buzz";
//            }
//            if (i % 3 != 0 && i % 5 != 0){
//                message += i;
//            }
//            System.out.println(message);
//            i++;
//        }

        for(int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
