package com.spring.tutorial;

import java.util.Arrays;

public class QuickSort implements SortingAlgorithm{
    @Override
    public int[] sort(int[] arr) {
        return Arrays.stream(arr).sorted().toArray();
    }
}
