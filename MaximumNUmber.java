import java.util.Scanner;

public class MaximumNUmber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MaximumNUmber maximum = new MaximumNUmber();

	     System.out.println("Maximum Number Among Three Integer Numbers Is : " + maximum.compareTo());

	}

	public Integer compareTo() {

	       Scanner scanner = new Scanner(System.in);

	       System.out.println("Enter The First Number:");
	       Integer number1 = scanner.nextInt();

	       System.out.println("Enter The Second Number:");
	       Integer number2 = scanner.nextInt();

	       System.out.println("Enter The Third Number:");
	       Integer number3 = scanner.nextInt();
	       Integer maximum = number1;

	       if (number1 > number2 && number1 > number3) {
	           maximum = number1;
	       }
	        else if (number2 > number1 && number2 > number3) {
	           maximum = number2;
	        }

	        else {
	           maximum = number3;
	       }
	       
	       scanner.close();
	       return maximum;       
	     
	   }

}
