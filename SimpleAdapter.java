import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.adjar.app.R;
import com.adjar.app.databinding.ItemTestBinding;
import com.adjar.app.models.TestModel;

import java.util.List;

/**
 * Created by ImanX.
 * Adjar | Copyrights 2018 ZarinPal Crop.
 */

public class SimpleAdapter extends BindingRecyclerAdapter<TestModel> {

    public SimpleAdapter(List<TestModel> list) {
        super(list);
    }

    @Override
    public int getLayout() {
        return R.layout.item_test;
    }

    @Override
    public void onBindView(RecyclerView.ViewHolder vh, ViewDataBinding binding, int position, TestModel testModel) {
        ItemTestBinding b = (ItemTestBinding) binding;
        b.txt.setText(position + " " + testModel.name);
    }
}
