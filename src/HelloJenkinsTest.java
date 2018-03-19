import com.google.gson.JsonObject;

public class HelloJenkinsTest {

	public static void main(String[] args) {
		System.out.println("please start your test");
		String oneWord = toDo();
		
		
		System.out.println("One Message :"+oneWord);

	}
	public static String toDo(){
		JsonObject obj = new JsonObject();
		obj.addProperty("name", "adam");
		obj.addProperty("address", "San Jose");
		return "hello, I am start doing my work\n"+obj.getAsJsonObject();
	}

}
