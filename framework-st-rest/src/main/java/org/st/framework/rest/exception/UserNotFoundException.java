package org.st.framework.rest.exception;

import org.st.framework.core.exception.ExceptionCode;
import org.st.framework.core.exception.NotFoundException;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException(String message) {
        super(message);
        setCode(ExceptionCode.SYSTEM_USER_NOTFOUND);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(Throwable cause) {
        super(cause);
    }
}
