package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sv8 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = pw8.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
