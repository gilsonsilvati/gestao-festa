package br.com.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.gestaofesta.service.CadastroConvidadoService;

@Controller
public class ConvidadosController {
	
	@Autowired
	private CadastroConvidadoService cadastroConvidadoService;
	
	@RequestMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject("convidados", cadastroConvidadoService.todos());
		
		return mv;
	}

}
