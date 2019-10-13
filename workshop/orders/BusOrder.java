package workshop.orders;
public class BusOrder extends PaintOrder{
	int number, total;
	double time;
	String plate;

	public BusOrder( int number , double time ,String plate ,int total){	//llama a las variables de PaintOrder
		super();
	}
	public boolean var(){
		if(!getTotal()==0){		//verifica el total
		}else{
			return false;
		}
	}
	public void getType(){
		System.out.println("Tipo Bus");	//tipo de pieza
	}

	public void getPrice(){
		return total;	//precio por la pieza
	}

	public void prcs(){
		System.out.println("Procesando...");	//estado PROCESSING en el PaintOrder
		this.state = State.PROCESSING;
	}
	public void fin(){
		System.out.println("LISTO");	//pieza finalizada
		this.state = State.DONE;
	}
	public void pt(){	//piezas totales
		--total;	//resta una pieza de las especificadas
	}

}