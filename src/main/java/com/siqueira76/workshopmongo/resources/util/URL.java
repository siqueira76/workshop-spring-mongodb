package com.siqueira76.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {
	
	public static String decoderParam(String text) {
		try {
			return URLDecoder.decode(text, "UTf-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}

}
