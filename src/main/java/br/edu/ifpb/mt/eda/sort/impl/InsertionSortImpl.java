package br.edu.ifpb.mt.eda.sort.impl;

import br.edu.ifpb.mt.eda.sort.interfaces.IInsertionSort;

public class InsertionSortImpl implements IInsertionSort {

	public Integer[] sort(Integer[] list) {
		for (int i = 1; i < list.length; i++) {
			Integer aux = list[i];
			Integer j;
			for(j = i-1; j >= 0 && aux < list[j]; j--) {
				list[j+1] = list[j];
			}
			list[j+1] = aux;
		}
		return list;
	}
}