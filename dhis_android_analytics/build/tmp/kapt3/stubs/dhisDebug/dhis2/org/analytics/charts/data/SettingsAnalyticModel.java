package dhis2.org.analytics.charts.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Ldhis2/org/analytics/charts/data/SettingsAnalyticModel;", "", "displayName", "", "programUid", "type", "Ldhis2/org/analytics/charts/data/ChartType;", "(Ljava/lang/String;Ljava/lang/String;Ldhis2/org/analytics/charts/data/ChartType;)V", "getDisplayName", "()Ljava/lang/String;", "getProgramUid", "getType", "()Ldhis2/org/analytics/charts/data/ChartType;", "dataElements", "", "Ldhis2/org/analytics/charts/data/DataElementData;", "indicators", "Ldhis2/org/analytics/charts/data/IndicatorData;", "period", "Ldhis2/org/analytics/charts/data/NutritionSettingsAnalyticsModel;", "Ldhis2/org/analytics/charts/data/DefaultSettingsAnalyticModel;", "dhis_android_analytics_dhisDebug"})
public abstract class SettingsAnalyticModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String displayName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String programUid = null;
    @org.jetbrains.annotations.NotNull()
    private final dhis2.org.analytics.charts.data.ChartType type = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<dhis2.org.analytics.charts.data.DataElementData> dataElements() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<dhis2.org.analytics.charts.data.IndicatorData> indicators() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String period() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProgramUid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dhis2.org.analytics.charts.data.ChartType getType() {
        return null;
    }
    
    private SettingsAnalyticModel(java.lang.String displayName, java.lang.String programUid, dhis2.org.analytics.charts.data.ChartType type) {
        super();
    }
}