package abhishek.gupta.multimodulenavigation.di

import abhishek.gupta.feature.auth.ui.navigation.AuthNavigationFeatureApi
import abhishek.gupta.feature.desboard.ui.navigation.DashboardNavigationFeatureApi
import abhishek.gupta.multimodulenavigation.ui.navigation.DefaultNavigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object HiltModule {
    @Provides
    fun providesDefaultNavigator(
        authNavigationFeatureApi: AuthNavigationFeatureApi,
        dashboardNavigationFeatureApi: DashboardNavigationFeatureApi,
    ): DefaultNavigator {
        return DefaultNavigator(authNavigationFeatureApi, dashboardNavigationFeatureApi)

    }
}

