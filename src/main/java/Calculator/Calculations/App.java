package Calculator.Calculations;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
   		int first_number;
   		int second_number;
   		int choice;
   		Scanner s = new Scanner(System.in);
    	System.out.println("Enter The First Number : ");
    	first_number = s.nextInt();
    	System.out.println("Enter The Second Number : ");
   		second_number = s.nextInt();
   		System.out.println("Choose the operation you want to perform:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division (Gives Quotient)\n5.Modulo Division (Gives Remainder)\nEnter the seriel Number of your choice : ");
   		choice = s.nextInt();
   		Calculations c = new Calculations(first_number,second_number);
    	System.out.println("Result = "+c.operation(choice));
    	s.close();
    }
}
