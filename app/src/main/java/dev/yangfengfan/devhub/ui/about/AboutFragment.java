/*
 * Copyright 2020 yangfengfan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.yangfengfan.devhub.ui.about;

import android.widget.TextView;

import androidx.lifecycle.ViewModelProvider;

import dev.yangfengfan.devhub.R;
import dev.yangfengfan.devhub.base.BaseFragment;

/**
 * @author yangfengfandev@gmail.com 2020-07-27
 */
public class AboutFragment extends BaseFragment {
    private AboutViewModel aboutViewModel;

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_about;
    }

    @Override
    protected void initData() {
        aboutViewModel = new ViewModelProvider(this).get(AboutViewModel.class);
    }

    @Override
    protected void initView() {
        final TextView textView = findViewById(R.id.text_about);
        aboutViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
    }
}
