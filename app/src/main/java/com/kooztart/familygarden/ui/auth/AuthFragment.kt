package com.kooztart.familygarden.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kooztart.familygarden.R
import com.kooztart.familygarden.databinding.FragmentAuthBinding


class AuthFragment : Fragment() {
    private var binding: FragmentAuthBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.btnAuth.setOnClickListener {
            if (binding!!.tilPassword.editText?.text != null && binding!!.tilPassword2.editText?.text != null
            ) {

                findNavController().navigate(R.id.main)

            } else {
                Toast.makeText(
                    requireContext(),
                    "Заполните все поля пожалуйста",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        binding!!.btnGoToLogin.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)
        }


    }
}