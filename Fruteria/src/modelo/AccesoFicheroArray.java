package modelo;

import java.util.ArrayList;
import java.util.List;

public class AccesoFicheroArray implements IAccesoDatos {

	List<Object> listaObjectos = new ArrayList<Object>();
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Object leerObjeto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean escribirObjeto(Object objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarObjeto(Modificable objeto, Object identificador) {
		// TODO Auto-generated method stub
		return false;
	}

}
