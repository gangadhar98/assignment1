
public class Pattern1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n=14;
			int i,j;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					//Pattern
					if(i==0||i==n-1||j==0||j==n-1||i+j<=n/2||j-i>=(n-1)/2)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
	}

