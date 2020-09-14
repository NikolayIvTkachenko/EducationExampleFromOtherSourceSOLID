package Pattern_OCP_Example;

public interface Specification<T>
{
	  boolean isSatisfied(T item);
}
