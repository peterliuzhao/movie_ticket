package com.woniuxy.util;

import java.util.UUID;

import org.apache.shiro.crypto.hash.SimpleHash;

public class AccountUtils {
		//md5加密  
		public static String encrypt(String source, String salt) {
			SimpleHash sh = new SimpleHash("md5", source, salt, 1024);
			return sh.toHex();
		}
		
		//获取没有横杠的uuid
		public static String uuid() {
			return UUID.randomUUID().toString().replace("-", "");
		}
}
