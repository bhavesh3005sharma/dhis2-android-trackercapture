package dhis2.org.analytics.charts.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u000bH\u00c6\u0003J\t\u0010#\u001a\u00020\rH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003JW\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\u0010\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020\rJ\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020.J\u000e\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\'J\u0006\u00102\u001a\u00020.J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0015R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019\u00a8\u00064"}, d2 = {"Ldhis2/org/analytics/charts/data/Graph;", "", "title", "", "isOnline", "", "series", "", "Ldhis2/org/analytics/charts/data/SerieData;", "periodToDisplay", "eventPeriodType", "Lorg/hisp/dhis/android/core/period/PeriodType;", "periodStep", "", "chartType", "Ldhis2/org/analytics/charts/data/ChartType;", "(Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Lorg/hisp/dhis/android/core/period/PeriodType;JLdhis2/org/analytics/charts/data/ChartType;)V", "getChartType", "()Ldhis2/org/analytics/charts/data/ChartType;", "getEventPeriodType", "()Lorg/hisp/dhis/android/core/period/PeriodType;", "()Z", "getPeriodStep", "()J", "getPeriodToDisplay", "()Ljava/lang/String;", "getSeries", "()Ljava/util/List;", "getTitle", "baseSeries", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "dateFromSteps", "Ljava/util/Date;", "numberOfSteps", "equals", "other", "hashCode", "", "maxValue", "", "minValue", "numberOfStepsToDate", "date", "numberOfStepsToLastDate", "toString", "dhis_android_analytics_dhisDebug"})
public final class Graph {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final boolean isOnline = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<dhis2.org.analytics.charts.data.SerieData> series = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String periodToDisplay = null;
    @org.jetbrains.annotations.NotNull()
    private final org.hisp.dhis.android.core.period.PeriodType eventPeriodType = null;
    private final long periodStep = 0L;
    @org.jetbrains.annotations.Nullable()
    private final dhis2.org.analytics.charts.data.ChartType chartType = null;
    
    public final float numberOfStepsToDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return 0.0F;
    }
    
    public final float numberOfStepsToLastDate() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date dateFromSteps(long numberOfSteps) {
        return null;
    }
    
    public final float maxValue() {
        return 0.0F;
    }
    
    public final float minValue() {
        return 0.0F;
    }
    
    private final java.util.List<dhis2.org.analytics.charts.data.SerieData> baseSeries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final boolean isOnline() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dhis2.org.analytics.charts.data.SerieData> getSeries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPeriodToDisplay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hisp.dhis.android.core.period.PeriodType getEventPeriodType() {
        return null;
    }
    
    public final long getPeriodStep() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final dhis2.org.analytics.charts.data.ChartType getChartType() {
        return null;
    }
    
    public Graph(@org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean isOnline, @org.jetbrains.annotations.NotNull()
    java.util.List<dhis2.org.analytics.charts.data.SerieData> series, @org.jetbrains.annotations.NotNull()
    java.lang.String periodToDisplay, @org.jetbrains.annotations.NotNull()
    org.hisp.dhis.android.core.period.PeriodType eventPeriodType, long periodStep, @org.jetbrains.annotations.Nullable()
    dhis2.org.analytics.charts.data.ChartType chartType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dhis2.org.analytics.charts.data.SerieData> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hisp.dhis.android.core.period.PeriodType component5() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final dhis2.org.analytics.charts.data.ChartType component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dhis2.org.analytics.charts.data.Graph copy(@org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean isOnline, @org.jetbrains.annotations.NotNull()
    java.util.List<dhis2.org.analytics.charts.data.SerieData> series, @org.jetbrains.annotations.NotNull()
    java.lang.String periodToDisplay, @org.jetbrains.annotations.NotNull()
    org.hisp.dhis.android.core.period.PeriodType eventPeriodType, long periodStep, @org.jetbrains.annotations.Nullable()
    dhis2.org.analytics.charts.data.ChartType chartType) {
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