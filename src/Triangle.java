public class Triangle {
    public static void tri(){
        int rows = 10;
        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(" * "); }
            System.out.println();}
        System.out.println();

        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(" * ");}
            System.out.println();}
        System.out.println();


        for(int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("  ");
        }

        for(int i = 10; i >= 1; i--) {
            for (int j = 1; j <= rows; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(' ');
        }
    }

}
