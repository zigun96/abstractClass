package sec01_abstractclass.EX02_AbstractClass_2;

abstract class A {
	abstract void abc();
}
public class AbstractClass_2 {
	public static void main(String[] args) {
		
		// ��ü ����
		A a1 = new A() {
			void abc() {
				System.out.println("��� 2. �͸� �̳� Ŭ���� ������� ��ü ����");
			}
		};
		A a2 = new A() {
			void abc() {
				System.out.println("��� 2. �͸� �̳� Ŭ���� ������� ��ü ����");
			}
		};
		// �޼��� ȣ��
		a1.abc();
		a2.abc();
	}
}
