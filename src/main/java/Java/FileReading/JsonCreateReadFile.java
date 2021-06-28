package Java.FileReading;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

@SuppressWarnings("unchecked")
public class JsonCreateReadFile {

	public static void WriteJsonFile() {
		JSONObject obj = new JSONObject();
		obj.put("name", "mkyong.com");
		obj.put("age", new Integer(100));
		
		JSONArray list = new JSONArray();
		list.add("msg 1");
		list.add("msg 2");
		list.add("msg 3");
		
		obj.put("messages", list);

		
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put("userName", "mkyong@mkyong.com");
		map.put("passwors", "1234567");
		
		obj.put("details", map);
		
		ArrayList<HashMap<Object, Object>> al = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			map = new HashMap<>();
			map.put("userName", "user"+i+"@json.com");
			map.put("password", "12345"+i);
			al.add(map);
		}
		
		obj.put("listOfItems", al);
		
		try (FileWriter file = new FileWriter("test.json")) {

			file.write(obj.toJSONString());
			file.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.print(obj);

	}

	public static void ReadJsonFile() {

		JSONParser parser = new JSONParser();

		try {

			Object obj = parser.parse(new FileReader("test.json"));

			JSONObject jsonObject = (JSONObject) obj;
//			System.out.println(jsonObject);

			String name = (String) jsonObject.get("name");
			System.out.println(name);

			long age = (Long) jsonObject.get("age");
			System.out.println(age);
			
			JSONObject innerObject = (JSONObject) jsonObject.get("details");
			System.out.println(innerObject.get("userName"));
			
			JSONArray listOfItems = (JSONArray) jsonObject.get("listOfItems");
			
			for (Object object : listOfItems) {
				JSONObject jsonObject2 = (JSONObject) object;
				System.out.println(jsonObject2.get("userName").toString());
				System.out.println(jsonObject2.get("password").toString());
			}
			
			
			// loop array
			JSONArray msg = (JSONArray) jsonObject.get("messages");
			
			Iterator<String> iterator = msg.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
//		WriteJsonFile();
		ReadJsonFile();
	}

}
