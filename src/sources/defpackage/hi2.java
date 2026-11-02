package defpackage;

import android.graphics.Typeface;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hi2 implements fi2 {
    public final ce a;
    public final xd6 b;
    public final q02 c;

    public hi2(be beVar, ce ceVar) {
        xd6 xd6Var = ii2.a;
        h71 h71Var = ki2.a;
        hv2 hv2Var = sp1.a;
        h71Var.getClass();
        gv3.c(g33.K(h71Var, hv2Var).B0(b02.X).B0(new ow7(null)));
        q02 q02Var = new q02();
        this.a = ceVar;
        this.b = xd6Var;
        this.c = q02Var;
        new y0((Object) this, (byte) 29);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082 A[Catch: Exception -> 0x008a, TRY_ENTER, TryCatch #1 {Exception -> 0x008a, blocks: (B:15:0x0028, B:17:0x0036, B:20:0x003b, B:22:0x003f, B:28:0x0059, B:45:0x0082, B:46:0x0089, B:23:0x0046, B:25:0x004a, B:27:0x0055), top: B:54:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final rj8 a(qj8 qj8Var) {
        Typeface typefaceD;
        rj8 rj8Var;
        xd6 xd6Var = this.b;
        synchronized (((g55) xd6Var.Y)) {
            rj8 rj8Var2 = (rj8) ((ej4) xd6Var.Z).a(qj8Var);
            if (rj8Var2 != null) {
                if (rj8Var2.Y) {
                    return rj8Var2;
                }
            }
            try {
                gi2 gi2Var = qj8Var.a;
                wp5 wp5Var = (wp5) this.c.Y;
                int i = qj8Var.c;
                dj2 dj2Var = qj8Var.b;
                if (gi2Var == null || (gi2Var instanceof qe1)) {
                    typefaceD = wp5Var.d(dj2Var, i);
                } else {
                    if (!(gi2Var instanceof iq2)) {
                        if (gi2Var instanceof wc4) {
                            typefaceD = (Typeface) ((wc4) gi2Var).f.Y;
                        } else {
                            rj8Var = null;
                        }
                        if (rj8Var != null) {
                            throw new IllegalStateException("Could not load font");
                        }
                        synchronized (((g55) xd6Var.Y)) {
                            if (((ej4) xd6Var.Z).a(qj8Var) == null && rj8Var.Y) {
                                ((ej4) xd6Var.Z).b(qj8Var, rj8Var);
                            }
                        }
                        return rj8Var;
                    }
                    typefaceD = wp5Var.k((iq2) gi2Var, dj2Var, i);
                }
                rj8Var = new rj8(typefaceD);
                if (rj8Var != null) {
                    throw new IllegalStateException("Could not load font");
                }
                synchronized (((g55) xd6Var.Y)) {
                    if (((ej4) xd6Var.Z).a(qj8Var) == null) {
                        ((ej4) xd6Var.Z).b(qj8Var, rj8Var);
                    }
                    return rj8Var;
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final rj8 b(gi2 gi2Var, dj2 dj2Var, int i, int i2) {
        int i3 = this.a.X;
        return a(new qj8(gi2Var, (i3 == 0 || i3 == Integer.MAX_VALUE) ? dj2Var : new dj2(x97.n(dj2Var.X + i3, 1, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax)), i, i2, null));
    }
}
