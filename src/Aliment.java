public class Aliment {
    private String nume;
    private Long dataExp;
    private Double pret;
    private Double calorii;

    @Override
    public String toString() {
        return "Aliment{" +
                "nume='" + nume + '\'' +
                ", dataExp=" + dataExp +
                ", pret=" + pret +
                ", calorii=" + calorii +
                ", ingrediente='" + ingrediente + '\'' +
                '}';
    }

    public Aliment(String nume, Long dataExp, Double pret, Double calorii, String ingrediente) {
        this.nume = nume;
        this.dataExp = dataExp;
        this.pret = pret;
        this.calorii = calorii;
        this.ingrediente = ingrediente;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDataExp(Long dataExp) {
        this.dataExp = dataExp;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public void setCalorii(Double calorii) {
        this.calorii = calorii;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    private String ingrediente;

    public String getNume() {
        return nume;
    }

    public Long getDataExp() {
        return dataExp;
    }

    public Double getPret() {
        return pret;
    }

    public Double getCalorii() {
        return calorii;
    }

    public String getIngrediente() {
        return ingrediente;
    }
}

