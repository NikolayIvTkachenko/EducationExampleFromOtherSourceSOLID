package Pattern_ISP_Example;

public interface Machine {
	void print(Document d);
	void fax(Document d) throws Exception;
	void scan(Document d) throws Exception;
}
