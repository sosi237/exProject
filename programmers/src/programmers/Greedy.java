package programmers;


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
		int a = N % 500;
		int b = a % 100;
		int c = b % 50;
		
		cnt += N / 500 + a / 100 + b / 50 + c / 10;
		
		return cnt;
	}
}
