package org.dhis2.form.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\bH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003Ju\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J\u0010\u0010(\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0001H\u0016J\n\u0010,\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010-\u001a\u00020\bH\u0016J\t\u0010.\u001a\u00020\u0005H\u00d6\u0001J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000200H\u0016J\u0012\u00102\u001a\u0002002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u00103\u001a\u0002002\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bH\u0016J\u0012\u00107\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u00108\u001a\u00020\u0000H\u0016J\b\u00109\u001a\u00020\u0000H\u0016J\u0012\u0010:\u001a\u00020\u00012\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0012\u0010=\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010>\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\n\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013\u00a8\u0006@"}, d2 = {"Lorg/dhis2/form/model/FieldUiModelImpl;", "Lorg/dhis2/form/model/FieldUiModel;", "uid", "", "layoutId", "", "value", "focused", "", "error", "editable", "warning", "mandatory", "label", "programStageSection", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getEditable", "()Z", "getError", "()Ljava/lang/String;", "getFocused", "getLabel", "getLayoutId", "()I", "getMandatory", "getProgramStageSection", "getUid", "getValue", "getWarning", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "item", "getOptionSet", "hasLegend", "hashCode", "onItemClick", "", "onNext", "onTextChange", "setCallback", "callback", "Lorg/dhis2/form/model/FieldUiModel$Callback;", "setEditable", "setError", "setFieldMandatory", "setFocus", "setLegend", "legendValue", "Lorg/dhis2/form/model/LegendValue;", "setValue", "setWarning", "toString", "form_debug"})
public final class FieldUiModelImpl implements org.dhis2.form.model.FieldUiModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uid = null;
    private final int layoutId = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String value = null;
    private final boolean focused = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    private final boolean editable = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String warning = null;
    private final boolean mandatory = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String label = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String programStageSection = null;
    
    @java.lang.Override()
    public void setCallback(@org.jetbrains.annotations.NotNull()
    org.dhis2.form.model.FieldUiModel.Callback callback) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.NotNull()
    org.dhis2.form.model.FieldUiModel item) {
        return false;
    }
    
    @java.lang.Override()
    public void onItemClick() {
    }
    
    @java.lang.Override()
    public void onNext() {
    }
    
    @java.lang.Override()
    public void onTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.dhis2.form.model.FieldUiModelImpl setValue(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.dhis2.form.model.FieldUiModelImpl setFocus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.dhis2.form.model.FieldUiModelImpl setError(@org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.dhis2.form.model.FieldUiModelImpl setEditable(boolean editable) {
        return null;
    }
    
    @java.lang.Override()
    public boolean hasLegend() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.dhis2.form.model.FieldUiModel setLegend(@org.jetbrains.annotations.Nullable()
    org.dhis2.form.model.LegendValue legendValue) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getOptionSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.dhis2.form.model.FieldUiModelImpl setWarning(@org.jetbrains.annotations.NotNull()
    java.lang.String warning) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.dhis2.form.model.FieldUiModelImpl setFieldMandatory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUid() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getValue() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getFocused() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getError() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getEditable() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getWarning() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getMandatory() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getProgramStageSection() {
        return null;
    }
    
    public FieldUiModelImpl(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, int layoutId, @org.jetbrains.annotations.Nullable()
    java.lang.String value, boolean focused, @org.jetbrains.annotations.Nullable()
    java.lang.String error, boolean editable, @org.jetbrains.annotations.Nullable()
    java.lang.String warning, boolean mandatory, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    java.lang.String programStageSection) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.dhis2.form.model.FieldUiModelImpl copy(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, int layoutId, @org.jetbrains.annotations.Nullable()
    java.lang.String value, boolean focused, @org.jetbrains.annotations.Nullable()
    java.lang.String error, boolean editable, @org.jetbrains.annotations.Nullable()
    java.lang.String warning, boolean mandatory, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    java.lang.String programStageSection) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}