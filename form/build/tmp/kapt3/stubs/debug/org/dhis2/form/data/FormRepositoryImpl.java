package org.dhis2.form.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J1\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u001a0\b\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u0002H\u001a\u00a2\u0006\u0002\u0010\u001fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/dhis2/form/data/FormRepositoryImpl;", "Lorg/dhis2/form/data/FormRepository;", "formValueStore", "Lorg/dhis2/form/data/FormValueStore;", "(Lorg/dhis2/form/data/FormValueStore;)V", "focusedItem", "Lorg/dhis2/form/model/RowAction;", "itemList", "", "Lorg/dhis2/form/model/FieldUiModel;", "itemsWithError", "", "composeList", "list", "getNextItem", "", "currentItemUid", "mergeListWithErrorFields", "fieldsWithError", "processUserAction", "Lorg/dhis2/form/model/StoreResult;", "action", "setFocusedItem", "updateErrorList", "", "updated", "E", "", "index", "", "elem", "(Ljava/lang/Iterable;ILjava/lang/Object;)Ljava/util/List;", "form_debug"})
public final class FormRepositoryImpl implements org.dhis2.form.data.FormRepository {
    private final java.util.List<org.dhis2.form.model.RowAction> itemsWithError = null;
    private java.util.List<? extends org.dhis2.form.model.FieldUiModel> itemList;
    private org.dhis2.form.model.RowAction focusedItem;
    private final org.dhis2.form.data.FormValueStore formValueStore = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.dhis2.form.model.StoreResult processUserAction(@org.jetbrains.annotations.NotNull()
    org.dhis2.form.model.RowAction action) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.dhis2.form.model.FieldUiModel> composeList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends org.dhis2.form.model.FieldUiModel> list) {
        return null;
    }
    
    private final java.util.List<org.dhis2.form.model.FieldUiModel> mergeListWithErrorFields(java.util.List<? extends org.dhis2.form.model.FieldUiModel> list, java.util.List<org.dhis2.form.model.RowAction> fieldsWithError) {
        return null;
    }
    
    private final java.util.List<org.dhis2.form.model.FieldUiModel> setFocusedItem(java.util.List<? extends org.dhis2.form.model.FieldUiModel> list) {
        return null;
    }
    
    private final java.lang.String getNextItem(java.lang.String currentItemUid) {
        return null;
    }
    
    private final void updateErrorList(org.dhis2.form.model.RowAction action) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <E extends java.lang.Object>java.util.List<E> updated(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends E> $this$updated, int index, E elem) {
        return null;
    }
    
    public FormRepositoryImpl(@org.jetbrains.annotations.NotNull()
    org.dhis2.form.data.FormValueStore formValueStore) {
        super();
    }
}