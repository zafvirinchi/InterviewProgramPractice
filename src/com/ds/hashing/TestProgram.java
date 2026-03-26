package com.ds.hashing;

import java.util.List;
import java.util.Optional;

public class TestProgram {
	
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,5,4,7,6);

		Optional<Integer> sum = list.stream().filter(i->i%2==0).map(sq->sq*sq).reduce(Integer::sum);
		
		System.out.println(sum.get());
	}

}
