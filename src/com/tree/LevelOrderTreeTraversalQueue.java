package com.tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class LevelOrderTreeTraversalQueue {
	public static void main(String[] args) {
		Node testData = Node.testData();

		levelOrder(testData);

	}

	private static void levelOrder(Node testData) {

		Queue<Node> queue = new LinkedBlockingQueue<Node>();
		queue.add(testData);

		while (!queue.isEmpty()) {
			Node root = queue.poll();
			if (root != null) {
				System.out.println(root.key);
			}
			if (root.left != null) {
				queue.add(root.left);
			}

			if (root.right != null) {
				queue.add(root.right);
			}
		}

	}

}
