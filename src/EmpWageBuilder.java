import java.util.Random;
import java.util.Scanner;

public class EmpWageBuilder{
    public static void main(String[] args) {
        final int Emp_Daily_Wages=20;
        final int Emp_Per_Hours=8;
        final int Emp_Tem_Hours=4;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<=20;i++) {
            int k = r.nextInt() % 2;
            switch (k) {
                case 1:
                    System.out.println("Employee is Present");
                    Random v = new Random();
                    int d = v.nextInt() % 2;
                    switch (d) {
                        case 1:
                            int Total = Emp_Per_Hours * Emp_Daily_Wages;
                            System.out.println("The Employee is Permanent & Salary is=" + Total + "$");
                            break;
                        default:
                            Total = Emp_Daily_Wages * Emp_Tem_Hours;
                            System.out.println("The Employee is Temporary & Salary is=" + Total + "$");
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
}

