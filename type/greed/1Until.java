// 1이 될때까지
public class greed_1Until {

	public static void main(String[] args) {
		System.out.println(outputCount());
	}
	
	public static int outputCount() {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int count = 0;
		
		while(n != 1) {	
			if(n%k == 0) {
				n = n/k;
			}else {
				n = n-1;
			}
			
			count++;
		}
		
		return count;
	}
}
