package dhis2.org.analytics.charts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\t\nJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Ldhis2/org/analytics/charts/Charts;", "", "getCharts", "", "Ldhis2/org/analytics/charts/data/Graph;", "enrollmentUid", "", "hasCharts", "", "Dependencies", "Provider", "dhis_android_analytics_dhisDebug"})
public abstract interface Charts {
    
    public abstract boolean hasCharts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<dhis2.org.analytics.charts.data.Graph> getCharts(@org.jetbrains.annotations.NotNull()
    java.lang.String enrollmentUid);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Ldhis2/org/analytics/charts/Charts$Provider;", "", "get", "Ldhis2/org/analytics/charts/Charts;", "dependencies", "Ldhis2/org/analytics/charts/Charts$Dependencies;", "dhis_android_analytics_dhisDebug"})
    public static abstract interface Provider {
        
        @org.jetbrains.annotations.NotNull()
        public abstract dhis2.org.analytics.charts.Charts get(@org.jetbrains.annotations.NotNull()
        dhis2.org.analytics.charts.Charts.Dependencies dependencies);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Ldhis2/org/analytics/charts/Charts$Dependencies;", "", "getD2", "Lorg/hisp/dhis/android/core/D2;", "dhis_android_analytics_dhisDebug"})
    public static abstract interface Dependencies {
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.hisp.dhis.android.core.D2 getD2();
    }
}