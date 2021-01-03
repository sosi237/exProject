package programmers;
/*
 * N X M 형태로 놓여있는 카드들 중, 주어진 조건 하에서 가장 높은 숫자가 쓰인 카드 한 장을 뽑는 프로그램을 만드시오.
 * 1. 뽑고자 하는 카드가 포함되어있는 행을 선택하고
 * 2. 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야 함
 * ex. int[][] arr2 = {{7, 3, 1, 8}, {3, 3, 3, 4}}; --> 3
 * */
public class CardGame {
	public static void main(String[] args) {
		int[][] arr = {{3,1,2}, {4, 1, 4}, {2, 2, 2}};
		System.out.println(getMax(arr));
	}
	// for문으로 각 행에 존재하는 숫자들을 비교하며 최소숫자를 골라내고 그 최소숫자들 중 가장 높은 수가 답
	public static int getMax(int[][] arr) {
		int answer = 0, min = 0;
		for(int i = 0; i < arr.length; i++) {		
			min = arr[i][0];	
			for(int j = 1; j < arr[i].length; j++) {	 
				if(arr[i][j] < min)		min = arr[i][j];
			}
			if(min > answer)	answer = min;
		}
		
		return answer;
	}
}
