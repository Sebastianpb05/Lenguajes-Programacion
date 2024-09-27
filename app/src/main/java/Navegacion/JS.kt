package Navegacion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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

fun Js(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.Black,
                    //containerColor = Color(0xFFADD8E6),
                    titleContentColor = Color.Yellow,
                ),
                title = {
                    Text("JavaScript",
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
                containerColor = Color.Black
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(), // Ocupa todo el ancho del BottomAppBar
                    horizontalArrangement = Arrangement.Center // Distribuye el contenido centrado
                ){
                    Button(onClick = { navController.navigate("Inicio") },
                        modifier = Modifier
                            .height(50.dp).width(150.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Yellow, // Cambia el color de fondo
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
                    onClick = { navController.navigate("java") }, // Navega a la pantalla de Kotlin
                    containerColor = Color.Yellow,
                    contentColor = Color.Black,
                    modifier = Modifier.padding(start = 30.dp)
                ) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Previous")
                }

                FloatingActionButton(
                    onClick = { navController.navigate("mysql") }, // Navega a Java
                    containerColor = Color.Yellow,  // Cambia el color del FAB
                    contentColor = Color.Black     // Cambia el color del ícono

                ) {
                    Icon(Icons.Default.ArrowForward, contentDescription = "Next")
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
                    painter = painterResource(id = R.drawable.js),
                    contentDescription = "Imagen"
                )

                Text(
                    textAlign = TextAlign.Center,
                    text = "¿Qué es JavaScript?",
                    modifier = Modifier.fillMaxWidth() // Asegura que el texto ocupe todo el ancho disponible
                        .padding(vertical = 16.dp),
                    fontWeight = FontWeight.Bold
                )

                Text(

                    text =
                    """
                       Es un lenguaje de programación interpretado que se utiliza principalmente para crear interfaces de usuario interactivas en páginas web. Se ejecuta en el navegador del cliente y permite agregar funcionalidades dinámicas a las páginas web, como animaciones, validación de formularios y manipulación del DOM (Document Object Model). 
                       
                       
                       Características clave:
                       
                       1. Lenguaje principal para la programación web (HTML, CSS y JS).
                       2. Utilizado en el desarrollo frontend (React, Angular, Vue) y backend (Node.js).
                       3. Soporta paradigmas de programación orientada a objetos y funcional.
                       4. Extendido soporte en navegadores.

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
                        .height(100.dp)
                        .width(45.dp),
                    painter = painterResource(id = R.drawable.cjs),
                    contentDescription = "Imagen"
                )

                Spacer(modifier = Modifier.height(45.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewJs() {
    // Simulación de un NavController. En la vista previa no se necesita navegación.
    val navController = rememberNavController()
    Js(navController) // Llama a la función Skotlin con un navController simulado.
}
