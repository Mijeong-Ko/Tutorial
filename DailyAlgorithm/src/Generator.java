
public class Generator {

	//generator : � �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ����
	//ex) d(91) = 9 + 1 + 91 = 101 -> 91�� 101�� ���׷������̴�.
	//self-number : ���׷����Ͱ� ���� �� 
	//ex) 1,3,5,7,9,20,31....
	
	//example) 1�̻� 5000���� ���� �����ѹ����� ���� ���Ͽ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,d,rst,sum = 0;
		
		boolean [] arr = new boolean[5000];
		
		for(int i=1; i<5000; i++) {
			a = i/1000;
			b = (i/10)%10;
			c = (i/100)%10;
			d = i%10;
			
			rst = a+b+c+d+i;
			
			if( 1 <= rst && rst <5000)
				arr[rst] = true;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == false)
				sum = sum+i;
		}
		
		System.out.println("self-number�� �� : "+ sum);
	}

}
