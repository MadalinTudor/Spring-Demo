package com.example.demo.player;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Player {

    @Id
    @SequenceGenerator(
           name = "player_sequence",
           sequenceName = "player_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "player_sequence"
    )
    private Long id;
    private String name;
    private String nationality;
    private LocalDate dateOfBirth;
    private Integer age;

    public Player() {
    }

    public Player(Long id, String name, String nationality, LocalDate dateOfBirth, Integer age) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public Player(String name, String nationality, LocalDate dateOfBirth, Integer age) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateOfBirth = dateofBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dateofBirth=" + dateOfBirth +
                ", age=" + age +
                '}';
    }
}
