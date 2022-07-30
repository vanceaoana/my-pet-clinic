package com.vanoa.mypetclinic.model;

import lombok.Data;

/**
 * Created by jt on 7/13/18.
 */
@Data
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

}
