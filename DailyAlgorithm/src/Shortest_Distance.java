
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Shortest_Distance {
	
	//�Էµ� ���� ���� �Ÿ��� ���� ª�� �Ÿ��� ���

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int rst = 0;               //�Էµ� ������ ���� ����� �Ÿ�
      int distance = 0;            //�Էµ� ������ �Ÿ�
      int [] disArr = new int [10];   //�Էµ� ������ �迭
      
      ArrayList <Integer> rstArr = new ArrayList <>();   //�Էµ� ������ �Ÿ��� �����ϴ� �迭
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("10���� ���ڸ� �Է��ϼ���.");
      
      for(int i=0; i<10; i++){
         disArr[i] = sc.nextInt();
      }
      
      //������ ���ĵǾ� �ִٰ� ����
      Arrays.sort(disArr);
      
      for(int i=0; i<disArr.length-1; i++){
         distance= disArr[i+1] - disArr[i];
         rstArr.add(distance);
         
         //�յ� ������ �Ÿ��� �� ª�� �Ÿ� ����
         if (rst == 0){
            rst = distance;
         }
         else{
            if( distance <= rst){ 
               rst = distance;
            }
         }
      }

      System.out.println("���� ª�� �Ÿ��� ����? ");
      
      //���� ������ ���� ª�� �Ÿ��� ���Ͽ� ���� ���� �Ÿ����� �� ���
      for (int i=0; i<rstArr.size(); i++){
         if( rstArr.get(i) == rst) {
            System.out.println("( "+disArr[i]+" , "+disArr[i+1]+" )");
         }
      }
   }
}