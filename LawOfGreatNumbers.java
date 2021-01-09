package programmers.GreedyAlgorithm;
import java.util.*;
/*
 * �پ��� ��(N)�� �̷���� �迭�� ���� �� �־��� ������ M�� ���Ͽ� ���� ū ���� ����� ��Ģ�� ���϶�. 
 * ��, �迭�� Ư�� �ε����� �����ϴ� ���� �����ؼ� K���� �ʰ��Ͽ� ������ �� ����. 
 * ���� �ٸ� �ε����� �ش��ϴ� ���� �����ص� ���� �ٸ� ������ �����Ѵ�. 
 * N: �迭�� ũ��, M:���ڰ� �������� Ƚ��, K: �����ؼ� �������� �Ǵ� Ƚ��
 * int[] n = {3, 4, 3, 4, 3};		int m = 7, k = 2;  --> 46
 * int[] n = {2, 4, 5, 4, 6};		int m = 8, k = 3;  --> 28
 * */
public class LawOfGreatNumbers {
	public static void main(String[] args) {
		int[] n = {3, 4, 3, 4, 3};
		int m = 7, k = 2;
		System.out.println(greatNum(n, m, k));
	}
	public static int greatNum(int[] n, int m, int k) {
		int result = 0, cntM = 0, cntK = 0;
		Integer[] arr = new Integer[n.length];
		for(int i = 0; i < n.length; i++) {
			arr[i] = n[i];
		}
		Arrays.sort(arr, Collections.reverseOrder());
		//sort�� �������� ���Ľ�Ű�Ƿ� �������� ������ ���ؼ���  Collections.reverseOrder()�� �ʿ�. 
		//�׷��� int�� ���� �⺻�ڷ����� Collections.reverseOrder() ����� ������ ���� �߻��ϹǷ� Integer�� �迭 �ʿ�
		
		//ī��Ʈ�� 3�� �Ǳ� �������� 0�� �ε�����, 3�� �Ǹ� 1�� �ε��� ���ϱ�
		while(cntM < m) {
			if(cntK <3)		result += arr[0];
			else if(cntK == 3)	{
				result += arr[1];
				cntK = -1;
			}
			cntK++;		cntM++;
		}
		return result;
	}
}