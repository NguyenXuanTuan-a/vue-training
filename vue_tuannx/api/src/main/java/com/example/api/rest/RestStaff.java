package com.example.api.rest;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.domain.service.StaffService;
import com.example.api.dto.StaffDto;
@CrossOrigin(origins = "http://localhost:8083")
@RestController
@RequestMapping("/api")
public class RestStaff {
	@Autowired
	private StaffService staffService;
	
	@RequestMapping(value = "/getAllStaff", method = RequestMethod.GET)
	public ResponseEntity<List<StaffDto>> getAllStaff() {
		List<StaffDto> result = staffService.getAllStaff();
		return new ResponseEntity<List<StaffDto>>(result, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/staff", method = RequestMethod.POST)
	public ResponseEntity<StaffDto> save(@RequestBody StaffDto dto) {
		StaffDto result = staffService.saveOrUpdate(null, dto);
		return new ResponseEntity<StaffDto>(result, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/staff/{id}", method = RequestMethod.PUT)
	public ResponseEntity<StaffDto> save(@RequestBody StaffDto dto, @PathVariable Long id) {
		StaffDto result = staffService.saveOrUpdate(id, dto);
		return new ResponseEntity<StaffDto>(result, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/staff/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		Boolean result = staffService.deleteStaff(id);
		return new ResponseEntity<Boolean>(result, HttpStatus.OK);
	}
}
