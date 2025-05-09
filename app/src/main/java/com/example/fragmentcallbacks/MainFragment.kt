package com.example.fragmentcallbacks

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onAttach(context : Context) {
        super.onAttach(context)
        Log.d("MainFragment","=== onAttach  ===" )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.fragment_main)
        Log.d("MainFragment","=== onCreate  ===" )
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("MainFragment","=== onCreateView TO INFLATE ===" )
        //var id = container?.getId()
        var s = container.toString()
        Log.d("MainFragment","=== onCreateView container s = $s ===" )

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("MainFragment","=== onViewCreated  ===" )
        var tv = view.findViewById<TextView>(R.id.TV)
        tv.setTextColor(Color.rgb(255, 255, 0))
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainFragment","=== onPause  ===" )
    }
    override fun onStop() {
        super.onStop()
        Log.d("MainFragment","=== onStop  ===" )
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("MainFragment","=== onDestroyView  ===" )
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainFragment","=== onDestroy  ===" )
    }
    override fun onDetach() {
        super.onDetach()
        Log.d("MainFragment","=== onDetach  ===" )
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    Log.d("MainFragment","=== newInstance apply  ===" )
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}