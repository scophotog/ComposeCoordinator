package org.sco.composecoordinator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.fragment.app.Fragment
import org.sco.composecoordinator.TextObject.lorem

class ScrollingComposeFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Surface(
                    modifier = Modifier.nestedScroll(rememberNestedScrollInteropConnection())
                ) {
                    LazyColumn {
                        item {
                            Text(text = lorem)
                        }
                        item {
                            Text(text = lorem)
                        }
                    }
                }

            }
        }
    }
}