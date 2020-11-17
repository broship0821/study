package ex35hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		
		System.out.println(hm1.size());
		
		hm1.put(new Integer(100), "멋쟁이");
		hm1.put(new Integer(300), "공주");
		hm1.put(new Integer(200), "왕자");
		
		System.out.println(hm1.get(300)); //value가 출력
		System.out.println(hm1.get(100));
		System.out.println(hm1.get(200));
		
		hm1.remove(300);
		if(hm1.size()>0)
			System.out.println(hm1.size());
		
		//value 모음 출력
		Collection<String> v1 = hm1.values();
		System.out.println(v1);
		
		//key 모음 출력
		Set<Integer> s1 = hm1.keySet();
		System.out.println(s1);
		
		//s1을 이용해서 key, value 출력
		for(Integer i : s1) {
			System.out.println(i + " : " + hm1.get(i));
		}
		
		
		
		
		Set<Map.Entry<Integer, String>> set3 = hm1.entrySet(); //map에 들어있는 내용을 처음부터 key,value로 종이박스(Map과 가장 비슷함)에 삽입
		for(Map.Entry<Integer, String> k : set3) {
			System.out.println(k.getKey()+ " : " + k.getValue());
		}
		
		System.out.println("--------------");
		//iterator 사용
		System.out.println("hash-map-iterator");
		Iterator it = hm1.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
