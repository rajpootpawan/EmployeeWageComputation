import java.util.*;
class Employee
{
        public static void main(String [] args)
        {
		//master added this walcome line..
                System.out.println("Welcome to Employee Wage Computation Program");

		//User1 Added the Random Function..
		Random r= new Random();
		int n=r.nextInt(2);
		switch(n){
		
		case 0:
			System.out.println("Employee Absent");
			break;
		case 1:
			System.out.println("Employee Present");
			break;
	
		}
        }
}
