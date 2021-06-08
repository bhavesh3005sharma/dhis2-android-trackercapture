package dhis2.org.analytics.charts.table;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J,\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J$\u0010\u0013\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016J$\u0010\u0015\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0016\u00a8\u0006\u001f"}, d2 = {"Ldhis2/org/analytics/charts/table/GraphTableAdapter;", "Lcom/evrencoskun/tableview/adapter/AbstractTableAdapter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getCellItemViewType", "", "columnPosition", "rowPosition", "getColumnHeaderItemViewType", "position", "getRowHeaderItemViewType", "onBindCellViewHolder", "", "holder", "Lcom/evrencoskun/tableview/adapter/recyclerview/holder/AbstractViewHolder;", "cellItemModel", "", "onBindColumnHeaderViewHolder", "columnHeaderItemModel", "onBindRowHeaderViewHolder", "rowHeaderItemModel", "onCreateCellViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onCreateColumnHeaderViewHolder", "onCreateCornerView", "Landroid/view/View;", "onCreateRowHeaderViewHolder", "dhis_android_analytics_dhisDebug"})
public final class GraphTableAdapter extends com.evrencoskun.tableview.adapter.AbstractTableAdapter<java.lang.String, java.lang.String, java.lang.String> {
    
    @java.lang.Override()
    public int getCellItemViewType(int columnPosition, int rowPosition) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateCornerView() {
        return null;
    }
    
    @java.lang.Override()
    public int getColumnHeaderItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getRowHeaderItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder onCreateColumnHeaderViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindColumnHeaderViewHolder(@org.jetbrains.annotations.Nullable()
    com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder holder, @org.jetbrains.annotations.Nullable()
    java.lang.Object columnHeaderItemModel, int columnPosition) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder onCreateRowHeaderViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindRowHeaderViewHolder(@org.jetbrains.annotations.Nullable()
    com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder holder, @org.jetbrains.annotations.Nullable()
    java.lang.Object rowHeaderItemModel, int rowPosition) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder onCreateCellViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindCellViewHolder(@org.jetbrains.annotations.Nullable()
    com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder holder, @org.jetbrains.annotations.Nullable()
    java.lang.Object cellItemModel, int columnPosition, int rowPosition) {
    }
    
    public GraphTableAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}