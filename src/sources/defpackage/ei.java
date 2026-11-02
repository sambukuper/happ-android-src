package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ei implements fw8 {
    public final ViewConfiguration a;

    public ei(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.fw8
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.fw8
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.fw8
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return u3.n(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.fw8
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.fw8
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.fw8
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return u3.m(this.a);
        }
        return 16.0f;
    }
}
