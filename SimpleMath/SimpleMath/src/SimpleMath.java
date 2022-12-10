//Name:
//Period:
//Lab: 01.02 - Simple Math
class SimpleMath
{
	public static void main(String[] args)
	{
	/* Starter Code!  You need to finish the four TASKS. */
	
	//Example:
	// TASK #0: Convert a total number of donuts into dozens and leftovers.
	//int total_donuts = 20;
	//
	//MY SOLUTION:
	//
	//1: Calculate how many dozen donuts we have.
	//int donuts_dozen = total_donuts / 12;
	//2: Subtract that amount from the total donuts to find the leftovers
	//(Yes, you can use modulus to make this easier)
	//int donuts_leftover = total_donuts - donuts_dozen*12;
	//3: Print out results
	//System.out.println("Total Donuts: " + total_donuts);
	//System.out.println(donuts_dozen + " dozen and " + donuts_leftover + " leftover donuts.");
	
	
	 //TASK #1 - Convert these inches into yards, feet, and inches
	 //Hint: It's similar to the example, except there's an extra step.
	 //Hint 2: How many inches are in a yard?  How many inches are in a foot?
	 //Hint 3: Create a "leftover_inches" variable to store the remainder each step
	 //[Correct answer is 3 yards, 1 foot, and 4 inches]
	 int total_inches = 124;
	 //TODO: Calculate Yards, Feet, and Inches and print those out
	 
	 int yards = total_inches / 36;
	 int leftover_inchYards = yards % 36;
	 int feet = yards / 3;
	 int leftover_inchFeet = feet % 12;
	 int leftover_inches = leftover_inchYards + leftover_inchFeet;
	 System.out.println(yards + " yards, " + feet + " foot, and " + leftover_inches + " inches");
	 
	 //TASK #2 – Convert this cents value into quarters, dimes, nickels, and pennies.
	 //Hint: Similar to #1, but with different division values.
	 //Hint 2: Create a "leftover_cents" variable and use that to track what's left after each step.
	 //[Correct Answer is 3 Quarters, 2 Dimes, 0 Nickels, and 3 Pennies
	 int total_cents = 98;
	
	 //TODO: Calculate Number of Quarters, Dimes, Nickels, & Pennies and print that out
	 int quarters = total_cents / 25;
	 int leftovercents1 = total_cents % 25;
	 int dimes = leftovercents1 / 10;
	 int leftovercents2 = leftovercents1 % 10;
	 int nickels = leftovercents2 / 5;
	 int leftovercents3 = leftovercents2 % 5; 
	 int pennies = leftovercents3;
	 System.out.println(quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");


	 //TASK #3 – Calculate a Semester Grade using the Alvin ISD formula:
	 // NW1 is 3/7th, NW2 is 3/7th and the Semester Exam is 1/7th.
	 //Hint: Don't get tricked by integers! [Correct Answer should be 88.14]
	 int nw1 = 93;
	 int nw2 = 80;
	 int exam = 98;
	 double semester = (nw1 * 3.0/7.0 + (nw2 * 3.0/7.0) + (exam * 1.0/7.0));
	 //TODO: Calculate and Print Semester Score as a double)
	 System.out.println("Semester grade: " + semester);
	 
	 //TASK #4 - Use Algebra to figure out what score is needed on the EXAM to get a 90 average
	 // if NW1 is 90, NW2 is 85, and a target SEMESTER score is 90.
	 //(Note I already used nw1, nw2, exam, semester so I'm making different names)
	 //[Correct answer is 105... yikes, it's not possible to get a 90!]
	 int nineweeks1 = 90;
	 int nineweeks2 = 85;
	 double desired_semester_grade = 90.0;
	 double exam_score_needed = ((nineweeks1 * 3.0/7.0 + (nineweeks2 * 3.0/7.0)));
	 double exam_score = (desired_semester_grade - exam_score_needed) * 7;
	 System.out.println("Exam score required is " + exam_score);
	 //TODO: Calculate the value of exam_score_needed using the formula from #3.


	} //end main
}//end class
