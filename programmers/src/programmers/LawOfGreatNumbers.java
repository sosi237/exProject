package programmers;
import java.util.*;
/*
 * 다양한 수(N)로 이루어진 배열이 있을 때 주어진 수들을 M번 더하여 가장 큰 수를 만드는 법칙을 구하라. 
 * 단, 배열의 특정 인덱스에 대한하는 수가 연속해서 K번을 초과하여 더해질 수 없다. 
 * 서로 다른 인덱스에 해당하는 수가 동일해도 서로 다른 것으로 간주한다. 
 * N: 배열의 크기, M:숫자가 더해지는 횟수, K: 연속해서 더해져도 되는 횟수
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
		for(int i = 0; i < arr.size(); i++) {	//내림차순으로 만들기
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
			} else {	//더이상 제일 큰 수를 더할 수 없으면
				result += arr.get(1);
				cnt = 0;
			}
		}
		return result;
	}
}
