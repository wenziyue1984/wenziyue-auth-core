package com.wenziyue.auth.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author wenziyue
 */
@Getter
@AllArgsConstructor
public enum UserStatusEnum {

    DISABLED(1, "禁用"),
    ENABLED(0, "正常");

    private final Integer code;
    private final String desc;

    public static UserStatusEnum getUserStatusByCode(Integer code) {
        for (UserStatusEnum value : UserStatusEnum.values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        return null;
    }

    public static UserStatusEnum getUserStatusByDesc(String desc) {
        for (UserStatusEnum value : UserStatusEnum.values()) {
            if (value.desc.equals(desc)) {
                return value;
            }
        }
        return null;
    }
}
