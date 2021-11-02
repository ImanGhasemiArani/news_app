package arani.ghasemi.iman.news_app.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import arani.ghasemi.iman.news_app.R;


public class DataAdapterNews extends RecyclerView.Adapter<DataAdapterNews.ViewHolder> {

    private Context context;

    public DataAdapterNews(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgItemNewsTitle;
        private TextView txtItemNewsTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            imgItemNewsTitle = itemView.findViewById(R.id.imgItemNewsTitle);
            txtItemNewsTitle = itemView.findViewById(R.id.txtItemNewsTitle);

        }
    }
}
