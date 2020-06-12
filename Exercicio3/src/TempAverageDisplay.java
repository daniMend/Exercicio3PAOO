package fatec_ipi_paoo_tarde_observer;

import java.util.ArrayList;
import java.util.List;

public class TempAverageDisplay implements Observer, DisplayElement{

    private List<Double> temps = new ArrayList<>();

    public void update (double temp) {
        for (int i = 0; i < 10; i++) {
            temps.add(temp);
        }
    }
    public void display(double t) {
        System.out.printf("Média: %.2f\n", calculaMedia());
    }

    @Override
    public void display(double t) {
        for (Double temp : temps) {
            System.out.printf("Temperatura: %.2f\n", temp);
        }
    }

    private double calculaMedia () {
        double soma = 0;
        for (Double temp : temps)
            soma += temp;
        return soma / temps.size();
    }

}


