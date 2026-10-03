package dbp.parcial.controllers;

import dbp.parcial.dtos.RouteRequestDTO;
import dbp.parcial.dtos.RouteResponseDTO;
import dbp.parcial.services.RouteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/routes")
@RequiredArgsConstructor
public class RouteController {

    private final RouteService routeService;

}
