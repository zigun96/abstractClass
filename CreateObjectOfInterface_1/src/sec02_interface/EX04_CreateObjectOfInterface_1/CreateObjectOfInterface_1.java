package sec02_interface.EX04_CreateObjectOfInterface_1;

interface A {
	int a = 3;
	void abc();
}
class B implements A {
	public void  abc() {
		System.out.println("��� 1. �ڽ� Ŭ���� �����ڷ� ��ü ����");
	}
}
public class CreateObjectOfInterface_1 {
	public static void main(String[] args) {
		// ��ü ����
		A b1 = new B();
		A b2 = new B();
		
		// �޼��� ȣ��
		b1.abc();
		b2.abc();
	}
}
