// 숫자 카드 게임
public class greed_cardGame {
	
	public static void main(String[] args) {
		
		System.out.println(outputNumber());
		
	}
	
	
	// 작은 수중 가장 큰 수를 출력하는 함수
	public static int outputNumber() {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[][] card = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				card[i][j] = scan.nextInt();
			}
		}
		
		int min = 10001;
		int max = 0;

		for(int i=0; i<n; i++) {
			min = 10001;
				
			for(int j=0; j<m; j++) {
				if(min > card[i][j]) {
					min = card[i][j];
				}
			}			
			if(max < min) {
				max = min;
			}	
		}
	
		return max;
	}

}
