package com.map.woxapptestapp.ui.fragment;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;
import com.map.woxapptestapp.App;
import com.map.woxapptestapp.models.RideUserData;
import com.map.woxapptestapp.models.RideUserDateList;
import com.map.woxapptestapp.tools.SharedPrefManager;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by i7-4770k on 21.01.2018
 */

@InjectViewState
public class HistoryFragmentPresenter extends MvpPresenter<HistoryFragmentPresenter.HistoryFragmentView> {

    private RecyclerAdapter adapter;
    private RideUserDateList list;

    @Inject
    SharedPrefManager sharedPrefManager;

    public void startConfig() {
        App.getComponent().inject(this);
        list = sharedPrefManager.getUserData(RideUserDateList.class);
        initRecyclerView(list.getAddresses());
    }

    @Override
    public void attachView(HistoryFragmentView view) {
        super.attachView(view);
    }

    private void initRecyclerView(List<RideUserData> list) {
        if (adapter == null)
            adapter = new RecyclerAdapter(list);
        getViewState().initRecyclerView(adapter, list);
    }

    public void removeAddress(int position) {
        if (list.getAddresses().size() >= position) {
            list.getAddresses().remove(position);
            sharedPrefManager.setUserData(list);
            getViewState().notifyRecyclerView();
        }
    }

    @StateStrategyType(AddToEndSingleStrategy.class)
    public interface HistoryFragmentView extends MvpView {

        void initRecyclerView(RecyclerAdapter adapter, List<RideUserData> list);

        void notifyRecyclerView();

    }
}
