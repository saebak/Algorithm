import java.util.*;

// 왕실의 나이트
public class implementation_royalNight {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String location = scan.next();
		Character[] rows = {'1','2','3','4','5','6','7','8'};
		Character[] cols = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		
		int row = Arrays.asList(rows).indexOf(location.charAt(1)) + 1;
		int col = Arrays.asList(cols).indexOf(location.charAt(0)) + 1;
		
		int[] x = {-2,-1,1,2,2,1,-1,-2};
		int[] y = {-1,-2,-2,-1,1,2,2,1};
		
		int count = 0;
		
		for(int i=0; i<8; i++) {
		
			if((col + x[i]) > 0 && (col + x[i]) < 9 && (row + y[i]) > 0 && (row + y[i]) < 9) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
