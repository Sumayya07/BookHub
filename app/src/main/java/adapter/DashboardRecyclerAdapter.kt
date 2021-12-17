package adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sumayya.bookhub.R
import model.Book

class DashboardRecyclerAdapter(val context: Context, val itemList: ArrayList<Book>): RecyclerView.Adapter<DashboardRecyclerAdapter.DashboardViewHolder>() {

    class DashboardViewHolder(view:View): RecyclerView.ViewHolder(view){
        val txtBookName: TextView= view.findViewById(R.id.txtBookName)
        val txtBookAuthor: TextView= view.findViewById(R.id.txtBookAuthor)
        val txtBookPrice: TextView= view.findViewById(R.id.txtBookPrice)
        val txtBookRating: TextView= view.findViewById(R.id.txtBookRating)
        val imgBookImage: TextView= view.findViewById(R.id.imgBookImage)
        val IIContent: LinearLayout = view.findViewById(R.id.IIContent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_dashboard_single_row, parent, false)

        return DashboardViewHolder(view)

        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        val book = itemList[position]
        holder.txtBookName.text = book.bookName
        holder.txtBookAuthor.text = book.bookAuthor
        holder.txtBookPrice.text = book.bookPrice
        holder.txtBookRating.text = book.bookRating
//        holder.imgBookImage.setImageResource(book.bookImage)
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imageView);


        holder.IIContent.setOnClickListener{
            Toast.makeText(context, "Clicked on ${holder.txtBookName.text}", Toast.LENGTH_SHORT).show()
        }


    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}