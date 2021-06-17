package com.example.api.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.domain.Staff;
import com.example.api.domain.service.StaffService;
import com.example.api.dto.StaffDto;
import com.example.api.reponsitory.StaffReponsitory;

@Service
public class StaffServiceImpl implements StaffService{
	@Autowired
	private StaffReponsitory staffReponsitory;
	
	@Override
	public List<StaffDto> getAllStaff() {
		List<StaffDto> listStaffDtos = staffReponsitory.getAllStaff();
		return listStaffDtos;
	}

	@Override
	public StaffDto saveOrUpdate(Long id, StaffDto dto) {
		if(dto != null) {
			Staff staff = null;
			if(dto.getId() != null) {
				if(dto.getId() != null && dto.getId().equals(id)) {
					return null;
				}
				staff = staffReponsitory.findById(dto.getId()).get();
			}
			if(staff == null) {
				staff = new Staff();
			}
			staff.setAge(dto.getAge());
			staff.setName(dto.getName());
			staff.setExperience(dto.getExperience());
			staff.setRole(dto.getRole());
			
			staff=staffReponsitory.save(staff);
			if(staff != null) {
				return new StaffDto(staff);
			}
			
		}
		return null;
	}

	@Override
	public Boolean deleteStaff(Long id) {
		
		if(id != null) {
			staffReponsitory.deleteById(id);
			return true;
		}
		return false;
	}

}
