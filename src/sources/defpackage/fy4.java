package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fy4 implements ey4 {
    public final Context X;
    public m51 Y;
    public final nh5 Z = new nh5(1.0f);
    public og7 f0;

    public fy4(Context context) {
        this.X = context;
    }

    @Override // defpackage.s61
    public final s61 B0(s61 s61Var) {
        return g33.K(this, s61Var);
    }

    @Override // defpackage.s61
    public final q61 H0(r61 r61Var) {
        return g33.t(this, r61Var);
    }

    @Override // defpackage.s61
    public final Object U(rn2 rn2Var, Object obj) {
        return rn2Var.K(obj, this);
    }

    @Override // defpackage.s61
    public final s61 a0(r61 r61Var) {
        return g33.I(this, r61Var);
    }

    @Override // defpackage.ey4
    public final float c0() {
        q51 q51Var;
        mh7 mh7Var;
        if (this.f0 == null) {
            Context context = this.X;
            s05 s05Var = q29.a;
            synchronized (s05Var) {
                try {
                    Object objG = s05Var.g(context);
                    q51Var = null;
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        x90 x90VarB = gv3.b(-1, null, null, 6);
                        j31 j31Var = new j31(new kg3(contentResolver, uriFor, new c81(x90VarB, z91.p(Looper.getMainLooper())), x90VarB, context, null), (byte) 7);
                        ow7 ow7VarB = pw7.b();
                        nf1 nf1Var = tp1.a;
                        objG = jm4.a0(j31Var, new m51(g33.K(ow7VarB, dm4.a)), new fh7(Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        s05Var.l(context, objG);
                    }
                    mh7Var = (mh7) objG;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.Z.m(((Number) mh7Var.getValue()).floatValue());
            m51 m51Var = this.Y;
            if (m51Var == null) {
                bt.i("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.f0 = w51.G(m51Var, null, null, new jy2((Object) mh7Var, (Object) this, q51Var, (byte) 12), 3);
        }
        return this.Z.l();
    }
}
