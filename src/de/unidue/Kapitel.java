package de.unidue;

public class Kapitel {
    private String ueberschrift;
    private Text text;
    private Kapitel nachfolger;

    public Kapitel(String ueberschrift, Text text, Kapitel nachfolger) {
        this.ueberschrift = ueberschrift;
        this.text = text;
        this.nachfolger = nachfolger;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public void setUeberschrift(String ueberschrift) {
        this.ueberschrift = ueberschrift;
    }

    public void setNachfolger(Kapitel nachfolger) {
        this.nachfolger = nachfolger;
    }

    public Kapitel getNachfolger() {
        return nachfolger;
    }

    public String getUeberschrift() {
        return ueberschrift;
    }

    public Text getText() {
        return text;
    }
}
