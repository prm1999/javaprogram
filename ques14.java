
public class ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100 ;
		int a = x++ ;
		int b = ++x ;
		int c = x++;
		int d = (a<b) ? ( a<c) ? a: (b<c) ? b : c : x ;
		System.out.println(d);

	}

}
