package operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OperacionMultiplicacion implements OperacionBinaria{

    private BigDecimal multiplicar(BigInteger num1, BigInteger num2)
    {
        return new BigDecimal(num1.multiply(num2));
    }

    @Override
    public BigDecimal realizarOperacion(BigInteger num1, BigInteger num2) {
        return multiplicar(num1, num2);
    }
}

