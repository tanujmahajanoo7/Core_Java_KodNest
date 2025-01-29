package Palindrome;

public class Palindrome {

	public boolean ispalindrome(int n) {
		// TODO Auto-generated method stub
		
		int on=n;
		int reverse=0;
		while(n!=0)
		{
			int num = n%10;
			reverse = reverse*10+num;
			n/=10;
		}
		if(on==reverse)
			return true;
		else
			return false;
	}

}
