package abhishek.gupta.feature.desboard.di

import abhishek.gupta.feature.desboard.ui.navigation.DesboardNavigationFeatureApi
import abhishek.gupta.feature.desboard.ui.navigation.DesboardNavigationFeatureApiImpl
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
    fun providesDesboardNavigationFeatureApi(): DesboardNavigationFeatureApi {
        return DesboardNavigationFeatureApiImpl()
    }
}