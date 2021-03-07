package tech.tora.Employee.Manager.bus;

import org.springframework.stereotype.Service;
import tech.tora.Employee.Manager.model.Device;

import java.util.List;

@Service
public interface DeviceService {
    Device addDevice(Device device);
    Device updateDevice(Device device);
    void deleteDevice(Long deviceId);
    List<Device> getDevicesByEmployeeId(Long employeeId);
}
