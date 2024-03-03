package com.kooztart.familygarden.ui.func.ecoblog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.kooztart.familygarden.R
import com.kooztart.familygarden.databinding.FragmentEcoBlogBinding


class EcoBlogFragment : Fragment() {

    private var _binding: FragmentEcoBlogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEcoBlogBinding.inflate(inflater, container, false)

        val blogList = listOf(
            // Инициализируйте ваш список EcoBlog
            EcoBlog("Советы по посадке деревьев", R.drawable.blog1),
            EcoBlog("Как понять, что деревьям в саду не хватает питательных элементов?", R.drawable.blog2),
            EcoBlog("Советы по уходу за деревьями", R.drawable.blog3),
            EcoBlog("Лучшие плодовые деревья для сада", R.drawable.blog4),
            EcoBlog("Советы по уходу за деревьями", R.drawable.blog3),
            EcoBlog("Лучшие плодовые деревья для сада", R.drawable.blog4),
        )

        binding.recyclerViewEcoBlog.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.recyclerViewEcoBlog.adapter = EcoBlogAdapter(blogList)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnMoreBlogs.setOnClickListener {
            Toast.makeText(requireContext(), "пока что всё  :)", Toast.LENGTH_SHORT).show()
        }
    }
}