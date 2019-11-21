package br.com.bandtec.projetopw.domain;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class SistemaDoGoverno {

	private final RestTemplate restTemplate;
	private final String url;

	public SistemaDoGoverno() {
		restTemplate = new RestTemplate();
		url = "http://localhost:8080/estados/";
	}


	public List<Municipio> municipiosDoEstado(@PathVariable("estado") String estado){
		String urlBusca = url + estado + "/municipios";
		ResponseEntity<List> resposta = restTemplate.getForEntity(urlBusca, List.class);
		return resposta.getBody();
	}
}




