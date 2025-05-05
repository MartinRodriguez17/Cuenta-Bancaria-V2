package org.example;

public class CuentaAhorros extends CuentaBancaria {
    //Declaramos una variable de tipo booleanos
    private boolean activa;

    /*Creamos el constructor*/
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo < 50) {
            //Se activa o desactiva la cuenta
            activa = false;
        } else {
            activa = true;
        }
    }

    /*Implemento un metodo para depositar*/
    public void depositar(float cantidad) {
        if (activa) {
            super.depositar(cantidad);
        }
    }

    /*Implemento el metodo retirar*/
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
    }

    /*Implementa extracto Mensual*/
    public void extracto(float cantidad) {
        if (numeroRetiro > 4) {
            int retiroAdicionales = numeroRetiro-4;
            comisionMensual = retiroAdicionales * 10;
        }
        //llamamos al extracto mensual
        super.extractoMensual();

        //verificamos si esta ctiva
        if(saldo>50){
            activa= true;
        }else{
            activa= false;
        }

    }
}
