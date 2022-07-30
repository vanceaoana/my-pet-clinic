package com.vanoa.mypetclinic.service;

import com.vanoa.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
