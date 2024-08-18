package org.codeforegypt.cleanarchitcturenoteapp.feature_note.peresentation.add_edit_note

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
