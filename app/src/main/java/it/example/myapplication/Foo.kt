package it.example.myapplication

import androidx.recyclerview.widget.DiffUtil

data class Foo(
    val id: Long,
    val name: String
) {
    companion object {
        val DIFF = object : DiffUtil.ItemCallback<Foo>() {
            override fun areItemsTheSame(oldItem: Foo, newItem: Foo): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Foo, newItem: Foo): Boolean {
                return oldItem == newItem
            }
        }
    }
}