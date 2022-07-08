package br.com.compass.compassmart.ui

import androidx.annotation.DrawableRes
import java.io.Serializable

data class Produto(
    val modelo: String,
    val quantidade: String,
    val preco: String,
    @DrawableRes val drawableId: Int,
)