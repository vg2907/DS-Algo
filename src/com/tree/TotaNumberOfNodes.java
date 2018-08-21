package com.tree;

public class TotaNumberOfNodes {

	public static void main(String[] args) {
		Node testData = Node.testData();

		int height = numberOfNodes(testData);
		System.out.println(height);

	}

	private static int numberOfNodes(Node testData) {
		if (testData == null)
			return 0;
		
		int a = numberOfNodes(testData.left);
		int b = numberOfNodes(testData.right);
		
		return b + a  + 1;
	}
}
