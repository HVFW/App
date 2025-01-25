package com.hvfw.moonvocab

  import android.os.Bundle
  import androidx.activity.ComponentActivity
  import androidx.activity.compose.setContent
  import androidx.compose.foundation.layout.fillMaxSize
  import androidx.compose.material3.MaterialTheme
  import androidx.compose.material3.Surface
  import androidx.compose.ui.Modifier
  import com.hvfw.moonvocab.ui.theme.MoonVocabTheme

  class MainActivity : ComponentActivity() {
      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContent {
              MoonVocabTheme {
                  Surface(
                      modifier = Modifier.fillMaxSize(),
                      color = MaterialTheme.colorScheme.background
                  ) {
                      // Hier kommt später die UI
                  }
              }
          }
      }
  }
