package facade;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface FacadeCalculadoraCompleta {

    BigDecimal ejecutarOperacionBinaria(String operacion, BigInteger num1, BigInteger num2);

    BigDecimal ejecucionOperacionUnaria(String operacion, BigInteger num1);


}
