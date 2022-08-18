package com.jonecx.qwit.ui

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.consumedWindowInsets
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.jonecx.qwit.R.drawable
import com.jonecx.qwit.R.string
import com.jonecx.qwit.ui.design.component.QwitTopAppBar
import com.jonecx.qwit.ui.design.image.Image
import com.jonecx.qwit.ui.design.theme.QwitTheme

@Composable
fun MailRoute(
    windowSizeClass: WindowSizeClass,
    modifier: Modifier = Modifier
) {
    MailScreen(windowSizeClass, modifier)
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun MailScreen(
    windowSizeClass: WindowSizeClass,
    modifier: Modifier = Modifier
) {
    QwitGradientBackground {
        Scaffold(
            topBar = {
                QwitTopAppBar(
                    titleRes = string.mail,
                    navigationIcon = ImageVector.vectorResource(id = drawable.ic_email_filled),
                    navigationIconContentDescription = stringResource(id = string.mail),
                    actionIcon = ImageVector.vectorResource(id = drawable.ic_email_outline),
                    actionIconContentDescription = stringResource(id = string.mail),
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = Color.Transparent
                    ),
                    modifier = Modifier.windowInsetsPadding(
                        WindowInsets.safeDrawing.only(WindowInsetsSides.Top)
                    )
                )
            },
            containerColor = Color.Transparent
        ) { innerPadding ->
            BoxWithConstraints(
                modifier = modifier
                    .padding(innerPadding)
                    .consumedWindowInsets(innerPadding)
            ) {
                Row {
                    Image(drawableResId = drawable.ic_email_filled, size = 50.dp, contentDescription = string.mail)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Preview(name = "phone", device = "spec:shape=Normal,width=360,height=640,unit=dp,dpi=480")
@Composable
fun MailScreenPreview() {
    BoxWithConstraints {
        QwitTheme {
            MailScreen(
                windowSizeClass = WindowSizeClass.calculateFromSize(DpSize(maxWidth, maxHeight))
            )
        }
    }
}
