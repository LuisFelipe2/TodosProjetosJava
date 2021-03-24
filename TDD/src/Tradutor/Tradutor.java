package Tradutor;

import java.util.HashMap;
import java.util.Map;

public class Tradutor {

	private Map<String,String> traduções = new HashMap<>();
	
	public boolean estaVazio() {
		return traduções.isEmpty();
	}

	public void adicionaTradução(String palavra, String tradução) {
		if(traduções.containsKey(palavra)) {
			tradução = traduzir(palavra)+", "+tradução;
		}
		traduções.put(palavra, tradução);
		
	}

	public String traduzir(String palavra) {
		return this.traduções.get(palavra);
	}

	public String traduzirFrase(String frase) {
		String[] palavras = frase.split(" ");
		String tradução = "";
		for(String palavra :palavras) {
			
			if(traduzir(palavra).contains(",")) {
				tradução += traduzir(palavra).substring(0, traduzir(palavra).indexOf(','))+" ";
			}else
				tradução += traduzir(palavra)+" ";
			
		}
		
		return tradução.trim();
	}
	
	

}
