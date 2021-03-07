package tech.tora.Employee.Manager.bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.tora.Employee.Manager.dal.DeviceRepository;
import tech.tora.Employee.Manager.model.Device;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {
    final
    DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public Device addDevice(Device device) {
        return deviceRepository.save(device);
    }

    @Override
    public Device updateDevice(Device device) {
        return deviceRepository.save(device);
    }

    @Override
    public void deleteDevice(Long deviceId) {
        deviceRepository.deleteById(deviceId);
    }

    @Override
    public List<Device> getDevicesByEmployeeId(Long employeeId) {
        List<Device> devices;
        devices = deviceRepository.getDevicesByEmployeeId(employeeId);
        return devices;
    }
}
