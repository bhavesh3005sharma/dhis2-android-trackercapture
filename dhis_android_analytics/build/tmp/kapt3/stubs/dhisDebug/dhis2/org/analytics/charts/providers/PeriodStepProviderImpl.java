package dhis2.org.analytics.charts.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldhis2/org/analytics/charts/providers/PeriodStepProviderImpl;", "Ldhis2/org/analytics/charts/providers/PeriodStepProvider;", "d2", "Lorg/hisp/dhis/android/core/D2;", "(Lorg/hisp/dhis/android/core/D2;)V", "getD2", "()Lorg/hisp/dhis/android/core/D2;", "getPeriodForPeriodTypeAndDate", "Lorg/hisp/dhis/android/core/period/Period;", "periodType", "Lorg/hisp/dhis/android/core/period/PeriodType;", "currentDate", "Ljava/util/Date;", "offset", "", "periodStep", "", "dhis_android_analytics_dhisDebug"})
public final class PeriodStepProviderImpl implements dhis2.org.analytics.charts.providers.PeriodStepProvider {
    @org.jetbrains.annotations.NotNull()
    private final org.hisp.dhis.android.core.D2 d2 = null;
    
    @java.lang.Override()
    public long periodStep(@org.jetbrains.annotations.Nullable()
    org.hisp.dhis.android.core.period.PeriodType periodType) {
        return 0L;
    }
    
    private final org.hisp.dhis.android.core.period.Period getPeriodForPeriodTypeAndDate(org.hisp.dhis.android.core.period.PeriodType periodType, java.util.Date currentDate, int offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hisp.dhis.android.core.D2 getD2() {
        return null;
    }
    
    public PeriodStepProviderImpl(@org.jetbrains.annotations.NotNull()
    org.hisp.dhis.android.core.D2 d2) {
        super();
    }
}