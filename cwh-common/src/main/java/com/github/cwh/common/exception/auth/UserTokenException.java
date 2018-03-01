package com.github.cwh.common.exception.auth;

import com.github.cwh.common.constant.CommonConstants;
import com.github.cwh.common.exception.BaseException;

/**
 * @author cwh
 */
public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
