// Generated by Dagger (https://google.github.io/dagger).
package dhis2.org.analytics.charts;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class DhisAnalyticCharts_Factory implements Factory<DhisAnalyticCharts> {
  private final Provider<ChartsRepository> chartsRepositoryProvider;

  public DhisAnalyticCharts_Factory(Provider<ChartsRepository> chartsRepositoryProvider) {
    this.chartsRepositoryProvider = chartsRepositoryProvider;
  }

  @Override
  public DhisAnalyticCharts get() {
    return new DhisAnalyticCharts(chartsRepositoryProvider.get());
  }

  public static DhisAnalyticCharts_Factory create(
      Provider<ChartsRepository> chartsRepositoryProvider) {
    return new DhisAnalyticCharts_Factory(chartsRepositoryProvider);
  }
}