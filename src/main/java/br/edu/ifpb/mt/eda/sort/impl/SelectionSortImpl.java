package br.edu.ifpb.mt.eda.sort.impl;

import br.edu.ifpb.mt.eda.sort.interfaces.ISelectionSort;

public class SelectionSortImpl implements ISelectionSort {

	public Integer[] sort(Integer[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			Integer index = i;
			for (int j = i + 1; j < list.length; j++)
				if (list[j] < list[index])
					index = j;

			Integer smallerNumber = list[index]; 
			list[index] = list[i];
			list[i] = smallerNumber;
		}
		return list;
	}
}
