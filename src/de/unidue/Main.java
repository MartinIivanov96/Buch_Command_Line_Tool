package de.unidue;

public class Main {

    public static void main(String[] args) {
	Text trial = new Text("aaa bbb");
	System.out.println(trial.ceaserVerschluesselung(1));
	System.out.println(trial.wortAnzahl());
	Text trial2 = new Text("ccc bbb");
	System.out.println(trial2.ceaserVerschluesselung(5));
	trial.wortSchnittstelle(trial2);

	Autor autor = new Autor("Ivo", "Ivanov", 35);
	Kapitel kapitel1 = new Kapitel("Erste Kapitel", trial, null);
	Buch test = new Buch(autor, kapitel1);

	Kapitel kapitel2 = new Kapitel("Zweite Kapitel", trial2 , null);
	kapitel1.setNachfolger(kapitel2);
	System.out.println(test.toString(test));
    }
}
