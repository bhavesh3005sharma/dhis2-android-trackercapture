// Generated by Dagger (https://google.github.io/dagger).
package dhis2.org.analytics.charts.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dhis2.org.analytics.charts.mappers.DataElementToGraph;
import dhis2.org.analytics.charts.providers.ChartCoordinatesProvider;
import dhis2.org.analytics.charts.providers.PeriodStepProvider;
import javax.inject.Provider;

public final class ChartsModule_ProvideDataElementToGraph$dhis_android_analytics_dhisDebugFactory
    implements Factory<DataElementToGraph> {
  private final ChartsModule module;

  private final Provider<PeriodStepProvider> periodStepProvider;

  private final Provider<ChartCoordinatesProvider> chartCoordinatesProvider;

  public ChartsModule_ProvideDataElementToGraph$dhis_android_analytics_dhisDebugFactory(
      ChartsModule module,
      Provider<PeriodStepProvider> periodStepProvider,
      Provider<ChartCoordinatesProvider> chartCoordinatesProvider) {
    this.module = module;
    this.periodStepProvider = periodStepProvider;
    this.chartCoordinatesProvider = chartCoordinatesProvider;
  }

  @Override
  public DataElementToGraph get() {
    return Preconditions.checkNotNull(
        module.provideDataElementToGraph$dhis_android_analytics_dhisDebug(
            periodStepProvider.get(), chartCoordinatesProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ChartsModule_ProvideDataElementToGraph$dhis_android_analytics_dhisDebugFactory
      create(
          ChartsModule module,
          Provider<PeriodStepProvider> periodStepProvider,
          Provider<ChartCoordinatesProvider> chartCoordinatesProvider) {
    return new ChartsModule_ProvideDataElementToGraph$dhis_android_analytics_dhisDebugFactory(
        module, periodStepProvider, chartCoordinatesProvider);
  }

  public static DataElementToGraph proxyProvideDataElementToGraph$dhis_android_analytics_dhisDebug(
      ChartsModule instance,
      PeriodStepProvider periodStepProvider,
      ChartCoordinatesProvider chartCoordinatesProvider) {
    return Preconditions.checkNotNull(
        instance.provideDataElementToGraph$dhis_android_analytics_dhisDebug(
            periodStepProvider, chartCoordinatesProvider),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
