package dhis2.org.analytics.charts.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ^\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Ldhis2/org/analytics/charts/mappers/AnalyticsTeiSettingsToGraph;", "", "analyticsSettingsMapper", "Ldhis2/org/analytics/charts/mappers/AnalyticTeiSettingsToSettingsAnalyticsModel;", "nutritionDataProvider", "Ldhis2/org/analytics/charts/providers/NutritionDataProvider;", "periodStepProvider", "Ldhis2/org/analytics/charts/providers/PeriodStepProvider;", "chartCoordinatesProvider", "Ldhis2/org/analytics/charts/providers/ChartCoordinatesProvider;", "(Ldhis2/org/analytics/charts/mappers/AnalyticTeiSettingsToSettingsAnalyticsModel;Ldhis2/org/analytics/charts/providers/NutritionDataProvider;Ldhis2/org/analytics/charts/providers/PeriodStepProvider;Ldhis2/org/analytics/charts/providers/ChartCoordinatesProvider;)V", "map", "", "Ldhis2/org/analytics/charts/data/Graph;", "teiUid", "", "analytycsTeiSettings", "Lorg/hisp/dhis/android/core/settings/AnalyticsTeiSetting;", "dataElementNameProvider", "Lkotlin/Function1;", "indicatorNameProvider", "teiGenderProvider", "Ldhis2/org/analytics/charts/data/NutritionGenderData;", "", "dhis_android_analytics_dhisDebug"})
public final class AnalyticsTeiSettingsToGraph {
    private final dhis2.org.analytics.charts.mappers.AnalyticTeiSettingsToSettingsAnalyticsModel analyticsSettingsMapper = null;
    private final dhis2.org.analytics.charts.providers.NutritionDataProvider nutritionDataProvider = null;
    private final dhis2.org.analytics.charts.providers.PeriodStepProvider periodStepProvider = null;
    private final dhis2.org.analytics.charts.providers.ChartCoordinatesProvider chartCoordinatesProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dhis2.org.analytics.charts.data.Graph> map(@org.jetbrains.annotations.NotNull()
    java.lang.String teiUid, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.hisp.dhis.android.core.settings.AnalyticsTeiSetting> analytycsTeiSettings, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> dataElementNameProvider, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> indicatorNameProvider, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super dhis2.org.analytics.charts.data.NutritionGenderData, java.lang.Boolean> teiGenderProvider) {
        return null;
    }
    
    public AnalyticsTeiSettingsToGraph(@org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.mappers.AnalyticTeiSettingsToSettingsAnalyticsModel analyticsSettingsMapper, @org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.providers.NutritionDataProvider nutritionDataProvider, @org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.providers.PeriodStepProvider periodStepProvider, @org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.providers.ChartCoordinatesProvider chartCoordinatesProvider) {
        super();
    }
}