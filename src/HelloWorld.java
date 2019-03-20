public class HelloWorld {
    public static void main(String[] args) {
        // boolean *
        // byte
        // short
        // int *
        // long
        // float
        // double *
        // char
        // + - * / %

        // 0000 1000
        // 0000 1001
        // 0111 1111 1111 1111 1111 1111 1111 1111
        // 1000 0000 0000 0000 0000 0000 0000 0000

        byte littleNum = 127;
        int biggerNum = littleNum;
        float imprecisePi = 3.14f;
        System.out.println(imprecisePi);
        final double PI = 3.14159212345;
//        PI += 7; error
        System.out.println(PI);
//        int almostPi = 3;
//        pi = almostPi;

        char letter = 'a';
        char letterb = 'b';
//        letter++;
        System.out.println("" + letter + letterb);

        biggerNum = 2147483647;
        biggerNum++;
        System.out.println(biggerNum);
        biggerNum--;
        System.out.println(biggerNum);
    }
}
