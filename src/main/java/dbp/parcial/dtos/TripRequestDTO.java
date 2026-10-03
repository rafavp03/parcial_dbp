package dbp.parcial.dtos;

import jakarta.validation.constraints.NotNull;
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
public class TripRequestDTO {
    // 1-1 hacia Route
    private Long routeidId;

    @NotNull
    private ZonedDateTime departureTime;
    @NotNull
    private Integer capacity;
    @NotNull
    private Integer availableSeats;
    @NotNull
    private String status;
    // 1-N hacia SeatRequest
    private Set<Long> tripIds = new HashSet<>();
}
