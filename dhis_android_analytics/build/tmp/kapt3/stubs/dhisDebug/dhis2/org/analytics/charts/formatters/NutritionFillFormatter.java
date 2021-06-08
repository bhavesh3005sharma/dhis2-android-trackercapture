package dhis2.org.analytics.charts.formatters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Ldhis2/org/analytics/charts/formatters/NutritionFillFormatter;", "Lcom/github/mikephil/charting/formatter/IFillFormatter;", "boundaryDataSet", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "(Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;)V", "getFillLineBoundary", "", "Lcom/github/mikephil/charting/data/Entry;", "getFillLinePosition", "", "dataSet", "dataProvider", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "dhis_android_analytics_dhisDebug"})
public final class NutritionFillFormatter implements com.github.mikephil.charting.formatter.IFillFormatter {
    private final com.github.mikephil.charting.interfaces.datasets.ILineDataSet boundaryDataSet = null;
    
    @java.lang.Override()
    public float getFillLinePosition(@org.jetbrains.annotations.Nullable()
    com.github.mikephil.charting.interfaces.datasets.ILineDataSet dataSet, @org.jetbrains.annotations.Nullable()
    com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider dataProvider) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.github.mikephil.charting.data.Entry> getFillLineBoundary() {
        return null;
    }
    
    public NutritionFillFormatter(@org.jetbrains.annotations.Nullable()
    com.github.mikephil.charting.interfaces.datasets.ILineDataSet boundaryDataSet) {
        super();
    }
}