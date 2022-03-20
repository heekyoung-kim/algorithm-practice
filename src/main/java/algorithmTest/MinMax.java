package algorithmTest;

public class MinMax {
	//  나열된 수에서 최솟값과 최댓값 구하기	
	public static void main(String[] args) {
		
		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		// 최소, 최대값 변수
		int min = numbers[0];
		int max = numbers[0];
		
		// 자릿수
		int minPos = 0;
		int maxPos = 0;
		
		for(int i = 1; i < numbers.length; i++) {
			
			// 최솟값 => min보다 numbers가 작으면 numbers가 최솟값이므로 min값으로 변경.
			if(min > numbers[i]) {
				min = numbers[i];
				minPos = i+1;		
			}
			// 최댓값.
			if(max < numbers[i]) {
				max = numbers[i];
				maxPos = i+1;
			}
		}
			System.out.println("가장 큰값은"+max +"이고, 위치는"+maxPos+"번째 입니다.");
			System.out.println("가장 작은값은"+min +"이고, 위치는"+minPos+"번째 입니다.");
	}
	// 수행시간 분석
	// 반복문의 한번 수행으로 두개의 원하는 값을 모두 찾을 수 잇다. 이 경우 수행속도는 나열된 수의 개수에 비례하므로 O(n)이 된다.
}
