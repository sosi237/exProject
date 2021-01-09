package GreedyAlgorithm;

/*
 * 어떠한 수 N이 1이 될때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려 한다.
 * 단, 두 번째 연산은 N이 K로 나누어떨어질 때만 선택할 수 있다.
 * 1. N에서 1을 뺀다.
 * 2. N을 K로 나눈다. 
 * N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하는 프로그램을 작성하시오. (N >= K)
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