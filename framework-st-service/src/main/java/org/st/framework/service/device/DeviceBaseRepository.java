package org.st.framework.service.device;

import org.springframework.data.jpa.repository.JpaRepository;
import org.st.framework.entity.device.DDeviceBase;

public interface DeviceBaseRepository extends JpaRepository<DDeviceBase,String> {
}
