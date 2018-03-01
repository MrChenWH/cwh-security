package com.github.cwh.common.msg.auth;

import com.github.cwh.common.constant.RestCodeConstants;
import com.github.cwh.common.msg.BaseResponse;

/**
 * @author cwh
 */
public class TokenForbiddenResponse extends BaseResponse {

    public TokenForbiddenResponse(String message) {
        super(RestCodeConstants.TOKEN_FORBIDDEN_CODE, message);
    }
}
