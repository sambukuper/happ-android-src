package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k29 implements j29 {
    public final gi1 b;

    public k29() {
        this.b = Build.VERSION.SDK_INT >= 34 ? hi1.X : oy1.r0;
        i21.f(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
