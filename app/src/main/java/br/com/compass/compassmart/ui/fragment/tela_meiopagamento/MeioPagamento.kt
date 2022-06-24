package br.com.compass.compassmart.ui.fragment.tela_meiopagamento

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import br.com.compass.compassmart.R
import br.com.compass.compassmart.databinding.FragmentMeioPagamentoBinding
import br.com.compass.compassmart.databinding.FragmentOnboardingBinding

class MeioPagamento : Fragment(), View.OnClickListener{


    private var _binding: FragmentMeioPagamentoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentMeioPagamentoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cardCompassPay.setOnClickListener(this)
        binding.cardPix.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        var escolha: Int //Para saber qual metodo de pagamento foi selecionado

        if(v.id == binding.cardCompassPay.id){
            binding.constraintLayoutCompassPay.setBackgroundResource(R.color.orange_500)
            binding.constraintLayoutPix.setBackgroundResource(R.color.white)
            escolha = 0
        }
        if(v.id == binding.cardPix.id){
            binding.constraintLayoutCompassPay.setBackgroundResource(R.color.white)
            binding.constraintLayoutPix.setBackgroundResource(R.color.orange_500)
            escolha = 1
        }
    }
}
