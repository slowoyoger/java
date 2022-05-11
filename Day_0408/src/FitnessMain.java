
public class FitnessMain {

	public static void main(String[] args) {
		int count = 0; // ���� ȸ������ ������� �˼��ִ�

		FitnessVO[] member = new FitnessVO[5]; // �� 5�� �����ϴ� ���� �����!

		/*
		 * �̰� �������µ� �����ϰ� 7�������� �ٲ� FitnessVO vo = new FitnessVO("1", "ȫ�浿", 175, 66);
		 * ��Ʈ�Ͻ����̿��� ���� vo���� �����ϰ� �ִ°�. ��ü�����. �Ѹ��� �������� �غ����̴�. member[0] = vo; //�Ѹ���
		 * �����ߴ�
		 */

		
		
		// ���Խ�Ű��
		// --ó���� ȸ������ 0�̴ϱ� count�� 0! 0���� ����!!
		
		member[count++] = new FitnessVO("1", "ȫ�浿", 175, 66);
		// ȫ�浿���� ���� �����ϰ� count++ ���߿� 1�� �÷��� �Ѵ�. count++�� ������ ���� �� �����̴ϱ�! ������ �����Ѵ�.

		member[count] = new FitnessVO("2", "�����", 167, 34);
		++count;

		member[count] = new FitnessVO("3", "����ġ", 199, 65);
		++count;

		member[count] = new FitnessVO("4", "�Ӳ���", 174, 23);
		++count;

		member[count] = new FitnessVO("5", "���Ȱ�", 122, 45);
		++count;

		/*
		 * System.out.println("ȸ���� : " + count); //������ ��� �� //member.length = ���԰����� ȸ����
		 * // member[0].output();// member[0]�� �ڸ��� ����� �˰�ʹ�. //
		 * System.out.println(member[0].getHeight()); //0�� �ڸ� ����� Ű�� ����ʹ�.
		 */

		// ��� ȸ�� ��ü ���
		for (int i = 0; i < count; ++i) { // ������ ȸ�� ī��Ʈ���� ���ڴ�! length�� �ϸ� ����
			member[i].output();
		}

		// ȸ�� �˻�
		String id = "5"; // ���� ã������ ��� key
		int no = -1; // 3������ ��ġ���� ã�´�. ���� �������� �ʴ� ���ȣ�� ������ �ʱ�ȭ

		for (int i = 0; i < count; ++i) { // i= ��ġ�� ã������ ���� ��
			if (member[i].getUsrid().equals(id)) { // ������
				no = i; // ã�� �� ��ȣ no
				break; // ã���� ������
			}

		}

		System.out.println("\n ## �˻��� ȸ������");
		if (no == -1) // -1�̶� ������ ȸ���� ���°�
			System.out.println("ȸ���� �����ϴ�");
		else // -1�� �ƴϰ� ������ ������ �װ� ã���Ŵϱ�
			member[no].output();
		
	System.out.println();
	
		// ȸ�� Ż��
		id = "2"; // Ż���� ȸ�� id
		no = -1;

		for (int i = 0; i < count; ++i) { // ���������� �׻� �˻����� �Ѵ�!! ��� ��ġ�� �ֳ�����
			if (member[i].getUsrid().equals(id)) { // ��ġ���� �˾� ��
				no = i;
				break;
			}
		}
		// ȸ������ ������ ����

		for (int i = no; i < count - 1; ++i) { // count-1= ��üȸ����-1 //�� ���� �������
			member[i] = member[i + 1];
		}

		count--;
		//member[count] = null; 

		for (int i = 0; i < count; ++i) {
			if (member[i] != null) {
				member[i].output();
			}
		}

		// ����
		id = "2";
		no = -1;
		double height = 181;
		double weight = 72;

		// ������ ã��
		for (int i = 0; i < count; ++i) {
			if (member[i].getUsrid().equals(id)) {
				no = i;
				break;
			}
		}
		// ����
		if (no != -1) {
			member[no].setHeight(height); //member[no]�濡�ٰ� �� ���� �ִ´�
			member[no].setWeight(weight);

		}
		System.out.println("\n ## ������ ȸ������");
		for (int i = 0; i < count; ++i) {
			member[i].output();
		}

	}
}
