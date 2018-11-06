package Dummy;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONObject;

import com.workfall.api.utils.Output;
import com.workfall.api.utils.Utils_API;

import net.minidev.json.JSONArray;

public class SpringPractice_Automation {
	public static JSONObject body = new JSONObject();

	public static void AddLibrary() throws Exception {
		String Endpoint = "/add-library";

		String name = Utils_API.RandomString();
		int cityId = new Random().nextInt(10);
		if (cityId == 0) {
			cityId = 4;
		}
		String address = Utils_API.RandomStringLong();
		Boolean isActive = Boolean.TRUE;

		body = new JSONObject();
		body.put("name", name);
		body.put("cityId", cityId);
		body.put("address", address);
		body.put("isActive", isActive);

		sendPost(Endpoint, body);
	}

	public static void Category() throws Exception {
		String Endpoint = "/add-category";

		String Category[] = { "Science fiction", "Satire", "Drama", "Action", "Adventure", "Romance", "Mystery",
				"Horror", "Self help" };
		for (int i = 0; i < Category.length; i++) {
			body = new JSONObject();
			body.put("name", Category[i]);
			body.put("description", Utils_API.RandomStringLong());
			sendPost(Endpoint, body);
		}
	}

	public static void Publisher() throws Exception {
		String Endpoint = "/add-publisher";
		body = new JSONObject();
		body.put("name", Utils_API.RandomString().toUpperCase());
		body.put("description", Utils_API.RandomStringLong());
		sendPost(Endpoint, body);
	}

	public static void Language() throws Exception {
		String Endpoint = "/add-language";

		String Category[] = { "Albanian", "Arabic", "Polish", "French", "Portuguese", "German", "Greek", "Russian",
				"English", "Hindi", "Telugu" };
		for (int i = 0; i < Category.length; i++) {
			body = new JSONObject();
			body.put("name", Category[i]);
			body.put("isActive", Boolean.TRUE);
			sendPost(Endpoint, body);
		}
	}

	public static void City() throws Exception {
		String Endpoint = "/add-city";

		String cityL[] = { "HYD", "BZA", "PUNE", "CHE", "TPTY", "VSKP", "VZM", "RJY", "KMT", "NGP" };
		String cityL2[] = { "HYDERABAD", "VIJAYAWADA", "PUNE", "CHENNAI", "TIRUPATI", "VISHAKAPATNAM", "VIJAYANAGARAM",
				"RAJAMUNDRY", "KHAMMAM", "NAGPUR" };
		for (int i = 0; i < cityL.length; i++) {
			body = new JSONObject();
			body.put("cityCode", cityL[i]);
			body.put("cityName", cityL2[i]);
			sendPost(Endpoint, body);
		}
	}
	
	public static void addBooksToLibrary() throws Exception {
		String Endpoint = "/add-books-tolibrary";
		
		JSONArray array = new JSONArray();
		List<JSONObject> list = new ArrayList<JSONObject>();
				for (int i = 1; i <=30; i++) {
					for (int j = 1; j <=30; j++) {
						body = new JSONObject();
						body.put("bookId", i);
						body.put("copies", 2);
						body.put("libraryId", j);
						list.add(body);
						array.add(list);
						sendPost(Endpoint, body);
					}
				}
	}

	public static void SignUp() throws Exception {
		String Endpoint = "/signup";

		String cityL[] = { "HYD", "BZA", "PUNE", "CHE", "TPTY", "VSKP", "VZM", "RJY", "KMT", "NGP" };
		int IdRandom1 = new Random().nextInt(cityL.length);
		String cityCode = cityL[IdRandom1];
		String email = RandomStringUtils.random(8, "abcdefghijklmnopqrstuvwxyz") + "@" + "spring.com";
		String genderL[] = { "MALE", "FEMALE" };
		int IdRandom2 = new Random().nextInt(genderL.length);
		String gender = genderL[IdRandom2];
		boolean isActive = Boolean.TRUE;
		String mobileNumber = Utils_API.generatePhonenumber();
		String name = Utils_API.RandomString();
		String password = "spring@123";
		String RoleL[] = { "USER", "AUTHOR" };
		int RoleRand = new Random().nextInt(RoleL.length);

		body = new JSONObject();
		body.put("email", email);
		body.put("gender", gender);
		body.put("isActive", isActive);
		body.put("mobileNumber", mobileNumber);
		body.put("name", name);
		body.put("password", password);
		body.put("cityCode", cityCode);
		body.put("role", RoleL[RoleRand]);

		sendPost(Endpoint, body);

	}

	public static void AddBook() throws Exception {
		String Endpoint = "/add-book";
		String description = Utils_API.RandomStringLong();
		Boolean isActive = Boolean.TRUE;
		String pages = RandomStringUtils.random(3, "123456789");
		int IdRandom1 = new Random().nextInt(11);
		if (IdRandom1 == 0) {
			IdRandom1 = 4;
		}
		int IdRandom2 = new Random().nextInt(9);
		if (IdRandom2 == 0) {
			IdRandom2 = 6;
		}

		int IdRandom3 = new Random().nextInt(10);
		if (IdRandom3 == 0) {
			IdRandom3 = 5;
		}
		int IdRandom4 = new Random().nextInt(13);
		if (IdRandom4 == 0) {
			IdRandom4 = 7;
		}
		
		String title = Utils_API.RandomString();

		body = new JSONObject();
		body.put("authorId", IdRandom4);
		body.put("description", description);
		body.put("isActive", isActive);
		body.put("languageId", IdRandom1);
		body.put("pages", pages);
		body.put("publisherId", IdRandom3);
		body.put("categoryId", IdRandom2);
		body.put("title", title);
		body.put("copies", "10");

		sendPost(Endpoint, body);

	}

	public static BufferedReader sendPost(String Endpoint, JSONObject body) throws Exception {

		String url = "http://localhost:8282" + Endpoint;
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// add request header
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json");
		// String data= "{\"email\":\"email@admin.com\",\"password\":\"123\"}";
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(body.toString());
		wr.flush();
		int responseCode = con.getResponseCode();

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		Output.OutputConsole("Sending 'POST' request to : " + url);
		Output.OutputConsole("Post parameters : " + body);
		Output.OutputConsole("Response Code : " + responseCode);
		JSONObject response = new JSONObject(in.readLine());
		Output.OutputConsole("Response Data : " + response);
		/*
		 * String inputLine; response = new StringBuffer(); while ((inputLine =
		 * in.readLine()) != null) { response.append(inputLine); }
		 */

		return in;
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 30; i++) {
			AddBook();
		}
		
	}
}
