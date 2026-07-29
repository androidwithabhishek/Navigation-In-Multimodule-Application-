package abhishek.gupta.multimodulenavigation.di

import abhishek.gupta.feature.auth.ui.navigation.AuthNavigationFeatureApi
import abhishek.gupta.feature.desboard.ui.navigation.DesboardNavigationFeatureApi
import abhishek.gupta.multimodulenavigation.ui.DefaultNavigator
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
        desboardNavigationFeatureApi: DesboardNavigationFeatureApi,
    ): DefaultNavigator {
        return DefaultNavigator(authNavigationFeatureApi, desboardNavigationFeatureApi)

    }
}