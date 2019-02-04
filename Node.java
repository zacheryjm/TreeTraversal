
import java.util.*;


class Node {
	public String name;
	public List<Node> children;

	Node(String name, List<Node> children) {
		this.name = name;
		this.children = children;
	}

	Node(String name) {
		this.name = name;
		this.children = new ArrayList<Node>();
	}

}


























