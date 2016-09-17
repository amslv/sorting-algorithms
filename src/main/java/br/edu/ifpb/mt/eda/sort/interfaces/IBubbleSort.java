package br.edu.ifpb.mt.eda.sort.interfaces;

/**
 * 
 * @author <a href="https://github.com/amslv">Ana Silva</a>
 *
 */
public interface IBubbleSort {

	/**
	 * Sorting algorithm 'Bubble Sort' implemented recursively.
	 * 
	 * @param list
	 * 		Array to be sorted
	 * @param n
	 * 		Length of the array
	 * @return
	 * 		Array sorted
	 */
	Integer[] sort(Integer[] list, Integer n);
}
