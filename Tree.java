import java.util.*;


class Tree {

	private Node root;

	Tree(Node root) {
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node newRoot) {
		this.root = newRoot;
	}

	public void findNodeRecursivelyGivenName (String name) {

		if (root != null) {
			traverseTreeRecursive(root, name);

		}		
	}

	private boolean traverseTreeRecursive (Node currentNode, String name) {
		boolean targetNodeFound = false;

		if (currentNode.name != null) {
			System.out.println(currentNode.name);

			if (currentNode.name == name) {
				return true;
			}

		}

		int count = 0;

		while (count < currentNode.children.size() && !targetNodeFound) {
			targetNodeFound = traverseTreeRecursive(currentNode.children.get(count), name);
			count++;
		}

		return targetNodeFound;
	}

	public void findNodeIterativelyGivenName (String name) {

		if (root == null) {
			return;
		}

		Queue<Node> childrenToVisit = new LinkedList<Node>();

		Node current;

		childrenToVisit.add(root);

		while (!childrenToVisit.isEmpty()) {
			current = childrenToVisit.remove();
			if (current.name != null) {
				System.out.println(current.name);

				if (current.name == name) {
					return;
				}
			}
			
			if (current.children != null) {
				childrenToVisit.addAll(current.children);
			}	
		} 
	}
}