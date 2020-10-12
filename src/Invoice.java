import java.util.Scanner;

public class Invoice {
    private String number;
    private String description;
    public int quantity;
    private double prisePer;
    public Invoice(){
        Scanner input =new Scanner(System.in);
        System.out.println("Insert numbers");
        String number=input.nextLine();

        System.out.println("Insert Description");
        String description=input.nextLine();

        System.out.println("Insert Quantity");
        int quantity=input.nextInt();
        if(quantity<0){
            quantity=0; }
        System.out.println("Insert Price");
        double prisePer=input.nextDouble();
        if(prisePer<0){
            prisePer=0.0;
        }

        setNUMB(number);
        setDESC(description);
        setQUANTITY(quantity);
        setPRICE(prisePer);

    }

    public void setPRICE(double prisePer) {
        this.prisePer=prisePer;
    }

    public double getPrisePer() { return prisePer; }
    public void setQUANTITY(int quantity) {
        this.quantity=quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setDESC(String description) {
        this.description =description;
    }
    public String getDescription() {
        return description;
    }

    public String getNumber() {
        return number;
    }

    public void setNUMB(String number) {
        this.number=number;
    }

    public double getInvoiceAmount(){
        return quantity*prisePer;
    }
}
