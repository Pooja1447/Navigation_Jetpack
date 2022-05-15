package com.example.navigationjetpack.presentation.auth.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationjetpack.R
import com.example.navigationjetpack.databinding.FragmentLoginBinding
import com.example.navigationjetpack.presentation.TimelineActivity

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.signup.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_loginFragment_to_registerFragment,
                null
            )
        )

        binding.apply {

            loginBtn.setOnClickListener {

                startActivity(
                    Intent(requireContext(), TimelineActivity::class.java)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                )

            }
        }

    }
}