package fatec_ipi_paoo_tarde_observer;

public interface Subject {
	
	public void registerObserver (Observer o);
	public void removeObserver (Observer o);
	public void notifyObservers();

}
