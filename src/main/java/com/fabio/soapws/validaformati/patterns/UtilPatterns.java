package com.fabio.soapws.validaformati.patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class UtilPatterns {

	
	private static final String REGEX_CF="^[a-zA-Z]{6}[0-9]{2}[abcdehlmprstABCDEHLMPRST]{1}[0-9]{2}([a-zA-Z]{1}[0-9a-zA-Z]{2}[a-zA-Z0-9])[a-zA-Z]{1}$";
	
	
	public static boolean validateCf(String daVerificare) throws Exception{
		if(StringUtils.isBlank(daVerificare)) {
			return false;
		}else {
			Pattern pattern=null;
			pattern=Pattern.compile(REGEX_CF);
			Matcher match=pattern.matcher(daVerificare);
			return match.find();
		}
	}
	
}
