package abhishek.gupta.multimodulenavigation.ui.navigation

import abhishek.gupta.feature.auth.ui.navigation.AuthNavigationFeatureApi
import abhishek.gupta.feature.desboard.ui.navigation.DashboardNavigationFeatureApi

data class DefaultNavigator(
    val authNavigationFeatureApi: AuthNavigationFeatureApi,
    val dashboardNavigationFeatureApi: DashboardNavigationFeatureApi,
)