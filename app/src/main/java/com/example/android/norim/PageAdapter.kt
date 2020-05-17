package com.example.android.norim

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                NotesFragment()
            }
            1 -> {
                RemindersFragment()
            }
            2 -> {
                SettingsFragment()
            }
            else -> {
               NotesFragment()
            }
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> {
                return "Notes"
            }
            1 -> {
                return "Reminders"
            }
            2 -> {
                return "Settings"
            }
        }
        return super.getPageTitle(position)
    }

    override fun getCount(): Int {
        return 3
    }
}