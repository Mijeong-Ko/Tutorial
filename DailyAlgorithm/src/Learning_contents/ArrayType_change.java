package Learning_contents;

import java.util.Arrays;

public class ArrayType_change {

	//String Ÿ���� �迭�� int������ ��ȯ
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string Ÿ���� �迭 ����
		String [] stringArr = {"1", "2", "5", "4", "9", "7"};
		
		//�迭 Ÿ���� string���� int�� �ٲ���
		int[] intArr = Arrays.stream(stringArr).mapToInt(Integer::parseInt).toArray();
	}

}
