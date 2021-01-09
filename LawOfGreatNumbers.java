package programmers.GreedyAlgorithm;
import java.util.*;
/*
 * 다양한 수(N)로 이루어진 배열이 있을 때 주어진 수들을 M번 더하여 가장 큰 수를 만드는 법칙을 구하라. 
 * 단, 배열의 특정 인덱스에 대한하는 수가 연속해서 K번을 초과하여 더해질 수 없다. 
 * 서로 다른 인덱스에 해당하는 수가 동일해도 서로 다른 것으로 간주한다. 
 * N: 배열의 크기, M:숫자가 더해지는 횟수, K: 연속해서 더해져도 되는 횟수
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
		//sort는 오름차순 정렬시키므로 내림차순 정렬을 위해서는  Collections.reverseOrder()가 필요. 
		//그런데 int와 같은 기본자료형은 Collections.reverseOrder() 적용시 컴파일 오류 발생하므로 Integer형 배열 필요
		
		//카운트가 3이 되기 전까지는 0번 인덱스를, 3이 되면 1번 인덱스 더하기
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