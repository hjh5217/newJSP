package basic_p;

public class TSNExcepMain {

	public static void main(String[] args) {
		
		System.out.println("3,6,9 게임 ");
		System.out.println("1 -> 20 ");
		
		for ( int i = 1; i <=20; i++) {
			int one = i % 10;
			int three = one % 3;
			try {
				
				int a = 1234/three;
				System.out.println(i+","+one+","+ three);
				
			} catch (Exception e) {
				
				try {
					int a = 123/one;
					System.out.println("짝"+","+one+","+ three);	
				} catch (Exception e2) {
					System.out.println(i+","+one+","+ three);
				}
				
				
			}
			
		}

	}

}
