
public class Ineuron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				//I pattern
				if(i==0||i==n-1||j==(n-1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				//N Pattern
				if(j==0||j==n-1||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				//E Pattern
				if(i==0&&j!=0||i==n-1&&j!=0||i==(n-1)/2||j==0&&i!=0&&i!=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				//U Pattern
				if(j==0&&i!=n-1||j==n-1&&i!=n-1||i==n-1&&j!=0&&j!=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				//R Pattern
				if(i==0&&j!=n-1||i==(n-1)/2&&j!=n-1||j==0||j==n-1&&i<=(n-1)/2&&i!=0&&i!=(n-1)/2||i==j&&j>=(n-1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				//O Pattern
				if(i==0&&j!=0&&j!=n-1||i==n-1&&j!=0&&j!=n-1||j==0&&i!=0&&i!=n-1||j==n-1&&i!=0&&i!=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				//N Pattern
				if(j==0||j==n-1||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
