package Dummy;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONObject;

import com.workfall.api.utils.Output;
import com.workfall.api.utils.Utils_API;

public class SpringPractice_Automation {
	public static JSONObject body = new JSONObject();
	public static void CreateUser() throws Exception{
		String Endpoint ="/add-user";
		for (int i = 1; i <= 15; i++) {
			
		
		String name = "user"+i;
		String email = "user"+i+"@spring.com";
		String mobileNumber = "1232"+i;
		String employeeId = "E00"+i;

		body = new JSONObject();
		body.put("name", name);
		body.put("email", email);
		body.put("mobileNumber", mobileNumber);
		body.put("employeeId", employeeId);

		sendPost_Without(Endpoint, body);
		}
}
	
	public static void Category() throws Exception{
		String Endpoint ="/add-category";
		
		String Category[] = {"Science fiction","Satire","Drama","Action","Adventure","Romance","Mystery","Horror","Self help"};
		for (int i = 0; i <Category.length; i++) {
			body = new JSONObject();
			body.put("name", Category[i]);
			body.put("description", Utils_API.RandomStringLong());
			sendPost_Without(Endpoint, body);
		}
		}
	public static void Language() throws Exception{
		String Endpoint ="/add-language";
		
		String Category[] = {"Albanian","Arabic","Polish","French","Portuguese","German","Greek","Russian","English","Hindi","Telugu"};
		for (int i = 0; i <Category.length; i++) {
			body = new JSONObject();
			body.put("name", Category[i]);
			body.put("isDeleted", Boolean.TRUE);
			sendPost_Without(Endpoint, body);
		}
		}
	
	public static void PracticeSpring() throws Exception {
		String Endpoint ="/add-book";

//		int reimbursementId = getReimbursementId();
//		String reimbursementStatusList[] = {"APPROVED","REJECTED"};
//		int IdRandom = new Random().nextInt(reimbursementStatusList.length);
//		String reimbursementStatus= reimbursementStatusList[IdRandom];
		
		/*String cityL[] = {"HYD","BZA","PUNE","TNA","TPTY","VSKP","VZM","RJY","LC","NGP"};
		int IdRandom1 = new Random().nextInt(cityL.length);
		String cityCode = cityL[IdRandom1];
		String email= RandomStringUtils.random(8, "abcdefghijklmnopqrstuvwxyz") + "@" + "spring.com";
		String genderL[] = {"MALE","FEMALE"};
		int IdRandom2 = new Random().nextInt(genderL.length);
		String gender = genderL[IdRandom2];
		boolean isActive= Boolean.TRUE;
		String mobileNumber = Utils_API.generatePhonenumber();
		String name= Utils_API.RandomString();
		String password = Utils_API.RandomString();

		body = new JSONObject();
		body.put("email", email);
		body.put("gender", gender);
		body.put("isActive", isActive);
		body.put("mobileNumber", mobileNumber);
		body.put("name", name);
		body.put("password", password);
		body.put("cityCode", cityCode);*/
		
		
//	
		
		String author= Utils_API.RandomString();
		String description = Utils_API.RandomStringLong();
		boolean isActive= Boolean.TRUE;
		String pages=  RandomStringUtils.random(3, "123456789");
		String publisher = Utils_API.RandomString();
		int IdRandom1 = new Random().nextInt(9);
		if (IdRandom1 == 0) {
			IdRandom1 = 4; 
		}
		int IdRandom2 = new Random().nextInt(9);
		if (IdRandom2 == 0) {
			IdRandom2 = 6; 
		}
		String title = Utils_API.RandomString();
		
		body = new JSONObject();
		body.put("author", author);
		body.put("description", description);
		body.put("isActive", isActive);
		body.put("languageId", IdRandom1);
		body.put("pages", pages);
		body.put("publisher", publisher);
		body.put("categoryId", IdRandom2);
		body.put("title", title);
		
		
		sendPost_Without(Endpoint, body);

	}
	
	public static BufferedReader sendPost_Without(String Endpoint, JSONObject body)
			throws Exception {

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
		/*String inputLine;
		response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}*/
		
		return in;
	}
	
	public static void main(String[] args) throws Exception {
		for (int i = 0; i <100; i++) {
			PracticeSpring();
		}
	

	}

}
