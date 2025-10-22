package com.example.login.ui.login

import android.service.autofill.OnClickAction
import android.text.style.ClickableSpan
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.login.ui.navigation.AppScreen

@Composable
fun Login(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(30.dp)){
        Column (modifier = Modifier
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(20.dp))
            .fillMaxSize()
            ,horizontalAlignment = Alignment.CenterHorizontally
        ){  //Caja Login
            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center){
                Text(text = "Login",
                    modifier = Modifier.padding(top = 120.dp),
                    color = Color.Blue,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.ExtraBold)
            }
            //Caja te echabamos de menos
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
                contentAlignment = Alignment.Center){
                Text(text = "¡Te echábamos de menos!",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }
            //Caja Email
            Box(modifier = Modifier.padding(top = 60.dp)){
                var email by rememberSaveable { mutableStateOf("") }
                OutlinedTextField(
                    value = email,
                    onValueChange = {email = it},
                    placeholder = {Text("Email")},
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = Color.Blue))
            }
            //Caja password
            Box(modifier = Modifier.padding(top = 30.dp)){
                var password by rememberSaveable { mutableStateOf("") }
                OutlinedTextField(
                    value = password,
                    onValueChange = {password = it},
                    placeholder = {Text("Password")},
                    colors= OutlinedTextFieldDefaults.colors(focusedBorderColor = Color.Blue),
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation())
            }

            //Campo olvidaste tu contraseña
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
                horizontalArrangement = Arrangement.End){
                Text(modifier = Modifier.clickable(
                    true, onClick = {navController.navigate(AppScreen.Recovery.route)}),
                    text = "¿Olvidaste tu contraseña?",
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold)
            }

            //Caja Boton de Sign In
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
                contentAlignment = Alignment.Center){
                Button(
                    onClick = {println("Hola")},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue
                    ),
                    shape = RoundedCornerShape(20),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                ) {
                    Text("Sign in",
                        modifier = Modifier.padding(5.dp),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold)
                }
            }

            //Campo crear una nueva cuenta
            Row (modifier = Modifier.padding(top = 30.dp)){
                Text(text = "Crear una nueva cuenta",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3F3F3F)
                )
            }
            //Campo o continua con
            Row (modifier = Modifier.padding(top = 45.dp)){
                Text(text = "O continua con",
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }

            //Campo botones
            Row (modifier = Modifier
                .padding(20.dp,15.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){

                //Boton de google
                Button(modifier = Modifier
                    .padding(horizontal = 5.dp),
                    onClick = {println("Google")},
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color.LightGray
                    ),
                    shape = RoundedCornerShape(10)
                ) {
                    Icon(imageVector = Icons.Rounded.Email,
                        contentDescription = "Google",
                        modifier = Modifier.size(25.dp))
                }

                //Boton de facebook
                Button(modifier = Modifier
                    .padding(horizontal = 5.dp),
                    onClick = {println("Google")},
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color.LightGray
                    ),
                    shape = RoundedCornerShape(10)
                ) {
                    Icon(imageVector = Icons.Rounded.Face,
                        contentDescription = "Google",
                        modifier = Modifier.size(25.dp))
                }

                //Boton de Mac
                Button(modifier = Modifier
                    .padding(horizontal = 5.dp),
                    onClick = {println("Google")},
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color.LightGray
                    ),
                    shape = RoundedCornerShape(10)
                ) {
                    Icon(imageVector = Icons.Rounded.Home,
                        contentDescription = "Google",
                        modifier = Modifier.size(25.dp))
                }
            }
        }
    }
}