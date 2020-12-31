package programmers;


/*
 * �������� ����� �����ִ� ������ �Ǿ�, �մԿ��� �Ž������ �� ���� N���� ��, �Ž������ �� ������ �ּ� ������ ���϶�. 
 * �Ž��������� ����� �� �ִ� ���� 500��, 100��, 50��, 10�� 4�����̰�, �Ž������ �� �� N�� �׻� 10�� ����̴�. 
 * */
public class Greedy {

	public static void main(String[] args) {
		int N = 1260;
		System.out.println(getCount(N));
	}
	public static int getCount(int N) {
		int cnt = 0;
		int a = N % 500;
		int b = a % 100;
		int c = b % 50;
		
		cnt += N / 500 + a / 100 + b / 50 + c / 10;
		
		return cnt;
	}
}
