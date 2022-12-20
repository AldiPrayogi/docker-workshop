package com.commsult.DockerWorkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commsult.DockerWorkshop.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
