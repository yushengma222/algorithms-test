package com.example.algorithms;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AlgorithmsApplication.class)
public class AlgorithmsTests {

	private static int[] arr;
	@Before
	public void init() {
		arr = new int[]{5, 15, 6, 2, 35, 18, 16, 8, 22, 16};
		printArr();
	}

	@Test
	public void bubbleSortTest() {
		for (int out = arr.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (arr[in] > arr[in + 1]) {
					transMethod(in, in + 1);
				}
			}
		}
		printArr();
	}

	@Test
	public void selectSortTest() {
		for (int out = 0; out < arr.length; out++) {
			for (int in = out + 1; in < arr.length; in++) {
				if (arr[out] > arr[in]) {
					transMethod(out, in);
				}
			}
		}
		printArr();
	}

	@Test
	public void insertSortTest() {
		for (int out = 1; out < arr.length; out++) {
			int temp = arr[out];
			int in = out;
			while (in > 0 && arr[in - 1] > temp) {
				arr[in] = arr[in - 1];
				--in;
			}
			arr[in] = temp;
		}
		printArr();
	}

	@Test
	public void mergeSortTest() {
		int n = 10;
		int[] workSpace = new int[n];
		reMergeSort(workSpace, 0, n - 1);
		printArr();
	}

	private void reMergeSort(int[] workSpace, int lowIndex, int highIndex) {
		if (lowIndex == highIndex) {
			return;
		}
		int mid = (lowIndex + highIndex) / 2;
		reMergeSort(workSpace, lowIndex, mid);
		reMergeSort(workSpace, mid + 1, highIndex);
		merge(workSpace, lowIndex, mid + 1, highIndex);
	}

	private void merge(int[] workSpace, int lowBound, int highBound, int highIndex) {
		int j = 0;
		int lowIndex = lowBound;
		int n = highIndex - lowIndex + 1;
		int mid = highBound - 1;
		while (lowBound <= mid && highBound <= highIndex) {
			if (arr[lowBound] <= arr[highBound]) {
				workSpace[j++] = arr[lowBound++];
			} else {
				workSpace[j++] = arr[highBound++];
			}
		}
		while (lowBound <= mid) {
			workSpace[j++] = arr[lowBound++];
		}
		while (highBound <= highIndex) {
			workSpace[j++] = arr[highBound++];
		}
		for (int i = 0; i < n; i++) {
			arr[lowIndex + i] = workSpace[i];
		}
	}

	@Test
	public void heapSortTest() {
		heapSort();
		printArr();
	}

	private void heapSort() {
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			trickleDown(i, arr.length);
		}
		for (int j = arr.length - 1; j > 0; j--) {
			transMethod(0, j);
			trickleDown(0, j);
		}
	}

	private void trickleDown(int index, int length) {
		int top = arr[index];
		int childIndex = 2 * index + 1;
		while (childIndex < length) {
			if ((childIndex + 1) < length && arr[childIndex + 1] > arr[childIndex]) {
				childIndex++;
			}
			if (arr[childIndex] <= top) {
				break;
			}
			arr[index] = arr[childIndex];
			index = childIndex;
			childIndex = 2 * childIndex + 1;
		}
		arr[index] = top;
	}

	private void trickleUp(int index) {
		int parent = (index - 1) / 2;
		int bottom = arr[index];
		while (index > 0 && arr[parent] > bottom) {
			arr[index] = arr[parent];
			index = parent;
			parent = (parent - 1) / 2;
		}
		arr[index] = bottom;
	}

	private void transMethod(int m, int n) {
		int temp = arr[m];
		arr[m] = arr[n];
		arr[n] = temp;
	}

	private void printArr() {
		System.out.println("print arr: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

}
