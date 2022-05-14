public class PID_speed {

    private double tp, td, ti;  // the variables for the PID Controller
    private double sum_error = 0;
    private double derivative_cte, last_cte;
    

    public PID_speed(double tp, double td, double ti) {
        this.tp = tp;
        this.td = td;
        this.ti = ti;
    }

    public double compute(double current_speed, double desired_speed) {
    	double output;
		double Poutput;
		double Ioutput;
		double Doutput;
		double Foutput;
    	
    	
        double error = current_speed - desired_speed;
        Poutput = -td*(error - last_cte);
        Ioutput = tp*error;
        
        
        
        //this.derivative_cte = cte - last_cte;
//        this.sum_error += error;  // integral
//        double alpha = -tp * cte -td * derivative_cte - ti * sum_cte;
//        this.last_cte = cte;
//        return alpha;
        return 0;
    }
}

