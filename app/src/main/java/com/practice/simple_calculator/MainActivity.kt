package com.practice.simple_calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.practice.simple_calculator.Components.Calculator
import com.practice.simple_calculator.Model.CalculatorViewModel
import com.practice.simple_calculator.ui.theme.Simple_calculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Simple_calculatorTheme {

                // A surface container using the 'background' color from the theme
               val viewModel = viewModel<CalculatorViewModel>()
                val state =viewModel.state
                val buttonSpacing = 10.dp

                Calculator(
                    state =state ,
                    onAction = viewModel:: onAction,
                    buttonSpacing = buttonSpacing,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                        .padding(16.dp)
                     )
                }
            }
        }
    }

