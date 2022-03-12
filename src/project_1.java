import java.util.Random;
import java.util.Scanner;


public class project_1 {
    public static void main(String[] args) {
/* int[] array = new int[10];
 Random rnd = new Random();

 for (int i = 1; i < array.length; i++) {
     array[i]= rnd.nextInt(10,100);
     System.out.print(array[i] + " ");
*/


    /*
        int a = 10;
        int b =100;
        System.out.println(sum(a,b));
    }
        public static int sum (int a, int b){
        return a+b;
     */


        Scanner sc = new Scanner(System.in);

        String dzialanie = "yt";

        while (dzialanie != "exit") {
            System.out.println("Input any digit");
            int pierwsza_liczba = sc.nextInt();

            System.out.println("Input next digit");
            int druga_liczba = sc.nextInt();

            System.out.println("Input char");
            dzialanie = sc.next();
            System.out.println(dzialanie);

            if (dzialanie.equals("d")) {
                System.out.println("sdasd");
                add(pierwsza_liczba, druga_liczba);
            }
            if (dzialanie == "c") {
                System.out.println("aaaaa");
                sub(pierwsza_liczba, druga_liczba);
            }


        }
    }

    public static void add (int A, int B){
        System.out.println(A+B);
    }
    public static void sub (int A, int B){
        System.out.println(A-B);
    }
    public static void mul (int A, int B){
        System.out.println(A*B);
    }
    public static void div (int A, int B){
        System.out.println(A/B);
    }
}
