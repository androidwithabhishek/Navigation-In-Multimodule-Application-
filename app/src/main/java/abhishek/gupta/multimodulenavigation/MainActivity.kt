package abhishek.gupta.multimodulenavigation

import abhishek.gupta.common.SubGraph
import abhishek.gupta.multimodulenavigation.ui.MainNavigation
import abhishek.gupta.multimodulenavigation.ui.navigation.DefaultNavigator
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import abhishek.gupta.multimodulenavigation.ui.theme.MultiModuleNavigationTheme
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var defaultNavigator: DefaultNavigator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MultiModuleNavigationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val  navController = rememberNavController()
                    MainNavigation(
                        modifier = Modifier.padding(innerPadding),
                        navHostController = navController,
                        defaultNavigator = defaultNavigator
                    )

                }
            }
        }
    }

}



