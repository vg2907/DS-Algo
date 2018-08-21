package com.tree;

import java.util.ArrayList;
import java.util.List;

public class PathsFromRoot {

	public static void main(String[] args) {
		Node testData = Node.testData();

		printAllPaths(testData, new ArrayList<>(), 0);

	}

	private static void printAllPaths(Node testData, List<Integer> list, int index) {
		if (testData == null) {
			return;
		}

		list.add(index, testData.getKey());
		index++;
		
		printAllPaths(testData.left, list, index);
		printAllPaths(testData.right, list, index);
		if (testData.left == null && testData.right == null) {
			printAll(list, index);
		}
	}

	private static void printAll(List<Integer> list, int index) {
		for (int i = 0; i < index; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("***********");

	}
}
