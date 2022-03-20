package basement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LottoNumber {

	public static void main(String[] args) {
		
		Set lottoSet = new HashSet();
		
		int num = 0;
		
		while(lottoSet.size() != 6) {
			num = (int)(Math.random()*45+1);
			lottoSet.add(num);
		}
//		System.out.println(lottoSet);
		
		ArrayList<Integer> lottoArr = new ArrayList<Integer>(lottoSet);
		// 오름차순정렬
		Collections.sort(lottoArr);
		System.out.println("금주의 로또번호: ");
		
		for(Object list : lottoArr) System.out.print (list +" ");
		
		
	
	}
	
}
