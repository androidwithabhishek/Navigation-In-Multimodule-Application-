package abhishek.gupta.common

import kotlinx.serialization.Serializable

sealed class SubGraph {

    @Serializable
    data object Auth : SubGraph()

    @Serializable
    data object DesBoard : SubGraph()

}