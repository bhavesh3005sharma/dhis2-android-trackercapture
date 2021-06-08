package dhis2.org.analytics.charts.formatters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Ldhis2/org/analytics/charts/formatters/DateLabelFormatter;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "dateFromValue", "Lkotlin/Function1;", "", "Ljava/util/Date;", "(Lkotlin/jvm/functions/Function1;)V", "getDateFromValue", "()Lkotlin/jvm/functions/Function1;", "getAxisLabel", "", "value", "", "axis", "Lcom/github/mikephil/charting/components/AxisBase;", "dhis_android_analytics_dhisDebug"})
public final class DateLabelFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Long, java.util.Date> dateFromValue = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAxisLabel(float value, @org.jetbrains.annotations.Nullable()
    com.github.mikephil.charting.components.AxisBase axis) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Long, java.util.Date> getDateFromValue() {
        return null;
    }
    
    public DateLabelFormatter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.util.Date> dateFromValue) {
        super();
    }
}