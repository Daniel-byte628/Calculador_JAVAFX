package logica;
import operaciones.OperacionBinaria;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class CreadorOperaciones {
    public static BigDecimal ejecutarOperacion(String operacion , BigInteger num1, BigInteger num2) {
        Optional<OperacionBinaria> respuesta = getInstanciaOperacion(operacion);
        if(respuesta.isPresent())
            return respuesta.get().realizarOperacion(num1, num2);
        throw new RuntimeException("Operacion no valida " + operacion);
    }


    private static Optional<OperacionBinaria> getInstanciaOperacion(String operacion) {
        try {
            OperacionBinaria operacionBinaria = (OperacionBinaria)
                    Class.forName("operaciones.Operacion" + operacion).newInstance();
            return Optional.of(operacionBinaria);
        }
        catch (ClassNotFoundException ce) {
            System.out.println("Operacion no valida " + operacion);
        }
        catch (InstantiationException | IllegalAccessException e) {
            System.out.println("Error al acceder a la operacion");
        }
        return Optional.empty();
    }
}
