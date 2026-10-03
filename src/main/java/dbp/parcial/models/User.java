package dbp.parcial.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false, unique = true)
    private String password;

    @Column(name = "role", nullable = false)
    private String role;

    @OneToMany(mappedBy = "UserId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Route> driver = new HashSet<>();

    @OneToMany(mappedBy = "UserId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SeatRequest> passenger = new HashSet<>();

}
