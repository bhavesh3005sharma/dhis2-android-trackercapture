package dhis2.org.analytics.charts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\n \u0014*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J6\u0010\u0018\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u001a0\u001a \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u001a0\u001a\u0018\u00010\f0\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Ldhis2/org/analytics/charts/ChartsRepositoryImpl;", "Ldhis2/org/analytics/charts/ChartsRepository;", "d2", "Lorg/hisp/dhis/android/core/D2;", "analyticsTeiSettingsToGraph", "Ldhis2/org/analytics/charts/mappers/AnalyticsTeiSettingsToGraph;", "dataElementToGraph", "Ldhis2/org/analytics/charts/mappers/DataElementToGraph;", "programIndicatorToGraph", "Ldhis2/org/analytics/charts/mappers/ProgramIndicatorToGraph;", "(Lorg/hisp/dhis/android/core/D2;Ldhis2/org/analytics/charts/mappers/AnalyticsTeiSettingsToGraph;Ldhis2/org/analytics/charts/mappers/DataElementToGraph;Ldhis2/org/analytics/charts/mappers/ProgramIndicatorToGraph;)V", "getAnalyticsForEnrollment", "", "Ldhis2/org/analytics/charts/data/Graph;", "enrollmentUid", "", "getDefaultAnalytics", "enrollment", "Lorg/hisp/dhis/android/core/enrollment/Enrollment;", "getEnrollment", "kotlin.jvm.PlatformType", "getNumericDataElements", "Lorg/hisp/dhis/android/core/dataelement/DataElement;", "stageUid", "getRepeatableProgramStages", "", "Lorg/hisp/dhis/android/core/program/ProgramStage;", "program", "getSettingsAnalytics", "getStageIndicators", "Lorg/hisp/dhis/android/core/program/ProgramIndicator;", "programUid", "dhis_android_analytics_dhisDebug"})
public final class ChartsRepositoryImpl implements dhis2.org.analytics.charts.ChartsRepository {
    private final org.hisp.dhis.android.core.D2 d2 = null;
    private final dhis2.org.analytics.charts.mappers.AnalyticsTeiSettingsToGraph analyticsTeiSettingsToGraph = null;
    private final dhis2.org.analytics.charts.mappers.DataElementToGraph dataElementToGraph = null;
    private final dhis2.org.analytics.charts.mappers.ProgramIndicatorToGraph programIndicatorToGraph = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<dhis2.org.analytics.charts.data.Graph> getAnalyticsForEnrollment(@org.jetbrains.annotations.NotNull()
    java.lang.String enrollmentUid) {
        return null;
    }
    
    private final java.util.List<dhis2.org.analytics.charts.data.Graph> getSettingsAnalytics(org.hisp.dhis.android.core.enrollment.Enrollment enrollment) {
        return null;
    }
    
    private final java.util.List<dhis2.org.analytics.charts.data.Graph> getDefaultAnalytics(org.hisp.dhis.android.core.enrollment.Enrollment enrollment) {
        return null;
    }
    
    private final java.util.List<org.hisp.dhis.android.core.program.ProgramStage> getRepeatableProgramStages(java.lang.String program) {
        return null;
    }
    
    private final org.hisp.dhis.android.core.enrollment.Enrollment getEnrollment(java.lang.String enrollmentUid) {
        return null;
    }
    
    private final java.util.List<org.hisp.dhis.android.core.dataelement.DataElement> getNumericDataElements(java.lang.String stageUid) {
        return null;
    }
    
    private final java.util.List<org.hisp.dhis.android.core.program.ProgramIndicator> getStageIndicators(java.lang.String programUid) {
        return null;
    }
    
    public ChartsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    org.hisp.dhis.android.core.D2 d2, @org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.mappers.AnalyticsTeiSettingsToGraph analyticsTeiSettingsToGraph, @org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.mappers.DataElementToGraph dataElementToGraph, @org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.mappers.ProgramIndicatorToGraph programIndicatorToGraph) {
        super();
    }
}