package com.epam.lambdas;

import java.util.*;
public class Average {
       public double average(List<Integer> arr) {
    	   return arr.stream().mapToInt(number -> number.intValue()).average().getAsDouble();
       }
}