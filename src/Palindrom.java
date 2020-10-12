import java.util.Scanner;

public class Palindrom {
    public static void Pal(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert a palindrome with (length=5) ==");
        int number = input.nextInt();
        if(number>100000||number<99){
            System.out.println("Not  palindrome inserted ");
            System.exit(1);
        }
        int polind = number;
        int ins =0;
        int reminder;
        while(number > 0)
        { reminder = number % 10;
            ins = ins * 10 + reminder;
            number = number / 10;
        }
        if(ins == polind)
            System.out.println(" Inserted number is palindrome="+ polind);
        else
            System.out.println(" Inserted number is not a palindrome");



    }

}
