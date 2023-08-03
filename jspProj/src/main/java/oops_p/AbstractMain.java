package oops_p;

abstract class AbsPar{
	
	int a = 10, b = 20;
	
	void meth_1() {
		System.out.println("부모 meth_1()");
	}
	
	// 추상메소드 : 선언 만 함. 정의부가 존재하면 안됨. 추상메소드일시 자식에서 오버라이딩 해야함.
	abstract void meth_2(); 
	
}

class AbsChild extends AbsPar{
	
	int c = 3000;
	
	@Override
	void meth_2() {
		System.out.println("자식 meth_2()");
	}
	
	void meth_3() {
		System.out.println("자식 meth_3()");
	}
	
}

public class AbstractMain {

	public static void main(String[] args) {

		AbsChild cc= new AbsChild();
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
	}

}
