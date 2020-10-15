import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		int number1=input.nextInt();
		int number2= input.nextInt();
		int number7=number1+number2;
		System.out.println("Addtition"+ number7);

		var number5=number1*number2;
		System.out.println("Multiply"+ number5);
		var number8=number1-number2;
		System.out.println("Minus"+ number8);
try {
		int number6=number1/number2;
		System.out.println("Divide"+ number6);
}
catch(Exception e) {
	System.out.println("Type number2 >0");
		
	}
System.out.println("MOURYA PRADEEP RAMASHARE");


}
}
