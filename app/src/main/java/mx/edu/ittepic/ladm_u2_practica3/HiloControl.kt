package mx.edu.ittepic.ladm_u2_practica3

import android.app.AlertDialog

import kotlinx.android.synthetic.main.activity_main.*

 class HiloControl(p:MainActivity):Thread(){
    var puntero = p
    var totalJ1 = 0
    var totalJ2 = 0
    var totalJ3 = 0
    var totalJ4 = 0
    var sleepT = 600.toLong()
    var auxiliar = 0
    var vivo = true
    override fun run() {
        super.run()
        while (true){

            if(vivo) {
//---------------------------------------PRIMERA RONDA-----------------------------------------
                sleep(sleepT)
                puntero.runOnUiThread {
                    Ejugador1()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador1Dado1Turno1.setText("" + auxiliar)
                    totalJ1 += auxiliar
                    totalj1()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador1Dado2Turno1.setText("" + auxiliar)
                    totalJ1 += auxiliar
                    totalj1()
                }
                sleep(sleepT)

                //--------------------------------
                puntero.runOnUiThread {
                    Ejugador2()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador2Dado1Turno1.setText("" + auxiliar)
                    totalJ2 += auxiliar
                    totalj2()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador2Dado2Turno1.setText("" + auxiliar)
                    totalJ2 += auxiliar
                    totalj2()
                }
                sleep(sleepT)

                //--------------------------------
                puntero.runOnUiThread {
                    Ejugador3()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador3Dado1Turno1.setText("" + auxiliar)
                    totalJ3 += auxiliar
                    totalj3()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador3Dado2Turno1.setText("" + auxiliar)
                    totalJ3 += auxiliar
                    totalj3()
                }
                sleep(sleepT)
                //--------------------------------
                puntero.runOnUiThread {
                    Ejugador4()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador4Dado1Turno1.setText("" + auxiliar)
                    totalJ4 += auxiliar
                    totalj4()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador4Dado2Turno1.setText("" + auxiliar)
                    totalJ4 += auxiliar
                    totalj4()
                }
                sleep(sleepT)
//-----------------------------------SEGUNDA RONDA-----------------------------------------
                sleep(sleepT)
                puntero.runOnUiThread {
                    Ejugador1()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador1Dado1Turno2.setText("" + auxiliar)
                    totalJ1 += auxiliar
                    totalj1()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador1Dado2Turno2.setText("" + auxiliar)
                    totalJ1 += auxiliar
                    totalj1()
                }
                sleep(sleepT)

                //--------------------------------
                puntero.runOnUiThread {
                    Ejugador2()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador2Dado1Turno2.setText("" + auxiliar)
                    totalJ2 += auxiliar
                    totalj2()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador2Dado2Turno2.setText("" + auxiliar)
                    totalJ2 += auxiliar
                    totalj2()
                }
                sleep(sleepT)

                //--------------------------------
                puntero.runOnUiThread {
                    Ejugador3()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador3Dado1Turno2.setText("" + auxiliar)
                    totalJ3 += auxiliar
                    totalj3()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador3Dado2Turno2.setText("" + auxiliar)
                    totalJ3 += auxiliar
                    totalj3()
                }
                sleep(sleepT)
                //--------------------------------
                puntero.runOnUiThread {
                    Ejugador4()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador4Dado1Turno2.setText("" + auxiliar)
                    totalJ4 += auxiliar
                    totalj4()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador4Dado2Turno2.setText("" + auxiliar)
                    totalJ4 += auxiliar
                    totalj4()
                }
                sleep(sleepT)

//------------------------------------TERCERA RONDA---------------------------------------------

                sleep(sleepT)
                puntero.runOnUiThread {
                    Ejugador1()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador1Dado1Turno3.setText("" + auxiliar)
                    totalJ1 += auxiliar
                    totalj1()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador1Dado2Turno3.setText("" + auxiliar)
                    totalJ1 += auxiliar
                    totalj1()
                }
                sleep(sleepT)

                //--------------------------------
                puntero.runOnUiThread {
                    Ejugador2()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador2Dado1Turno3.setText("" + auxiliar)
                    totalJ2 += auxiliar
                    totalj2()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador2Dado2Turno3.setText("" + auxiliar)
                    totalJ2 += auxiliar
                    totalj2()
                }
                sleep(sleepT)

                //--------------------------------
                puntero.runOnUiThread {
                    Ejugador3()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador3Dado1Turno3.setText("" + auxiliar)
                    totalJ3 += auxiliar
                    totalj3()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador3Dado2Turno3.setText("" + auxiliar)
                    totalJ3 += auxiliar
                    totalj3()
                }
                sleep(sleepT)
                //--------------------------------
                puntero.runOnUiThread {
                    Ejugador4()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador4Dado1Turno3.setText("" + auxiliar)
                    totalJ4 += auxiliar
                    totalj4()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador4Dado2Turno3.setText("" + auxiliar)
                    totalJ4 += auxiliar
                    totalj4()
                }
                sleep(sleepT)
//-------------------------------CUARTA RONDA-------------------------------------
                sleep(sleepT)
                puntero.runOnUiThread {
                    Ejugador1()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador1Dado1Turno4.setText("" + auxiliar)
                    totalJ1 += auxiliar
                    totalj1()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador1Dado2Turno4.setText("" + auxiliar)
                    totalJ1 += auxiliar
                    totalj1()
                }
                sleep(sleepT)

                //--------------------------------
                puntero.runOnUiThread {
                    Ejugador2()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador2Dado1Turno4.setText("" + auxiliar)
                    totalJ2 += auxiliar
                    totalj2()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador2Dado2Turno4.setText("" + auxiliar)
                    totalJ2 += auxiliar
                    totalj2()
                }
                sleep(sleepT)

                //--------------------------------
                puntero.runOnUiThread {
                    Ejugador3()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador3Dado1Turno4.setText("" + auxiliar)
                    totalJ3 += auxiliar
                    totalj3()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador3Dado2Turno4.setText("" + auxiliar)
                    totalJ3 += auxiliar
                    totalj3()
                }
                sleep(sleepT)
                //--------------------------------
                puntero.runOnUiThread {
                    Ejugador4()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador4Dado1Turno4.setText("" + auxiliar)
                    totalJ4 += auxiliar
                    totalj4()
                }
                sleep(sleepT)
                puntero.runOnUiThread {
                    auxiliar = tirarDados()
                    puntero.jugador4Dado2Turno4.setText("" + auxiliar)
                    totalJ4 += auxiliar
                    totalj4()
                }
                sleep(sleepT)

                puntero.runOnUiThread {
                    AlertDialog.Builder(puntero)
                        .setTitle("GANADOR")
                        .setMessage("El ganador es : Jugador " + ganador(totalJ1, totalJ2, totalJ3, totalJ4))
                        .show()
                }
                pausar()
            }
        }
    }



    fun tirarDados():Int{
        return (Math.random()*6+1).toInt()
    }
    fun totalj1(){
        puntero.totalJ1.setText(""+totalJ1)
    }
    fun totalj2(){
        puntero.totalJ2.setText(""+totalJ2)
    }
    fun totalj3(){
        puntero.totalJ3.setText(""+totalJ3)
    }
    fun totalj4(){
        puntero.totalJ4.setText(""+totalJ4)
    }


    fun Ejugador1(){
        puntero.estatusJugador1.setText("TIRANDO DADOS")
        puntero.estatusJugador2.setText("ESPERANDO")
        puntero.estatusJugador3.setText("ESPERANDO")
        puntero.estatusJugador4.setText("ESPERANDO")
    }
    fun Ejugador2(){
        puntero.estatusJugador2.setText("TIRANDO DADOS")
        puntero.estatusJugador1.setText("ESPERANDO")
        puntero.estatusJugador3.setText("ESPERANDO")
        puntero.estatusJugador4.setText("ESPERANDO")
    }
    fun Ejugador3(){
        puntero.estatusJugador3.setText("TIRANDO DADOS")
        puntero.estatusJugador1.setText("ESPERANDO")
        puntero.estatusJugador2.setText("ESPERANDO")
        puntero.estatusJugador4.setText("ESPERANDO")
    }
    fun Ejugador4(){
        puntero.estatusJugador4.setText("TIRANDO DADOS")
        puntero.estatusJugador1.setText("ESPERANDO")
        puntero.estatusJugador2.setText("ESPERANDO")
        puntero.estatusJugador3.setText("ESPERANDO")
    }


    fun ganador(uno : Int, dos :Int, tres:Int,cuatro : Int):String{
        if(uno>dos && uno >tres && uno>cuatro){
            return "1"
        }else if(dos>uno && dos>tres && dos>cuatro){
            return "2"
        }else if(tres>uno && tres>dos && tres>cuatro){
            return "3"
        }else{
            return "4"
        }
    }
    fun pausar(){
        vivo = false
    }

    fun despausar(){
        totalJ1 = 0
        totalJ2 = 0
        totalJ3 = 0
        totalJ4 = 0
        vivo = true


    }

    fun status():Boolean{
        return vivo
    }

}