package org.st.framework.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class EncryptionUtil {
    /**
     * 根据encryptionType 选择加密方式
     * @param userId
     * @param password
     * @param encryptionType
     * @return
     */
    public static final String encryption(String userId,String password,String encryptionType){
        String rs = password;
        switch (encryptionType){
            case "md5":
                rs = DigestUtils.md5Hex(userId+password);
                break;
            default:
                break;
        }
        return rs;
    }

    public static void main(String[] args) {
        String rs = "admin123456";
        System.out.println(DigestUtils.md5Hex(rs));

    }
}
