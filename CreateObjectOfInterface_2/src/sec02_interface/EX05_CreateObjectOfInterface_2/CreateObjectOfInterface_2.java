package sec02_interface.EX05_CreateObjectOfInterface_2;

interface A {
	int a = 3;
	void abc();
}

public class CreateObjectOfInterface_2 {
	public static void main(String[] args) {
		// ��ü ����
		A a1 = new A() {
			public void abc() {
				System.out.println("��� 2. �͸� �̳� Ŭ������ �̿��� ��ü ����");
			}
		};
		A a2 = new A() {
			public void abc() {
				System.out.println("��� 2. �͸� �̳� Ŭ������ �̿��� ��ü ����");
			}
		};
		// �޼��� ȣ��
		a1.abc();
		a2.abc();

	}
}
