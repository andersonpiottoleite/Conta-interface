
public class ContaCorrente implements Conta {

	private double saldo;

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;

	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void atualizaTaxa(double taxaSelic) {
		this.saldo += taxaSelic * 2;
	}

}
