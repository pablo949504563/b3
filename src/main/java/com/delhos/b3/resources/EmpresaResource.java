package com.delhos.b3.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/empresas")
public class EmpresaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	
	public String lista() {
		
		return "Rest está funcionando";
	}

}
