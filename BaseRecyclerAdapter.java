
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ImanX.
 * Adjar | Copyrights 2018 ZarinPal Crop.
 */

public abstract class BaseRecyclerAdapter<VH extends RecyclerView.ViewHolder, T> extends RecyclerView.Adapter<VH> {

    private List<T> list;

    public BaseRecyclerAdapter(List<T> list) {
        this.list = list;
    }

    public BaseRecyclerAdapter() {
    }


    public abstract int getLayout();

    public abstract void onBindView(VH vh, int position, T t);

    public abstract VH getViewHolder(View view);


    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return getViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(getLayout(), parent, false)
        );
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        T t = list.get(position);
        onBindView(holder, position, t);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public List<T> getList() {
        return list;
    }
}

