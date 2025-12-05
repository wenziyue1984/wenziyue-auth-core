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
    public String jwtSecret;

    /**
     * 有效期，单位：秒
     */
    public Long expireSeconds;

    /**
     * 还剩多少时间开始刷新token，单位：秒
     */
    public Long refreshBeforeExpirationSeconds;
}
