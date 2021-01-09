package GreedyAlgorithm;

/*
 * ��� �� N�� 1�� �ɶ����� ������ �� ���� �� �ϳ��� �ݺ������� �����Ͽ� �����Ϸ� �Ѵ�.
 * ��, �� ��° ������ N�� K�� ��������� ���� ������ �� �ִ�.
 * 1. N���� 1�� ����.
 * 2. N�� K�� ������. 
 * N�� K�� �־��� �� N�� 1�� �� ������ 1�� Ȥ�� 2���� ������ �����ؾ� �ϴ� �ּ� Ƚ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (N >= K)
 * n=17, k=4 --> 3
 * n=25, k=5 --> 2
 * n=25, k=3 --> 6 
 * */
public class ToMakeOne {
	public static void main(String[] args) {
		int n = 17, k = 4;
		System.out.println(getMin(n, k));
	}
	public static int getMin(int n, int k) {
		int cnt = 0;
		while(n != 1) {
			if(n % k != 0) {
				n--;
			} else {
				n /= k;
			}
			cnt++;
		}
		return cnt;
	}
}