package com.example.ugbapp.packages

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.provider.MediaStore
import android.content.Context
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ugbapp.R
import kotlinx.android.synthetic.main.fragment_himno.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HimnoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HimnoFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_himno, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HimnoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HimnoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txt_himno.text = "Somos fuerza de una gran nación,\n" +
                "forjadores de unidad,\n" +
                "nuestras mentes, nuestro corazón\n" +
                "van en busca de verdad.\n" +
                "Con espíritu trabajador,\n" +
                "sin descanso hasta triunfar\n" +
                "lucharemos siempre con valor\n" +
                "por la paz reconquistar.\n" +
                "Nuestro hogar, nuestro orgullo es Oriente,\n" +
                "nuestra estrella es inmortal y en Barrios aún sigue latente\n" +
                "el progreso cual noble ideal.\n" +
                "Universidad Gerardo Barrios\n" +
                "formación profesional\n" +
                "que transforma y educa con fe en Dios\n" +
                "el futuro nacional.\n" +
                "Nuestro hogar, nuestro orgullo es Oriente,\n" +
                "nuestra estrella es inmortal\n" +
                "y en Barrios aún sigue latente\n" +
                "el progreso cual noble ideal."

        btn_Himno.setOnClickListener{
            val mp = MediaPlayer.create(activity,R.raw.himno_ugb)
            mp.start()
        }
    }
}