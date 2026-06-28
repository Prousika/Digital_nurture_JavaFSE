CustomerRepository.java

interface CustomerRepository {

    String findCustomerById(int id);

}

CustomerRepositoryImpl.java

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        return "Customer ID : " + id + " Name : Prousika";

    }

}

CustomerService.java

public class CustomerService {
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {

        this.repository = repository;

    }

    public void displayCustomer(int id) {

        System.out.println(repository.findCustomerById(id));

    }
}


DependencyInjectionExample.java

public class DependencyInjectionExample {

    public static void main(String[] args) {

        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        service.displayCustomer(101);

    }

}

/*
output:
Customer ID : 101 Name : Prousika
*/

