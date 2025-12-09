package com.wenziyue.auth.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 用户角色枚举
 * 0 - 用户，1 - 管理员
 */
@Getter
@AllArgsConstructor
public enum UserRoleEnum {
    USER(0, "用户", "USER"),
    ADMIN(1, "管理员", "ADMIN");

    private final Integer code;
    private final String desc;
    private final String role;
}
