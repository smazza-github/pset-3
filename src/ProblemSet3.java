/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        // ps.sign();          // executes Exercise 1
        // ps.parity();        // executes Exercise 2
        // ps.ordered();       // executes Exercise 3
        // ps.gpa();           // executes Exercise 4
        // ps.grade();         // executes Exercise 5
        // ps.cards();         // executes Exercise 6
        // ps.leapYear();      // executes Exercise 7
        // ps.state();         // executes Exercise 8
        // ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {

      System.out.print("\nEnter an integer: ");
      int integer = in.nextInt();

      if (integer > 0) {
        System.out.println("\nPositive. ");

      } else if (integer < 0) {
        System.out.println("\nNegative. ");

      } else {
        System.out.println("\nZero.");
      }
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {

      System.out.print("\nEnter an integer: ");
      int parityInteger = in.nextInt();

       if ((parityInteger % 2) == 0) {
         System.out.println("\nEven.");

       } else {
         System.out.println("\nOdd.");
       }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {

      System.out.println("\nEnter three integers. ");


      System.out.print("\nEnter integer: ");
      int orderInt1 = in.nextInt();

      System.out.print("Enter integer: ");
      int orderInt2 = in.nextInt();

      System.out.print("Enter integer: ");
      int orderInt3 = in.nextInt();


      if (orderInt1 == orderInt2 && orderInt2 == orderInt3) {
        System.out.println("\nSame.");

      } else if (orderInt1 < orderInt2 && orderInt2 < orderInt3) {
        System.out.println("\nStrictly increasing.");

      } else if (orderInt1 <= orderInt2 && orderInt2 <= orderInt3) {
        System.out.println("\nIncreasing.");

      } else if (orderInt1 > orderInt2 && orderInt2 > orderInt3) {
        System.out.println("Strictly Decreasing. ");

      } else if (orderInt1 >= orderInt2 && orderInt2 >= orderInt3) {
        System.out.println("\nDecreasing.");

      } else {
        System.out.println("\nUnordered.");
      }
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {

      final double A_GRADE = 4.00;
      final double B_GRADE = 3.00;
      final double C_GRADE = 2.00;
      final double D_GRADE = 1.00;
      final double F_GRADE = 0.00;

      final double PLUS_SIGN = 0.33;
      final double MINUS_SIGN = -0.33;

      double gpa = 0.00;


      System.out.print("\nEnter a letter grade: ");
      String gradeLetter = in.nextLine().toUpperCase();


      if (gradeLetter.equals("A") || gradeLetter.equals("A+")) {
        gpa += A_GRADE;
        System.out.printf("\nYour GPA is %.2f.\n", gpa);

      } else if (gradeLetter.equals("A-")) {
        gpa += B_GRADE;
        gpa += MINUS_SIGN;
        System.out.printf("\nYour GPA is %.2f.\n", gpa);

      } else if (gradeLetter.equals("B+")) {
        gpa += B_GRADE;
        gpa += PLUS_SIGN;
        System.out.printf("\nYour GPA is %.2f.\n", gpa);

      } else if (gradeLetter.equals("B")) {
        gpa += B_GRADE;
        System.out.printf("\nYour GPA is %.2f.\n", gpa);

      } else if (gradeLetter.equals("B-")) {
        gpa += B_GRADE;
        gpa += MINUS_SIGN;
        System.out.printf("\nYour GPA is %.2f.\n", gpa);

      } else if (gradeLetter.equals("C+")) {
        gpa += C_GRADE;
        gpa += PLUS_SIGN;
        System.out.printf("\nYour GPA is %.2f.\n", gpa);

      } else if (gradeLetter.equals("C")) {
        gpa += C_GRADE;
        System.out.printf("\nYour GPA is %.2f.\n", gpa);

      } else if (gradeLetter.equals("C-")) {
        gpa += C_GRADE;
        gpa += MINUS_SIGN;
        System.out.printf("\nYour GPA is %.2f.\n", gpa);

      } else if (gradeLetter.equals("D+")) {
        gpa += D_GRADE;
        gpa += PLUS_SIGN;
        System.out.printf("\nYour GPA is %.2f.\n", gpa);

      } else if (gradeLetter.equals("D")) {
        gpa += D_GRADE;
        System.out.printf("\nYour GPA is %.2f.\n", gpa);

      } else if (gradeLetter.equals("D-")) {
        gpa += D_GRADE;
        gpa += MINUS_SIGN;
        System.out.printf("\nYour GPA is %.2f.\n", gpa);

      } else if (gradeLetter.equals("F")) {
        gpa += F_GRADE;
        System.out.printf("\nYour GPA is %.2f.\n", gpa);

      } else {
        System.out.println("\nThat's not a valid letter grade.");
      }
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {

      final double HIGH_A = 100;
      final double GRADE_A = 90;
      final double GRADE_B = 80;
      final double GRADE_C = 70;
      final double GRADE_D = 60;
      final double GRADE_F = 0;

      System.out.print("\nEnter a grade: ");
      double gradeValue = in.nextDouble();

      if (gradeValue >= GRADE_A && gradeValue <= HIGH_A) {
        System.out.println("\nYou recieved an A.");

      } else if (gradeValue < GRADE_A && gradeValue >= GRADE_B) {
        System.out.println("\nYou recieved a B.");

      } else if (gradeValue < GRADE_B && gradeValue >= GRADE_C) {
        System.out.println("\nYou recieved a C.");

      } else if (gradeValue < GRADE_C && gradeValue >= GRADE_D) {
        System.out.println("\nYou recieved a D.");

      } else if (gradeValue < GRADE_D && gradeValue >= GRADE_F) {
        System.out.println("\nYou recieved a F.");

      } else if (gradeValue < GRADE_F) {
        System.out.println("\nGrades below 0 are invalid.");

      } else if (gradeValue > HIGH_A) {
        System.out.println("\nGrades above 100 are invalid.");
      }
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

    System.out.print("\nEnter a card: ");

		String card = in.nextLine().toUpperCase();
		String cardSuit = card.substring(1);
		String cardRank = card.substring(0, 1);

		boolean validity  = false;

		switch (cardRank) {

			case "2":
				cardRank = "Two";
				validity = true;
				break;

			case "3":
				cardRank = "Three";
				validity = true;
				break;

			case "4":
				cardRank = "Four";
				validity = true;
				break;

			case "5":
				cardRank = "Five";
				validity = true;
				break;

			case "6":
				cardRank = "Six";
				validity = true;
				break;

			case "7":
				cardRank = "Seven";
				validity = true;
				break;

			case "8":
				cardRank = "Eight";
				validity = true;
				break;

			case "9":
				cardRank = "Nine";
				validity = true;
				break;

			case "T":
				cardRank = "Ten";
				validity = true;
				break;

			case "J":
				cardRank = "Jack";
				validity = true;
				break;

			case "Q":
				cardRank = "Queen";
				validity = true;
				break;

			case "K":
				cardRank = "King";
				validity = true;
				break;

			case "A":
				cardRank = "Ace";
				validity = true;
				break;

			default:
				System.out.println("\nThat's not a valid rank.\n");
				validity  = false;
		}

		if (validity ) {
			switch (cardSuit) {
				case "C":
					cardSuit = "Clubs";
					break;

				case "D":
					cardSuit = "Diamonds";
					break;

				case "H":
					cardSuit = "Hearts";
					break;

				case "S":
					cardSuit = "Spades";
					break;

				default:
					System.out.print("That's not a valid suit.");
					validity  = false;
			}
		}

		if (validity ) {
			System.out.printf("\n%s of %s.\n", cardRank, cardSuit);

		}
	}

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {

      System.out.print("\nEnter a year: ");
      long leapYear = in.nextLong();

      if (leapYear >=  0) {
        if ((leapYear % 4 == 0) && ((leapYear % 100 != 0) || (leapYear % 400 == 0))) {
          System.out.printf("\n%d is a leap year.", leapYear);
          System.out.print("\n");

        } else {
          System.out.printf("\n%d is not a leap year.", leapYear);
          System.out.print("\n");
        }
      }
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

      final int FAH_FREEZING_POINT = 32;
      final int CEL_FREEZING_POINT = 0;
      final int FAH_BOILING_POINT = 212;
      final int CEL_BOILING_POINT = 100;

      System.out.print("\nEnter a temperature: ");
      double inputTemp = in.nextDouble();

      System.out.print("Enter a scale: ");
      in.nextLine();
      String tempScale = in.nextLine();
      tempScale = tempScale.toUpperCase();

      String matterState = "";

      if (tempScale.equals("F") || tempScale.equals("C")) {
        if (tempScale.equals("F")) {
          if (inputTemp <= FAH_FREEZING_POINT) {
            matterState = "Solid.";

          } else if (inputTemp > FAH_FREEZING_POINT && inputTemp < FAH_BOILING_POINT) {
            matterState = "Liquid.";

          } else if (inputTemp >= FAH_BOILING_POINT) {
            matterState = "Gas.";
          }

        } else if (tempScale.equals("C")) {
        if (inputTemp <= CEL_FREEZING_POINT) {
          matterState = "Solid.";

        } else if (inputTemp > CEL_FREEZING_POINT && inputTemp < CEL_BOILING_POINT) {
          matterState = "Liquid.";

        } else if (inputTemp >= CEL_BOILING_POINT) {
          matterState = "Gas.";
        }
      }

      System.out.println("\n" + matterState);

    } else {
      System.out.println("\nThat's not a valid scale.");

    }
  }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

      System.out.print("\nEnter a month: ");
        String inputMonth = in.nextLine().toUpperCase();

		switch (inputMonth) {

			   case "JANUARY":
			   case "JANU":
			   case "JAN":
		  System.out.println("\n31 days.");
		  break;

			   case "FEBRUARY":
			   case "FEBR":
			   case "FEB":
		  System.out.println("\n28 or 29 days.");
      break;

			   case "MARCH":
			   case "MARC":
			   case "MAR":
		  System.out.println("\n31 days.");
		  break;

			   case "APRIL":
			   case "APRI":
			   case "APR":
		  System.out.println("\n30 days.");
		  break;

			   case "MAY":
		  System.out.println("\n31 days.");
		  break;

			   case "JUNE":
			   case "JUN":
		  System.out.println("\n30 days.");
	    break;

			   case "JULY":
			   case "JUL":
	    System.out.println("\n31 days.");
	    break;

			   case "AUGUST":
			   case "AUGU":
			   case "AUG":
	    System.out.println("\n31 days.");
	    break;

			   case "SEPTEMBER":
			   case "SEPT":
			   case "SEP":
	    System.out.println("\n30 days.");
	    break;

			   case "OCTOBER":
			   case "OCTO":
			   case "OCT":
	    System.out.println("\n31 days.");
	    break;

			   case "NOVEMBER":
			   case "NOVE":
			   case "NOV":
	    System.out.println("\n30 days.");
	    break;

			   case "DECEMBER":
			   case "DECE":
			   case "DEC":
	    System.out.println("\n31 days.");
	    break;

			   default:
	    System.out.println("\nThat's not a valid month.");
	    break;
		}
  }



    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

      final double OVER_TIME_MULTIPLIER = 1.5;
      final double OVER_TIME_AMOUNT = 40;

      double paycheck;
      double overTimeHours;

      System.out.print("\nWage: ");
      double wage = in.nextDouble();

      if (wage < 0.00) {
        System.out.println("Your wage must be greater than or equal to $0.00/hour.");
      }


      System.out.print("Hours: ");
      double workHours = in.nextDouble();

      if (workHours < 0.0) {
        System.out.println("Your hours must be greater than or equal to 0.0");
      }


      if (workHours > OVER_TIME_AMOUNT) {
        overTimeHours = workHours - OVER_TIME_AMOUNT;
        paycheck = 40 * wage + overTimeHours * OVER_TIME_MULTIPLIER * wage;
        System.out.printf("\nYou'll make $%,.2f this week.\n", paycheck);

      } else {
        paycheck = workHours * wage;
        System.out.printf("\nYou'll make $%,.2f this week.\n", paycheck);

      }
    }
}
