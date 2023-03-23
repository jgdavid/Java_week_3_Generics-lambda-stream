package com.qa.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams_Main {
	public static void main(String[] args) {
		List<String> names = List.of("Micheal", "Dean", "James", "Chris");
		names.stream().filter(str -> str.matches("James")).collect(Collectors.toList())
				.forEach(name -> System.out.println(name + name));

		List<Integer> nums = List.of(3, 4, 7, 8, 12);

		// Reduce method multiplies all the numbers
		System.out.println(nums.stream().reduce(0, (a, b) -> a + b));

		Optional<Integer> Max = nums.stream().reduce(Math::max);
		Optional<Integer> Min = nums.stream().reduce(Math::min);
		System.out.println(Max);
		System.out.println(Min);

	}

}
