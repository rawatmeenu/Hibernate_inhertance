package com.hibinheritance;

import com.hibinheritance.model.Check;
import com.hibinheritance.model.CreditCard;
import com.hibinheritance.model.Payment;
import com.hibinheritance.reposiroty.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.cert.CertPathChecker;

@SpringBootTest
class HibernateInhertanceApplicationTests {

	@Autowired
	PaymentRepository repo;
	@Test
	void contextLoads() {
	}


	@Test
	public void craetepayments() {
		CreditCard cc = new CreditCard();
		cc.setCardnumber("132459983");
		cc.setAmount(1267);
		cc.setId(2);
		repo.save(cc);
	}

	@Test
	public void craetecheckpayments(){
		Check ch= new Check();
		ch.setAmount(7815);
		ch.setCheckNo("458764567");
		ch.setId(5);
		repo.save(ch);
	}

}
