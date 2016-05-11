package ae.co.etisalat.cbcm.services.parymanagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteredRestWs {

	@RequestMapping(value = "/hello-world", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String index(@RequestParam(value = "fields", required = false) String fields) {
		return "Hello World";
	}

}