package org.example;

/*Desarrollar un programa un Java que modele una cuenta bancaria mediante POO
esta clase va a tener los siguientes atributos, que tiene que se de acceso protegido.
*/


public class CuentaBancaria {
    /*Saldo tipo float*/
    protected float saldo; //Creamos la variable de saldo

    /*Consignaciones tipo int con inicio 0*/
    protected int consignaciones = 0;

    /*Numero de retiros tipo int inicio en 0*/
    protected int numeroRetiro = 0;

    /*Tasa anual de interes (porcentaje tipo float)*/
    protected float tasaAnual;

    /*Comicion Mensual de tipo float con incio 0*/
    protected float comisionMensual=0;

    /*La clase Cuenta tiene un constructor que inicializa los atributos saldo y tasa anual
    con valores pasados como parámetros.
    La clase Cuenta tiene los siguientes métodos. */

    /*
    * •	Depositar: una cantidad de dinero en la cuenta actualizando su saldo.
•	Retirar: 1) una cantidad de dinero de la cuenta actualizando el saldo,
*   2)el valor a retirar no debe pasar del saldo que se tiene en la cuenta.
•	Calcular el interés mensual de la cuenta, y actualiza el saldo correspondiente.
•	Extracto mensual: 1)actualizando el saldo restándole la comisión mensual,
* 2)calculando el interés mensual correspondiente
* (invocando al metodo anterior).
•	Imprimir los datos de la cuenta en pantalla.

    * */
    /*Constructor*/
    public CuentaBancaria(float saldo, float tasaAnual ) {
        this.saldo=saldo;
        this.tasaAnual=tasaAnual;
    }


    /*Metodo*/
    /*Depositar sirve para sumar un deposito al saldo acutal de la cuenta*/
    public void depositar(float cantidad){
        saldo = saldo+ cantidad;
        consignaciones++;
    }

    /*Retirar sirve para que el valor retirado no sea mayor al saldo actual*/
    public void retirar(float cantidadr){//Es cantidadr por cantidad retiro
        float SaldoT = saldo-cantidadr;  //Se cre variable SaldoT para almacenar la operacion de -
        if (SaldoT<=0){             //La operacion no debe ser menor o igual a 0
            System.out.println("Saldo Insuficiente ");
        }
    }

    /*Calcular la tasa mensal de la cuenta y actualizar el saldo*/
    public void interesMensual(){

        float tasaMensual = tasaAnual/12;  //La operacion nos da la mensual al hacer tasa anual/12

        float interesMensual = tasaMensual*saldo; //La operacion tasaMensual*Saldo = al valor que ganaremos al mes

        float saldoActual = saldo + interesMensual; //La operacion saldo+mensual= nos da la suma del valor al mes mas nuestro saldo
    }

    /*Extracto mensual*/
    public void extractoMensual(){
        saldo = saldo-comisionMensual;
        //Invocamos al metodo interes
        interesMensual();
    }
}
