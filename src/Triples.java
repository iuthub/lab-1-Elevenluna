import java.util.Scanner;

public class Triples {
    public static void trip()
    { Scanner input = new Scanner(System.in);


        System.out.println("Insert max value between 5 and 500 =");
        int max = input.nextInt();
        int a=0;
        int b=0;
        int c = 0;
        int D = 2;
        while (c < max) {
            if (max > 500) {
                System.out.println("Maximum value = 500");
                System.exit(1);
            }
            else {
                for (int n = 1; n < D; ++n) {
                    a = D * D - n * n;
                    b = 2 * D * n;
                    c = D * D + n * n;
                    if (c > max) {
                        break;
                    }
                    System.out.println(" " + a + " " + b + " " + c + " ");
                }
                D++;
            }
        }


    }}
