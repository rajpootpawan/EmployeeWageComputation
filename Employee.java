import java.util.*;
class Employee
{
        public static void main(String [] args)
        {
		//master added this walcome line..
                System.out.println("Welcome to Employee Wage Computation Program");

		//User1 Added the Random Function..
		 //User 6 aadded a while condition to calculate total wage..
                int hour=0;
                int days=0;
                int totalWage=0;
                while(hour<100 || days<20)
                {

		Random r= new Random();
		int num=r.nextInt(2);
		//User 4 added the switch Case statements
		  switch(num){
                case 0:
                        System.out.println("Employee Absent");
                        break;
                case 1:

                        System.out.println("Employee Present");
                        totalWage=totalWage+oneDayWage();
                        days++;
                        hour=hour+20;
                        break;
		}
	}
		 //User 2 Added function to calculate the one Day Wage..
                System.out.println("OneDay Wage is "+oneDayWage());
		//User 3 added Function to calculte one day wage After add parttime..
		System.out.println("Wage After added part time "+partTimeWage());
		 //User 5 added a function to calculate wage for a month..
                System.out.println("Wage For month "+wageMonth());
		 if(hour==100)
                        System.out.println("Total Wage for 100 hours :"+totalWage);
                else
                        System.out.println("Total wage For 20 Days  :"+totalWage);



        }
public static int oneDayWage()
{
        int oneDay=20*8;
        return oneDay;
}
public static int partTimeWage()
{
        int partTime=oneDayWage()+20*8;
	return partTime;
}
public static int wageMonth()
{
        int month=20*oneDayWage();
        return month;
}


}
