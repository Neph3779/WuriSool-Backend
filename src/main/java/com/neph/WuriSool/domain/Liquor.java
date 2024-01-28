package com.neph.WuriSool.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Liquor {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private Float alcoholPercentage;
}
