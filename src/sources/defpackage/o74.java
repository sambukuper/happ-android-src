package defpackage;

import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o74 implements kv6, iv6 {
    public final lv6 X;
    public final jv6 Y;
    public final t05 Z;

    public o74(kv6 kv6Var, Map map, jv6 jv6Var) {
        vj2 vj2Var = new vj2(kv6Var, (byte) 14);
        ox1 ox1Var = mv6.a;
        this.X = new lv6(map, vj2Var);
        this.Y = jv6Var;
        t05 t05Var = vw6.a;
        this.Z = new t05();
    }

    @Override // defpackage.kv6
    public final f63 a(String str, dn2 dn2Var) {
        return this.X.a(str, dn2Var);
    }

    @Override // defpackage.iv6
    public final void b(Object obj, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(-858296452);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            this.Y.b(obj, zy0Var, lp2Var, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            boolean zH = lp2Var.h(this) | lp2Var.h(obj);
            Object objK = lp2Var.K();
            if (zH || objK == zz0.a) {
                objK = new zw2(this, obj, (byte) 9);
                lp2Var.g0(objK);
            }
            u70.a(obj, (gn2) objK, lp2Var);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) this, obj, (Object) zy0Var, i, (byte) 11);
        }
    }

    @Override // defpackage.kv6
    public final boolean c(Object obj) {
        return this.X.c(obj);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[LOOP:0: B:5:0x000d->B:17:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[EDGE_INSN: B:21:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:5:0x000d->B:17:0x004e], SYNTHETIC] */
    @Override // defpackage.kv6
    public final Map d() {
        t05 t05Var = this.Z;
        Object[] objArr = t05Var.b;
        long[] jArr = t05Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            jv6 jv6Var = this.Y;
                            if (jv6Var.Y.j(obj) == null) {
                                jv6Var.X.remove(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.X.d();
    }

    @Override // defpackage.kv6
    public final Object e(String str) {
        return this.X.e(str);
    }
}
