package basic_p;

public class CalcMain {

	public static void main(String[] args) {
		int aa = 5;
		aa++;
		System.out.println("1:"+aa);
		
		++aa;
		System.out.println("2:"+aa);
		System.out.println("3:"+aa++);
		System.out.println("4:"+aa);
		System.out.println("5:"+ ++aa);
		System.out.println("6:"+aa);
		
		int a=5, b = 6, c = 10, d;
		 
		d = a++ + ++c - b-- * --a + a++;
		
		//   5  +  11 -  6  *   5  +  5

		// a:6                  5      6
		//       c:11
		//              b:5
		
		//   5  +  11 -  30  +  5   => -9
		
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
		
		
	}

}
