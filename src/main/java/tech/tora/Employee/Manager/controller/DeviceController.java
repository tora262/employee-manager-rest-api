package tech.tora.Employee.Manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.tora.Employee.Manager.bus.DeviceService;
import tech.tora.Employee.Manager.model.Device;

import java.util.List;

@RestController
@RequestMapping("/v1/device")
public class DeviceController {
    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("hello")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello World");
    }

    @RequestMapping("/{employeeId}")
    public ResponseEntity<List<Device>> getDevicesByEmployeeId(@PathVariable("employeeId") Long employeeId) {
        List<Device> devices = deviceService.getDevicesByEmployeeId(employeeId);
        return ResponseEntity.status(HttpStatus.OK).body(devices);
    }

    @PostMapping("/add")
    public ResponseEntity<Device> addDevice(@RequestBody Device device)  {
        Device tmp = deviceService.addDevice(device);
        return ResponseEntity.status(HttpStatus.OK).body(device);
    }

    @PutMapping("/edit")
    public ResponseEntity<Device> editDevice(@RequestBody Device device) {
        Device tmp = deviceService.updateDevice(device);
        return ResponseEntity.status(HttpStatus.OK).body(device);
    }

    @DeleteMapping("/delete/{deviceId}")
    public ResponseEntity<?> deleteDevice(@PathVariable("deviceId") Long deviceId) {
        deviceService.deleteDevice(deviceId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
