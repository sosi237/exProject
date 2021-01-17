package test;
import java.util.*;
/*
 * cli로 1개 이상의 숫자값을 입력 받으면 중간값을 리턴하여 화면에 출력하는 기능
 * */
public class Median {
// 우선 입력받은 거 크기순으로 정렬하고 2로 나눴을 때의 인덱스 추출
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
		System.out.println("중간값 : " + answer);
	}
}
