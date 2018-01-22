package com.map.woxapptestapp.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.map.woxapptestapp.R;
import com.map.woxapptestapp.models.RideUserData;
import com.map.woxapptestapp.ui.activiy.BaseActivity;
import com.nikhilpanju.recyclerviewenhanced.RecyclerTouchListener;

import java.util.List;

import butterknife.BindView;

import static com.map.woxapptestapp.tools.ViewUtils.setVisibleOrInvisibleView;


/**
 * Created by Anton on 23.05.2017
 */

public class HistoryFragment extends BaseFragment implements HistoryFragmentPresenter.HistoryFragmentView {

    public static final String TAG = "HistoryFragment";

    @InjectPresenter
    HistoryFragmentPresenter mHistoryFragmentPresenter;

    @BindView(R.id.no_content)
    TextView noContentTextView;

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private ItemSelectedListener mItemSelectedListener;
    private List<RideUserData> list;

    public static HistoryFragment newInstance() {
        return new HistoryFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mItemSelectedListener = (ItemSelectedListener) getActivity();
    }

    @Override
    public void onDetach() {
        mItemSelectedListener = null;
        super.onDetach();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.history_fragment_layout, container, false);
        bindButterKnife(this, mView);
        initRecyclerView();
        mHistoryFragmentPresenter.startConfig();
        return mView;
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(layoutManager);

        RecyclerTouchListener onTouchListener = new RecyclerTouchListener(getActivity(), recyclerView);
        onTouchListener
                .setIndependentViews(R.id.address)
                .setClickable(new RecyclerTouchListener.OnRowClickListener() {
                    @Override
                    public void onRowClicked(int positionClick) {

                    }

                    @Override
                    public void onIndependentViewClicked(int independentViewID, int positionClick) {
                        if (mItemSelectedListener != null && list != null)
                            mItemSelectedListener.returnItem(list.get(positionClick));
                        ((BaseActivity) getActivity()).onBackPressed();
                    }
                })
                .setLongClickable(true, position -> mHistoryFragmentPresenter.removeAddress(position));

        recyclerView.addOnItemTouchListener(onTouchListener);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void initRecyclerView(RecyclerAdapter adapter, List<RideUserData> list) {
        this.list = list;
        setVisibleOrInvisibleView(noContentTextView, (list == null || list.size() == 0));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void notifyRecyclerView() {
        if (recyclerView.getAdapter() != null)
            recyclerView.getAdapter().notifyDataSetChanged();
        setVisibleOrInvisibleView(noContentTextView, (list == null || list.size() == 0));
    }
}
