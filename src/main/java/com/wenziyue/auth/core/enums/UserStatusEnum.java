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
}
