package abhishek.gupta.feature.auth.ui.navigation

import abhishek.gupta.common.MainGraph
import abhishek.gupta.common.NavigationFeatureApi
import abhishek.gupta.common.SubGraph
import abhishek.gupta.feature.auth.ui.AuthScreen
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation


interface AuthNavigationFeatureApi : NavigationFeatureApi

class AuthNavigationFeatureApiImpl : AuthNavigationFeatureApi {
    override fun registerGraph(
        navHostController: NavHostController,
        navGraphBuilder: NavGraphBuilder,
    ) {


        navGraphBuilder.navigation<SubGraph.Auth>(startDestination = MainGraph.AuthScreen) {


            composable<MainGraph.AuthScreen> {

                AuthScreen(
                    onBackClick = { navHostController.popBackStack() },
                    onGoDesClick = { navHostController.navigate(MainGraph.DesboardScreen) }
                )

            }
        }

    }


}