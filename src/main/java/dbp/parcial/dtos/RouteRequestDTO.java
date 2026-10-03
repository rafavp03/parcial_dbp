package dbp.parcial.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RouteRequestDTO {
    // 1-N hacia User
    @NotNull
    private Long useridId;

    @NotNull
    private String origin;
    @NotNull
    private String destination;
    @NotNull
    private String status;
    // 1-1 hacia Trip
    private Long routeId;
}
