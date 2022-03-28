package com.OSB.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.OSB.Model.Seat;

@Repository
public interface SeatRepo  extends JpaRepository<Seat, Integer> {

	public Optional<Seat> findBylocationId(int locationId);

}