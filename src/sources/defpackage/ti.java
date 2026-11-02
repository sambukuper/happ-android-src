package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ti extends g24 implements gn2 {
    public static final ti Z;
    public static final ti f0;
    public static final ti g0;
    public static final ti h0;
    public static final ti i0;
    public static final ti j0;
    public static final ti k0;
    public static final ti l0;
    public static final ti m0;
    public static final ti n0;
    public static final ti o0;
    public static final ti p0;
    public static final ti q0;
    public static final ti r0;
    public static final ti s0;
    public static final ti t0;
    public static final ti u0;
    public static final ti v0;
    public static final ti w0;
    public static final ti x0;
    public final /* synthetic */ byte Y;

    static {
        int i = 1;
        Z = new ti((byte) 0, i);
        f0 = new ti((byte) 1, i);
        g0 = new ti((byte) 2, i);
        h0 = new ti((byte) 3, i);
        i0 = new ti((byte) 4, i);
        j0 = new ti((byte) 5, i);
        k0 = new ti((byte) 6, i);
        l0 = new ti((byte) 7, i);
        m0 = new ti((byte) 8, i);
        n0 = new ti((byte) 9, i);
        o0 = new ti((byte) 10, i);
        p0 = new ti((byte) 11, i);
        q0 = new ti((byte) 12, i);
        r0 = new ti((byte) 13, i);
        s0 = new ti((byte) 14, i);
        t0 = new ti((byte) 15, i);
        u0 = new ti((byte) 16, i);
        v0 = new ti((byte) 17, i);
        w0 = new ti((byte) 18, i);
        x0 = new ti((byte) 19, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ti(byte b, int i) {
        super(i);
        this.Y = b;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.Y;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return null;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 4:
                long jA = dw0.a(((dw0) obj).a, nw0.x);
                return new vk(dw0.c(jA), dw0.g(jA), dw0.f(jA), dw0.d(jA));
            case 5:
                return obj;
            case 6:
                long j = ((gd8) obj).a;
                return new tk(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 7:
                tk tkVar = (tk) obj;
                return new gd8(pn7.h(tkVar.a, tkVar.b));
            case 8:
                return wl7.V(0.0f, 0.0f, null, 7);
            case 9:
                ((Number) obj).intValue();
                return 0;
            case 10:
                long j2 = ((pf3) obj).a;
                return new pf3(0L);
            case 11:
                ((Number) obj).intValue();
                return 0;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((Number) obj).intValue();
                return 0;
            case 13:
                long j3 = ((pf3) obj).a;
                return new pf3(0L);
            case 14:
                ((Number) obj).intValue();
                return 0;
            case 15:
                long j4 = ((pf3) obj).a;
                return new hf3(0L);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                pf3 pf3Var = (pf3) obj;
                long j5 = pf3Var.a;
                return pf3Var;
            case 17:
                return b22.d;
            case 18:
                return dn8Var;
            default:
                sv1.k0((sv1) obj, dw0.f, 0L, 0L, 0.0f, WebSocketProtocol.PAYLOAD_SHORT);
                return dn8Var;
        }
    }
}
