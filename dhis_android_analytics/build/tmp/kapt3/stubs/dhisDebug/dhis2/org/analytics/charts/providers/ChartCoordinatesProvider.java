package dhis2.org.analytics.charts.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000eH&\u00a8\u0006\u0011"}, d2 = {"Ldhis2/org/analytics/charts/providers/ChartCoordinatesProvider;", "", "dataElementCoordinates", "", "Ldhis2/org/analytics/charts/data/GraphPoint;", "stageUid", "", "teiUid", "dataElementUid", "indicatorCoordinates", "indicatorUid", "nutritionCoordinates", "zScoreValueContainerUid", "zScoreSavedIsDataElement", "", "ageOrHeightCountainerUid", "ageOrHeightIsDataElement", "dhis_android_analytics_dhisDebug"})
public abstract interface ChartCoordinatesProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<dhis2.org.analytics.charts.data.GraphPoint> dataElementCoordinates(@org.jetbrains.annotations.NotNull()
    java.lang.String stageUid, @org.jetbrains.annotations.NotNull()
    java.lang.String teiUid, @org.jetbrains.annotations.NotNull()
    java.lang.String dataElementUid);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<dhis2.org.analytics.charts.data.GraphPoint> indicatorCoordinates(@org.jetbrains.annotations.NotNull()
    java.lang.String stageUid, @org.jetbrains.annotations.NotNull()
    java.lang.String teiUid, @org.jetbrains.annotations.NotNull()
    java.lang.String indicatorUid);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<dhis2.org.analytics.charts.data.GraphPoint> nutritionCoordinates(@org.jetbrains.annotations.NotNull()
    java.lang.String stageUid, @org.jetbrains.annotations.NotNull()
    java.lang.String teiUid, @org.jetbrains.annotations.NotNull()
    java.lang.String zScoreValueContainerUid, boolean zScoreSavedIsDataElement, @org.jetbrains.annotations.NotNull()
    java.lang.String ageOrHeightCountainerUid, boolean ageOrHeightIsDataElement);
}