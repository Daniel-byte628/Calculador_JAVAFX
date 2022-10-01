package operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OperacionSuma implements OperacionBinaria{

    private BigDecimal sumar(BigInteger num1, BigInteger num2)
    {
        return new BigDecimal(num1.add(num2));
    }

    @Override
    public BigDecimal realizarOperacion(BigInteger num1, BigInteger num2) {
        return sumar(num1, num2);
    }


}
