
public interface Conta {

	public abstract void saca(double valor);

	public abstract void deposita(double valor);

	public abstract double getSaldo();

	public abstract void atualizaTaxa(double taxaSelic);

}
