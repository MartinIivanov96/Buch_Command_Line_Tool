package de.unidue;

public class Buch {
    private Autor autor;
    private Kapitel ersteKapitel;

    public Buch(Autor autor, Kapitel kapitel) {
        this.autor = autor;
        this.ersteKapitel = kapitel;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setErsteKapitel(Kapitel ersteKapitel) {
        this.ersteKapitel = ersteKapitel;
    }

    public Autor getAutor() {
        return autor;
    }

    public Kapitel getErsteKapitel() {
        return ersteKapitel;
    }

    public void addChapter(String title, Text text) {
        if(ersteKapitel == null) {
            Kapitel newKapitel = new Kapitel(title, text,null);
        }
        else {
            Kapitel schleife = ersteKapitel.getNachfolger();
            while (schleife != null) {
                 schleife = schleife.getNachfolger();
            }
            schleife.setNachfolger(new Kapitel(title, text, null));
        }
    }
    public String toString(Buch buch){
        if( buch.getErsteKapitel() != null ) {
            String output = buch.getErsteKapitel().getUeberschrift() +"\n" + buch.getErsteKapitel().getText().getText();
            Kapitel schleife = buch.getErsteKapitel().getNachfolger();
            while ( schleife != null )
            {
                output = output + "\n" + schleife.getUeberschrift() + "\n" + schleife.getText().getText();
                schleife = schleife.getNachfolger();
            }
            return output;
        }
       else {
           return " Kein Text vorhanden." ;
        }

    }
}
