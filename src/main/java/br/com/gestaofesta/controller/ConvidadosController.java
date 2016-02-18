package br.com.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.gestaofesta.model.Convidado;
import br.com.gestaofesta.service.CadastroConvidadoService;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	@Autowired
	private CadastroConvidadoService cadastroConvidadoService;
	
	@RequestMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject("convidados", cadastroConvidadoService.todos());
		mv.addObject(new Convidado());
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Convidado convidado) {
		cadastroConvidadoService.adicionar(convidado);
		
		return "redirect:/convidados";
	}

}
