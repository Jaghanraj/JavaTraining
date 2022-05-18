package task1;

public class CountCharNew {
	String name;
	int count=0;
	CountCharNew(String name1)
	{
		this.name = name1;
	}
	public void countLength()
	{
		for(int index=0; index<name.length(); index++)
		{
			count++;
		}
		System.out.println("Length of name :" +count);
	}

	public static void main(String[] args) {
		CountCharNew length = new CountCharNew("Jaghan");
		length.countLength();	

	}

} 

