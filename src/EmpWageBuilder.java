import java.util.Random;
import java.util.Scanner;

public class EmpWageBuilder{
    public static void main(String[] args) {
        final int F=20;
        final int W=8;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int k = r.nextInt() % 2;
        switch(k){
            case 0:
                int t=W*F;
                System.out.println("Total Wage Is="+t+"$");
                break;
            default:
                System.out.println("The Total Wage is 56$");
                break;
        }

    }
}

