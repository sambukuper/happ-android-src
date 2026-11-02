package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ky7 implements SurfaceHolder.Callback {
    public Size a;
    public hy7 b;
    public hy7 c;
    public mf1 d;
    public Size e;
    public boolean f = false;
    public boolean g = false;
    public final /* synthetic */ ly7 h;

    public ky7(ly7 ly7Var) {
        this.h = ly7Var;
    }

    public final void a() {
        mf1 mf1Var;
        if (this.b != null) {
            Objects.toString(this.b);
            hi5.z0("SurfaceViewImpl");
            if (!this.b.c() || (mf1Var = this.d) == null) {
                return;
            }
            mf1Var.c();
        }
    }

    public final boolean b() {
        ly7 ly7Var = this.h;
        Surface surface = ly7Var.e.getHolder().getSurface();
        if (this.f || this.b == null || !Objects.equals(this.a, this.e)) {
            return false;
        }
        hi5.z0("SurfaceViewImpl");
        mf1 mf1Var = this.d;
        hy7 hy7Var = this.b;
        Objects.requireNonNull(hy7Var);
        hy7Var.a(surface, w79.y(ly7Var.e.getContext()), new hp(mf1Var, (byte) 4));
        this.f = true;
        ly7Var.a = true;
        ly7Var.h();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        hi5.z0("SurfaceViewImpl");
        this.e = new Size(i2, i3);
        b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        hy7 hy7Var;
        hi5.z0("SurfaceViewImpl");
        if (!this.g || (hy7Var = this.c) == null) {
            return;
        }
        hy7Var.c();
        hy7Var.i.b(null);
        this.c = null;
        this.g = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        hi5.z0("SurfaceViewImpl");
        if (this.f) {
            hy7 hy7Var = this.b;
            if (hy7Var != null) {
                Objects.toString(hy7Var);
                hi5.z0("SurfaceViewImpl");
                this.b.k.a();
            }
        } else {
            a();
        }
        this.g = true;
        hy7 hy7Var2 = this.b;
        if (hy7Var2 != null) {
            this.c = hy7Var2;
        }
        this.f = false;
        this.b = null;
        this.d = null;
        this.e = null;
        this.a = null;
    }
}
