package com.noha.designpatternsapplication.behavioral.observer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.noha.designpatternsapplication.behavioral.observer.Observer
import com.noha.designpatternsapplication.behavioral.observer.model.Blog
import com.noha.designpatternsapplication.databinding.FragmentSubscriberBinding

/**
 * Blog fragment will observe any changes in the blog model
 *
 * @constructor Create empty Blog fragment
 */
class SubscriberFragment : Fragment(), Observer {

    private lateinit var mBinding: FragmentSubscriberBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mBinding = FragmentSubscriberBinding.inflate(inflater, container, false)

        Blog.registerObserver(this)

        mBinding.blog = Blog
        mBinding.button.setOnClickListener {
            mBinding.blog = Blog
        }
        return mBinding.root
    }

    override fun update(state: Any) {
        Toast.makeText(context, "Refresh your blog.", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Blog.unregisterObserver(this)
    }

}