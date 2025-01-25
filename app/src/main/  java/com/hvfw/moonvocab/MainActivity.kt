package com.hvfw.moonvocab

import android.os.Bundle
import android.os.FileObserver
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
        
        // Starte Moon+ Reader-Überwachung
        MoonReaderManager(this).startMonitoring()

        setContent {
            MoonVocabTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    VocabListScreen()
                }
            }
        }
    }
}
