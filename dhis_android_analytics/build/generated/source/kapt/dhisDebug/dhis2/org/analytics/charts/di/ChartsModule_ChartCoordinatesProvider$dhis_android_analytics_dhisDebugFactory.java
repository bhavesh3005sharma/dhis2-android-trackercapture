// Generated by Dagger (https://google.github.io/dagger).
package dhis2.org.analytics.charts.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dhis2.org.analytics.charts.providers.ChartCoordinatesProvider;
import javax.inject.Provider;
import org.hisp.dhis.android.core.D2;

public final class ChartsModule_ChartCoordinatesProvider$dhis_android_analytics_dhisDebugFactory
    implements Factory<ChartCoordinatesProvider> {
  private final ChartsModule module;

  private final Provider<D2> d2Provider;

  public ChartsModule_ChartCoordinatesProvider$dhis_android_analytics_dhisDebugFactory(
      ChartsModule module, Provider<D2> d2Provider) {
    this.module = module;
    this.d2Provider = d2Provider;
  }

  @Override
  public ChartCoordinatesProvider get() {
    return Preconditions.checkNotNull(
        module.chartCoordinatesProvider$dhis_android_analytics_dhisDebug(d2Provider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ChartsModule_ChartCoordinatesProvider$dhis_android_analytics_dhisDebugFactory
      create(ChartsModule module, Provider<D2> d2Provider) {
    return new ChartsModule_ChartCoordinatesProvider$dhis_android_analytics_dhisDebugFactory(
        module, d2Provider);
  }

  public static ChartCoordinatesProvider
      proxyChartCoordinatesProvider$dhis_android_analytics_dhisDebug(ChartsModule instance, D2 d2) {
    return Preconditions.checkNotNull(
        instance.chartCoordinatesProvider$dhis_android_analytics_dhisDebug(d2),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
