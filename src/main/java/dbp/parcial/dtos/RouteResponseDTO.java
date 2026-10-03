package dbp.parcial.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RouteResponseDTO {
    private Long id;
    // 1-N hacia User
    private Long useridId;

    private String origin;
    private String destination;
    private String status;
    // 1-1 hacia Trip
    private Long routeId;
}
