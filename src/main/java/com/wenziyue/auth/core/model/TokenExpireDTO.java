package com.wenziyue.auth.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author wenziyue
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class TokenExpireDTO implements Serializable {

    private String token;

    // 过期时间戳
    private Long expireTimeStamp;
}
