import com.guilhermerodrigues.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    private Calculadora calculadora = new Calculadora();

    // ADICAO
    @Test
    @DisplayName("Teste de soma com numeros positivos")
    public void TestaSomaComPositivos() {
        Assertions.assertEquals(3, calculadora.Somar(1, 2));
    }

    @Test
    @DisplayName("Teste de soma com numeros negativos")
    public void TestaSomaComNegativos() {
        Assertions.assertEquals(-10, calculadora.Somar(-5,-5));
    }

    @Test
    @DisplayName("Teste de soma com zero")
    public void TestaSomaComZero() {
        Assertions.assertEquals(11, calculadora.Somar(11,0));
    }
}
