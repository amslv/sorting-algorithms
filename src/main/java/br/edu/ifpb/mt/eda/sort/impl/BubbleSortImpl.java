package br.edu.ifpb.mt.eda.sort.impl;

import br.edu.ifpb.mt.eda.sort.interfaces.IBubbleSort;

public class BubbleSortImpl implements IBubbleSort {

	public Integer[] sort(Integer[] list, Integer n) {
		// Only one number on the list, finished sorting
		if (n == 1) {
			return list;
		}
		Integer aux;
		for (int i = 0; i < n-1; i++) {
			if (list[i+1] < list[i]) {
				aux = list[i];
				list[i] = list[i+1];
				list[i+1] = aux;
			}
		}
		return sort(list, n-1);
	}
}