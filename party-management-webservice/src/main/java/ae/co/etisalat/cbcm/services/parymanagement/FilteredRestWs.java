package ae.co.etisalat.cbcm.services.parymanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteredRestWs {

	@Autowired
	private ConsulDiscoveryClient discoveryClient;

	@RequestMapping(value = "/hello-world", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String index(@RequestParam(value = "fields", required = false) String fields) {
		List<ServiceInstance> instances = discoveryClient.getInstances("party-management-webservice");
		String res = "";
		for (ServiceInstance ins : instances) {
			res += ins.getUri() + ":" + ins.getHost() + "\r\n";
		}
		return res;
	}

}