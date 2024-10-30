package com.soft.geminichatia

import android.graphics.Bitmap

sealed class ChatUiEvent {

    data class UpdatePrompt(
        val newprompt: String
    ) : ChatUiEvent()

    data class SendPrompt(
        val prompt: String,
        val bitmap: Bitmap?
    ) : ChatUiEvent()
}
