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

package dev.yangfengfan.devhub.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * @author yangfengfandev@gmail.com 2020-07-27
 */
public class AppUtil {

    public static void handlerThrowable(Throwable throwable) {
        throwable.printStackTrace();
    }

    public static void openBrowser(Context context, String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse(url);
        intent.setData(uri);
        try {
            context.startActivity(intent);
        } catch (Throwable throwable) {
            handlerThrowable(throwable);
        }

    }

}
