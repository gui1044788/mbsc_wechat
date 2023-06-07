package com.xhsd.baseutils.utils;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import cn.hutool.crypto.symmetric.SM4;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * SM4国密算法工具类
 * @author guij
 */

@Slf4j
public class SM4Util {

    /**
     * 秘钥空间大小
     */
    public static final int SM4_KEY_SIZE = 128;

    /**
     * 默认秘钥空间为128，Key的长度是16
     */
    public static final int SM4_KEY_LENGTH = 16;

    /**
     * 算法编号
     */
    public static final String ALGORITHM_NAME  = "SM4";

    /**
     * ECB模式串
     */
    public static final String ALGORITHM_NAME_ECB_PADDING = "SM4/ECB/PKCS5Padding";
    /**
     * CBC模式串
     */
    public static final String ALGORITHM_NAME_CBC_PADDING = "SM4/CBC/PKCS5Padding";

    /**
     * 首次加密初始向量  01030507090B0D0F11131517191B1D1F
     */
    public static final byte[] SM4_KEY_IV = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31 };

    /**
     * sm4加密
     * @param mode sm4加密的模式 ECB,CBC
     * @param padding 加密填充方式
     * @param key 加密秘钥 转成byte[] 大小16
     * @param iv 偏移量，CBC模式下需要传入,否则系统随机生成iv每次加密结果都不一样 转成byte[] 大小16
     * @param content 加密内容
     * @return
     */
    public static String encode(Mode mode, Padding padding, String key, String iv, String content) {
        try {
            //校验参数
            if(StringUtils.isBlank(content)) {
                return null;
            }
            SymmetricCrypto sm4 = new SM4(mode, padding, key.getBytes());
            String encryptHex = null;
            if(mode.equals(Mode.CBC)) {
                sm4 = new SM4(mode, padding, key.getBytes(),iv.getBytes());
            }
            // 在NoPadding模式下需要手动补齐分组16字节倍数
            if(padding.equals(Padding.NoPadding)) {
                byte[] data = padding(content);
                encryptHex = sm4.encryptHex(data);
            }
            else {
                encryptHex = sm4.encryptHex(content.getBytes());
            }
            return encryptHex;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("MS4加密失败");
        }
        return null;
    }
    /**
     * sm4解密
     * @param mode sm4加密的模式 ECB,CBC
     * @param padding 加密填充方式
     * @param key 加密秘钥 转成byte[] 大小16
     * @param iv 偏移量，CBC模式下需要传入,否则系统随机生成iv每次加密结果都不一样 转成byte[] 大小16
     * @param encodeContent 需解密字符串
     * @return
     */
    public static String decode(Mode mode, Padding padding,String key, String iv,String encodeContent) {
        try {
            //校验参数
            if(StringUtils.isBlank(encodeContent)) {
                return null;
            }
            SymmetricCrypto sm4 = new SM4(mode, padding, key.getBytes());
            if(mode.equals(Mode.CBC)) {
                sm4 = new SM4(mode, padding, key.getBytes(),iv.getBytes());
            }
            String decryptStr = sm4.decryptStr(encodeContent, CharsetUtil.CHARSET_UTF_8);
            return decryptStr;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("SM4解密失败");
        }
        return null;
    }

    // 在NoPadding模式下需要手动对齐16字节的倍数
    public static byte[] padding(String arg_text) {
        byte[] encrypt = arg_text.getBytes();

        if (encrypt.length % 16 != 0) {
            byte[] padded = new byte[encrypt.length + 16 - (encrypt.length % 16)];
            System.arraycopy(encrypt, 0, padded, 0, encrypt.length);
            encrypt = padded;
        }
        return encrypt;
    }

}

