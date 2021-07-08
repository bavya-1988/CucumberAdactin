package com.adactin.property;

import com.adactin.helper.configuration_Reader;

public class File_Reader_Manager {

	private File_Reader_Manager() {

	}

	public static File_Reader_Manager getInstance() {
		File_Reader_Manager helper = new File_Reader_Manager();
		return helper;

	}

	public configuration_Reader getInstanceCR() throws Throwable {
		configuration_Reader Reader = new configuration_Reader();
		return Reader;

	}

}
