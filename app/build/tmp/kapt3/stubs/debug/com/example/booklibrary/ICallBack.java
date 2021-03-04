package com.example.booklibrary;

import java.lang.System;

/**
 * Created by Kiran Kumar Choudhary on 01,March,2021).
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/booklibrary/ICallBack;", "", "handleClick", "", "availableBooksModel", "Lcom/example/booklibrary/model/AvailableBooksModel;", "app_debug"})
public abstract interface ICallBack {
    
    public abstract void handleClick(@org.jetbrains.annotations.Nullable()
    com.example.booklibrary.model.AvailableBooksModel availableBooksModel);
}