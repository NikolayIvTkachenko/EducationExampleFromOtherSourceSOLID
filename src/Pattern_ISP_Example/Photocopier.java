package Pattern_ISP_Example;

public class Photocopier implements Printer, IScanner
{
	public void Print(Document d) throws Exception
	{
		throw new Exception();
	}

	public void Scan(Document d) throws Exception
	{
		throw new Exception();
	}
}