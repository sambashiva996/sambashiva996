package com.petpeers.encriptdecript;

import java.util.Base64;

public class EncriptorAndDecriptor {
	
	public static String getEncoder(String encodes) {
		
		String encodedString = new String(Base64.getEncoder().encodeToString(encodes.getBytes()));
		return encodedString;	
	}
	
	public static String getDecoder(String decodes) {
		
		String decodedString = new String(Base64.getDecoder().decode(decodes.getBytes()));
		return decodedString;
	}

}
