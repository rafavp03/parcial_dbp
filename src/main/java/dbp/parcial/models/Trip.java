package dbp.parcial.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "viaje")
@NoArgsConstructor
@Getter
@Setter
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "routeId", unique = true)
    private Route RouteId;

    @Column(name = "departureTime", nullable = false)
    private ZonedDateTime departureTime;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "availableSeats", nullable = false)
    private Integer availableSeats;

    @Column(name = "status", nullable = false)
    private String status;

    @OneToMany(mappedBy = "TripId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SeatRequest> trip = new HashSet<>();

}
