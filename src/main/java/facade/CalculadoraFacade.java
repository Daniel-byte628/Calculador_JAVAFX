package facade;

import logica.CreadorOperaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CalculadoraFacade implements FacadeOperacionBinaria, FacadeOperacionUnaria, FacadeCalculadoraCompleta{

    @Override
    public BigDecimal ejecutarOperacionBinaria(String operacion, BigInteger num1, BigInteger num2) {
        return CreadorOperaciones.ejecutarOperacion(operacion, num1, num2);
    }

    @Override
    public BigDecimal ejecucionOperacionUnaria(String operacion, BigInteger numero1) {
        return null;
    }


}
