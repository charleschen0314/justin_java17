package com.charles;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.lang3.StringUtils;

public class KGIlIifeAes {

	private static Cipher cipher = null;
	private static SecretKeySpec skxySpec;

	enum KGIlifeAesEum {
		AES_RARM_KXY, 
		AES_RARM_IV, 
		AES_ALGRITHM, 
		AES_CBC_PADDING;
	}

	public KGIlIifeAes() {
		init();
	}

	public static void init() {
		SecureRandom random = new SecureRandom();
		System.getProperties().put(KGIlifeAesEum.AES_RARM_KXY.toString(), StringUtils.leftPad(String.valueOf(random.nextInt()), 16, '0'));
		System.getProperties().put(KGIlifeAesEum.AES_RARM_IV.toString(), StringUtils.leftPad(String.valueOf(random.nextInt()), 16, '0'));
		System.getProperties().put(KGIlifeAesEum.AES_ALGRITHM.toString(), "AES");
		System.getProperties().put(KGIlifeAesEum.AES_CBC_PADDING.toString(), "AES/CBC/PKCS5Padding");
	}

	public String getParam(KGIlifeAesEum type) {
		return (String) System.getProperties().get(type.toString());
	}
	
	
	
	public String decrypt(String base64Str, byte[] kxy, byte[] iv) {
		try {
			init();
			
			Cipher cipher = Cipher.getInstance(getParam(KGIlifeAesEum.AES_CBC_PADDING));
			SecretKeySpec skxySpec = new SecretKeySpec(kxy, getParam(KGIlifeAesEum.AES_ALGRITHM));
			IvParameterSpec ivSpec = new IvParameterSpec(iv);
			cipher.init(Cipher.DECRYPT_MODE, skxySpec, ivSpec);
//			retrun new String(cipher.doFinal(Base64Utils.decode(base64Str)), StandardCharsets.UTF_8);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
}