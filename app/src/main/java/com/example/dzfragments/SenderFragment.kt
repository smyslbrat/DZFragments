package com.example.dzfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.setFragmentResult
import com.example.dzfragments.databinding.FragmentSenderBinding


class SenderFragment : Fragment() {
    lateinit var bind: FragmentSenderBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("log", "SenderFragment: onCreateView")
        bind = FragmentSenderBinding.inflate(inflater)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("log", "SenderFragment: onViewCreated")
        bind.btToRec.setOnClickListener {
            repFrag()
        }
    }
    private fun repFrag(){
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.sndr_frag, ReceiverFragment())
            .addToBackStack(null)
            .commit()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("log", "SenderFragment: onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        Log.i("log", "SenderFragment: onAttach")
        super.onAttach(context)
    }

    override fun onStart() {
        Log.i("log", "SenderFragment: onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("log", "SenderFragment: onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("log", "SenderFragment: onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("log", "SenderFragment: onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("log", "SenderFragment: onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.i("log", "SenderFragment: onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("log", "SenderFragment: onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("log", "SenderFragment: onDetach")
        super.onDetach()
    }
    companion object {
        @JvmStatic
        fun newInstance() = SenderFragment()
    }
}