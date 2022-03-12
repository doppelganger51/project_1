import java.util.Random;
import java.util.Scanner;


public class project_1 {
    public static void main(String[] args) {
        Auto auto = new Auto("czerwone", 100);
        //auto.kolor = "czerwone";
        //auto.prędkość = 100;
        auto.jedzie();

    //int [][] array = new int[9][9];
    //int[] array = new int[100];
    //Random rnd = new Random();
 /*
    String dzialanie = "0";

        while (true) {
            System.out.println("Randomowe liczby od 0-10. Wpisz liczbę od 0 do 10. Jeśli chcesz wyjść wpisz (x)");
            System.out.println("Podaj liczbe");
            Scanner sc = new Scanner(System.in);
            dzialanie = sc.next();
            if (dzialanie.equals("x")) {
                break;
            }
            int liczba = rnd.nextInt(0, 10);
            System.out.println("Moja liczba to: " + String.valueOf(liczba) + ", twoja liczba to: " + dzialanie);
            if (liczba != Integer.parseInt(dzialanie)) {
                System.out.println("Przegrałeś");
            }
            if (liczba == Integer.parseInt(dzialanie)) {
                System.out.println("Gratyluję, wygrałeś!");
            }
        }

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++){
            array[i][j] = i+10;
            System.out.print((array[i] [j])+"|");
        }
        System.out.println();
    }
  */


/*
int a = 10;
int b =100;
System.out.println(sum(a,b));
}
public static int sum (int a, int b){
return a+b;
*/

        /*
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
/*
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
*/
        /*
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
        */
    }
}
