package com.shiva.reservation.controller;

import com.shiva.reservation.model.Reservation;
import com.shiva.reservation.service.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private static Logger log = LoggerFactory.getLogger(ReservationController.class);

    private ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<Reservation> findAll() {
        log.info("Getting all reservations data");
        return reservationService.findAll();
    }

    @GetMapping("/room/{roomId}")
    public Reservation findReservationByRoomId(@PathVariable("roomId") String roomId) {
        log.info("Getting reservations data for room : " + roomId);
        return reservationService.findReservationByRoomId(roomId);
    }

    @GetMapping("/guest/{guestId}")
    public Reservation findReservationByGuestId(@PathVariable("guestId") String guestId) {
        log.info("Getting reservations data for guest : " + guestId);
        return reservationService.findReservationByGuestId(guestId);
    }
}
