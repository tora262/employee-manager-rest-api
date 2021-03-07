package tech.tora.Employee.Manager.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deviceId")
    private Long deviceId;
    @Column(name = "deviceName")
    private String deviceName;
    @Column(name = "deviceCode")
    private String deviceCode;
    @Column(name = "employeeId")
    private Long employeeId;
}
