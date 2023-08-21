package com.example.testesame1.ui.character

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.testesame1.R
import com.example.testesame1.databinding.FragmentYourCharacterBinding
import com.example.testesame1.ui.Races

class CharacterFragment : Fragment() {

    private var _binding: FragmentYourCharacterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentYourCharacterBinding.inflate(inflater, container, false)
        return binding.root
    }

    // E' la stessa cosa dell'onBindViewHolder, quindi sovrascriviamo la funzione di base di android, richiamando l'orginale
    // con il super.  , poi assegniamo testi, immagini, etc...
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val array = resources.getStringArray(R.array.dnd_races)
        val list = array.map { race -> Races(race, "") }

        binding.characterRecyclerView.adapter = RacesAdapter(racesList = list )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}