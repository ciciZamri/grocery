package mygrocery;

import java.security.*;
import javax.xml.bind.DatatypeConverter;

public class Util {
	public static String hex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte aByte : bytes) {
            result.append(String.format("%02x", aByte));
        }
        return result.toString();
    }
	
	public static String hash(String str) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(str.getBytes());
		byte[] digest = md.digest();
//		String hashed = DatatypeConverter.printHexBinary(digest);
		String hashed = hex(digest);
		return hashed;
	}
}
