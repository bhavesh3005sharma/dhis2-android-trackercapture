package dhis2.org.analytics.charts.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Ldhis2/org/analytics/charts/mappers/GraphToNutritionData;", "", "nutritionColorProvider", "Ldhis2/org/analytics/charts/providers/NutritionColorsProvider;", "(Ldhis2/org/analytics/charts/providers/NutritionColorsProvider;)V", "coordinateToEntryMapper", "Ldhis2/org/analytics/charts/mappers/GraphCoordinatesToEntry;", "getCoordinateToEntryMapper", "()Ldhis2/org/analytics/charts/mappers/GraphCoordinatesToEntry;", "coordinateToEntryMapper$delegate", "Lkotlin/Lazy;", "dataSet", "Lcom/github/mikephil/charting/data/LineDataSet;", "entries", "", "Lcom/github/mikephil/charting/data/Entry;", "label", "", "map", "Lkotlin/Pair;", "Lcom/github/mikephil/charting/data/LineData;", "", "graph", "Ldhis2/org/analytics/charts/data/Graph;", "numberOfValues", "dataset", "dhis_android_analytics_dhisDebug"})
public final class GraphToNutritionData {
    private final kotlin.Lazy coordinateToEntryMapper$delegate = null;
    private final dhis2.org.analytics.charts.providers.NutritionColorsProvider nutritionColorProvider = null;
    
    private final dhis2.org.analytics.charts.mappers.GraphCoordinatesToEntry getCoordinateToEntryMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<com.github.mikephil.charting.data.LineData, java.lang.Integer> map(@org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.data.Graph graph) {
        return null;
    }
    
    private final com.github.mikephil.charting.data.LineDataSet dataSet(java.util.List<? extends com.github.mikephil.charting.data.Entry> entries, java.lang.String label) {
        return null;
    }
    
    private final int numberOfValues(java.util.List<? extends com.github.mikephil.charting.data.LineDataSet> dataset) {
        return 0;
    }
    
    public GraphToNutritionData(@org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.providers.NutritionColorsProvider nutritionColorProvider) {
        super();
    }
}