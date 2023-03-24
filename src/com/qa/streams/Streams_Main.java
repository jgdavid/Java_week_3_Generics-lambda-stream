package com.qa.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Streams_Main {
	public static void main(String[] args) {
		// Filter and string match to remove James from the list
		List<String> names = List.of("Micheal", "Dean", "James", "Chris");
		names.stream().filter(str -> !str.matches("James")).collect(Collectors.toList())
				.forEach(name -> System.out.println("Hello " + name));

		List<Integer> nums = List.of(3, 4, 7, 8, 12);

		// Reduce method multiplies all the numbers
		System.out.println(nums.stream().reduce(1, (a, b) -> a * b));

		// Find the highest number
		Integer Max = nums.stream().reduce(Math::max).get();
		// Find the lowest number
		Integer Min = nums.stream().reduce(Math::min).get();
		// Find all even numbers
		List<Integer> even = nums.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		// Find all odd numbers
		List<Integer> odd = nums.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
		System.out.println(Max);
		System.out.println(Min);
		System.out.println(odd);
		System.out.println(even);
		// two methods of getting the sum of all numbers
		System.out.println(nums.stream().reduce(0, (a, b) -> a + b));
		System.out.println(nums.stream().mapToInt(i -> i.intValue()).sum());
		// Squared the numbers removed the even ones and then got the smallest number
		System.out.println(nums.stream().map(num -> num * num).filter(x -> x % 2 == 1).reduce(Math::min).get());
//				.forEach(num -> System.out.println(num * num).filter(x -> x % 2 == 0).collect(Collectors.toList()));

	}
//	.forEach(System.out::println)
}
