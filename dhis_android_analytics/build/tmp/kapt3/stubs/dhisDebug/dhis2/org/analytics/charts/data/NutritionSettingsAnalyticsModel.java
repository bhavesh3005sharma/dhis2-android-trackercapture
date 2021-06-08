package dhis2.org.analytics.charts.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\f\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c2\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\fH\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\fH\u00c6\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\fH\u00c6\u0001J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011\u00a8\u0006)"}, d2 = {"Ldhis2/org/analytics/charts/data/NutritionSettingsAnalyticsModel;", "Ldhis2/org/analytics/charts/data/SettingsAnalyticModel;", "name", "", "program", "chartType", "Ldhis2/org/analytics/charts/data/ChartType;", "genderData", "Ldhis2/org/analytics/charts/data/NutritionGenderData;", "stageUid", "zScoreContainerUid", "zScoreContainerIsDataElement", "", "ageOrHeightContainerUid", "ageOrHeightIsDataElement", "(Ljava/lang/String;Ljava/lang/String;Ldhis2/org/analytics/charts/data/ChartType;Ldhis2/org/analytics/charts/data/NutritionGenderData;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "getAgeOrHeightContainerUid", "()Ljava/lang/String;", "getAgeOrHeightIsDataElement", "()Z", "getGenderData", "()Ldhis2/org/analytics/charts/data/NutritionGenderData;", "getStageUid", "getZScoreContainerIsDataElement", "getZScoreContainerUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "dhis_android_analytics_dhisDebug"})
public final class NutritionSettingsAnalyticsModel extends dhis2.org.analytics.charts.data.SettingsAnalyticModel {
    private final java.lang.String name = null;
    private final java.lang.String program = null;
    private final dhis2.org.analytics.charts.data.ChartType chartType = null;
    @org.jetbrains.annotations.NotNull()
    private final dhis2.org.analytics.charts.data.NutritionGenderData genderData = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String stageUid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String zScoreContainerUid = null;
    private final boolean zScoreContainerIsDataElement = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ageOrHeightContainerUid = null;
    private final boolean ageOrHeightIsDataElement = false;
    
    @org.jetbrains.annotations.NotNull()
    public final dhis2.org.analytics.charts.data.NutritionGenderData getGenderData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStageUid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getZScoreContainerUid() {
        return null;
    }
    
    public final boolean getZScoreContainerIsDataElement() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAgeOrHeightContainerUid() {
        return null;
    }
    
    public final boolean getAgeOrHeightIsDataElement() {
        return false;
    }
    
    public NutritionSettingsAnalyticsModel(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String program, @org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.data.ChartType chartType, @org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.data.NutritionGenderData genderData, @org.jetbrains.annotations.NotNull()
    java.lang.String stageUid, @org.jetbrains.annotations.NotNull()
    java.lang.String zScoreContainerUid, boolean zScoreContainerIsDataElement, @org.jetbrains.annotations.NotNull()
    java.lang.String ageOrHeightContainerUid, boolean ageOrHeightIsDataElement) {
    }
    
    private final java.lang.String component1() {
        return null;
    }
    
    private final java.lang.String component2() {
        return null;
    }
    
    private final dhis2.org.analytics.charts.data.ChartType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dhis2.org.analytics.charts.data.NutritionGenderData component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dhis2.org.analytics.charts.data.NutritionSettingsAnalyticsModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String program, @org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.data.ChartType chartType, @org.jetbrains.annotations.NotNull()
    dhis2.org.analytics.charts.data.NutritionGenderData genderData, @org.jetbrains.annotations.NotNull()
    java.lang.String stageUid, @org.jetbrains.annotations.NotNull()
    java.lang.String zScoreContainerUid, boolean zScoreContainerIsDataElement, @org.jetbrains.annotations.NotNull()
    java.lang.String ageOrHeightContainerUid, boolean ageOrHeightIsDataElement) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}