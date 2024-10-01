package JavaAssignment2;

public class Pattern6 {

	public static void main(String[] args) {
		int row=6;
		int col=6;
		int space=5;
		int star=1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				for(int k=0;k<space;k++)
				{
					System.out.print("");
				}
				for(int l=0;j<star;l++)
				{
					System.out.print("*");
				}
			}
			space--;
			star++;
			System.out.println("");
		}
		
	}
}


