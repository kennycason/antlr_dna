package grammar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TokenMapper {

	private HashMap<Integer, String> tokens;

	public TokenMapper(String file) {
		tokens = new HashMap<Integer, String>();
		parse(file);
	}

	private void parse(String file) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				if(line.contains("=")) {
					String[] args = line.split("=");
					tokens.put(Integer.parseInt(args[1]), args[0]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public Integer type(String type) {
		for(Map.Entry<Integer, String> entry : tokens.entrySet()) {
			if(entry.getValue().equals(type)) {
				return entry.getKey();
			}
		}
		return -1;
	}
	
	public String type(Integer type) {
		return tokens.get(type);
	}	

}
