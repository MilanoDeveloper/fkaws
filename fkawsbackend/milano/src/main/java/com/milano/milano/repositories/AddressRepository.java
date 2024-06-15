package com.milano.milano.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milano.milano.domain.address.Address;

public interface AddressRepository extends JpaRepository<Address,UUID>{

}
