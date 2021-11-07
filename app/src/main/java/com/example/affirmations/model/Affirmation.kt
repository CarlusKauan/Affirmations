//Pacotes
package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


//Adicione um parâmetro stringResourceId val inteiro ao construtor da classe Affirmation.
    //Isso eliminará o erro.

data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int)
