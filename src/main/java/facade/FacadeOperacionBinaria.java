package facade;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface FacadeOperacionBinaria {

    BigDecimal ejecutarOperacionBinaria(String operacion, BigInteger num1, BigInteger num2);

}
