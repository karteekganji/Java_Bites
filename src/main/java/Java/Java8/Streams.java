package Java.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Java.Java8.Streams.RemoveStringFromList.Person;

public class Streams {
	public static class WithoutStreams {
		public static void main(String[] args) {
			List<String> names = new ArrayList<String>();
			names.add("Ajeet");
			names.add("Negan");
			names.add("Aditya");
			names.add("Steve");
			int count = 0;
			for (String str : names) {
				if (str.length() < 6)
					count++;
			}
			System.out.println("There are " + count + " strings with length less than 6");
		}
	}

	public static class WithStreams {
		public static void main(String[] args) {
			List<String> names = new ArrayList<String>();
			names.add("Ajeet");
			names.add("Negan");
			names.add("Aditya");
			names.add("Steve");

			// Using Stream and Lambda expression
			long count = names.stream().filter(str -> str.length() < 6).count();
			System.out.println("There are " + count + " strings with length less than 6");

		}
	}
	

	
	
	/*What is the difference between these codes?*/
	
	/**
	 * The output of both the examples are same, however there is a major
	 * difference between these examples if you consider the performance of the
	 * code. 
	 * In the first example, we are iterating the whole list to find the
	 * strings with length less than 6. There is no parallelism in this code.
	 *  
	 * In the second example, the stream() method returns a stream of all the
	 * names, the filter() method returns another stream of names with length
	 * less than 6, the count() method reduces this stream to the result. All
	 * these operations are happening parallelly which means we are able to
	 * parallelize the code with the help of streams. Parallel execution of
	 * operations using stream is faster than sequential execution without using
	 * streams.
	 */
	
	/*
	 * Java Stream Example 1: Iterating and displaying selected integers
	 */
	
	public static class DisplayingSelectedIntegers {
		public static void main(String[] args) {
			Stream.iterate(1, count -> count + 1).filter(number -> number % 3 == 0).limit(6)
					.forEach(System.out::println);
		}
	}
	
	/* Java Stream Example 2: Concatenating two streams */
	
	public static class ConcatenatingTwoStreams {
		public static void main(String[] args) {
			// list 1
			List<String> alphabets = Arrays.asList("A", "B", "C");
			// list 2
			List<String> names = Arrays.asList("Sansa", "Jon", "Arya");

			// creating two streams from the two lists and concatenating them into one
			Stream<String> opstream = Stream.concat(alphabets.stream(), names.stream());

			// displaying the elements of the concatenated stream
			opstream.forEach(str -> System.out.print(str + " "));
		}
	}
	
	public static class RemoveStringFromList {

	    public static void main(String[] args) {

	        List<String> lines = Arrays.asList("spring", "node", "mkyong");

	        List<String> result = lines.stream()                // convert list to stream
	                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
	                .collect(Collectors.toList());              // collect the output and convert streams to a List

	        result.forEach(System.out::println);                //output : spring, node

	    }

	    public static class Person {

	        private String name;
	        private int age;

	        public Person(String name, int age) {
	            this.name = name;
	            this.age = age;
	        }

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

	    } 
	    
	    public static class NowJava8 {

	        public static void main(String[] args) {

				List<Person> persons = Arrays.asList(new Person("mkyong", 30), new Person("jack", 20),
						new Person("lawrence", 40));

	            Person result1 = persons.stream()                        // Convert to steam
	                    .filter(x -> "jack".equals(x.getName()))        // we want "jack" only
	                    .findAny()                                      // If 'findAny' then return found
	                    .orElse(null);                                  // If not found, return null

				System.out.println(result1);

				Person result2 = persons.stream().filter(x -> "ahmook".equals(x.getName())).findAny().orElse(null);

				System.out.println(result2);

	        }

	    } 
	    
	}
	
	public static class FilterAndMap {

		public static void main(String[] args) {

			List<Person> persons = Arrays.asList(new Person("mkyong", 30), new Person("jack", 20),
					new Person("lawrence", 40));

			String name = persons.stream().filter(x -> "jack".equals(x.getName())).map(Person::getName).findAny()
					.orElse(""); //convert stream to String

			System.out.println("name : " + name);

			List<String> collect = persons.stream().map(Person::getName).collect(Collectors.toList());

			collect.forEach(System.out::println);

		}

	}
	
	/*
	 * Filter Map by both Keys and Values
	 */	
	
	public static class FilterMapKeysAndValues {
		   public static void main(String[] args) {
			Map<Integer, String> hmap = new HashMap<Integer, String>();
			hmap.put(1, "ABC");
			hmap.put(2, "XCB");
			hmap.put(3, "ABB");
			hmap.put(4, "ZIO");

		      Map<Integer, String> result = hmap.entrySet()
		         .stream()
		         .filter(p -> p.getKey().intValue() <= 2) //filter by key
		         .filter(map -> map.getValue().startsWith("A")) //filter by value
		         .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

		     System.out.println("Result: " + result);
		   }
		}
}
