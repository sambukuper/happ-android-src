package defpackage;

import android.os.Build;
import android.os.SystemClock;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ef0 {
    public Map A;
    public og7 B;
    public og7 C;
    public og7 D;
    public final b71 a;
    public final s98 b;
    public final tl7 c;
    public final hi0 d;
    public final it2 e;
    public final yx7 f;
    public final nf0 g;
    public final mn0 h;
    public final y5 i;
    public final s16 j;
    public final jl0 k;
    public final jg0 l;
    public final u08 m;
    public final ni0 n;
    public final re0 o;
    public final cl7 p;
    public final Object q;
    public boolean r;
    public mb6 s;
    public dl0 t;
    public ai0 u;
    public ya8 v;
    public og7 w;
    public final ux0 x;
    public sy8 y;
    public sn0 z;

    public ef0(b71 b71Var, s98 s98Var, tl7 tl7Var, hi0 hi0Var, it2 it2Var, yx7 yx7Var, nf0 nf0Var, mn0 mn0Var, y5 y5Var, s16 s16Var, jl0 jl0Var, jg0 jg0Var, u08 u08Var, ni0 ni0Var, re0 re0Var, cl7 cl7Var, j11 j11Var) {
        b71Var.getClass();
        s98Var.getClass();
        tl7Var.getClass();
        nf0Var.getClass();
        mn0Var.getClass();
        s16Var.getClass();
        jl0Var.getClass();
        jg0Var.getClass();
        u08Var.getClass();
        j11Var.getClass();
        this.a = b71Var;
        this.b = s98Var;
        this.c = tl7Var;
        this.d = hi0Var;
        this.e = it2Var;
        this.f = yx7Var;
        this.g = nf0Var;
        this.h = mn0Var;
        this.i = y5Var;
        this.j = s16Var;
        this.k = jl0Var;
        this.l = jg0Var;
        this.m = u08Var;
        this.n = ni0Var;
        this.o = re0Var;
        this.p = cl7Var;
        this.q = new Object();
        this.r = true;
        this.s = sh0.o0;
        this.t = new bl0(hi0Var.a);
        this.x = new ux0();
        q51 q51Var = null;
        this.C = w51.G(b71Var, null, null, new bf0(this, q51Var, (byte) 0), 3);
        this.D = w51.G(b71Var, null, null, new bf0(this, q51Var, (byte) 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s51 s51Var) {
        cf0 cf0Var;
        if (s51Var instanceof cf0) {
            cf0Var = (cf0) s51Var;
            int i = cf0Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                cf0Var.h0 = i - Integer.MIN_VALUE;
            } else {
                cf0Var = new cf0(this, s51Var);
            }
        } else {
            cf0Var = new cf0(this, s51Var);
        }
        Object obj = cf0Var.f0;
        c71 c71Var = c71.X;
        int i2 = cf0Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            toString();
            synchronized (this.q) {
                if (this.s.equals(sh0.j0)) {
                    toString();
                    return Boolean.TRUE;
                }
                if (!this.s.equals(sh0.k0)) {
                    toString();
                    return Boolean.FALSE;
                }
                ux0 ux0Var = this.x;
                cf0Var.h0 = 1;
                if (ux0Var.h(cf0Var) == c71Var) {
                    return c71Var;
                }
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return Boolean.TRUE;
    }

    public final void b(sn0 sn0Var, sy8 sy8Var) {
        og7 og7VarG = w51.G(this.a, null, null, new k(sn0Var, sy8Var, null, (byte) 3), 3);
        if (this.s.equals(sh0.k0)) {
            og7VarG.D(new ze0(this, (byte) 0));
        }
    }

    public final boolean c() {
        return this.s.equals(sh0.k0) || this.s.equals(sh0.j0);
    }

    public final void d(dl0 dl0Var) {
        toString();
        vi0.b(this.d.a);
        Objects.toString(dl0Var);
        synchronized (this.q) {
            try {
                if (c()) {
                    return;
                }
                if ((dl0Var instanceof zk0) || (dl0Var instanceof bl0)) {
                    this.t = dl0Var;
                } else if (dl0Var instanceof al0) {
                    this.m.getClass();
                    this.v = new ya8(SystemClock.elapsedRealtimeNanos());
                }
                g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (c()) {
            toString();
            return;
        }
        mb6 mb6Var = this.s;
        sh0 sh0Var = sh0.n0;
        if (mb6Var.equals(sh0Var)) {
            toString();
            return;
        }
        q51 q51Var = null;
        this.u = null;
        hi0 hi0Var = this.d;
        String str = hi0Var.a;
        List listY0 = wv0.Y0(q57.X(w45.U(new vi0(str)), new vi0(str)));
        ze0 ze0Var = new ze0(this, (byte) 1);
        s16 s16Var = this.j;
        s16Var.getClass();
        str.getClass();
        b71 b71Var = s16Var.d;
        it2 it2Var = this.e;
        sy8 sy8Var = new sy8(str, it2Var, b71Var);
        if (((x90) s16Var.e.h0).b(new ve6(sy8Var, listY0, it2Var, ze0Var)) instanceof tp0) {
            vi0.b(str);
            it2Var.a(new mt2(12, false));
            sy8Var = null;
        }
        if (sy8Var == null) {
            toString();
            return;
        }
        if (this.y != null) {
            bt.i("Check failed.");
            return;
        }
        if (this.z != null) {
            bt.i("Check failed.");
            return;
        }
        this.y = sy8Var;
        sn0 sn0Var = new sn0(it2Var, this.h, this.i, this.k, this.m, hi0Var.n, null, this.p, this.c, this.b, this.a);
        this.z = sn0Var;
        Map map = this.A;
        if (map != null) {
            sn0Var.j(map);
        }
        this.s = sh0Var;
        toString();
        og7 og7Var = this.B;
        if (og7Var != null) {
            og7Var.m(null);
        }
        this.B = w51.G(this.a, null, null, new bf0(this, q51Var, (byte) 2), 3);
    }

    public final void f() {
        if (c()) {
            toString();
            return;
        }
        mb6 mb6Var = this.s;
        sh0 sh0Var = sh0.p0;
        if (mb6Var.equals(sh0Var) || this.s.equals(sh0.o0)) {
            toString();
            return;
        }
        sy8 sy8Var = this.y;
        sn0 sn0Var = this.z;
        this.y = null;
        this.z = null;
        this.s = sh0Var;
        toString();
        b(sn0Var, sy8Var);
    }

    public final void g() {
        int i;
        this.m.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        mb6 mb6Var = this.s;
        ai0 ai0Var = this.u;
        dl0 dl0Var = this.t;
        ya8 ya8Var = this.v;
        dl0Var.getClass();
        boolean z = false;
        boolean z2 = (dl0Var instanceof zk0) && (ai0Var == null || ai0Var.a != 3);
        if (ya8Var != null && jx1.a(jElapsedRealtimeNanos - ya8Var.a, 200000000L) <= 0) {
            z = true;
        }
        if (!mb6Var.equals(sh0.l0) ? !(mb6Var.equals(sh0.m0) && z2 && ((ai0Var == null || ai0Var.a != 9) && (ai0Var == null || ai0Var.a != 8))) : !(z2 || z || (29 <= (i = Build.VERSION.SDK_INT) && i < 33))) {
            long j = this.d.n.f ? 700L : 0L;
            og7 og7Var = this.w;
            if (og7Var != null) {
                og7Var.m(null);
            }
            this.w = w51.G(this.a, null, null, new df0(j, this, null), 3);
            return;
        }
        toString();
        Objects.toString(this.s);
        Objects.toString(this.u);
        Objects.toString(this.t);
        Objects.toString(this.v);
        ya8.a(jElapsedRealtimeNanos);
    }

    public final String toString() {
        return "Camera2CameraController(" + this.n + ')';
    }
}
