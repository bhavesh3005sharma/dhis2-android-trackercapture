package dhis2.org.analytics.charts.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J>\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Ldhis2/org/analytics/charts/providers/ChartCoordinatesProviderImpl;", "Ldhis2/org/analytics/charts/providers/ChartCoordinatesProvider;", "d2", "Lorg/hisp/dhis/android/core/D2;", "(Lorg/hisp/dhis/android/core/D2;)V", "getD2", "()Lorg/hisp/dhis/android/core/D2;", "dataElementCoordinates", "", "Ldhis2/org/analytics/charts/data/GraphPoint;", "stageUid", "", "teiUid", "dataElementUid", "formattedDate", "Ljava/util/Date;", "date", "indicatorCoordinates", "indicatorUid", "nutritionCoordinates", "zScoreValueContainerUid", "zScoreSavedIsDataElement", "", "ageOrHeightCountainerUid", "ageOrHeightIsDataElement", "dhis_android_analytics_dhisDebug"})
public final class ChartCoordinatesProviderImpl implements dhis2.org.analytics.charts.providers.ChartCoordinatesProvider {
    @org.jetbrains.annotations.NotNull()
    private final org.hisp.dhis.android.core.D2 d2 = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<dhis2.org.analytics.charts.data.GraphPoint> dataElementCoordinates(@org.jetbrains.annotations.NotNull()
    java.lang.String stageUid, @org.jetbrains.annotations.NotNull()
    java.lang.String teiUid, @org.jetbrains.annotations.NotNull()
    java.lang.String dataElementUid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<dhis2.org.analytics.charts.data.GraphPoint> indicatorCoordinates(@org.jetbrains.annotations.NotNull()
    java.lang.String stageUid, @org.jetbrains.annotations.NotNull()
    java.lang.String teiUid, @org.jetbrains.annotations.NotNull()
    java.lang.String indicatorUid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<dhis2.org.analytics.charts.data.GraphPoint> nutritionCoordinates(@org.jetbrains.annotations.NotNull()
    java.lang.String stageUid, @org.jetbrains.annotations.NotNull()
    java.lang.String teiUid, @org.jetbrains.annotations.NotNull()
    java.lang.String zScoreValueContainerUid, boolean zScoreSavedIsDataElement, @org.jetbrains.annotations.NotNull()
    java.lang.String ageOrHeightCountainerUid, boolean ageOrHeightIsDataElement) {
        return null;
    }
    
    private final java.util.Date formattedDate(java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hisp.dhis.android.core.D2 getD2() {
        return null;
    }
    
    public ChartCoordinatesProviderImpl(@org.jetbrains.annotations.NotNull()
    org.hisp.dhis.android.core.D2 d2) {
        super();
    }
}