package com.example.pokedex.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.pokedex.R

// 머티리얼 타이포그래피 스타일
val Roboto = FontFamily(
    Font(R.font.godo_rounded_l, FontWeight.Light),
    Font(R.font.godo_maum, FontWeight.Normal),
    Font(R.font.godo_maum, FontWeight.Medium),
    Font(R.font.godo_rounded_r, FontWeight.Bold),
)

val RobotoCondensed = FontFamily(
    Font(R.font.godo_rounded_l, FontWeight.Light),
    Font(R.font.godo_rounded_r, FontWeight.Normal),
)

// 머티리얼 타이포그래피 스타일
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)