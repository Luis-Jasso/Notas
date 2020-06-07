package com.viajero.notas

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class NotasActivity : AppCompatActivity() {
    private lateinit var allNoteFragment: NoteFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notas)
        supportActionBar

        allNoteFragment = NoteFragment()
        openFragment(allNoteFragment)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_note, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_note_all -> toastMessage(1)
            R.id.item_favorite_note -> toastMessage(2)
        }
        return true
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayoutMain,fragment)
            .commit()
    }

    private fun toastMessage(i: Int) {
        Toast.makeText(this, "Sección $i", Toast.LENGTH_SHORT).show()
    }
}