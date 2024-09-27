package Navegacion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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

fun ScreenC(navController: NavController) {

    Scaffold(

        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color(0xFF00599C),
                    //containerColor = Color(0xFFADD8E6),
                    titleContentColor = Color.White,
                ),
                title = {
                    Text("C++",
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
                containerColor = Color(0xFF00599C)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(), // Ocupa todo el ancho del BottomAppBar
                    horizontalArrangement = Arrangement.Center // Distribuye el contenido centrado
                ){
                    Button(onClick = { navController.navigate("Inicio") },
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White, // Cambia el color de fondo
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

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                FloatingActionButton(
                    onClick = { navController.popBackStack() }, // Navega a la pantalla de Kotlin
                    containerColor = Color(0xFF00599C),
                    contentColor = Color.White,
                    modifier = Modifier.padding(start = 30.dp)
                ) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Previous")
                }
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
                        .padding(15.dp),
                    painter = painterResource(id = R.drawable.c),
                    contentDescription = "Imagen"
                )

                Text(
                    textAlign = TextAlign.Center,
                    text = "¿Qué es C++?",
                    modifier = Modifier.fillMaxWidth() // Asegura que el texto ocupe todo el ancho disponible
                        .padding(vertical = 16.dp),
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text =
                    """
                        Es un lenguaje de programación compilado de propósito general que es una extensión de C. 
                        C++ es conocido por su eficiencia y control a bajo nivel, lo que lo hace ideal para el desarrollo de sistemas operativos, videojuegos, aplicaciones de alto rendimiento y aplicaciones embebidas.                    
                        
                        Características clave:
                        
                        1. Eficiente y rápido, con control sobre los recursos del sistema.
                        2. Soporte tanto para programación orientada a objetos como de procedimientos.
                        3. Utilizado en desarrollo de software de sistemas, videojuegos, motores gráficos y más.
                        4. Extensión del lenguaje C.
                    """.trimIndent(),

                    textAlign = TextAlign.Justify,  // Para que el texto esté justificado
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
                    painter = painterResource(id = R.drawable.cc),
                    contentDescription = "Imagen"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewScreenC() {
    // Simulación de un NavController. En la vista previa no se necesita navegación.
    val navController = rememberNavController()
    ScreenC(navController) // Llama a la función Skotlin con un navController simulado.
}