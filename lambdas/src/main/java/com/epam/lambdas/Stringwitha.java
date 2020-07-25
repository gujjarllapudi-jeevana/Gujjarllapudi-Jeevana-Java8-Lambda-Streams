package com.epam.lambdas;

import java.util.*;
import java.util.stream.Collectors;
public class Stringwitha {
     public List<Object> find(List<String> arr){
    	 return arr.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());

}}