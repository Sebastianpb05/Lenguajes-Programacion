package Navegacion

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.res.painterResource
import com.example.lenguajes.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun inicio() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "inicio") {
        composable("inicio") {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .border(2.dp, Color.Black, shape = RoundedCornerShape(16.dp))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Lenguajes de Programación",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .size(200.dp)
                        .padding(bottom = 8.dp)
                )

                Text(
                    text = "Los lenguajes de programación son sistemas formales de comunicación utilizados para dar instrucciones a las computadoras. Existen diversos lenguajes, cada uno diseñado para diferentes tipos de tareas y con sus propias sintaxis y semántica.",
                    fontSize = 15.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .padding(bottom = 30.dp)

                )


                Button(
                    onClick = { navController.navigate("kotlin") },
                    modifier = Modifier.fillMaxWidth(0.7f)
                ) {
                    Text(text = "Kotlin")
                }
                Button(
                    onClick = { navController.navigate("java") },
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth(0.7f)
                ) {
                    Text(text = "Java")
                }
                Button(
                    onClick = { navController.navigate("js") },
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth(0.7f)
                ) {
                    Text(text = "Js")
                }
                Button(
                    onClick = { navController.navigate("mysql") },
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth(0.7f)
                ) {
                    Text(text = "MySQL")
                }
                Button(
                    onClick = { navController.navigate("screenc") },
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth(0.7f)
                ) {
                    Text(text = "C++")
                }
            }
        }

        composable("kotlin") { Skotlin(navController) }
        composable("java") { SJava(navController) }
        composable("js") { Js(navController) }
        composable("mysql") { SMysql(navController) }
        composable("screenc") { ScreenC(navController) }
    }
}

