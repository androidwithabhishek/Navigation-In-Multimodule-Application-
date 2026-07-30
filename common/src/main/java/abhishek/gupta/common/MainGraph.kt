package abhishek.gupta.common

import kotlinx.serialization.Serializable

sealed class MainGraph {

    @Serializable
    data object  AuthScreen: MainGraph()

    @Serializable
    data class DashBoardScreen(val userId: String)  : MainGraph()
}