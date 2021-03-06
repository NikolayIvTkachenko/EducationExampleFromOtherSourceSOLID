package Pattern_DIP_Example;

public class TestApp {

	public static void main(String[] args) {
		Person parent = new Person("John");
	    Person child1 = new Person("Chris");
	    Person child2 = new Person("Matt");

	    // low-level module
	    Relationships relationships = new Relationships();
	    relationships.addParentAndChild(parent, child1);
	    relationships.addParentAndChild(parent, child2);

	    new Research(relationships);

	}

}
