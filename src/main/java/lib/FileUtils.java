package lib;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;

public class FileUtils {
	
	private static final Logger LOGGER = Logger.getLogger(FileUtils.class);

	private FileUtils() {
		
	}
	
	public static String pwd() {
		File directory = new File (".");
		try {
			return directory.getCanonicalPath() + "/";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String home() {
		String userHome = System.getProperty( "user.home" ) + "/";
		return userHome;
	}

	public static void mkdir(String path) {
		String cmd = "mkdir " + path;
		LOGGER.debug(cmd);
	}
	
	public static void rm(String file) {
		rm(file, FileRemoveFlagsEnum.NONE);
	}
	
	public static void rm(String file, FileRemoveFlagsEnum flag) {
		String cmd = "rm " + flag + " " + file;
		LOGGER.debug(cmd);
		SystemUtils.exec(cmd);
	}
	
	public static void chmod(ChmodFlagsEnum flag, String file) {
		chmod(flag, file, false);
	}

	public static void chmod(ChmodFlagsEnum flag, String file, boolean recursive) {
		String cmd = "chmod ";
		if(recursive) {
			cmd += "-R ";
		} 
		cmd += flag + " " + file;
		LOGGER.debug(cmd);
		SystemUtils.exec(cmd);
	}
	
	public static enum ChmodFlagsEnum {
		PLUS_EXEC("+x"), 
		MINUS_EXEC("-x"),
		PLUS_READ("+r"),
		MINUS_READ("-r"),
		PLUS_WRITE("+w"),
		MINUS_WRITE("-w");
		
		private String flag;
		
		private ChmodFlagsEnum(String flag) {
			this.flag = flag;
		}
		
		@Override
		public String toString() {
			return flag;
		}
		
	}
	
	public static enum FileRemoveFlagsEnum {
		NONE(""), 
		FORCE("-f"),
		RECURSIVE("-R"),
		FORCE_RECURSIVE("-Rf");
		
		private String flag;
		
		private FileRemoveFlagsEnum(String flag) {
			this.flag = flag;
		}
		
		@Override
		public String toString() {
			return flag;
		}
		
	}
	
}
