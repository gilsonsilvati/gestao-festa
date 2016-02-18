package br.com.gestaofesta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gestaofesta.model.Convidado;
import br.com.gestaofesta.repository.Convidados;

@Service
public class CadastroConvidadoService {
	
	@Autowired
	private Convidados convidados;
	
	public void adicionar(Convidado convidado) {
		convidados.save(convidado);
	}
	
	public void excluir(Long codigo) {
		convidados.delete(codigo);
	}
	
	public List<Convidado> todos() {
		return convidados.findAll();
	}

}
