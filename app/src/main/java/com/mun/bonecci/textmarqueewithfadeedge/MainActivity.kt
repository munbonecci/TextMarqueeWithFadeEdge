package com.mun.bonecci.textmarqueewithfadeedge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mun.bonecci.textmarqueewithfadeedge.components.TextMarqueeWithFadeEdge
import com.mun.bonecci.textmarqueewithfadeedge.ui.theme.TextMarqueeWithFadeEdgeTheme
import com.mun.bonecci.textmarqueewithfadeedge.ui.theme.dimen_40dp
import com.mun.bonecci.textmarqueewithfadeedge.ui.theme.dimen_50dp
import com.mun.bonecci.textmarqueewithfadeedge.ui.theme.dimen_60dp
import com.mun.bonecci.textmarqueewithfadeedge.ui.theme.dimen_70dp
import com.mun.bonecci.textmarqueewithfadeedge.ui.theme.dimen_80dp
import com.mun.bonecci.textmarqueewithfadeedge.ui.theme.dimen_90dp
import com.mun.bonecci.textmarqueewithfadeedge.utils.Constants.EXAMPLE_FIVE
import com.mun.bonecci.textmarqueewithfadeedge.utils.Constants.EXAMPLE_FOUR
import com.mun.bonecci.textmarqueewithfadeedge.utils.Constants.EXAMPLE_ONE
import com.mun.bonecci.textmarqueewithfadeedge.utils.Constants.EXAMPLE_SIX
import com.mun.bonecci.textmarqueewithfadeedge.utils.Constants.EXAMPLE_TEXT
import com.mun.bonecci.textmarqueewithfadeedge.utils.Constants.EXAMPLE_THREE
import com.mun.bonecci.textmarqueewithfadeedge.utils.Constants.EXAMPLE_TWO

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextMarqueeWithFadeEdgeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextMarqueeWithFadeEdgeExample()
                }
            }
        }
    }
}

@Composable
fun TextMarqueeWithFadeEdgeExample() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextMarqueeWithFadeEdge(
            text = EXAMPLE_TEXT,
            color = Color.Blue,
            fontSize = 12.sp,
            fontWeight = FontWeight.Light,
            layoutId = EXAMPLE_ONE,
            edgeWidth = dimen_40dp
        )
        TextMarqueeWithFadeEdge(
            text = EXAMPLE_TEXT,
            color = Color.Black,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            layoutId = EXAMPLE_TWO,
            edgeWidth = dimen_50dp
        )
        TextMarqueeWithFadeEdge(
            text = EXAMPLE_TEXT,
            color = Color.Gray,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            layoutId = EXAMPLE_THREE,
            edgeWidth = dimen_60dp
        )
        TextMarqueeWithFadeEdge(
            text = EXAMPLE_TEXT,
            color = Color.Magenta,
            fontSize = 18.sp,
            fontWeight = FontWeight.ExtraBold,
            layoutId = EXAMPLE_FOUR,
            edgeWidth = dimen_70dp
        )
        TextMarqueeWithFadeEdge(
            text = EXAMPLE_TEXT,
            color = Color.Green,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            layoutId = EXAMPLE_FIVE,
            edgeWidth = dimen_80dp
        )
        TextMarqueeWithFadeEdge(
            text = EXAMPLE_TEXT,
            color = Color.DarkGray,
            fontSize = 22.sp,
            fontWeight = FontWeight.ExtraBold,
            layoutId = EXAMPLE_SIX,
            edgeWidth = dimen_90dp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TextMarqueeWithFadeEdgePreview() {
    TextMarqueeWithFadeEdgeTheme {
        TextMarqueeWithFadeEdgeExample()
    }
}