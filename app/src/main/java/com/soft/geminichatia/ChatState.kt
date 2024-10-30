package com.soft.geminichatia

import android.graphics.Bitmap
import com.soft.geminichatia.data.Chat

data class ChatState(
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)