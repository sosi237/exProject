package programmers;
/*
 * N x N  크기의 정사각형 공간의 (1, 1)에 서있는 여행객이 L(왼쪽), R(오른쪽), U(위), D(아래) 로 이동함
 * 다만 정사각형 공간을 벗어나는 움직임은 무시된다
 */
public class LRUD {
	public static void main(String[] args) {
		String[] move = {"R", "R", "R", "U", "D", "D"};
		int n = 5;	// 정사각형 한 변의 길이
		for(int i = 0; i < getPosition(move, n).length; i++) {
			System.out.print(getPosition(move, n)[i] + " ");
		}
	}
	public static int[] getPosition(String[] move, int n) {
		int[] curPosition = {1, 1};
		for(String i : move) {	//정사각형의 범위를 벗어나지 않을 때만 이동시킴
			if(curPosition[1] != 1 && i.equals("L"))	curPosition[1]--;	
			if(curPosition[1] != n && i.equals("R"))	curPosition[1]++;
			if(curPosition[0] != 1 && i.equals("U"))	curPosition[0]--;
			if(curPosition[0] != n && i.equals("D"))	curPosition[0]++;
		}
		return curPosition;
	}
}
