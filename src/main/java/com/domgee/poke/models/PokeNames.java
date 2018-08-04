package com.domgee.poke.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PokeNames {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(max=20)
    private String name;

    @OneToMany
    @JoinColumn(name="poke_id")
    private List<Poke> poke = new ArrayList<>();
}
