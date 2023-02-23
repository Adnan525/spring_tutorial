package com.spring.tutorial;
import org.springframework.stereotype.Component;
import java.util.Arrays;
@Component
public class BubbleSort implements SortingAlgorithm {
    @Override
    public int[] sort(int[] arr)
    {
        return Arrays.stream(arr).sorted().toArray();
    }
}
