 import com.plurasight.sevice.CustomerService;
import com.plurasight.sevice.CustomerServiceImpl;


public class Application {

	public static void main(String[] args) {
		
		CustomerService service = new CustomerServiceImpl();
		
		// System.out.println(service.findAll());
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
