
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ImanX.
 * Adjar | Copyrights 2018 ZarinPal Crop.
 */

public abstract class BindingRecyclerAdapter<T> extends BaseRecyclerAdapter<RecyclerView.ViewHolder, T> {

    public BindingRecyclerAdapter(List<T> list) {
        super(list);
    }

    public BindingRecyclerAdapter() {
        this(new ArrayList<T>());
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(View view) {
        return new VH(view);
    }

    public abstract void onBindView(RecyclerView.ViewHolder vh, ViewDataBinding binding, int position, T t);

    @Override
    public void onBindView(RecyclerView.ViewHolder viewHolder, int position, T t) {
        onBindView(viewHolder, ((VH) viewHolder).viewDataBinding, position, t);
    }

    public class VH extends RecyclerView.ViewHolder {
        ViewDataBinding viewDataBinding;

        public VH(View v) {
            super(v);
            viewDataBinding = DataBindingUtil.bind(v);
        }
    }

}
