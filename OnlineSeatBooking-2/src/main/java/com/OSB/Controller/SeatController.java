package com.OSB.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.OSB.Exception.ResourceNotFoundException;
import com.OSB.Model.Seat;
import com.OSB.Service.SeatService;

@RestController
@RequestMapping("/seat")
public class SeatController {

	@Autowired
	SeatService service;

	@GetMapping("/SearchSeat/{locationId}")
	public ResponseEntity<String> findBylocationId(@PathVariable int locationId) {
		String status = null;
		Optional<Seat> s = service.findBylocationId(locationId);

		if (s.isPresent()) {

			service.findBylocationId(locationId);
			status = s.get() + " ";
		} else {

			throw new ResourceNotFoundException("LocationId Not Found");
		}

		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
}
