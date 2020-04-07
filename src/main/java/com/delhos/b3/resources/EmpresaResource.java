package com.delhos.b3.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.delhos.b3.domain.Empresa;

@RestController
@RequestMapping(value="/empresas")
public class EmpresaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	
	public List<Empresa> listar() {
		Empresa emp1 = new Empresa(1, "Delphos", "dph3", "MB");
		Empresa emp2 = new Empresa(2, "Tiete", "TIET3", "EN");
		
		List<Empresa>lista = new ArrayList<>();
		lista.add(emp1);
		lista.add(emp2);
		
		return lista;
	}

}
