package io.marelso.offline_first.navigation

sealed class Routes(val route: String) {

    companion object {
        fun navigate(to: Routes, vararg parameters: Pair<String, String>?): String {
            return parameters.fold(to.route) { route, parameter ->
                parameter?.let {
                    route.replace("{${it.first}}", it.second)
                } ?: route
            }
        }
    }

    data object Home: Routes(route = "/home")
}