package GreedyAlgorithm;
/*
 * 음식점의 계산을 도와주는 점원이 되어, 손님에게 거슬러줘야 할 돈이 N원일 때, 거슬러줘야 할 동전의 최소 개수를 구하라. 
 * 거스름돈으로 사용할 수 있는 것은 500원, 100원, 50원, 10원 4가지이고, 거슬러줘야 할 돈 N은 항상 10의 배수이다. 
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
	 * 이 문제에서 그리디 알고리즘이 통하는 이유는 큰 단위가 언제나 작은 단위의 배수이기 때문. 
	 * 즉, 작은 단위의 동전들을 합해 큰 단위와 다른 수를 만들 수 있다면 이 알고리즘이 통하지 않음.
	 * ex) 거스름돈 단위 중 400원 이 있었다면?
	 * */
}