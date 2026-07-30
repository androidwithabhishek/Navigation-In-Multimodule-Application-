package abhishek.gupta.feature.desboard.di

import abhishek.gupta.feature.desboard.ui.navigation.DashboardNavigationFeatureApi
import abhishek.gupta.feature.desboard.ui.navigation.DashboardNavigationFeatureApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object HiltModule {

    @Provides
    @Singleton
    fun providesDashboardNavigationFeatureApi(): DashboardNavigationFeatureApi {
        return DashboardNavigationFeatureApiImpl()
    }
}