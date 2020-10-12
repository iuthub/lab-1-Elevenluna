import java.util.Scanner;

public class SalesCalc {

        public static void SalesCalcs() {
            Scanner input = new Scanner(System.in);
            double total = 200;
            int ITEM1 = 240;
            int ITEM2 = 140;
            int ITEM3 = 35;
            int ITEM4 = 350;
            System.out.println("Insert quantity of ITEM1 =  ");
            int item1=input.nextInt();
            System.out.println("Insert quantity of ITEM2  =");
            int item2=input.nextInt();
            System.out.println("Insert quantity of ITEM3  =");
            int item3=input.nextInt();
            System.out.println("Insert quantity of ITEM4  =");
            int item4=input.nextInt();
            total= total+(item1*ITEM1+item2*ITEM2+item3*ITEM3+item4*ITEM4)*0.09;
            System.out.println("Total earnings= " + total);





        }
}
