package com.github.cwh.common.exception.auth;

import com.github.cwh.common.constant.CommonConstants;
import com.github.cwh.common.exception.BaseException;

/**
 * @author cwh
 */
public class ClientInvalidException extends BaseException {
    public ClientInvalidException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
