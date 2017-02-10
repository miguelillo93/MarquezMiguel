import org.junit.Test;
import junit.framework.TestCase;

public class TestFecha extends TestCase {

	Fecha fechaBien = new Fecha(23, 02, 1993);
	Fecha fechaFalloDia = new Fecha(233, 02, 1993);
	Fecha fechaFalloMes = new Fecha(23, 100, 1993);
	Fecha fechaFalloAnyo = new Fecha(23, 02, -10);

	@Test
	public void testFecha() {

		//assertEquals(false, fechaBien.valida());
		//assertEquals(false, fechaFalloDia.valida());
		//assertEquals(false, fechaFalloMes.valida());
		//assertEquals(false, fechaFalloAnyo.valida());
	}
}
