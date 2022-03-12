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

        //Tworzymy obiekt Scanner
        Scanner sc = new Scanner(System.in);
        //Deklarujemy zmienną string aby jej później używać
        String dzialanie = "1";
        //warunek pętli while (!-neguje)
        while (true) {
            //Pytamy o dzialanie
            System.out.println("Wyjscie(x),Dodawanie(d),Odejmowanie(o),Mnozenie(m),Dzielenie(dz)");
            System.out.println("Input char");
            dzialanie = sc.next();
            //Przerwanie aplikacji jesli x
            if(dzialanie.equals("x")){
                break;
            }
            //Pytamy o liczby

            System.out.println("Input any digit");
            int pierwsza_liczba = sc.nextInt();

            System.out.println("Input next digit");
            int druga_liczba = sc.nextInt();
/*
            if (dzialanie.equals("+")) {
                add(pierwsza_liczba, druga_liczba);
            }
            if (dzialanie.equals("-")) {
                sub(pierwsza_liczba, druga_liczba);
            }
            if (dzialanie.equals("*")) {
                mul(pierwsza_liczba, druga_liczba);
            }
            if (dzialanie.equals("/")) {
                div(pierwsza_liczba, druga_liczba);
            }

 */
            switch (dzialanie) {
                case "+":
                    add(pierwsza_liczba, druga_liczba);
                    break;
                case "-":
                    sub(pierwsza_liczba, druga_liczba);
                    break;
                case "*":
                    mul(pierwsza_liczba, druga_liczba);
                    break;
                case "/":
                    div(pierwsza_liczba, druga_liczba);
                    break;
                default:
                    System.out.println("Wprowadzono zły znak");
            }
            }
    }

    public static void add (int A, int B){
        System.out.println(String.valueOf(A)+"+"+String.valueOf(B)+"="+(A+B));
    }
    public static void sub (int A, int B){
        System.out.println(String.valueOf(A)+"-"+String.valueOf(B)+"="+(A-B));
    }
    public static void mul (int A, int B){
        System.out.println(String.valueOf(A)+"*"+String.valueOf(B)+"="+(A*B));
    }
    public static void div (int A, int B){
        if (B != 0){
        System.out.println(String.valueOf(A)+"/"+String.valueOf(B)+"="+(A/B));
        }
                System.out.println("Błędne dzialanie, nie wolno dzielić na zero");
    }
}
