package dbp.parcial.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TripResponseDTO {
    private Long id;
    // 1-1 hacia Route
    private Long routeidId;

    private ZonedDateTime departureTime;
    private Integer capacity;
    private Integer availableSeats;
    private String status;
    // 1-N hacia SeatRequest
    private Set<Long> tripIds = new HashSet<>();
}
