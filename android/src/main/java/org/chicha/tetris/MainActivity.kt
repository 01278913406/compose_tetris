package org.chicha.tetris

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import github.leavesczy.compose_tetris.android.AndroidMainScreen


/**
 * @Author: leavesCZY
 * @Date: 2021/6/3 22:06
 * @Desc:
 * @Github：https://github.com/leavesCZY
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            AndroidMainScreen()
        }
    }

}