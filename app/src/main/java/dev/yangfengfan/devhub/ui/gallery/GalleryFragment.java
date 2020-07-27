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

package dev.yangfengfan.devhub.ui.gallery;

import android.widget.TextView;

import androidx.lifecycle.ViewModelProvider;

import dev.yangfengfan.devhub.R;
import dev.yangfengfan.devhub.base.BaseFragment;

public class GalleryFragment extends BaseFragment {

    private GalleryViewModel galleryViewModel;


    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_gallery;
    }

    @Override
    protected void initData() {
        galleryViewModel = new ViewModelProvider(this).get(GalleryViewModel.class);
    }

    @Override
    protected void initView() {
        final TextView textView = findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
    }
}