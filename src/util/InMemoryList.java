package util;

import java.util.ArrayList;
import java.util.List;

public abstract class InMemoryList<E> {
	
	protected final List<E> lista;
	
	protected InMemoryList(List<E> list){
		this.lista = list;
	}
	
	public abstract List<E> inMemoryList();

}
