package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Product> prodList=new ArrayList<Product>();
		prodList.add(new Product(1001,"TV",95000,1,"Apple",0));
		prodList.add(new Product(1002,"Tripod",7000,2,"Digitech",100));
		prodList.add(new Product(1003,"CCTV Camera",4500,5,"Mi",150));
		prodList.add(new Product(1004,"Mobile",50000,1,"Samsung",0));
		prodList.add(new Product(1005,"Monitor",16000,4,"Dell",100));
		prodList.add(new Product(1006,"Mouse",1200,15,"logitech",50));
		prodList.add(new Product(1007,"Camera",1200,15,"logitech",0));
		prodList.add(new Product(1008,"Bluetooth",1200,15,"logitech",0));
		// filter out names of products with zero delivery
		List<String>myList=prodList.stream()
				.filter(p->p.deliveryCharges==0)
				.filter(p->p.brand.equals("logitech"))
				.map(p->p.name)
				.collect(Collectors.toList());
		System.out.println(myList);
		
		Set<String>mySet=prodList.stream()
				.filter(p->p.deliveryCharges==0)
				.map(p->p.name)
				.collect(Collectors.toSet());
		System.out.println(mySet);
		
		Map<Object, Object> myMap=prodList.stream()
				.filter(p->p.brand.equals("logistics"))
				.collect(Collectors.toMap(p->p.prodId, p->p.name));
		System.out.println(myMap);
	
	prodList.stream().filter(p->p.deliveryCharges==0)
	        .filter(p->p.brand.equals("logitech"))
	        .map(p->p.name)
	        .forEach(p->System.out.println(p));

}
}


