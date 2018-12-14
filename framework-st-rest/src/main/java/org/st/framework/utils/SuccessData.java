package org.st.framework.utils;

import org.st.framework.core.utils.SimpleData;

public class SuccessData<T> extends SimpleData {
    public SuccessData() {
        setCode(200);
        setMessage("操作成功！");
    }
}

