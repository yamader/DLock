package net.dyama.dlock

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.dyama.dlock.ui.home.HomeScreen
import net.dyama.dlock.ui.theme.DLockTheme

class DLockActivity: ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { DLockApp() }
  }
}

@Composable
fun DLockApp() {
  val navController = rememberNavController()

  DLockTheme {
    NavHost(
      navController = navController,
      startDestination = HomeRoute,
    ) {
      composable(HomeRoute) { HomeScreen(navController) }
    }
  }
}
