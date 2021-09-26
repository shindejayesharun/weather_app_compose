package com.shindejayesharun.composeweatherapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.shindejayesharun.composeweatherapp.R

val CustomFont = FontFamily(
    Font(R.font.futura_normal),
    Font(R.font.futura_bold,weight = FontWeight.Bold),
    Font(R.font.futura_medium,weight = FontWeight.Medium)
)

// Set of Material typography styles to start with
val Typography = Typography(defaultFontFamily = CustomFont)