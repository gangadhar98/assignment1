
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				//Pattern
				 if(i==n-1||i-j>=(n-2)/2||i+j>=n+(n-3)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();	
		}
	}
}
