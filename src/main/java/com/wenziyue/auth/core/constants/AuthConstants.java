package com.wenziyue.auth.core.constants;

/**
 * @author wenziyue
 */
public interface AuthConstants {

    /**
     * 传 token 的 header 名，前后保持统一
     */
    String AUTHORIZATION_HEADER = "Authorization";

    /**
     * 网关向下游传递完整用户信息的 header 名
     * 例如 Base64(JSON(LoginUser))
     */
    String USER_INFO_HEADER = "X-Wzy-User";

    /**
     * 只传 userId 的 header 名（如果你想只下发 userId）
     */
    String USER_ID_HEADER = "X-Wzy-UserId";

    /**
     * 传 traceId 的 header
     */
    String TRACE_ID_HEADER = "X-Trace-Id";

    /**
     * token 前缀
     */
    String TOKEN_PREFIX = "Bearer ";

    /**
     * redis中用户信息的key
     */
    String LOGIN_USER_INFO_KEY = "blog:login:userInfo:";
}
