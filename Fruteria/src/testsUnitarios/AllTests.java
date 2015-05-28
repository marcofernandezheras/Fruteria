package testsUnitarios;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccesoFicheroTest.class, ArticuloTest.class,
		LineaPedidoTest.class, ListaArticulosTest.class,
		ListaClientesTest.class, ListaPedidosTest.class, PedidoTest.class })
public class AllTests {

}