package com.tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class MinimumDepthOfBinaryTree {
	public static void main(String[] args) {
		Node testData = Node.testData();

		int height = height(testData);
		System.out.println(height);

	}

	private static int height(Node testData) {
		Queue<Node> queue = new LinkedBlockingQueue<Node>();
		queue.add(testData);
		int depth = 0;
		
		while (!queue.isEmpty()) {
			Node root = queue.poll();
			if (root != null) {
				if (root.left == null && root.right == null) {
					depth ++;
				}
			}
			if (root.left != null) {
				queue.add(root.left);
			}

			if (root.right != null) {
				queue.add(root.right);
			}
		}
		
		return 0;
	}
}
