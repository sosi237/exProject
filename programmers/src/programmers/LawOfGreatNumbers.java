package programmers;
import java.util.*;
/*
 * �پ��� ��(N)�� �̷���� �迭�� ���� �� �־��� ������ M�� ���Ͽ� ���� ū ���� ����� ��Ģ�� ���϶�. 
 * ��, �迭�� Ư�� �ε����� �����ϴ� ���� �����ؼ� K���� �ʰ��Ͽ� ������ �� ����. 
 * ���� �ٸ� �ε����� �ش��ϴ� ���� �����ص� ���� �ٸ� ������ �����Ѵ�. 
 * N: �迭�� ũ��, M:���ڰ� �������� Ƚ��, K: �����ؼ� �������� �Ǵ� Ƚ��
 * */
public class LawOfGreatNumbers {
	public static void main(String[] args) {
		int[] n = {3, 4, 3, 4, 3};
		int m = 7, k = 2;
		/*
		int[] n = {2, 4, 5, 4, 6};
		int m = 8, k = 3;
		*/
		System.out.println(greatNum(n, m, k));
	}
	public static int greatNum(int[] n, int m, int k) {
		int result = 0,  tmp = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>(n.length);
		for(int i = 0; i < n.length; i++) {
			arr.add(n[i]);
		}
		for(int i = 0; i < arr.size(); i++) {	//������������ �����
			for(int j = 0; j < i; j++) {
				if(arr.get(i) > arr.get(j)) {
					tmp = arr.get(j);
					arr.set(j, arr.get(i));
					arr.set(i, tmp);
				}
			}
		}
		int cnt = 0;
		for(int i = 0; i < m ; i++) {
			if(cnt < k) {
				result += arr.get(0);
				cnt++;
			} else {	//���̻� ���� ū ���� ���� �� ������
				result += arr.get(1);
				cnt = 0;
			}
		}
		return result;
	}
}
