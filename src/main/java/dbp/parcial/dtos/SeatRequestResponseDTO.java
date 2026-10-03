package dbp.parcial.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SeatRequestResponseDTO {
    private Long id;
    // 1-N hacia Trip
    private Long tripidId;

    // 1-N hacia User
    private Long useridId;

    private ZonedDateTime requestedAt;
    private String status;
}
