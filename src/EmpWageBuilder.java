import java.util.Random;
import java.util.Scanner;

public class EmpWageBuilder{
    public static void main(String[] args) {
        final int F=20;
        final int W=8;
        final int P=4;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int k = r.nextInt() % 2;
        switch(k){
            case 1:

                System.out.println("Employee is Present");
                Random v = new Random();
                int d= v.nextInt()%2;
                switch (d){
                    case 1:
                        int t=W*F;
                        System.out.println("The Employee is Permanent & Salary is="+t+"$");
                        break;
                    default:
                        t=F*P;
                        System.out.println("The Employee is Temporary & Salary is="+t+"$");
                        break;
                }

            case 0:
                System.out.println("Employee is Absent");
                break;
            default:
                System.out.println("LoL");
                break;
        }

    }
}

