package com.github.cwh.common.exception.auth;

import com.github.cwh.common.constant.CommonConstants;
import com.github.cwh.common.exception.BaseException;

/**
 * @author cwh
 */
public class ClientTokenException extends BaseException {
    public ClientTokenException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
