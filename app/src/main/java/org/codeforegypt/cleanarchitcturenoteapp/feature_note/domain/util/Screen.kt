package org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.util

sealed class Screen(val route: String) {
    object NoteScreen: Screen("note_Screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}