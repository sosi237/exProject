package programmers;
/*
 * N x N  ũ���� ���簢�� ������ (1, 1)�� ���ִ� ���ఴ�� L(����), R(������), U(��), D(�Ʒ�) �� �̵���
 * �ٸ� ���簢�� ������ ����� �������� ���õȴ�
 */
public class LRUD {
	public static void main(String[] args) {
		String[] move = {"R", "R", "R", "U", "D", "D"};
		int n = 5;	// ���簢�� �� ���� ����
		for(int i = 0; i < getPosition(move, n).length; i++) {
			System.out.print(getPosition(move, n)[i] + " ");
		}
	}
	public static int[] getPosition(String[] move, int n) {
		int[] curPosition = {1, 1};
		for(String i : move) {	//���簢���� ������ ����� ���� ���� �̵���Ŵ
			if(curPosition[1] != 1 && i.equals("L"))	curPosition[1]--;	
			if(curPosition[1] != n && i.equals("R"))	curPosition[1]++;
			if(curPosition[0] != 1 && i.equals("U"))	curPosition[0]--;
			if(curPosition[0] != n && i.equals("D"))	curPosition[0]++;
		}
		return curPosition;
	}
}
