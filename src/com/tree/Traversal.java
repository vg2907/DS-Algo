package com.tree;

public class Traversal {

	
	public static void main(String[] args) {
		Node testData = Node.testData();
		
		inorder(testData);
		System.out.println("*************");
		preOrder(testData);
		System.out.println("*************");
		postOrder(testData);
		
	}

	private static void postOrder(Node testData) {
		if(testData == null ) {
			return;
		}
		
		postOrder(testData.left);		
		postOrder(testData.right);
		System.out.println(testData.key);
		
	}

	private static void inorder(Node testData) {
		if(testData == null ) {
			return;
		}
		
		inorder(testData.left);
		System.out.println(testData.key);
		inorder(testData.right);
	}
	
	private static void preOrder(Node testData) {
		if(testData == null ) {
			return;
		}
		System.out.println(testData.key);
		preOrder(testData.left);
		
		preOrder(testData.right);
	}
}
