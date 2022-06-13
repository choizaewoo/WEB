package com.jwc.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.jwc.domain.model.Product;

public class ProductRepository {
	public static void main(String[] args) {
		
		//삽입 삭제가 빈번할 때 항상 동일 서능, but ArrayList보다 검색이 느리다.
		//메모리 조금 더 많이 먹는
		List<Product> product = new LinkedList<>();
		
		
		//크기가 커질수록 삽입, 삭제가 느려짐, 내부적으로 배열이라 성능이 일단 빠르다.
		ArrayList<Product> product2 = new ArrayList<>();
		
		sort(product);
	    sort(product2);
	}
	
	public static ArrayList<Product> sort(List<Product> products) {
		return new ArrayList<>();
	}
	
	
}
