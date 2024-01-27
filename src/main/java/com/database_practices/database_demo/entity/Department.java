package com.database_practices.database_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;

    @NotBlank(message = "please add Department Name")
    private String departmentName;
    private String departmentAddress;
    private String departmentcode;

//    public long getDepartmentId() {
//        return departmentId;
//    }
//
//    public void setDepartmentId(long departmentId) {
//        this.departmentId = departmentId;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    public String getDepartmentAddress() {
//        return departmentAddress;
//    }
//
//    public void setDepartmentAddress(String departmentAddress) {
//        this.departmentAddress = departmentAddress;
//    }
//
//    public String getDepartmentcode() {
//        return departmentcode;
//    }
//
//    public void setDepartmentcode(String departmentcode) {
//        this.departmentcode = departmentcode;
//    }
//
//    public Department(long departmentId, String departmentName, String departmentAddress, String departmentcode) {
//        this.departmentId = departmentId;
//        this.departmentName = departmentName;
//        this.departmentAddress = departmentAddress;
//        this.departmentcode = departmentcode;
//    }
//
//    public Department() {
//    }
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "departmentId=" + departmentId +
//                ", departmentName='" + departmentName + '\'' +
//                ", departmentAddress='" + departmentAddress + '\'' +
//                ", departmentcode='" + departmentcode + '\'' +
//                '}';
//    }
}
