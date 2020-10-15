import java.util.Scanner;
public class Module1_que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
		System.out.print("Enter the number");
		int number=input1.nextInt();
		int i,j;
		for(i=number;i<0;i--)
		{
			i--;
			//System.out.println("Enter the number4");

			System.out.println("\n");
			
			for(j=i;j<0;j--)
			{
			System.out.print("*");
		}
	}


	}

}
