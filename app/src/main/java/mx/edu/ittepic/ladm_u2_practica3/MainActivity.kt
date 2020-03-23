package mx.edu.ittepic.ladm_u2_practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var jugador1 = HiloControl(this)
    var juego = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener {
            if(!jugador1.isAlive){
                jugador1.start()
            }else{
                if(jugador1.status()){
                }else{
                    jugador1.despausar()
                }
            }
        }
        }
    }

