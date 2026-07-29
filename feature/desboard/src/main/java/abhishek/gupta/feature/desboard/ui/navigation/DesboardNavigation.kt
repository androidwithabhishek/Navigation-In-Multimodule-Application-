package abhishek.gupta.feature.desboard.ui.navigation

import abhishek.gupta.common.MainGraph
import abhishek.gupta.common.NavigationFeatureApi
import abhishek.gupta.common.SubGraph
import abhishek.gupta.feature.auth.ui.DashboardScreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation

interface DesboardNavigationFeatureApi: NavigationFeatureApi{}



class DesboardNavigationFeatureApiImpl : DesboardNavigationFeatureApi {
    override fun registerGraph(
        navHostController: NavHostController,
        navGraphBuilder: NavGraphBuilder,
    ) {
        navGraphBuilder.navigation<SubGraph.DesBoard>(startDestination = MainGraph.DesboardScreen) {



            composable <MainGraph.DesboardScreen>{


                DashboardScreen(

                    onBackClick = { navHostController.popBackStack() },
                    onGoAuthClick = { navHostController.navigate(MainGraph.AuthScreen) }
                )


            }
        }
    }

}
