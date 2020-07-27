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

package dev.yangfengfan.devhub.ui.home;

import android.widget.TextView;

import androidx.lifecycle.ViewModelProvider;

import dev.yangfengfan.devhub.R;
import dev.yangfengfan.devhub.base.BaseFragment;

public class HomeFragment extends BaseFragment {

    private HomeViewModel homeViewModel;

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initData() {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
    }

    @Override
    protected void initView() {
        final TextView textView = findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
    }
}