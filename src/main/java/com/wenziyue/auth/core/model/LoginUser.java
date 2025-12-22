package com.wenziyue.auth.core.model;

import com.wenziyue.auth.core.enums.UserStatusEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wenziyue
 */
@Data
public class LoginUser implements Serializable {

    private static final long serialVersionUID = 5791647049199916473L;

    /**
     * 用户唯一 ID，建议直接用 Long 或 String，看你 blog 系统里怎么设计
     */
    private String userId;

    /**
     * 展示名称，可以是昵称
     */
    private String username;

    /**
     * 角色列表，例如 ["ROLE_ADMIN", "ROLE_USER"]
     */
    private String roles;

    /**
     * 客户端标识，例如 "WEB", "APP", "ADMIN"
     */
    private String clientType;

    /**
     * 用户状态，例如 "NORMAL", "DISABLED"
     */
    private UserStatusEnum status;
}
