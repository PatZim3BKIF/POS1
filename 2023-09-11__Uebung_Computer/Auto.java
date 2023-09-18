public class Auto
{
    private String farbe;
    private String marke;
    private int ps;
    
    public Auto(String farbe, String marke, int ps){
        setFarbe(farbe);
        setMarke(marke);
        setPS(ps);
    }

    public Auto (String farbe) {
        setFarbe(farbe);
        setMarke("Skoda");
        setPS(250);
    }
    
    public Auto (String farbe, int ps) {
        setFarbe(farbe);
        setPS(ps);
        setMarke("Audi");
    }
    
    public Auto (int ps, String marke) {
        setPS(ps);
        setMarke(marke);
        setFarbe("rot");
    }
    
    public void setMarke (String neuMarke) {
        
        // Überprüft den gegebenen String mit den Vordefinierten Fällen und wirft bei fehlerhafter Eingabe eine Exception
        switch (neuMarke) {
            case "VW":
                this.marke = neuMarke;
                break;
            case "Audi":
                this.marke = neuMarke;
                break;
            case "Skoda":
                this.marke = neuMarke;
                break;
            default:
                throw new IllegalArgumentException("FEHLER: Die Marke muss ein VW, Audi oder Skoda sein");
        }
    }
    
    public void setPS(int ps) {
        if(ps >= 30 && ps <= 300) {
            this.ps = ps;
        } else {
            throw new IllegalArgumentException("FEHLER: Die PS liegen unter 30 oder über 300");
        }
    }
    
    public void setFarbe(String farbe) {
        switch(farbe){
            case "blau":
                this.farbe = farbe;
                break;
            case "rot":
                this.farbe = farbe;
                break;
            case "schwarz":
                this.farbe = farbe;
                break;
            case "weiß":
                this.farbe = farbe;
                break;
            case "gelb":
                this.farbe = farbe;
                break;
            default:
                throw new IllegalArgumentException("FEHLER: Die gewählte Farbe muss blau, rot, schwarz, weiß oder gelb sein");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
