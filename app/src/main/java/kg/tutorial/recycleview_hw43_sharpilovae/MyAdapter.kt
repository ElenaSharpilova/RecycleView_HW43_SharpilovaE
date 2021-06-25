package kg.tutorial.recycleview_hw43_sharpilovae

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(var lists: MutableList<List1>) : RecyclerView.Adapter<MyAdapter.ListViewHolder>()
{

    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ListViewHolder(view)
    }

    fun addItem (list1: List1){
        lists.add(list1)
        notifyItemInserted(lists.size - 1)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.itemView.apply {
            var tv_title = findViewById<TextView>(R.id.tv_title)
            tv_title.text = lists[position].title

        }
    }

    override fun getItemCount(): Int {
        return  lists.size
    }


}