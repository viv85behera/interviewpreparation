package interviewpreparation;

public class countcharactersofstring 
{
	public static void countcharacters(String string) 
	{
		int count = 0;
		char[] arr=string.toCharArray();
		for(int i=0;i<=arr.length;i++) 
		{
			count++;
			
	}
		System.out.println(count);
	}
public static void main(String[] args) {
	countcharacters("vivekananda");
}

	
}

   