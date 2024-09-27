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

fun SJava(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.Yellow,
                    //containerColor = Color(0xFFADD8E6),
                    titleContentColor = Color.Black,
                ),
                title = {
                    Text("Java",
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
                containerColor = Color.Yellow
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(), // Ocupa todo el ancho del BottomAppBar
                    horizontalArrangement = Arrangement.Center // Distribuye el contenido centrado
                ){
                    Button(onClick = { navController.navigate("Inicio") },
                        modifier = Modifier
                            .height(50.dp).width(150.dp),
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
                    onClick = { navController.navigate("kotlin") }, // Navega a la pantalla de Kotlin
                    containerColor = Color.Yellow,
                    contentColor = Color.Black,
                    modifier = Modifier.padding(start = 30.dp)
                ) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Previous")
                }

                FloatingActionButton(
                onClick = { navController.navigate("js") }, // Navega a Java
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
                        .padding(1.dp),
                    painter = painterResource(id = R.drawable.j),
                    contentDescription = "Imagen"
                )

                Text(
                    textAlign = TextAlign.Center,
                    text = "¿Qué es Java?",
                    modifier = Modifier.fillMaxWidth() // Asegura que el texto ocupe todo el ancho disponible
                        .padding(vertical = 16.dp),
                    fontWeight = FontWeight.Bold
                )

                Text(

                    text =
                    """
                       Es un lenguaje de programación orientado a objetos de propósito general. Es conocido por su portabilidad, ya que el código Java se compila en bytecode que puede ejecutarse en cualquier máquina virtual Java (JVM). Java se utiliza ampliamente en el desarrollo de aplicaciones empresariales, aplicaciones web, aplicaciones Android y muchas otras áreas.
                     
                       
                       Características clave:
                       
                       1. Orientado a objetos.
                       2. Multiplataforma ("Escribe una vez, ejecuta en cualquier lugar").
                       3. Usado en una amplia gama de aplicaciones (Android, servidores, aplicaciones empresariales).
                       4. Amplia comunidad y soporte de bibliotecas.
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
                    painter = painterResource(id = R.drawable.cj),
                    contentDescription = "Imagen"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewJava() {
    // Simulación de un NavController. En la vista previa no se necesita navegación.
    val navController = rememberNavController()
    SJava(navController) // Llama a la función Skotlin con un navController simulado.
}
