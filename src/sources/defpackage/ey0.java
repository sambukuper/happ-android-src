package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ey0 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ComponentActivity Y;

    public /* synthetic */ ey0(ComponentActivity componentActivity, byte b) {
        this.X = b;
        this.Y = componentActivity;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        byte b2 = 0;
        ComponentActivity componentActivity = this.Y;
        switch (b) {
            case 0:
                int i = ComponentActivity.x0;
                componentActivity.reportFullyDrawn();
                return dn8.a;
            case 1:
                return new bn2(componentActivity.h0, new ey0(componentActivity, b2));
            case 2:
                int i2 = ComponentActivity.x0;
                ep1 ep1Var = new ep1();
                componentActivity.a().l(ep1Var);
                return ep1Var;
            case 3:
                int i3 = ComponentActivity.x0;
                return new zv6(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            default:
                int i4 = ComponentActivity.x0;
                z95 z95Var = new z95(new dy0(componentActivity, (byte) 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (dh3.f(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.X.a(new fy0(z95Var, componentActivity, b2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new sc(componentActivity, z95Var, (byte) 13));
                    }
                }
                return z95Var;
        }
    }
}
