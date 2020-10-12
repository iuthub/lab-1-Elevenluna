import java.util.Scanner;

public class BMICalc {
    public static double calculator(double weight,double height){
        double BMIIndex=weight/(Math.pow(height,2));
        return BMIIndex;  }

    public static String getCategoryBMI(double weight,double height){
        double BmiIndex=BMICalc.calculator(weight,height);
        if(BmiIndex<18.5){
            return "Underweight"; }
        else if(BmiIndex>=18.5 && BmiIndex<25){
            return "Normal"; }
        else if(BmiIndex>=25 && BmiIndex<30){
            return "Overweight"; }
        else{
        return "Obese";}
    }
}
