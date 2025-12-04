package com.wenziyue.auth.core.jwt;

import lombok.Data;

/**
 * @author wenziyue
 */
@Data
public class JwtConfig {
    /**
     * 签名秘钥
     */
    private String jwtSecret;

    /**
     * 有效期，单位：秒
     */
    private long expireSeconds;
}
