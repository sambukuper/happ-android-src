package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tk2 extends vj8 implements fx8, aa5, yv6, ql2 {
    public final AppCompatActivity B0;
    public final AppCompatActivity C0;
    public final Handler D0;
    public final ml2 E0;
    public final /* synthetic */ AppCompatActivity F0;

    public tk2(AppCompatActivity appCompatActivity) {
        this.F0 = appCompatActivity;
        Handler handler = new Handler();
        this.B0 = appCompatActivity;
        this.C0 = appCompatActivity;
        this.D0 = handler;
        this.E0 = new ml2();
    }

    @Override // defpackage.vj8
    public final View W(int i) {
        return this.F0.findViewById(i);
    }

    @Override // defpackage.vj8
    public final boolean X() {
        Window window = this.F0.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.aa5
    public final z95 b() {
        return this.F0.b();
    }

    @Override // defpackage.fx8
    public final ex8 e() {
        return this.F0.e();
    }

    @Override // defpackage.yv6
    public final xd6 f() {
        return (xd6) this.F0.f0.Z;
    }

    @Override // defpackage.d94
    /* JADX INFO: renamed from: h */
    public final g94 getX() {
        return this.F0.z0;
    }

    @Override // defpackage.ql2
    public final void a() {
    }
}
