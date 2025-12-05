package com.wenziyue.auth.core.header;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wenziyue.auth.core.model.LoginUser;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author wenziyue
 */
public class HeaderUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 生成用户信息字符串
     * @param loginUser 用户信息
     * @return base64字符串
     */
    public String serializeUserInfoToHeader(LoginUser loginUser) {
        if (loginUser == null) {
            return null;
        }
        try {
            String loginUserJson = objectMapper.writeValueAsString(loginUser);
            return Base64.getUrlEncoder().encodeToString(loginUserJson.getBytes(StandardCharsets.UTF_8));
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to serialize LoginUser to JSON", e);
        }
    }

    /**
     * 将Base64编码的用户信息字符串转换为LoginUser对象
     * @param base64UserInfo Base64编码的用户信息
     * @return LoginUser对象
     */
    public LoginUser parseUserInfoFromHeader(String base64UserInfo) {
        if (base64UserInfo == null || base64UserInfo.isEmpty()) {
            return null;
        }
        try {
            byte[] decodedBytes = Base64.getUrlDecoder().decode(base64UserInfo);
            String userInfoJson = new String(decodedBytes, StandardCharsets.UTF_8);
            return objectMapper.readValue(userInfoJson, LoginUser.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to deserialize LoginUser from JSON", e);
        }
    }



}
