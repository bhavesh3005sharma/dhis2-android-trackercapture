package dhis2.org.analytics.charts.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Ldhis2/org/analytics/charts/providers/PeriodStepProvider;", "", "periodStep", "", "periodType", "Lorg/hisp/dhis/android/core/period/PeriodType;", "dhis_android_analytics_dhisDebug"})
public abstract interface PeriodStepProvider {
    
    public abstract long periodStep(@org.jetbrains.annotations.Nullable()
    org.hisp.dhis.android.core.period.PeriodType periodType);
}