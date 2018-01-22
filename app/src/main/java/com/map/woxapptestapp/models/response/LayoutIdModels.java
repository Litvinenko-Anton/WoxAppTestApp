package com.map.woxapptestapp.models.response;

import android.support.annotation.IdRes;

/**
 * Created by i7-4770k on 21.01.2018
 */

public class LayoutIdModels {

    private int parentLayoutId;
    private int imageViewId;
    private int editTextId;
    private int imageButtonId;

    public LayoutIdModels() {

    }

    public LayoutIdModels(int parentLayoutId, int imageViewId, int editTextId, int imageButtonId) {
        this.parentLayoutId = parentLayoutId;
        this.imageViewId = imageViewId;
        this.editTextId = editTextId;
        this.imageButtonId = imageButtonId;
    }

    public int getParentLayoutId() {
        return parentLayoutId;
    }

    public int getImageViewId() {
        return imageViewId;
    }

    public int getEditTextId() {
        return editTextId;
    }

    public int getImageButtonId() {
        return imageButtonId;
    }

    public boolean containsId(@IdRes int id) {
        return (imageButtonId == id ||
                editTextId == id ||
                parentLayoutId == id ||
                imageViewId == id);
    }

    public void clear() {
        parentLayoutId = 0;
        imageViewId = 0;
        editTextId = 0;
        imageButtonId = 0;
    }
}
