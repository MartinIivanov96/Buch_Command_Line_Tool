package de.unidue;

public class Text {
    private String text;

    public Text (String text) {
        this.text=text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String ceaserVerschluesselung(int verschiebung){
        if(verschiebung<0 || verschiebung>25) {
            throw new IllegalArgumentException("Ungültige Verschiebung");
        }
        char[] text_array = text.toCharArray();
        String verschluesselte_text = "";
        for(int i=0; i< text.length(); i++) {
            if (text_array[i] != ' ') {
                text_array[i] = (char) (((text_array[i] - 'a') + verschiebung) % 26 + 'a') ;
                verschluesselte_text = verschluesselte_text + text_array[i];
            }
            else {
                verschluesselte_text = verschluesselte_text + ' ';
            }
        }
        return verschluesselte_text;
    }

    public int wortAnzahl() {
        String[] wörter;
        wörter = text.split("\\s+");
        return wörter.length;
    }

    public void wortSchnittstelle( Text andererText) {
        String[] wörter = text.split("\\s+");
        String[] wörter2 = andererText.getText().split("\\s+");
        for (String wort : wörter) {
            for (String wort_compare : wörter2 ) {
                if (wort.equals(wort_compare) == true ){
                    System.out.println(wort);
                }
            }
        }
    }
}
