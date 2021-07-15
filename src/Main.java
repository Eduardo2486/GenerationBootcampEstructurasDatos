import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HashSet");
		
		Set<String> fruits = new HashSet();
		fruits.add("Apple");
		fruits.add("Cherry");
		fruits.add("Melon");
		fruits.add("Watermelon");

		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		

		System.out.println("TreeSet");
		
		Set<String> fruits1 = new TreeSet();
		fruits.add("Apple");
		fruits.add("Cherry");
		fruits.add("Melon");
		fruits.add("Watermelon");
		
		for(String fruit: fruits1) {
			System.out.println(fruit);
		}
		
		
		System.out.println("LinkedHashSet");
		
		Set<String> fruits2 = new LinkedHashSet();
		fruits.add("Apple");
		fruits.add("Cherry");
		fruits.add("Melon");
		fruits.add("Watermelon");
		
		for(String fruit: fruits2) {
			System.out.println(fruit);
		}


		System.out.println("ArrayList");

		List<String> fruits3 = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Cherry");
		fruits.add("Melon");
		fruits.add("Watermelon");
		
		for(String fruit: fruits3) {
			System.out.println(fruit);
		}
		
	
		int apple = fruits3.indexOf("Apple");
		System.out.println(apple);


		System.out.println(fruits3.get(apple));
		
		System.out.println("ArrayList integer");
		
		List<Integer> agenda = new ArrayList<Integer>();
		agenda.add(456);
		agenda.add(123);
		agenda.add(789);
		
		for(Integer day: agenda) {
			System.out.println(day);
		}
		
		
		
		System.out.println("LinkedList");
		
		//LinkedList
		List<String> animals = new LinkedList<String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Turtle");	
		animals.add("Bear");
		
		int dog = animals.indexOf("Dog");
		animals.add(dog, "Cow");
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		
		
		System.out.println("HashMap");
		
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("name", "Some name");
		dictionary.put("age", "15");
		dictionary.put("gender", "male");

		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		
		
		System.out.println("TreeMap");
		
		Map<String, String> dictionary1 = new TreeMap<>();
		dictionary1.put("name", "Some name");
		dictionary1.put("age", "15");
		dictionary1.put("gender", "male");

			
		for (Map.Entry<String, String> entry : dictionary1.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		

		
		System.out.println("LinkedHashMap");
		
		Map<String, String> dictionary2 = new LinkedHashMap<>();
		dictionary2.put("name", "Some name");
		dictionary2.put("age", "15");
		dictionary2.put("gender", "male");
		
		for (Map.Entry<String, String> entry : dictionary2.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		
	}

}