package boletin_1.cuenta;

public class CuentaCredito extends Cuenta {
    private static final double SALDO_INICIAL = 0;
    private static final double CREDITO_INICIAL = 100;
    private static final double CREDITO_MAX = 300;
    private double credito;

    public CuentaCredito(double saldoInicial, double credito) throws CuentaException {
        super(saldoInicial);
        setCredito(credito);
    }

    public CuentaCredito(double saldoInicial) throws CuentaException {
        super(saldoInicial);
        this.credito = CREDITO_INICIAL;
    }

    public CuentaCredito() throws CuentaException {
        super(SALDO_INICIAL);
        this.credito = CREDITO_INICIAL;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) throws CuentaException {
        if (credito > CREDITO_MAX) {
            throw new CuentaException("Crédito máximo excedido");
        }
        this.credito = credito;
    }

    @Override
    public void reintegro(double dineroASacar) throws CuentaException {
        if (dineroASacar <= 0) {
            throw new CuentaException("Introduzca una cantidad positiva");
        }
        if (getSaldo() + credito < dineroASacar) {
            throw new CuentaException("No tienes fondos suficientes");
        }
        if (dineroASacar > getSaldo()) {
            if (credito != 0) {
                double cantidadRestante = dineroASacar - getSaldo();
                super.reintegro(getSaldo());
                credito -= cantidadRestante;
            } else throw new CuentaException("No tienes suficiente crédito para hacer esta operación");
        } else super.reintegro(dineroASacar);

    }
}
