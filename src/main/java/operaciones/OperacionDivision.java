package operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OperacionDivision implements OperacionBinaria{

    private BigDecimal dividir(BigInteger num1, BigInteger num2)
    {
        return new BigDecimal(num1.divide(num2));
    }

    @Override
    public BigDecimal realizarOperacion(BigInteger num1, BigInteger num2) {
        return dividir(num1, num2);
    }
}
