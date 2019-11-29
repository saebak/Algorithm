import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		//3의 배수일때는 fizz 5의배수일때는 buzz 3과 5의 공배수일땐  fizzbuzz출력
		for(int i=1; i<=num; i++) {
			if(i%(3*5) == 0) {
				System.out.print("FizzBuzz ");
			}else if(i%3==0) {
				System.out.print("Fizz ");
			}else if(i%5==0) {
				System.out.print("Buzz ");
			}else {
				System.out.print(i+" ");
			}
		}
	}
}

