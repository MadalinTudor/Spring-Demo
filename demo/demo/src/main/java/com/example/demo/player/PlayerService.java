package com.example.demo.player;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class PlayerService {

    public List<Player> getPlayers(){
        return List.of(
                new Player(
                        1L,
                        "Cristian Sapunaru",
                        "Romanian",
                        LocalDate.of(1984, Month.AUGUST, 5),
                        37
                )
        );
    }
}
