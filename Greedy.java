package GreedyAlgorithm;
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
		int[] arrCoin = {500, 100, 50, 10};
		for(int coin : arrCoin) {
			cnt += N / coin;
			N %= coin;
		}
		return cnt;
	}
	/*
	 * �� �������� �׸��� �˰����� ���ϴ� ������ ū ������ ������ ���� ������ ����̱� ����. 
	 * ��, ���� ������ �������� ���� ū ������ �ٸ� ���� ���� �� �ִٸ� �� �˰����� ������ ����.
	 * ex) �Ž����� ���� �� 400�� �� �־��ٸ�?
	 * */
}