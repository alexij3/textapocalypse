package com.buzilov.textapocalypse.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "character", indexes = @Index(name = "id_index", columnList = "id"))
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class PlayableCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id")
    private Player player;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int level;

    @Column(nullable = false)
    private double experience;

    @Column(nullable = false)
    private Long currentLocationId;

}
