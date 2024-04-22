package com.hibinheritance.reposiroty;

import com.hibinheritance.model.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
