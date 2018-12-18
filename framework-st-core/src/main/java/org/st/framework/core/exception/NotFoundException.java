package org.st.framework.core.exception;

public class NotFoundException extends CoreException {

    public NotFoundException(String message) {
        super(message);
        setCode(ExceptionCode.SYSTEM_OBJECT_NOTFOUND);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(Throwable cause) {
        super(cause);
    }
}
