package com.noha.designpatternsapplication.behavioral.observer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.noha.designpatternsapplication.behavioral.observer.model.Blog
import com.noha.designpatternsapplication.behavioral.utils.hideKeyboard
import com.noha.designpatternsapplication.databinding.FragmentEditBlogBinding


class EditBlogFragment : Fragment() {

    private lateinit var mBinding: FragmentEditBlogBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mBinding = FragmentEditBlogBinding.inflate(inflater, container, false)

        mBinding.blog = Blog
        mBinding.saveButton.setOnClickListener {
            Blog.editBlogText()
            context?.hideKeyboard(it)
        }

        return mBinding.root
    }
}