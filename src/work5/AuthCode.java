package work5;

public class AuthCode {
//	65-90
//	97-122
	
	private int[] n=new int[10];
	private static  char[] s=new char[52];
	private static  char[] res=new char[52];
	
	public AuthCode() {
		
	}
	public void genAuthCode() {
		for(int i =65;i<=122;i++) {
			if(90<i&&i<97) {
				continue;
			}
			
		}
	
	
	
	}
	public static void main(String[] args) {
		for(int i =65;i<=122;i++) {
			if(90<i&&i<97) {
				continue;
			}
			res[i]=s[i];
		}
		
	}
}
