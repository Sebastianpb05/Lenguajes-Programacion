package Navegacion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.lenguajes.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun Skotlin(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.Cyan,
                    //containerColor = Color(0xFFADD8E6),
                    titleContentColor = Color.Black,
                ),
                title = {
                    Text("Kotlin",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Cyan
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    Button(onClick = { navController.popBackStack() },
                        modifier = Modifier
                            .height(50.dp).width(150.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black)
                    )
                    {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Inicio",
                        )
                    }
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate("java") },
                    containerColor = Color.Cyan,
                    contentColor = Color.White

            ) {
                Icon(Icons.Default.ArrowForward, contentDescription = "Next")
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(2.dp),
        ) {
            item {

                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .padding(1.dp),
                    painter = painterResource(id = R.drawable.k),
                    contentDescription = "Imagen"
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "¿Qué es Kotlin?",
                    modifier = Modifier.fillMaxWidth()
                        .padding(vertical = 16.dp),
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text =
                    """
                    Es un lenguaje de programación moderno desarrollado por JetBrains. Se destaca por su concisión, seguridad y interoperabilidad con Java. Es muy utilizado en el desarrollo de aplicaciones Android, pero también se emplea en el desarrollo web del lado del servidor y en otras plataformas. 
                    Kotlin ofrece características como inferencia de tipos, funciones de orden superior, null safety y corrutinas, lo que lo hace muy expresivo y fácil de leer.
                    
                    
                    Características clave:
                                                                   
                    1. Sintaxis más concisa que Java.
                    2. Seguro contra null (evita errores de punteros nulos).
                    3. Totalmente interoperable con Java.
                    4. Soporte oficial para desarrollo de Android.
                """.trimIndent(),
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 45.dp)
                )

                Text(
                    textAlign = TextAlign.Center,
                    text = "Codigo",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    painter = painterResource(id = R.drawable.ck),
                    contentDescription = "Imagen"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSkotlin() {

    val navController = rememberNavController()
    Skotlin(navController)
}





