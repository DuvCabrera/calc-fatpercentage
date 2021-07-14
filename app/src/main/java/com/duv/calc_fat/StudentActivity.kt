package com.duv.calc_fat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.duv.calc_fat.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    private fun calculaIMC(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if (peso != null && altura != null) {
            val imc = peso / (altura * altura)
            binding.txtIMC.text = "O seu IMC é de {%.2f}".format(imc)
        } else {
            binding.txtIMC.text = "Preencha os dados corretamente"
        }
    }

    private fun somaDobras(axilar: String, triceps: String, peitoral: String,
                           subscapular: String, abdominal: String, suprailiaca:String,
                           coxa:String) {
        val ax = axilar.toFloatOrNull()
        val tri = triceps.toFloatOrNull()
        val pe = peitoral.toFloatOrNull()
        val sb = subscapular.toFloatOrNull()
        val ab = abdominal.toFloatOrNull()
        val si = suprailiaca.toFloatOrNull()
        val cx = coxa.toFloatOrNull()

        if (ax != null && tri != null && pe != null && sb != null && ab != null && si != null && cx != null) {
            val somaDb = ax + tri + pe + pe + sb + ab + si + cx
        }
    }

    private fun calculaGordura(){
        val soma = somaDobras()

    }
}
