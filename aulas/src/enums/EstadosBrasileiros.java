package enums;

public enum EstadosBrasileiros {
    SAO_PAULO ("São Paulo", "São Paulo", "SP"),
    RIO_JANEIRO ("Rio de Janeiro", "Rio de Janeiro", "RJ"),
    ESPIRITO_SANTO ("Espirito Santo", "Vitorio", "ES"),
    GOIAS ("Goias", "Goiania", "ES");

    private String name;
    private String capital;
    private String siglas;

    private EstadosBrasileiros(String name, String capital, String siglas){
        this.name = name;
        this.capital = capital;
        this.siglas = siglas;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getSiglas(){
        return siglas;
    }
}
