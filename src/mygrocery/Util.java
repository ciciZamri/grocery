package mygrocery;

import java.security.*;
import javax.xml.bind.DatatypeConverter;

public class Util {
	public static String hash(String str) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(str.getBytes());
		byte[] digest = md.digest();
		String hashed = DatatypeConverter.printHexBinary(digest);
		return hashed;
	}
}
