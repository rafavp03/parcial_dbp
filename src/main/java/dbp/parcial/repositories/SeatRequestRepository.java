package dbp.parcial.repositories;

import dbp.parcial.models.SeatRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRequestRepository extends JpaRepository<SeatRequest, Long> {
}
