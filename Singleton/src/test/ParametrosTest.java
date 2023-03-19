package test;

import Singleton.Parametros;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarAndarElevador() {
        Parametros.getInstance().setAndarElevador("Segundo Andar");
        assertEquals("Segundo Andar", Parametros.getInstance().getAndarElevador());
    }

    @Test
    public void deveRetornarElevadorMovendo() {
        Parametros.getInstance().setElevadorMovendo("Elevador Movendo");
        assertEquals("Elevador Movendo", Parametros.getInstance().getElevadorMovendo());
    }

}