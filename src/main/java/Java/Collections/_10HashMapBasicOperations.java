package Java.Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _10HashMapBasicOperations {

	public static class HashMapExamples {
		@SuppressWarnings("rawtypes")
		public static void main(String[] args) {
			/* This is how to declare HashMap */
			HashMap<Integer, String> hmap = new HashMap<Integer, String>();

			/* Adding elements to HashMap */
			hmap.put(12, "Chaitanya");
			hmap.put(2, "Rahul");
			hmap.put(7, "Singh");
			hmap.put(49, "Ajeet");
			hmap.put(3, "Anuj");

			System.out.println(Collections.singletonList(hmap));
			hmap.forEach((key, value) -> System.out.println(key + " : " + value));
			System.out.println("\n#####Another Way of Printing#####\n");
			/* Display content using Iterator */
			Set set = hmap.entrySet();
			Iterator iterator = set.iterator();
			while (iterator.hasNext()) {
				Map.Entry mentry = (Map.Entry) iterator.next();
				System.out.println(mentry.getKey() + " : " + mentry.getValue());
			}

			/* Get values based on key */
			String var = hmap.get(2);
			System.out.println("Value at index 2 is: " + var);

			/* Remove values based on key */
			hmap.remove(3);
		}

	}

}
