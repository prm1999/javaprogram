import java.util.Scanner;
public class module1_ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number");
		int number=input.nextInt();
		int i,j;
		for(i=0;i<number;i++)
		{
			System.out.println("\n");

			for(j=0;j<=i;j++)
			{
			System.out.print("*");
		}
	}

}
}
