import java.util.Scanner;

public class LargeNum {
    public static void Large(){
        Scanner input=new Scanner(System.in);
        int large=Integer.MIN_VALUE;
        int large2=Integer.MIN_VALUE;
        for (int i=0;i<10;i++){
            System.out.printf("enter %d numbers to find 2 max numbers = ",i+1);
            int num=input.nextInt();
            if(num>large){
                large2=large;
                large=num;
            }
            else if(num>large2){
                large2=num;
            }

        }
        System.out.printf("first large = %d , second large =%d",large,large2);
    }
    public static void Small(){
        Scanner input=new Scanner(System.in);
        int min =Integer.MAX_VALUE;
        int min2 =Integer.MAX_VALUE;
        for (int i=0;i<10;i++){
            System.out.printf("enter %d numbers to find 2 min numbers = ",i+1);
            int num=input.nextInt();
            if(num< min){
                min2 = min;
                min =num;
            }
            else if(num< min2){
                min2 =num;
            }

        }
        System.out.printf("first min = %d , second min =%d", min, min2);
    }
}
