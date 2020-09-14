package Pattern_ISP_Example;

public class OldFashionedPrinter  implements Machine
{
	public void print(Document d)
	{
		
	}

	public void fax(Document d) throws Exception
	{
		throw new Exception();
	}

	public void scan(Document d) throws Exception
	{
		throw new Exception();
	}
}
