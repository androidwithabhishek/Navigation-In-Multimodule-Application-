package abhishek.gupta.feature.auth.di

import abhishek.gupta.feature.auth.ui.navigation.AuthNavigationFeatureApi
import abhishek.gupta.feature.auth.ui.navigation.AuthNavigationFeatureApiImpl
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
    fun providesAuthNavigationFeatureApi(): AuthNavigationFeatureApi {
      return  AuthNavigationFeatureApiImpl()
    }


}