package com.github.cwh.common.exception.auth;

import com.github.cwh.common.constant.CommonConstants;
import com.github.cwh.common.exception.BaseException;

/**
 * @author cwh
 */
public class ClientForbiddenException extends BaseException {
    public ClientForbiddenException(String message) {
        super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
    }
}
