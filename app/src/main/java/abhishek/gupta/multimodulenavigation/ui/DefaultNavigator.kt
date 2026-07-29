package abhishek.gupta.multimodulenavigation.ui


import abhishek.gupta.feature.auth.ui.navigation.AuthNavigationFeatureApi
import abhishek.gupta.feature.desboard.ui.navigation.DesboardNavigationFeatureApi

data class DefaultNavigator(
    val authNavigationFeatureApi: AuthNavigationFeatureApi,
    val desboardNavigationFeatureApi: DesboardNavigationFeatureApi,
)