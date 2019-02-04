/*
Main.java
Created by Zachery Miller
*/


import java.util.*;

class Main {
	
	public static void main(String[] args) {

		Node start = createTestTree();
		Tree tree = new Tree(start);
		tree.findNodeRecursivelyGivenName("FindMe");
	}

	public static Node createTestTree() {
		//Left Branch
		Node E1 = new Node("E1");

		List<Node> D1Children = new ArrayList<Node>();
		D1Children.add(E1);
		Node D1 = new Node("D1", D1Children);

		List<Node> A1Children = new ArrayList<Node>();
		A1Children.add(D1);
		Node A1 = new Node("A1", A1Children);

		//Right Branch
		Node findMe = new Node("FindMe");

		List<Node> B1Children = new ArrayList<Node>();
		B1Children.add(findMe);
		Node B1 = new Node("B1", B1Children);

		Node C1 = new Node("C1");

		List<Node> B2Children = new ArrayList<Node>();
		B2Children.add(C1);
		Node B2 = new Node("B2", B2Children);

		List<Node> A2Children = new ArrayList<Node>();
		A2Children.add(B1);
		A2Children.add(B2);
		Node A2 = new Node("A2", A2Children);


		//Start Node
		List<Node> startChildren = new ArrayList<Node>();
		startChildren.add(A1);
		startChildren.add(A2);
		Node start = new Node("Start", startChildren);

		return start;
	}
}