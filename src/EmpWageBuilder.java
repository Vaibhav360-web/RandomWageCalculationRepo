import java.util.Random;

public class EmpWageBuilder {
    public static void get_Data() {
        int Emp_Total_Hours = 0;
        int Emp_Total_Days = 0;
        Random random = new Random();

        for (int i = 1; i <= Constants.Emp_Total_Days; i++) {
            System.out.println("Day:" + i);
            int Binary_Number_Random = random.nextInt() % 2;
            switch (Binary_Number_Random) {
                case 1:
                    System.out.println("*Employee is Present");
                    Random random1 = new Random();
                    int Binary_Number_Random1 = random1.nextInt() % 2;
                    switch (Binary_Number_Random1) {
                        case 1:
                            int Total = Constants.EMP_PER_HOURS * Constants.EMP_DAILY_WAGES;
                            System.out.println("->The Employee is Permanent & Salary is=" + Total + "$");
                            Emp_Total_Hours = Emp_Total_Hours + Constants.EMP_PER_HOURS;
                            Emp_Total_Days = Emp_Total_Days + 1;
                            break;
                        default:
                            Total = Constants.EMP_DAILY_WAGES * Constants.EMP_TEM_HOURS;
                            System.out.println("->The Employee is Temporary & Salary is=" + Total + "$");
                            Emp_Total_Hours = Emp_Total_Hours + Constants.EMP_TEM_HOURS;
                            Emp_Total_Days = Emp_Total_Days + 1;
                            break;
                    }

                case 0:
                case -1:
                    System.out.println("*Employee is Absent");
                    break;

            }
            System.out.println("The Hours Are=" + Emp_Total_Hours);
            if (Emp_Total_Hours >= Constants.Emp_Present_Hours || Emp_Total_Days == Constants.Emp_Present_Days) {
                i = 31;
                if (Emp_Total_Hours >= Constants.Emp_Present_Hours) {
                    System.out.println("The Employee Has Completed his 100 Hrs of Month");
                }
                if (Emp_Total_Days == Constants.Emp_Total_Days) {
                    System.out.println("The Employee has Completed his 20 Days of Month");
                }

            }
        }
    }
    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.get_Data();
    }
}

