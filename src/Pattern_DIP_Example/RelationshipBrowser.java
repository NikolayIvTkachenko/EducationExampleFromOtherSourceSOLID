package Pattern_DIP_Example;

import java.util.List;

public interface RelationshipBrowser {
	List<Person> findAllChildrenOf(String name);
}
