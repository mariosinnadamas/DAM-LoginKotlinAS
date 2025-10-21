package com.example.login.ui.register

import androidx.compose.foundation.background
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun register(){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(30.dp)){
        Column (modifier = Modifier
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(20.dp))
            .fillMaxSize()
            ,horizontalAlignment = Alignment.CenterHorizontally
            , verticalArrangement = Arrangement.Center
        ){  //Caja Login
            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center){
                Text(text = "Crear una cuenta",
                    color = Color.Blue,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.ExtraBold)
            }
            //Caja Email
            Box(modifier = Modifier.padding(top = 20.dp)){
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
                    Text("Crear",
                        modifier = Modifier.padding(5.dp),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}