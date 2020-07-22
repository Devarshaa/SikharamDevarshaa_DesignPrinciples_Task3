package Calculator.Calculations;

public class Calculations {
	int first_number;
	int second_number;
	Calculations(int first_number,int second_number)
	{
		this.first_number = first_number;
		this.second_number = second_number;
	}
	int operation(int option)
	{
		switch(option) {
		case 1: return sum(this.first_number,this.second_number);
		case 2: return difference(this.first_number,this.second_number);
		case 3: return product(this.first_number,this.second_number);
		case 4: return quotient(this.first_number,this.second_number);
		case 5: return remainder(this.first_number,this.second_number);
		}
		return 0;
	}
	int sum(int a,int b)
	{
		return a+b;
	}
	int difference(int a,int b)
	{
		return a-b;
	}
	int product(int a,int b)
	{
		return a*b;
	}
	int quotient(int a,int b)
	{
		return a/b;
	}
	int remainder(int a,int b)
	{
		return a%b;
	}
}
