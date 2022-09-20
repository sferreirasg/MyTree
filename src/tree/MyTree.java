package tree;


public class MyTree {

	public MyTree() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;

		for(i=1;i<=10;i++)
		{
			for(j=1;j<=i;j++)
		
			{
				if(j%2==0)
					System.out.print("0");
			else
					System.out.print("1");
			}
			System.out.println();
		}
		
		
		

		
	}

}


