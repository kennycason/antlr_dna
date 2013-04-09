package lib;

import java.io.IOException;
import java.util.Properties;

public class SystemUtils {
	
	private SystemUtils() {
		
	}
	
	public static String getClassPath() {
		Properties prop = System.getProperties();
		return prop.getProperty("java.class.path");
	}

	public static Process exec(String command) {
		return exec(command, false);
	}
	
	public static Process exec(String command, boolean sync) {
		try {
			Process p = Runtime.getRuntime().exec(new String[]{"bash","-c",command});
			if(!sync) {
				return p;
			}
			p.waitFor();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
