package dbp.parcial.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name = "solicitud")
@NoArgsConstructor
@Getter
@Setter
public class SeatRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tripId")
    private Trip TripId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "passengerId")
    private User UserId;

    @Column(name = "requestedAt", nullable = false)
    private ZonedDateTime requestedAt;

    @Column(name = "status", nullable = false)
    private String status;

}
