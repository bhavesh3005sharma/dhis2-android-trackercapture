// Generated by Dagger (https://google.github.io/dagger).
package dhis2.org.analytics.charts.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dhis2.org.analytics.charts.mappers.AnalyticIndicatorToIndicatorData;

public final
class ChartsModule_ProvideAnalyticIndicatorMapper$dhis_android_analytics_dhisDebugFactory
    implements Factory<AnalyticIndicatorToIndicatorData> {
  private final ChartsModule module;

  public ChartsModule_ProvideAnalyticIndicatorMapper$dhis_android_analytics_dhisDebugFactory(
      ChartsModule module) {
    this.module = module;
  }

  @Override
  public AnalyticIndicatorToIndicatorData get() {
    return Preconditions.checkNotNull(
        module.provideAnalyticIndicatorMapper$dhis_android_analytics_dhisDebug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ChartsModule_ProvideAnalyticIndicatorMapper$dhis_android_analytics_dhisDebugFactory
      create(ChartsModule module) {
    return new ChartsModule_ProvideAnalyticIndicatorMapper$dhis_android_analytics_dhisDebugFactory(
        module);
  }

  public static AnalyticIndicatorToIndicatorData
      proxyProvideAnalyticIndicatorMapper$dhis_android_analytics_dhisDebug(ChartsModule instance) {
    return Preconditions.checkNotNull(
        instance.provideAnalyticIndicatorMapper$dhis_android_analytics_dhisDebug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}