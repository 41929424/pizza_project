public class Pizza {
    private String name;
    private String pildijums;
    private boolean asaVaiNe;
    private double cena;

    @Override
    public String toString() {
        String asa;
        if (asaVaiNe) asa = "Jā";
        else asa = "Nē";
        return "Nosaukums = " + name + '\n' +
                "Pildijums = " + pildijums + '\n' +
                "Asa = " + asa + "\n" +
                "Cena = " + cena + "€\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPildijums() {
        return pildijums;
    }

    public void setPildijums(String pildijums) {
        this.pildijums = pildijums;
    }

    public boolean isAsaVaiNe() {
        return asaVaiNe;
    }

    public void setAsaVaiNe(boolean asaVaiNe) {
        this.asaVaiNe = asaVaiNe;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Pizza(String name, String pildijums, boolean asaVaiNe, double cena) {
        this.name = name;
        this.pildijums = pildijums;
        this.asaVaiNe = asaVaiNe;
        this.cena = cena;
    }
}
