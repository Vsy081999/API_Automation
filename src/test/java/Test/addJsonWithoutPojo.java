package Test;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class addJsonWithoutPojo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ObjectMapper objectMapper = new ObjectMapper();

		File file = new File("C:\\Users\\Vsy08\\eclipse-workspace\\API_Automation\\src\\test\\java\\Address.json");

		Map<String, Object> address = objectMapper.readValue(file, new TypeReference<Map<String, Object>>() {
		});

    	address.put("city", "Noida");
		address.put("landMark[0]", "45 street");
		
		

		String updated = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);

		System.out.println("City_updated   :" + updated);

	}

}
