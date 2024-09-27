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

fun SMysql(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color(0xFFFFA500),
                    //containerColor = Color(0xFFADD8E6),
                    titleContentColor = Color.White,
                ),
                title = {
                    Text("MySQL",
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
                containerColor = Color(0xFFFFA500)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    Button(onClick = { navController.navigate("Inicio") },
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

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                FloatingActionButton(
                    onClick = { navController.navigate("js") },
                    containerColor = Color(0xFFFFA500),
                    contentColor = Color.White,
                    modifier = Modifier.padding(start = 30.dp)
                ) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Previous")
                }

                FloatingActionButton(
                    onClick = { navController.navigate("screenc") },
                    containerColor = Color(0xFFFFA500),
                    contentColor = Color.White

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
                    painter = painterResource(id = R.drawable.sql),
                    contentDescription = "Imagen"
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "¿Qué es MySQL?",
                    modifier = Modifier.fillMaxWidth()
                        .padding(vertical = 16.dp),
                    fontWeight = FontWeight.Bold
                )

                Text(

                    text =
                    """
                    Es un sistema de gestión de bases de datos relacionales (RDBMS) de código abierto muy popular. Se utiliza para almacenar y gestionar grandes cantidades de datos organizados en tablas. MySQL es conocido por su velocidad, fiabilidad y facilidad de uso, lo que lo hace ideal para una amplia variedad de aplicaciones, desde sitios web pequeños hasta grandes aplicaciones empresariales.
                    
                    Características clave:
                    
                    1. Soporta grandes volúmenes de datos.
                    2. Muy utilizado en aplicaciones web, especialmente con PHP.
                    3. Ofrece capacidades para transacciones y almacenamiento seguro de datos.
                    4. Gratuito y de código abierto.
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
                    painter = painterResource(id = R.drawable.cmys),
                    contentDescription = "Imagen"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMysql() {
    val navController = rememberNavController()
    SMysql(navController)
}