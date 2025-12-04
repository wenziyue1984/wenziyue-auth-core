package com.wenziyue.auth.core.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @author wenziyue
 */
public class JwtUtils {

    private final JwtConfig config;


    public JwtUtils(JwtConfig config) {
        this.config = config;
    }


    /**
     * 生成 token（传入用户ID）
     */
    public String generateToken(String userId) {
        return Jwts.builder()
                .setSubject(userId)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + config.getExpireSeconds() * 1000)) // *1000 秒转为毫秒
                .signWith(SignatureAlgorithm.HS256, config.getJwtSecret())
                .compact();
    }

    /**
     * 解析 token，获取用户 ID（也可以改成返回完整 Claims）
     */
    public String getUserIdFromToken(String token) {
        return getClaims(token).getSubject();
    }

    /**
     * 校验 token 是否有效（是否过期）
     */
    public boolean isTokenExpired(String token) {
        return getClaims(token).getExpiration().before(new Date());
    }

    private Claims getClaims(String token) {
        return Jwts.parser()
                .setSigningKey(config.getJwtSecret())
                .parseClaimsJws(token)
                .getBody();
    }

    /**
     * 获取 token 剩余有效时长（秒）
     */
    public long getExpirationRemaining(String token) {
        return (getClaims(token).getExpiration().getTime() - System.currentTimeMillis()) / 1000;
    }
}
