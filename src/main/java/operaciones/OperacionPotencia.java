package operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OperacionPotencia implements OperacionBinaria{

    private BigDecimal realizarPotencia(BigInteger num1, BigInteger num2)
    {
        return new BigDecimal(num1.pow(num2.intValue()));
    }

    @Override
    public BigDecimal realizarOperacion(BigInteger num1, BigInteger num2) {
        return realizarPotencia(num1, num2);
    }
}
