package com.example.api.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.api.domain.Staff;
import com.example.api.dto.StaffDto;

@Repository
public interface StaffReponsitory extends JpaRepository<Staff, Long> {
	
	@Query("select new com.example.api.dto.StaffDto(ed) from Staff ed")
	List<StaffDto> getAllStaff();
}
