package operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OperacionModulo implements OperacionBinaria{

    private BigDecimal realizarModulo(BigInteger num1, BigInteger num2)
    {
        return new BigDecimal(num1.mod(num2));
    }

    @Override
    public BigDecimal realizarOperacion(BigInteger num1, BigInteger num2) {
        return realizarModulo(num1, num2);
    }
}
