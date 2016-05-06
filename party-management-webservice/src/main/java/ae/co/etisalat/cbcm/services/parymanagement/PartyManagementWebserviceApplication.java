package ae.co.etisalat.cbcm.services.parymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PartyManagementWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartyManagementWebserviceApplication.class, args);
	}
}
