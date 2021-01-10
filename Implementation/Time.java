package Implementation;
/*
 * 정수 n 이 입력되면 00시 00분 00초부터 n시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성하라. 
 * */
public class Time {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(getTime(n));
	}
	public static int getTime(int n) {
		int answer = 0;
		String str = "";
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j < 60; j++) {
				for(int k = 0; k < 60; k++) {
					str = i + "" + j + "" + k + "";
					System.out.println(str);
					if(str.indexOf('3') != -1)		{
						answer++;
					}
				}
			}
		}
		return answer;
	}
}
