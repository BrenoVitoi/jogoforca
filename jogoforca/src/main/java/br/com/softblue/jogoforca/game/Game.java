package br.com.softblue.jogoforca.game;

import br.com.softblue.jogoforca.core.Dictionary;
import br.com.softblue.jogoforca.core.Word;

public class Game {

	public void start() {
		
		Dictionary d1 = Dictionary.getInstance();
		System.out.println(d1);
		
		Word w1 = d1.nextWord();
		System.out.println(w1.getOriginalWord());
		
	}

}
