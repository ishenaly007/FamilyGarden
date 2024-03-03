package com.kooztart.familygarden.ui.func.treeshops

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.kooztart.familygarden.R
import com.kooztart.familygarden.databinding.FragmentTreeShopsBinding

class TreeShopsFragment : Fragment() {

    private var _binding: FragmentTreeShopsBinding? = null
    private val binding get() = _binding!!

    private val treeShopsAdapter: TreeShopsAdapter =
        TreeShopsAdapter(
            listOf(
                TreeShop(R.drawable.shop1),
                TreeShop(R.drawable.shop2),
                TreeShop(R.drawable.shop1),
                TreeShop(R.drawable.shop2),
                TreeShop(R.drawable.shop8),
                TreeShop(R.drawable.shop7),
                TreeShop(R.drawable.shop5),
                TreeShop(R.drawable.shop6),
                TreeShop(R.drawable.shop7),

            )
        )
    // Инициализируйте список treeShops

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTreeShopsBinding.inflate(inflater, container, false)

        binding.recyclerViewTreeShops.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = treeShopsAdapter
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
