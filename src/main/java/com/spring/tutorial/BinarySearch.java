package com.spring.tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.stream.IntStream;

@Component
public class BinarySearch {
    //make this class loosely coupled
    @Autowired
    SortingAlgorithm sortingAlgorithm;
    public BinarySearch(SortingAlgorithm sortingAlgorithm)
    {
        this.sortingAlgorithm = sortingAlgorithm;
    }
    Optional<Integer> binarySearch(int[] arr, int n)
    {
        //sorting logic
        boolean isSorted = IntStream.range(0, arr.length - 1)
                .allMatch(i -> arr[i] <= arr[i+1]);
        if(isSorted) {
            //just returning a base value for the time being
            return Optional.of(3);
        }
        else {
            //sorting required
            //sorting algorithm
            //BubbleSort bSort = new BubbleSort();
            int[] sortedArr = sortingAlgorithm.sort(arr);
            //now i can just do a recursive call
            return Optional.empty();
        }
        //search the array
    }
}
