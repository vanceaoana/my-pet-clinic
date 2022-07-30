package com.vanoa.mypetclinic.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * Created by jt on 7/13/18.
 */

@Data
public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

}
