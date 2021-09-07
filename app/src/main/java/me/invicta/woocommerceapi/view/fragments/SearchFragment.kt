package me.invicta.woocommerceapi.view.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.invicta.woocommerceapi.R
import me.invicta.woocommerceapi.viewModels.SearchViewModel

class SearchFragment: Fragment() {
	
	companion object {
		fun newInstance() = SearchFragment()
	}
	
	private lateinit var viewModel: SearchViewModel
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.search_fragment, container, false)
	}
	
	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		viewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
		// TODO: Use the ViewModel
	}
	
}