package com.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ProductRunner {

	public static void main(String[] args) {
		List<Product> refernce = new ArrayList<>();

		refernce.add(new Product("Water", 86));
		refernce.add(new Product("milk", 23));
		refernce.add(new Product("biscuits", 24));
		refernce.add(new Product("FruitShake", 44));
		refernce.add(new Product("Badam Milk", 36));

		Collections.sort(refernce, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		for (Product product : refernce) {

			System.out.println(product);

		}

		Stream<Product> filtering_data = refernce.stream().filter(p -> p.price > 1);

		 filtering_data.forEach((Product111 -> System.out.println(Product111.name+"===="+Product111.price)));
		
	}

}
