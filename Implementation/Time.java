package Implementation;
/*
 * ���� n �� �ԷµǸ� 00�� 00�� 00�ʺ��� n�� 59�� 59�ʱ����� ��� �ð� �߿��� 3�� �ϳ��� ���ԵǴ� ��� ����� ���� ���ϴ� ���α׷��� �ۼ��϶�. 
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
