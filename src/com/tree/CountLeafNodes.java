package com.tree;

public class CountLeafNodes {
	public static void main(String[] args) {
		Node testData = Node.testData();

		int count = leaf(testData);
		System.out.println(count);

	}

	private static int leaf(Node testData) {
		if (testData == null) {
			return 0;
		}

		if (testData.left == null && testData.right == null) {
			return 1;
		}

		int a = leaf(testData.left);
		int b = leaf(testData.right);

		return a + b ;
	}

}
