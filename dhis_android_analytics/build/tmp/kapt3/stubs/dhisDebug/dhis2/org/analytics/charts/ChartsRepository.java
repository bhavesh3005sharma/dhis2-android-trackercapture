package dhis2.org.analytics.charts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Ldhis2/org/analytics/charts/ChartsRepository;", "", "getAnalyticsForEnrollment", "", "Ldhis2/org/analytics/charts/data/Graph;", "enrollmentUid", "", "dhis_android_analytics_dhisDebug"})
public abstract interface ChartsRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<dhis2.org.analytics.charts.data.Graph> getAnalyticsForEnrollment(@org.jetbrains.annotations.NotNull()
    java.lang.String enrollmentUid);
}