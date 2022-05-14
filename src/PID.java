public class PID {

    private double tp, td, ti;  // the variables for the PID Controller
    private double true_value = 1;  // the desired altitude
    private double sum_cte = 0;
    private double derivative_cte, last_cte;

    public PID(double tp, double td, double ti) {
        this.tp = tp;
        this.td = td;
        this.ti = ti;
    }

    public double compute(double current_value) {
        double cte = current_value - this.true_value;
        this.derivative_cte = cte - last_cte;
        this.sum_cte += cte;  // integral
        double alpha = -tp * cte -td * derivative_cte - ti * sum_cte;
        this.last_cte = cte;
        return alpha;
    }
}
