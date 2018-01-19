package com.map.woxapptestapp.ui.adapter.presentor;


import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

/**
 * Советы:
 * Для инициализации в Presenter сделайте метод Presenter.init(); или Presenter.startConfig();
 * Пока жив процесс, получить доступ к MvpPresenterStore можно через MvpFacade.getInstance().getPresenterStore();
 *
 * @InjectPresenter (type PresenterType.LOCAL, tag MainActivity.TAG)
 * PresenterType.LOCAL     – presenter живет пока View не финиширует
 * PresenterType.GLOBAL    – presenter живет пока живет процесс
 * PresenterType.WEAK      – presenter живет пока не финишируют все View
 * ViewState               - пока жив Presenter(в save state не сохраняется)
 */

@InjectViewState
public class MainPresenter extends MvpPresenter<MainPresenter.MainPresenterView> {


    /**
     * All of the methods that should be in Fragment
     * @StateStrategyType(SkipStrategy.class)
     * AddToEndStrategy             – выполнит команду, добавит команду в конец очереди команд. Default.
     * AddToEndSingleStrategy       – выполнит команду, добавит команду в конец очереди и УДАЛИТЬ ВСЕ ЕЕ ПРЕДЫДУЩИЕ экземпляры.
     * SingleStateStrategy          – выполнит команду, ОЧИСТИТ ВСЮ ОЧЕРЕДЬ КОМАНД, добавит команду в 'очередиь'.
     * SkipStrategy                 – не гарантированно выполнит команду (if (View != null)). Команда НЕ БУДЕТ ДОБАВЛЕНА в очередь, и никак не изменит текущую очередь.
     * OneExecutionStateStrategy    – гарантированно выполнит команду (при первой возможности). Команда НЕ БУДЕТ ДОБАВЛЕНА в очередь..
     *
     * https://habrahabr.ru/company/redmadrobot/blog/325816/
     */
    @StateStrategyType(AddToEndSingleStrategy.class)
    public interface MainPresenterView extends MvpView {

        void responseComplete(boolean success);

        void responseError(String errorMessage);

    }
}
