package me.invicta.woocommerceapi.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import me.invicta.woocommerceapi.viewModels.HomeViewModel
import me.invicta.woocommerceapi.R

class HomeFragment: Fragment() {
	
	companion object {
		fun newInstance() = HomeFragment()
	}
	
	private val viewModel: HomeViewModel by viewModels()
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.home_fragment, container, false)
	}
	
	
}