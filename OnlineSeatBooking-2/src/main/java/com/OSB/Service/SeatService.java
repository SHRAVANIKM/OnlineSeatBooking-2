package com.OSB.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.OSB.Model.Seat;
import com.OSB.Repository.SeatRepo;

@Component
public class SeatService {

	@Autowired
	SeatRepo repo;

	public Optional<Seat> findBylocationId(int locationId) {

		return repo.findBylocationId(locationId);
	}

}