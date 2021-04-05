//Welcome to Daily Employee Wage Compute Program
public class EmployeeWage 
{
	
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_PER_RATE_HOUR = 20;
	public static final	int NUM_OF_WORKING_DAYS = 20;

	public static void main(String[] args) 
	{

		 //Variables
                int empHrs=0;
                int empWage=0;
		int totalEmpWage=0;

		/* Computation
		double empCheck = Math.floor(Math.random() *10)%2;
		if(empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");*/

		//Computation and full time, part time
				//Computation using switch
		//Computation with switch and for loop
		for(int day=0; day<NUM_OF_WORKING_DAYS; day++)
		{
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
		}
		empWage = empHrs * EMP_PER_RATE_HOUR;
		totalEmpWage =empWage;
		System.out.println("Total Employee wage = "+totalEmpWage);
	}

}
