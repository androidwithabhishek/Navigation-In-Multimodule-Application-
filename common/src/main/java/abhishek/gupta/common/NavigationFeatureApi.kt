package abhishek.gupta.common

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

 interface NavigationFeatureApi {



    fun registerGraph (navHostController: NavHostController,navGraphBuilder: NavGraphBuilder)


}