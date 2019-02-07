package com.example.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgorithm {

	@Override
	public int[] sort(int[] number) {
		// TODO Auto-generated method stub
		return number;
	}

}
