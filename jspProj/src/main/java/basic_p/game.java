package basic_p;

public class game {

	public static void main(String[] args) {	
		/*
		System.out.println("3,6,9게임");
		System.out.println("1->20");
		
		for(int i = 1; i <=20; i++) {
			int one=i%10;
			if(one%3==0 && one!=0) {
				System.out.println("짝");
			}else {
				System.out.println(i+","+one);
			}
		}
		*/
		
		// try~catch 369 게임 1~20
		
		
			int[] arr = {1,1,0,1,1,0,1,1,0,1,1,1,0,1,1,0,1,1,0,1};
			for (int i = 0; i < 20; i++) {
				try {
					System.out.println(i+1/arr[i]);
				}catch (Exception e) {
					System.out.println("짝");
				}
			}
		
		
	}

}
