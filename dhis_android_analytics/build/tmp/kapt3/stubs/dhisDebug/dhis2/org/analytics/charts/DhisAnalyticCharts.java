package dhis2.org.analytics.charts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Ldhis2/org/analytics/charts/DhisAnalyticCharts;", "Ldhis2/org/analytics/charts/Charts;", "chartsRepository", "Ldhis2/org/analytics/charts/ChartsRepository;", "(Ldhis2/org/analytics/charts/ChartsRepository;)V", "getCharts", "", "Ldhis2/org/analytics/charts/data/Graph;", "enrollmentUid", "", "hasCharts", "", "Provider", "dhis_android_analytics_dhisDebug"})
public final class DhisAnalyticCharts implements dhis2.org.analytics.charts.Charts {
    private final dhis2.org.analytics.charts.ChartsRepository chartsRepository = null;
    public static final dhis2.org.analytics.charts.DhisAnalyticCharts.Provider Provider = null;
    
    @java.lang.Override()
    public boolean hasCharts() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<dhis2.org.analytics.charts.data.Graph> getCharts(@org.jetbrains.annotations.NotNull()
    java.lang.String enrollmentUid) {
        return null;
    }
    
    @javax.inject.Inject()
    public DhisAnalyticCharts(@org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.ChartsRepository chartsRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Ldhis2/org/analytics/charts/DhisAnalyticCharts$Provider;", "Ldhis2/org/analytics/charts/Charts$Provider;", "()V", "get", "Ldhis2/org/analytics/charts/Charts;", "dependencies", "Ldhis2/org/analytics/charts/Charts$Dependencies;", "dhis_android_analytics_dhisDebug"})
    public static final class Provider implements dhis2.org.analytics.charts.Charts.Provider {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public dhis2.org.analytics.charts.Charts get(@org.jetbrains.annotations.NotNull()
        dhis2.org.analytics.charts.Charts.Dependencies dependencies) {
            return null;
        }
        
        private Provider() {
            super();
        }
    }
}