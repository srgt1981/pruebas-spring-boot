package es.prueba.customer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest-service/v1/customers")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	Optional<Customer> findCustomer(@PathVariable("id") Long id) {
		return customerRepository.findById(id);
	}
	
}
