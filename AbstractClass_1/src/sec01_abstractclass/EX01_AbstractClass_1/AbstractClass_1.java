package sec01_abstractclass.EX01_AbstractClass_1;

abstract class A {
	abstract void abc();
}
class B extends A {
	void abc() {
		System.out.println("��� 1. �ڽ� Ŭ���� ���� �� �߻� �޼��� ����");
	}
}
public class AbstractClass_1 {
	public static void main(String[] args) {
		// ��ü ����
		A b1 = new B();
		A b2 = new B();
		
		// �޼��� ȣ��
		b1.abc();
		b2.abc();
	}
}
