package test;
import java.util.*;
/*
 * cli�� 1�� �̻��� ���ڰ��� �Է� ������ �߰����� �����Ͽ� ȭ�鿡 ����ϴ� ���
 * */
public class Median {
// �켱 �Է¹��� �� ũ������� �����ϰ� 2�� ������ ���� �ε��� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		input = sc.nextLine();
		sc.close();
		String[] arrStr = input.split(" ");
		int[] arrInt = new int[arrStr.length];
		for(int i = 0 ; i < arrStr.length; i++) {
			arrInt[i] = Integer.parseInt(arrStr[i]);
		}
		Arrays.sort(arrInt);
		int answer = arrInt[arrInt.length / 2];
		System.out.println("�߰��� : " + answer);
	}
}
