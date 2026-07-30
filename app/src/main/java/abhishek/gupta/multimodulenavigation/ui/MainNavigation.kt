package abhishek.gupta.multimodulenavigation.ui

import abhishek.gupta.common.SubGraph
import abhishek.gupta.multimodulenavigation.ui.navigation.DefaultNavigator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun MainNavigation(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    defaultNavigator: DefaultNavigator,
) {


    NavHost(navHostController, startDestination = SubGraph.Auth) {
        defaultNavigator.authNavigationFeatureApi.registerGraph(navHostController,this)
        defaultNavigator.dashboardNavigationFeatureApi.registerGraph(navHostController,this)
    }

}
