package tech.tora.Employee.Manager.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.tora.Employee.Manager.model.Device;

import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
    List<Device> getDevicesByEmployeeId(Long employeeId);
}
