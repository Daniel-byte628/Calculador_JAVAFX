package operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OperacionResta implements OperacionBinaria{

    private BigDecimal restar(BigInteger num1, BigInteger num2) {
        return new BigDecimal(num1.subtract(num2));
    }

    @Override
    public BigDecimal realizarOperacion(BigInteger num1, BigInteger num2) {
        return restar(num1, num2);
    }

}
