package oops_p;

import java.util.Arrays;

public class Exam {
	
	String name, grade;
	int [] jum;
	int tot, avg, rank;
	
	public Exam(String name, String ... jum) {
		super();
		this.name = name;
		this.jum = new int [jum.length];
		
		for(int i = 0; i< jum.length; i++) {
			this.jum[i] = Integer.parseInt(jum[i]);
		}
		calc();
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
		//평균을 10으로 나눠서 가가가가가가양미우수수 에 맞는 자리로 가게함
		//ex. 평균 80 = charAt(8) = 가가가가가가양미 "우" 수수
		grade = "가가가가가가양미우수수".charAt(avg/10)+"";
	}
	
	void rankCalc(Exam [] exArr) {
		rank = 1;
		for(Exam you : exArr) {
			if(avg < you.avg) {
				rank++;
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "Exam [name=" + name + ", grade=" + grade + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", rank="
				+ rank + "]";
	}
	
}
