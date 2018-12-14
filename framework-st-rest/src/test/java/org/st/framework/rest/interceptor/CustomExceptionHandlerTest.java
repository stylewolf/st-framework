package org.st.framework.rest.interceptor;

import org.junit.Test;
import org.st.framework.core.exception.CoreException;
import org.st.framework.core.exception.NotFoundException;

public class CustomExceptionHandlerTest {

    @Test
    public void doResolveException() {
        NotFoundException e1 = new NotFoundException("1");
        System.out.println(e1 instanceof CoreException);
    }
}