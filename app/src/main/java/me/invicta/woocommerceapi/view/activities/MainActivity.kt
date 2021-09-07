package me.invicta.woocommerceapi.view.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import me.invicta.woocommerceapi.R
import me.invicta.woocommerceapi.databinding.ActivityMainBinding
import me.invicta.woocommerceapi.viewModels.MainViewModel

class MainActivity: AppCompatActivity() {
	
	private val viewModel: MainViewModel by viewModels()
	private lateinit var navController: NavController
	private lateinit var binding : ActivityMainBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
		
		initNavController()
		
	}
	
	private fun initNavController() {
		val navHostFragment =
			supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
		navController = navHostFragment.navController
	}
}