package com.capgemini;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

import javax.lang.model.element.Element;

public class ArraysMinMax {
	public static void main(String[] args) {
		int array[]= {2,4,245,7,3,8,2,1,4,8,9};
		int negativePostiveArray[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		/*
		 * System.out.println(Arrays.toString( IntStream.concat(
		 * Arrays.stream(negativePostiveArray).filter(element-> element<0),
		 * Arrays.stream(negativePostiveArray).filter(element -> element>0).toArray()
		 * )));
		 */
		
		System.out.println("Minimum value : "+Arrays.stream(array).min().getAsInt()+"...."
				+ "....... Maximum Value : "+Arrays.stream(array).max().getAsInt());
	}
	
	
}
