package com.sumeshpandit.datafill
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.recyclerview.widget.RecyclerView
class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()
{
    private var deptList= arrayOf("Ola Electric", "Ola Cabs", "Ola Foods", "Ola Money", "Human Resources")
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        var itemDept:RadioButton = itemView.findViewById(R.id.dept)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.dept_item,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemDept.text= deptList[position]
    }

    override fun getItemCount(): Int {
    return deptList.size
    }

}