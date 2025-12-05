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
    private Long expireSeconds;

    /**
     * 还剩多少时间开始刷新token，单位：秒
     */
    private Long refreshBeforeExpirationSeconds;
}
