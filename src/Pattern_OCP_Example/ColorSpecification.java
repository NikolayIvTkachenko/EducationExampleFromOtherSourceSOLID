package Pattern_OCP_Example;

public class ColorSpecification  implements Specification<Product>
{
	  private Color color;

	  public ColorSpecification(Color color) {
	    this.color = color;
	  }

	  @Override
	  public boolean isSatisfied(Product p) {
	    return p.color == color;
	  }
}