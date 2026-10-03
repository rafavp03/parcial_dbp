package dbp.parcial.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SeatRequestRequestDTO {
    // 1-N hacia Trip
    private Long tripidId;

    // 1-N hacia User
    private Long useridId;

    @NotNull
    private ZonedDateTime requestedAt;
    @NotNull
    private String status;
}
