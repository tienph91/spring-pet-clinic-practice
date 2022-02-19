package com.example.springpetclinicpractice.service;

import com.example.springpetclinicpractice.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
