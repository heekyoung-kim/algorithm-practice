package algorithmTest;

public class binarySearch {
	
	// 이진탐색을 활용하면 매번 비교되는 요소의 수가 절반으로 감소될 수 있으므로 O(logN)의 수행으로 원하는 수를 찾을 수 있다.
	// 정렬된 수에서 하나의 수의 위치 찾기
	public static void main(String[] args) {
		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		System.out.println("총 숫자 개수:"+ numbers.length);
		int target = 83;
		int left = 0; 						// 0번째 배열부터 스캔한다.
		int right = numbers.length - 1; 	//length와 달리 배열은 0부터 시작하기 때문에 -1을 해 끝번호 자리를 알아낸다.
		int mid = (left + right) / 2; 		// 처음과 끝을 더해 2로 나눠 중간자리를 찾는다.
		System.out.println("중간자리:"+ mid);
		
		int temp = numbers[mid]; 			// 중간자리 숫자를 알아낸다.
		boolean find = false; 				// 숫자를 찾으면 true로 바꿔준다.
		
		while(left <= right) {				// while문을 돌려줘 left가 right의 자리수가 될때까지 숫자를 찾을 때까지 조건을 반복해 스캔한다.
			if(target == temp) {			// target과 중간자리수가 같은지 확인
				find = true;				// 같으면 true결과를 저장하고 while문을 끝낸다.
				break;
			}
			else if(target < temp) {		// 같지 않고 target이 temp보다 작다면 왼쪽으로 이동해야하기 때문에 
				right = mid-1;				// right에 mid -1을 해 자리를 왼쪽으로 이동한다.
			}
			else {
				left = mid +1;				// target이 temp보다 크다면 오른쪽으로 이동해야하기 때문에 left = mid+1을 해준다.
			}	
			mid = (left + right)/2;			// target == temp이 아니기 때문에 while문을 다시 반복해야하므로 mid값을 다시 오른쪽이든 왼쪽으로든 이동시켜 구한다.
			temp = numbers[mid];			// 구한 mid 자리값으로 비교할 배열위치의 숫자를 구한다.
		}
		System.out.println("left= "+left+" right="+right);
		
		if (find == true) {
			mid++;							// 찾았다면 원래 배열 자리값에 맞춰놨던 값에 +1해서 복구한다.
			System.out.println("찾는 수는" + mid + "번째 있습니다.");
		}else System.out.println("찾는 수가 없습니다.");
		
		
	}
}
