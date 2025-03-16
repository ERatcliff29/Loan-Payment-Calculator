/* Project: Program 3 "Loan Payment"
   Class: Application nProgramming 1
   Name: Eric Ratcliff
*/

import java.util.Scanner;

// Get different values

class LoanPayment {
   public static void main(String[] args) {
      double loan = 0;
      double annualRate = 0;
      int years = 0;
      double monthlyRate = 0;
      int numberOfPayments = 0;
      double monthlyPayment = 0;
      
      Scanner myScanner = new Scanner(System.in);
      
   // Get the input
   
      System.out.print ("Enter the loan amount: ");
      loan = myScanner.nextDouble();
      System.out.println();
   
      System.out.print ("Enter the annual interest rate: ");
      annualRate = myScanner.nextDouble();
      System.out.println();
   
      System.out.print ("Enter the number of years: ");
      years = myScanner.nextInt();
      System.out.println(); 
      
   // Get the monthly interest rate
      
      double annualRatePct = annualRate/100;
   
      monthlyRate = (annualRate/100)/12;
   
      numberOfPayments = years*12;
      
   /* Here is the formula (I did  use chatGPT for help because i was having issues printing the correct result).
      I didn't close the denominatior in parentheses.
   */
   
      monthlyPayment = (loan*monthlyRate*Math.pow(1+monthlyRate, numberOfPayments)) / (Math.pow(1+monthlyRate, numberOfPayments)-1);
      
   // Print the result
   
   System.out.printf("Your monthly payment is: $%,.2f%n", monthlyPayment);
   
   }
      
}