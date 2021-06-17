package com.example.api.domain.service;

import java.util.List;
import java.util.UUID;

import com.example.api.dto.StaffDto;

public interface StaffService {
	public List<StaffDto> getAllStaff();
	public StaffDto saveOrUpdate(Long id,StaffDto dto);
	public Boolean deleteStaff(Long id);
}
