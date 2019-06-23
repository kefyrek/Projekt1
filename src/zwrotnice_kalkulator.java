import java.util.Scanner;
public class zwrotnice_kalkulator {


            public static void main(String[] args) {
            part5();
        }

        public static void part5() {
            Scanner sc = new Scanner(System.in);
            char d;
            double a, b, c;
            System.out.println("Wykonujemy działania +,-,*,/ na liczbach całkowitych");
            System.out.println("Podaj pierwszą liczbę z przecinkiem dziesiętnym: ");
            a = sc.nextDouble();
            System.out.println("Wybierz działanie: ");
            d = sc.next().charAt(0);
            if ((d!='+')&&(d!='-')&&(d!='*')&&(d!='/')) {
                System.out.println("Nie ma takiego działania!!!");
            } else {
                System.out.println("Podaj drugą liczbę: ");
                b = sc.nextDouble();
                switch(d) {
                    case '+':
                        System.out.println("a + b = " + ( a + b));
                        break;
                    case '-':
                        System.out.println("a - b = " + (a - b));
                        break;
                    case '*':
                        System.out.println("a * b = " + (a * b));
                        break;
                    default:
                        System.out.println("a / b = " +  (a / b));
                        break;
                }
            }
            sc.close();
        }

    }