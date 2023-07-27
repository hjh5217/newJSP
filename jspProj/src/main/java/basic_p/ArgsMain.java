package basic_p;

public class ArgsMain {

	public static void main(String[] args) {
		/*
		System.out.println("내가 argsMain 이다 : "+args.length);
		
		System.out.println(Arrays.toString(args));
		
		for (String str : args) {
			System.out.println(str);
		}
		
		System.out.println("argsMain 끝");
		*/
		// 짝수,숫자 일 경우에만 수를 더함
		int sum = 0;
		int avg = 0;
		int min = 0;
		int max = 0;
		int count = 0;
		int i = 1;
		
		try {
			for (String str : args) {	
				int strtoint = Integer.parseInt(str);
				int countargs = Integer.parseInt(args[i]);
				if(strtoint%2 == 0) {	
					sum += strtoint;
					min = strtoint;
					count++;
				}
			}
		} catch (Exception e) {
			
		}
		System.out.println("짝수 합계 : " + sum);
		avg = sum/count;
		System.out.println("짝수 평균 : " + avg);
		System.out.println("짝수 중 최댓값 : " + max);
		System.out.println("짝수 중 최솟값 : " + min);
	}
}
