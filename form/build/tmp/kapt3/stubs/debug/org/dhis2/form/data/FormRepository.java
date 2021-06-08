package org.dhis2.form.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lorg/dhis2/form/data/FormRepository;", "", "composeList", "", "Lorg/dhis2/form/model/FieldUiModel;", "list", "processUserAction", "Lorg/dhis2/form/model/StoreResult;", "action", "Lorg/dhis2/form/model/RowAction;", "form_debug"})
public abstract interface FormRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.dhis2.form.model.StoreResult processUserAction(@org.jetbrains.annotations.NotNull()
    org.dhis2.form.model.RowAction action);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.dhis2.form.model.FieldUiModel> composeList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends org.dhis2.form.model.FieldUiModel> list);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}