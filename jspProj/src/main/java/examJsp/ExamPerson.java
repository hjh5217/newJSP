package examJsp;

public class ExamPerson {
	
	String name, grade;
	int [] jum;
	int tot, avg, rank;
	
	public ExamPerson(String name, String ... jum) {
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
	
	public void rankCalc(ExamPerson [] exArr) {
		rank = 1;
		for(ExamPerson you : exArr) {
			if(avg < you.avg) {
				rank++;
			}
		}
	}
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "<td><input type=\"text\" value=\""+name+"\" disabled=\"disabled\"></td>"
				+"<td><input type=\"text\" value=\""+jum[0]+"\" disabled=\"disabled\"></td>"
				+"<td><input type=\"text\" value=\""+jum[1]+"\" disabled=\"disabled\"></td>"
				+"<td><input type=\"text\" value=\""+jum[2]+"\" disabled=\"disabled\"></td>"
				+"<td><input type=\"text\" value=\""+tot+"\" disabled=\"disabled\"></td>"
				+"<td><input type=\"text\" value=\""+avg+"\" disabled=\"disabled\"></td>"
				+"<td><input type=\"text\" value=\""+grade+"\" disabled=\"disabled\"></td>"
				+"<td><input type=\"text\" value=\""+rank+"\" disabled=\"disabled\"></td>";
	}

}