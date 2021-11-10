package com.example.dashborad_cahyo_06.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import com.example.dashborad_cahyo_06.R
import com.example.dashborad_cahyo_06.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment(R.layout.fragment_notification) {

    private lateinit var binding: FragmentNotificationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNotificationBinding.bind(view)

        binding.iconNotification.setOnClickListener {
            Toast.makeText(activity, "Yeay, tugas selesai!", Toast.LENGTH_SHORT).show()
        }
    }

}