package com.xhsd.baseutils.secret.util;

import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import cn.hutool.crypto.symmetric.AES;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

/**
 * <p>
 * AES加解密
 * </p>
 *
 * @author guij
 */

@Slf4j
@Component
public class AesUtil {


	// 密钥字符串
	private static String secret;

	// 密钥字符串
	private static String iv;

	@Value("${aes.secret}")
	public void setSecret(String secret) {
		AesUtil.secret = secret;
	}

	@Value("${aes.iv}")
	public void setIv(String iv) {
		AesUtil.iv = iv;
	}


	public static String encryptFromString(String data, Mode mode, Padding padding) {
		if (StringUtils.isBlank(data)){
			return  data;
		}
		AES aes;
		if (Mode.CBC == mode) {
			aes = new AES(mode, padding,
					new SecretKeySpec(secret.getBytes(), "AES"),
					new IvParameterSpec(iv.getBytes()));
		} else {
			aes = new AES(mode, padding,
					new SecretKeySpec(secret.getBytes(), "AES"));
		}
		return aes.encryptBase64(data, StandardCharsets.UTF_8);
	}

	public static String decryptFromString(String data, Mode mode, Padding padding) {
		if (StringUtils.isBlank(data)){
			return  data;
		}
		String reString = null;
		try {
			AES aes;
			if (Mode.CBC == mode) {
				aes = new AES(mode, padding,
						new SecretKeySpec(secret.getBytes(), "AES"),
						new IvParameterSpec(iv.getBytes()));
			} else {
				aes = new AES(mode, padding,
						new SecretKeySpec(secret.getBytes(), "AES"));
			}
			byte[] decryptDataBase64 = aes.decrypt(data);
			reString = new String(decryptDataBase64, StandardCharsets.UTF_8);
		} catch (Exception e) {
			log.error("解密失败{}",data);
			return data;
		}
		return reString.trim();
	}

}
