package Singleton;
public class Parametros {

    private Parametros() {}
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String andarElevador;
    private String elevadorMovendo;


    public String getAndarElevador() {
        return andarElevador;
    }

    public void setAndarElevador(String andarElevador) {
        this.andarElevador = andarElevador;
    }

    public String getElevadorMovendo() {
        return elevadorMovendo;
    }

    public void setElevadorMovendo(String elevadorMovendo) {
        this.elevadorMovendo = elevadorMovendo;
    }
}