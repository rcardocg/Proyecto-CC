public class WorkshopScheduler{
	public static void main(String[] args)throws Exception{
		for(int i = 0; i<args.length; i++)
		System.out.println(args[i]);

		String[] t = args[1].split("-");
		double tmin = Double.parseDouble(t[0])*1000;
		System.out.println("Tiempo minimo: "+tmin);
		double tmax = Double.parseDouble(t[1])*1000;
		System.out.println ("Tiempo maximo: "+tmax);

		switch(args[0]){
		
			case "-fcfs":
				System.out.println("First Come First Served\n");
				break;
			case "fcfs":
				System.out.println("First Come First Served\n");
				break;
			case "-lcfs":
				System.out.println("Last Come First Served\n");
				break;
			case "lcfs":
				System.out.println("Last Come First Served\n");
				break;
			case "-rr":
				System.out.println("Round Robin\n");
				break;
			case "rr":
				System.out.println("Round Robin\n");
				break;
			default:
				System.out.println("Saber que es eso bro");
				break;
		}
		try{

		}catch{
			ArrayIndexOutOfBoundsException
		}
	}
}