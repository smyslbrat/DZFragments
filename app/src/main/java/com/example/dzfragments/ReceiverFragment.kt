package com.example.dzfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.dzfragments.databinding.FragmentReceiverBinding

class ReceiverFragment : Fragment() {
    lateinit var bind: FragmentReceiverBinding
    private val dataModel: DataModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("log", "ReceiverFragment: onCreateView")
        bind = FragmentReceiverBinding.inflate(inflater)

        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("log", "ReceiverFragment: onViewCreated")
        dataModel.message2.observe(activity as LifecycleOwner) {
            bind.message2.text = it
        }


        bind.btRead.setOnClickListener {
            dataModel.message2.value = getString(R.string.message_read)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("log", "ReceiverFragment: onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        Log.i("log", "ReceiverFragment: onAttach")
        super.onAttach(context)
    }

    override fun onStart() {
        Log.i("log", "ReceiverFragment: onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("log", "ReceiverFragment: onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("log", "ReceiverFragment: onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("log", "ReceiverFragment: onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("log", "ReceiverFragment: onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.i("log", "ReceiverFragment: onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("log", "ReceiverFragment: onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("log", "ReceiverFragment: onDetach")
        super.onDetach()
    }

    companion object {
        @JvmStatic
        fun newInstance() = ReceiverFragment()
    }
}