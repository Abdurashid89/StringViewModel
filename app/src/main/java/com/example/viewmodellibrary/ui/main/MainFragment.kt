package com.example.viewmodellibrary.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.viewmodellibrary.R

open class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: StringViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(StringViewModel::class.java)


//       val text : String = viewModel.liveData.value!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(StringViewModel::class.java)

        val et = view.findViewById<EditText>(R.id.et)
        viewModel.text = et.text.toString()
        val tv = view.findViewById<TextView>(R.id.tv)

        et.setText(viewModel.liveData.value)
        view.findViewById<Button>(R.id.buttonEnter).setOnClickListener {
            tv.text = viewModel.liveData.value
        }

    }

}

/**git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Abdurashid89/StringViewModel.git
git push -u origin main*/