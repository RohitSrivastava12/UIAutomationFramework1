package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class inetBankingReadConfig {

	Properties pro;

	// Creating constructor , This is similar to page object class only 3 steps
	// (object initiation, Constructor creation and methods creation) needs to be
	// followed
	public inetBankingReadConfig() {
		File src = new File("./Configurations/config.properties");

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getUrl() {
		String url = pro.getProperty("url");
		return url;
	}

	public String getuserName() {
		String usname = pro.getProperty("usname");
		return usname;
	}

	public String getPassword() {
		String passwd = pro.getProperty("passwd");
		return passwd;
	}

	public String getExpectedTitle() {
		String expTitle = pro.getProperty("expTitle");
		return expTitle;
	}

	public String getchromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getedgePath() {
		String edgepath = pro.getProperty("edgepath");
		return edgepath;
	}

}
