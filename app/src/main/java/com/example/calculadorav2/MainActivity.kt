package com.example.calculadorav2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Numeros
        val punto: Button =findViewById(R.id.punto)
        val Boton0: Button =findViewById(R.id.button0)
        val Boton1: Button =findViewById(R.id.button1)
        val Boton2: Button =findViewById(R.id.button2)
        val Boton3: Button =findViewById(R.id.button3)
        val Boton4: Button =findViewById(R.id.button4)
        val Boton5: Button =findViewById(R.id.button5)
        val Boton6: Button =findViewById(R.id.button6)
        val Boton7: Button =findViewById(R.id.button7)
        val Boton8: Button =findViewById(R.id.button8)
        val Boton9: Button =findViewById(R.id.button9)

        //Operaciones
        val clear: Button =findViewById(R.id.clear)
        val suma: Button =findViewById(R.id.suma)
        val resta: Button =findViewById(R.id.resta)
        val multi: Button =findViewById(R.id.multi)
        val div: Button =findViewById(R.id.div)
        val igual: Button =findViewById(R.id.igual)
        val sec: Button =findViewById(R.id.sec)
        val cos: Button =findViewById(R.id.cos)
        val sin: Button =findViewById(R.id.sin)
        val csc: Button =findViewById(R.id.csc)
        val tan: Button =findViewById(R.id.tan)
        val cot: Button =findViewById(R.id.cot)
        val expo: Button =findViewById(R.id.expo)
        val ln: Button =findViewById(R.id.ln)

        //Pantalla
        val pantalla: TextView = findViewById(R.id.textView)
        var resul=""
        var resultado=0.0
        var operacion=0
        var cont=0

        //Variables para realizar las operaciones
        var num1=0.0
        var num2=0.0

        var estado=false

        //Botones numeros
        Boton0.setOnClickListener(){ resul=resul+"0"; pantalla.text=resul; }
        Boton1.setOnClickListener(){ resul=resul+"1"; pantalla.text=resul; }
        Boton2.setOnClickListener(){ resul=resul+"2"; pantalla.text=resul; }
        Boton3.setOnClickListener(){ resul=resul+"3"; pantalla.text=resul; }
        Boton4.setOnClickListener(){ resul=resul+"4"; pantalla.text=resul; }
        Boton5.setOnClickListener(){ resul=resul+"5"; pantalla.text=resul; }
        Boton6.setOnClickListener(){ resul=resul+"6"; pantalla.text=resul; }
        Boton7.setOnClickListener(){ resul=resul+"7"; pantalla.text=resul; }
        Boton8.setOnClickListener(){ resul=resul+"8"; pantalla.text=resul; }
        Boton9.setOnClickListener(){ resul=resul+"9"; pantalla.text=resul; }


        punto.setOnClickListener(){
            if(cont == 0){
                resul=resul+"."
                pantalla.text=resul
                cont++
            }else{
                pantalla.text="0"
                resul=""
            }
        }

        clear.setOnClickListener(){
            resul=""
            pantalla.text="0"
            num1=0.0
            num2=0.0
            cont=0
            operacion=0
        }

        suma.setOnClickListener(){
            if(resul == ""){
                pantalla.text="No hay numeros"
            }else{
                num1=resul.toDouble()
                operacion=1
                resul=""
            }
        }

        resta.setOnClickListener(){
            if(resul == ""){
                pantalla.text="No hay numeros"
            }else{
                num1=resul.toDouble()
                operacion=2
                resul=""
            }

        }

        multi.setOnClickListener(){
            if(resul == ""){
                pantalla.text="No hay numeros"
            }else{
                num1=resul.toDouble()
                operacion=3
                resul=""
            }

        }

        div.setOnClickListener(){
            if(resul == ""){
                pantalla.text="No hay numeros"
            }else{
                num1=resul.toDouble()
                operacion=4
                resul=""
            }

        }


        //Funciones trigonometricas

        cos.setOnClickListener(){
            //Valor de 1 radian = 0.0174533
            //1 grado equivale a  0.0174533 radianes

            if(resul == ""){
                pantalla.text="No hay numeros"
            }else{
                resultado = resul.toDouble() *0.0174533
                num1= cos(resultado)

                pantalla.text = num1.toString()
            }
        }

        sin.setOnClickListener(){
            //Valor de 1 radian = 0.0174533
            //1 grado equivale a  0.0174533 radianes

            if(resul == ""){
                pantalla.text="No hay numeros"
            }else{
                resultado=resul.toDouble()*0.0174533
                num1 = sin(resultado)

                pantalla.text=num1.toString()
            }

        }

        tan.setOnClickListener(){
            //Valor de 1 radian = 0.0174533
            //1 grado equivale a  0.0174533 radianes
            if(resul == ""){
                pantalla.text="No hay numeros"
            }else{
                resultado = resul.toDouble() *0.0174533
                num1= tan(resultado)

                pantalla.text = num1.toString()
            }
        }

        sec.setOnClickListener(){
            //calcular el coseno
            //Dividir 1 / valor coseno
            if(resul == ""){
                pantalla.text="No hay numeros"
            }else{
                resultado = resul.toDouble() *0.0174533
                num1= cos(resultado)
                num1= 1 / num1
                pantalla.text = num1.toString()
            }

        }

        csc.setOnClickListener(){
            //Obtener el valor del seno
            //Dividir 1 / valor seno
            if(resul == ""){
                pantalla.text="No hay numeros"
            }else{
                resultado=resul.toDouble()*0.0174533
                num1 = sin(resultado)
                num1 = 1 / num1
                pantalla.text = num1.toString()
            }
        }

        cot.setOnClickListener(){
            //Obtener el valor de la tangente
            //Dividir 1 / valor tangente
            if(resul == ""){
                pantalla.text="No hay numeros"
            }else{
                resultado = resul.toDouble() *0.0174533
                num1= tan(resultado)
                num1= 1 / num1
                pantalla.text = num1.toString()
            }
        }

        expo.setOnClickListener(){
            if(resul == ""){
                pantalla.text="No hay numeros"
            }else{
                resultado = resul.toDouble()
                num1= exp(resultado)

                pantalla.text = num1.toString()
            }

        }

        ln.setOnClickListener(){
            if(resul == ""){
                pantalla.text="No hay numeros"
            }else{
                resultado = resul.toDouble()
                num1= ln(resultado)

                pantalla.text = num1.toString()
            }
        }

        igual.setOnClickListener(){
            if(resul != ""){
                num2=resul.toDouble()
                when(operacion){
                    1->{resultado=num1+num2; pantalla.text=resultado.toString();}
                    2->{resultado=num1-num2; pantalla.text=resultado.toString();}
                    3->{resultado=num1*num2; pantalla.text=resultado.toString();}
                    4->{
                        if(num2 == 0.0){
                            pantalla.text="Indeterminado"
                        }else{
                            resultado=num1/num2
                            pantalla.text=resultado.toString()
                        }
                    }
                }
            }

        }

    }
}