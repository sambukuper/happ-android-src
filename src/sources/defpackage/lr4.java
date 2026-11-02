package defpackage;

import androidx.compose.material3.c;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lr4 {
    public static final ox1 a;

    static {
        new vz7(new sh4((byte) 22));
        a = new ox1(new sh4((byte) 23), (byte) 1);
    }

    public static final void a(iw0 iw0Var, ky4 ky4Var, p77 p77Var, wj8 wj8Var, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(904511636);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(iw0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(ky4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(p77Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.f(wj8Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var.h(zy0Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (lp2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            lp2Var.S();
            if ((i & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            c cVarA = hl6.a(0.0f, 7, 0L, false);
            long j = iw0Var.a;
            boolean zE = lp2Var.e(j);
            Object objK = lp2Var.K();
            if (zE || objK == zz0.a) {
                objK = new h88(j, dw0.b(0.4f, j));
                lp2Var.g0(objK);
            }
            mb6.b(new t06[]{kw0.a.a(iw0Var), a.a(ky4Var), qb3.a.a(cVarA), q77.a.a(p77Var), i88.a.a((h88) objK), yj8.a.a(wj8Var)}, jm4.U(-1750539308, new n40(wj8Var, zy0Var, b), lp2Var), lp2Var, 56);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new kr4(iw0Var, ky4Var, p77Var, wj8Var, zy0Var, i, (byte) 0);
        }
    }

    public static final void b(iw0 iw0Var, p77 p77Var, wj8 wj8Var, zy0 zy0Var, lp2 lp2Var, int i) {
        lp2 lp2Var2;
        zy0 zy0Var2;
        wj8 wj8Var2;
        p77 p77Var2;
        iw0 iw0Var2;
        lp2Var.X(-449719819);
        int i2 = i | 146 | (lp2Var.h(zy0Var) ? 2048 : 1024);
        if (lp2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            lp2Var.S();
            if ((i & 1) == 0 || lp2Var.x()) {
                iw0Var = (iw0) lp2Var.j(kw0.a);
                p77Var = (p77) lp2Var.j(q77.a);
                wj8Var = (wj8) lp2Var.j(yj8.a);
            } else {
                lp2Var.Q();
            }
            int i3 = i2 & (-1023);
            iw0 iw0Var3 = iw0Var;
            p77 p77Var3 = p77Var;
            wj8 wj8Var3 = wj8Var;
            lp2Var.q();
            lp2Var2 = lp2Var;
            a(iw0Var3, (ky4) lp2Var.j(a), p77Var3, wj8Var3, zy0Var, lp2Var2, (i3 << 3) & 57344);
            zy0Var2 = zy0Var;
            iw0Var2 = iw0Var3;
            p77Var2 = p77Var3;
            wj8Var2 = wj8Var3;
        } else {
            lp2Var2 = lp2Var;
            zy0Var2 = zy0Var;
            lp2Var2.Q();
            wj8Var2 = wj8Var;
            p77Var2 = p77Var;
            iw0Var2 = iw0Var;
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new j30(iw0Var2, p77Var2, wj8Var2, zy0Var2, i);
        }
    }
}
