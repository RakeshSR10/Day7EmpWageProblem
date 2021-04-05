//Welcome to Daily Employee Wage Compute Program
public class EmployeeWage {

	public static void main(String[] args) 
	{
		int IS_FULL_TIME = 2;
		int IS_PART_TIME = 1;
		int EMP_PER_RATE_HOUR = 20;

		 //Variables
                int empHrs=0;
                int empWage=0;

		/* Computation
		double empCheck = Math.floor(Math.random() *10)%2;
		if(empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");*/

		//Computation and full time, part time
		double empCheck = Math.floor(Math.random() *10) % 3;
		if(empCheck == IS_PART_TIME)
			empHrs=4;
		else if(empCheck == IS_FULL_TIME)
			empHrs=8;
		else
			empHrs=0;

		empWage = empHrs * EMP_PER_RATE_HOUR;
		System.out.println("Employee wage = "+empWage);
	}

}
