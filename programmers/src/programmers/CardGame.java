package programmers;
/*
 * N X M ���·� �����ִ� ī��� ��, �־��� ���� �Ͽ��� ���� ���� ���ڰ� ���� ī�� �� ���� �̴� ���α׷��� ����ÿ�.
 * 1. �̰��� �ϴ� ī�尡 ���ԵǾ��ִ� ���� �����ϰ�
 * 2. ���õ� �࿡ ���Ե� ī��� �� ���� ���ڰ� ���� ī�带 �̾ƾ� ��
 * ex. int[][] arr2 = {{7, 3, 1, 8}, {3, 3, 3, 4}}; --> 3
 * */
public class CardGame {
	public static void main(String[] args) {
		int[][] arr = {{3,1,2}, {4, 1, 4}, {2, 2, 2}};
		System.out.println(getMax(arr));
	}
	// for������ �� �࿡ �����ϴ� ���ڵ��� ���ϸ� �ּҼ��ڸ� ��󳻰� �� �ּҼ��ڵ� �� ���� ���� ���� ��
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
