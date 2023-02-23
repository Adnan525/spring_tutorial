package com.spring.tutorial;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Primary
//primary annotation to use this class as default if we have multiple classes of same implementation
public class QuickSort implements SortingAlgorithm{
    @Override
    public int[] sort(int[] arr) {
        return Arrays.stream(arr).sorted().toArray();
    }
}
