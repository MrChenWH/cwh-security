package com.github.cwh.common.msg.auth;

import com.github.cwh.common.constant.RestCodeConstants;
import com.github.cwh.common.msg.BaseResponse;

/**
 * @author cwh
 */
public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
