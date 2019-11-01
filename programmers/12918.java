import java.util.Scanner;

public class munja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		if(s.length() == 4 || s.length() == 6) {	//문자열 크기 확인
			try {
				int number = Integer.parseInt(s);	//문자열을 숫자로 변환
				System.out.println("true");		//변환 된다면 true
			}catch(Exception e){		
				System.out.println("false");	//변환되지 않으면 문자가 섞여있으므로 false
			}		
			
		}else {
			System.out.println("false");
		}
	}

}
