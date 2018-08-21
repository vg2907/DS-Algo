package com.tree;

public class LeafNodes {

	public static void main(String[] args) {
		Node testData = Node.testData();

		leaf(testData);

	}

	private static void leaf(Node testData) {
		if (testData == null) {
			return;
		}

		if (testData.left == null && testData.right == null) {
			System.out.println(testData.key);
		}

		leaf(testData.left);
		leaf(testData.right);

	}
}
