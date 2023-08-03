package oops_p;

// 부모 1 자식 2

class Par{
	int a = 10;
	int b = 20;
	
	void meth_1() {
		System.out.println("부모 meth_1():"+a+","+b);
	}
	void meth_2() {
		System.out.println("부모 meth_2():"+a+","+b);
	}
}

class Child1 extends Par{
	int a = 1000; // hiding
	int c = 3000;
	
	void meth_1() { //overriding
		System.out.println("자식 meth_1():"+a+","+b+","+c);
	}
	void meth_3() {
		System.out.println("자식1 meth_3()");
	}
}

class Child2 extends Par{
	int d = 1234;
	
	void meth_4() {
		System.out.println("자식2 meth_4()");
	}
}
class Uncle {
	
}

public class DinamicMain {
	
	public static void main(String[] args) {
		Par pp = new Par();
		Child1 cc1 = new Child1();
		Child2 cc2 = new Child2();
		
		System.out.println("pp : "+pp.a+","+pp.b);
		//System.out.println("pp : "+pp.a+","+pp.b+","+pp.c);
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3();
		//pp.meth_4();
		System.out.println("cc1 : "+cc1.a+","+cc1.b+","+cc1.c);
		//System.out.println("cc1 : "+cc1.a+","+cc1.b+","+cc1.c+","+cc1.d);
		cc1.meth_1();
		cc1.meth_2();
		cc1.meth_3();
		//cc1.meth_4();
		System.out.println("cc2 : "+cc2.a+","+cc2.b+","+cc2.d);
		//System.out.println("cc2 : "+cc2.a+","+cc2.b+","+cc2.c+","+cc2.d);
		cc2.meth_1();
		cc2.meth_2();
		//cc2.meth_3();
		cc2.meth_4();
		
		System.out.println("---------------------------------");
		
		Par dpp = new Par();
		Par dpc = new Child1();
		//Child1 dcp = new Par(); 자녀가 부모보다 크다
		Child1 dcc = new Child1();
		
		System.out.println("dpp : " +dpp.a+","+dpp.b);
		//System.out.println("dpp : " +dpp.a+","+dpp.b+","+dpp.c);
		dpp.meth_1();
		dpp.meth_2();
		//dpp.meth_3();
		
		System.out.println("dpc : " +dpc.a+","+dpc.b);
		//System.out.println("dpc : " +dpc.a+","+dpc.b+","+dpc.c);
		dpc.meth_1();
		dpc.meth_2();
		//dpp.meth_3();
		//그냥부르면 super 에 해당되는 변수값 (하이딩)
		//메소드로 부르면 자기 자신에 해당되는 변수값

		System.out.println("dcc : " +dcc.a+","+dcc.b+","+dcc.c);
		dcc.a = 1111; // 자신의 변수를 바꿈
		dcc.b = 2222;
		dcc.c = 3333;
		
		System.out.println("dcc : " +dcc.a+","+dcc.b+","+dcc.c);
		dcc.meth_1();
		dcc.meth_2();
		dcc.meth_3();
		
		Par dpcc = dcc; // 자기자신이지만 보는 눈이 부모임
		System.out.println("dpcc : " +dpcc.a+","+dpcc.b);
		//System.out.println("dpcc : " +dpcc.a+","+dpcc.b+","+dpcc.c);
		dpcc.meth_1();
		dpcc.meth_2();
		//dpcc.meth_3();
		
		Child1 dcpcc = (Child1) dpcc;
		System.out.println("dcpcc : " +dcpcc.a+","+dcpcc.b+","+dcpcc.c);
		dcpcc.meth_1();
		dcpcc.meth_2();
		dcpcc.meth_3();
		
		//Child1 cpp = (Child1)pp;
		System.out.println(pp instanceof Par);
		System.out.println(pp instanceof Child1);
		System.out.println(cc1 instanceof Par);
		System.out.println(cc1 instanceof Child1);
		//System.out.println(cc1 instanceof Uncle); 상속관계가 맞아야 사용할수 있음
	}
	
}
