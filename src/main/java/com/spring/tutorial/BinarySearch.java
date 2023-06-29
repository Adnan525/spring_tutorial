package com.spring.tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.stream.IntStream;

// ctrl + space to get the list of suggestions for imports / or normal suggestions
@Component
public class BinarySearch {
//  @Qualifier("bubble")
    @Autowired
    SortingAlgorithm sortingAlgorithm;
//    SortingAlgorithm bubbleSort; this will use the name "buubleSort" and use the bubbleSort bean
//    annotation has higher priority than the name, so if we had @primary on bubble
//    but variable name was quickSort, it would still use bubbleSort

    //    constructor injection
//    public BinarySearch(SortingAlgorithm sortingAlgorithm)
//    {
//        this.sortingAlgorithm = sortingAlgorithm;
//    }
    //setter injection
    //even if we don't hav a setter, spring will use setter injection by default
    public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm)
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
    }
}
