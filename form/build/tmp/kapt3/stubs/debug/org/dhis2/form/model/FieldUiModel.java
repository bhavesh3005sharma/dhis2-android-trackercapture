package org.dhis2.form.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u00010J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0000H&J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020!H&J\u0012\u0010#\u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H&J\u0010\u0010\'\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010(\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010)\u001a\u00020\u0000H&J\b\u0010*\u001a\u00020\u0000H&J\u0012\u0010+\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010-H&J\u0012\u0010.\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010/\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0012\u0010\u0016\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\t\u00a8\u00061"}, d2 = {"Lorg/dhis2/form/model/FieldUiModel;", "", "editable", "", "getEditable", "()Z", "error", "", "getError", "()Ljava/lang/String;", "focused", "getFocused", "label", "getLabel", "layoutId", "", "getLayoutId", "()I", "mandatory", "getMandatory", "programStageSection", "getProgramStageSection", "uid", "getUid", "value", "getValue", "warning", "getWarning", "equals", "item", "getOptionSet", "hasLegend", "onItemClick", "", "onNext", "onTextChange", "setCallback", "callback", "Lorg/dhis2/form/model/FieldUiModel$Callback;", "setEditable", "setError", "setFieldMandatory", "setFocus", "setLegend", "legendValue", "Lorg/dhis2/form/model/LegendValue;", "setValue", "setWarning", "Callback", "form_debug"})
public abstract interface FieldUiModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUid();
    
    public abstract int getLayoutId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getValue();
    
    public abstract boolean getFocused();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getError();
    
    public abstract boolean getEditable();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getWarning();
    
    public abstract boolean getMandatory();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLabel();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getProgramStageSection();
    
    public abstract void setCallback(@org.jetbrains.annotations.NotNull()
    org.dhis2.form.model.FieldUiModel.Callback callback);
    
    public abstract boolean equals(@org.jetbrains.annotations.NotNull()
    org.dhis2.form.model.FieldUiModel item);
    
    public abstract void onItemClick();
    
    public abstract void onNext();
    
    public abstract void onTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.dhis2.form.model.FieldUiModel setValue(@org.jetbrains.annotations.Nullable()
    java.lang.String value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.dhis2.form.model.FieldUiModel setFocus();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.dhis2.form.model.FieldUiModel setError(@org.jetbrains.annotations.Nullable()
    java.lang.String error);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.dhis2.form.model.FieldUiModel setEditable(boolean editable);
    
    public abstract boolean hasLegend();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.dhis2.form.model.FieldUiModel setLegend(@org.jetbrains.annotations.Nullable()
    org.dhis2.form.model.LegendValue legendValue);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getOptionSet();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.dhis2.form.model.FieldUiModel setWarning(@org.jetbrains.annotations.NotNull()
    java.lang.String warning);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.dhis2.form.model.FieldUiModel setFieldMandatory();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&\u00a8\u0006\b"}, d2 = {"Lorg/dhis2/form/model/FieldUiModel$Callback;", "", "onNext", "", "showDialog", "title", "", "message", "form_debug"})
    public static abstract interface Callback {
        
        public abstract void onNext();
        
        public abstract void showDialog(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String message);
    }
}