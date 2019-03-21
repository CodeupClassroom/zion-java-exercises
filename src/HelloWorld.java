import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

       for (int i=1;true;i++) {
           if (i>10) break;
           if (i%2!=0) {
               continue;
           }
           System.out.println(i);
       }
    }
}
