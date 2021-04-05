//Welcome to Daily Employee Wage Compute Program
public class EmployeeWage 
{
	
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_PER_RATE_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	
	public static int computeEmpWage()
	{
		//Variables
		int empHrs=0, totalEmpWage=0, totalEmpHrs=0, totalWorkingDays=0;

		//Computation 
		while(totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;	
			int empCheck =(int) Math.floor(Math.random() *10) % 3;
			switch(empCheck)
			{
			case IS_PART_TIME:
				empHrs=4;
				break;
			case IS_FULL_TIME:
				empHrs=8;
				break;
			default:
				empHrs=0;
			}

			totalEmpHrs += empHrs;
			System.out.println("Days = "+totalWorkingDays+ ", Employee Hours = "+empHrs);
		}
		totalEmpWage = totalEmpHrs * NUM_OF_WORKING_DAYS;
		System.out.println("Total Employee Wage = "+totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) 
	{

         	/* Computation
		double empCheck = Math.floor(Math.random() *10)%2;
		if(empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");*/

		//Computation and full time, part time
				//Computation using switch
		//Computation with switch and for loop
				//Computation and total working days per month
		computeEmpWage();
	}

}
