package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s5 {
    public final db a;
    public final Set b;
    public sy8 c;
    public final z05 d;

    public s5(db dbVar, Set set, b71 b71Var, vj2 vj2Var) {
        q51 q51Var;
        dbVar.getClass();
        b71Var.getClass();
        this.a = dbVar;
        this.b = set;
        byte b = 0;
        p5 p5Var = new p5(vj2Var, this, b);
        b71Var.getClass();
        z05 z05Var = new z05();
        z05Var.f0 = b71Var;
        z05Var.g0 = p5Var;
        Object obj = new Object();
        z05Var.Z = obj;
        synchronized (obj) {
            q51Var = null;
            z05Var.h0 = w51.G(b71Var, null, null, new ym7(z05Var, q51Var, (byte) 13), 3);
        }
        this.d = z05Var;
        w51.G(b71Var, null, null, new r5(this, q51Var, b), 3);
    }

    public final s15 a() {
        z05 z05Var = this.d;
        synchronized (z05Var.Z) {
            try {
                if (z05Var.Y) {
                    return null;
                }
                int i = z05Var.X + 1;
                z05Var.X = i;
                if (i == 1) {
                    og7 og7Var = (og7) z05Var.h0;
                    if (og7Var != null) {
                        og7Var.m(null);
                    }
                    z05Var.h0 = null;
                }
                return new s15(z05Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(s51 s51Var) {
        Object objR = gv3.r(this.a.u, new q5(2, null, (byte) 1), s51Var);
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        if (objR != c71Var) {
            objR = dn8Var;
        }
        return objR == c71Var ? objR : dn8Var;
    }

    public final void c() {
        this.d.b();
        this.a.a();
    }

    public final dn8 d(sy8 sy8Var, s15 s15Var) {
        dn8 dn8Var = dn8.a;
        sy8 sy8Var2 = this.c;
        this.c = sy8Var;
        q51 q51Var = null;
        if (sy8Var2 != null) {
            sy8Var2.a(null);
        }
        oh7 oh7Var = this.a.u;
        synchronized (sy8Var.e) {
            if (sy8Var.f) {
                s15Var.b();
            } else {
                sy8Var.k = w51.G(sy8Var.c, null, null, new t17(oh7Var, sy8Var, q51Var, (byte) 20), 3);
                sy8Var.l = s15Var;
            }
        }
        return dn8Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveCamera(cameraId=");
        sb.append((Object) vi0.b(this.a.a));
        sb.append(")@");
        int iHashCode = hashCode();
        km4.q(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        return sb.toString();
    }
}
