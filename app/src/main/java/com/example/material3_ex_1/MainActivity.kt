package com.example.material3_ex_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.material3_ex_1.ui.theme.Material3ex1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Material3ex1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                        ) {
                            Text(text = "Create a new account")
                        }
                        Spacer(modifier = Modifier.height(18.dp))

                        OutlinedButton(
                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "I have a existing account")
                        }
                        Spacer(modifier = Modifier.height(18.dp))

                        ElevatedButton(
                            onClick = { /*TODO*/ }
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Add,
                                contentDescription ="Add to cart",
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = "Add to cart")
                        }

                        Spacer(modifier = Modifier.height(18.dp))

                        FilledTonalButton(
                            onClick = { /*TODO*/ },

                        ) {
                            Text(text = "Open in browser")
                        }
                        Spacer(modifier = Modifier.height(18.dp))

                        TextButton(
                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "Learn more")
                        }

                    }
                }
            }
        }
    }
}

