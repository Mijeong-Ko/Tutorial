package sort;

import java.util.Arrays;
import java.util.Scanner;

//��������
public class Select_sort {
	
	public static int [] sort(int [] ar){
		for(int i=0; i<ar.length-1; i++){
			for(int j=i+1; j<ar.length; j++){
				if(ar[i] > ar[j]){
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		return ar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���� �Է� : ");
		String inputData = sc.next();
		
		//�Էµ� ���ڸ� �ѱ��ھ� �߶� �迭�� ��ȯ
		//�� ��� ���Ǵ��� �̻��� ���ڴ� ���� �Ұ�
		//�����ڸ� �̻���ڵ� �����ϵ��� �������
		String [] stringArr = inputData.split("");
		
		//�迭 Ÿ���� string���� int�� �ٲ���
		int[] sortArr = Arrays.stream(stringArr).mapToInt(Integer::parseInt).toArray();
		
		sort(sortArr);
		
		for(int k : sortArr){
			System.out.println(k);
		}
		
	}

}
