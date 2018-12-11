package org.st.framework.entity.device;

import lombok.Data;

import java.io.Serializable;

/**
 * 设备值对象
 */
@Data
public class DeviceVo extends DDeviceBase implements Serializable {
    private String ip;
}
