import java.util.Random;

public class EmpWageBuilder {
    public static void main(String[] args) {
        final int EMP_DAILY_WAGES = 20;
        final int EMP_PER_HOURS = 20;
        final int EMP_TEM_HOURS = 15;
        int Emp_Total_Hours=0;
        int Emp_Total_Days=0;
        Random random = new Random();

        for (int i = 0; i <= 30; i++) {
            int Binary_Number_Random = random.nextInt() % 2;
            switch (Binary_Number_Random) {
                case 1:
                    System.out.println("*Employee is Present");
                    Random random1 = new Random();
                    int Binary_Number_Random1 = random1.nextInt() % 2;
                    switch (Binary_Number_Random1) {
                        case 1:
                            int Total = EMP_PER_HOURS * EMP_DAILY_WAGES;
                            System.out.println("->The Employee is Permanent & Salary is=" + Total + "$");
                            Emp_Total_Hours=Emp_Total_Hours+EMP_PER_HOURS;
                            Emp_Total_Days=Emp_Total_Days+1;
                            break;
                        default:
                            Total = EMP_DAILY_WAGES * EMP_TEM_HOURS;
                            System.out.println("->The Employee is Temporary & Salary is=" + Total + "$");
                            Emp_Total_Hours=Emp_Total_Hours+EMP_TEM_HOURS;
                            Emp_Total_Days=Emp_Total_Days+1;
                            break;
                    }

                case 0:
                    System.out.println("*Employee is Absent");
                    break;
                default:
                    System.out.println("*LoL");
                    break;
            }
            System.out.println("The Hours Are="+Emp_Total_Hours);
            if(Emp_Total_Hours>=100 || Emp_Total_Days==20) {
                i = 31;
                if(Emp_Total_Hours>=100){
                    System.out.println("The Employee Has Completed his 100 Hrs of Month");
                }
                if (Emp_Total_Days==20){
                    System.out.println("The Employee has Completed his 20 Days of Month");
                }

            }
        }

    }
}

