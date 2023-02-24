package com.spring.tutorial;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Arrays;
@Component
//@Qualifier("bubble")
public class BubbleSort implements SortingAlgorithm {
    @Override
    public int[] sort(int[] arr)
    {
        return Arrays.stream(arr).sorted().toArray();
    }
}
