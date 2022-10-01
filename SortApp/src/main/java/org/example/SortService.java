package org.example;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Mixin;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.env.Environment;

@Service
public class SortService {

    @NotNull
    public Integer[] sortArray(@NotNull String array) {
        Integer[] inputArray = Arrays.stream(array.split(","))
                .map(Integer::valueOf)
                .toArray(Integer[]::new);
        sort(inputArray);
        return inputArray;

    }

    //Selection sort
    public static <T extends Comparable<? super T>>
    void sort(T @NotNull [] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int minPos = i;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[j].compareTo(array[minPos]) < 0) {
                    minPos = j;
                }
            }
            T saveValue = array[minPos];
            array[minPos] = array[i];
            array[i] = saveValue;
        }
    }


}
