package dhis2.org.analytics.charts.renderers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012R\u00020\u0013H\u0014J(\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u00a8\u0006\u001a"}, d2 = {"Ldhis2/org/analytics/charts/renderers/NutritionRenderer;", "Lcom/github/mikephil/charting/renderer/LineChartRenderer;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "animator", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "viewPortHandler", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "drawLinearFill", "", "c", "Landroid/graphics/Canvas;", "dataSet", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "trans", "Lcom/github/mikephil/charting/utils/Transformer;", "bounds", "Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer$XBounds;", "Lcom/github/mikephil/charting/renderer/BarLineScatterCandleBubbleRenderer;", "generateFilledPath", "startIndex", "", "endIndex", "outputPath", "Landroid/graphics/Path;", "dhis_android_analytics_dhisDebug"})
public final class NutritionRenderer extends com.github.mikephil.charting.renderer.LineChartRenderer {
    
    @java.lang.Override()
    protected void drawLinearFill(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    com.github.mikephil.charting.interfaces.datasets.ILineDataSet dataSet, @org.jetbrains.annotations.NotNull()
    com.github.mikephil.charting.utils.Transformer trans, @org.jetbrains.annotations.NotNull()
    com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.XBounds bounds) {
    }
    
    private final void generateFilledPath(com.github.mikephil.charting.interfaces.datasets.ILineDataSet dataSet, int startIndex, int endIndex, android.graphics.Path outputPath) {
    }
    
    public NutritionRenderer(@org.jetbrains.annotations.NotNull()
    com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider chart, @org.jetbrains.annotations.NotNull()
    com.github.mikephil.charting.animation.ChartAnimator animator, @org.jetbrains.annotations.NotNull()
    com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(null, null, null);
    }
}