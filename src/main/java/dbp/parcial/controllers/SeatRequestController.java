package dbp.parcial.controllers;

import dbp.parcial.dtos.SeatRequestRequestDTO;
import dbp.parcial.dtos.SeatRequestResponseDTO;
import dbp.parcial.services.SeatRequestService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/seat-requests")
@RequiredArgsConstructor
public class SeatRequestController {

    private final SeatRequestService seatRequestService;

}
