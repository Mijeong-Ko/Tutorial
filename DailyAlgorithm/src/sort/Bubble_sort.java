package sort;

//��������
public class Bubble_sort {
	
	public static int [] bubble(int [] ar){
		//�ִ� n-1ȸ��
		for(int i=0; i<ar.length-1; i++){
			//1ȸ�� ���� �������� �̵��� �ִ��� Ȯ���ϱ� ���� ����
			int flag = 0;
			//ù��° ���� ������ -1��° �����ͱ��� �ڽ��� ���� �����Ϳ� ��
			for(int j=0; j<ar.length-1-i; j++){
				//���� �����Ͱ� ���� �����ͺ��� ũ�ٸ� ��ġ�� �����ϰ� �̵��� �־��ٴ� ǥ�ø� ��
				if(ar[j] > ar[j+1]){
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
		return ar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sortArr = {2,5,1,24,4,9,8,11,7};
		bubble(sortArr);
		
		for(int k : sortArr){
			System.out.println(k);
		}

	}

}
