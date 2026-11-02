package defpackage;

import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oe0 implements sn2 {
    public static final oe0 Y = new oe0(0);
    public static final oe0 Z = new oe0(1);
    public static final oe0 f0 = new oe0(2);
    public static final oe0 g0 = new oe0(3);
    public final /* synthetic */ byte X;

    public /* synthetic */ oe0(byte b) {
        this.X = b;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                try {
                    p61.z((Response) obj2);
                    break;
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return dn8Var;
            case 1:
                return dn8Var;
            case 2:
                return null;
            default:
                sv1 sv1Var = (sv1) obj;
                long j = ((z85) obj2).a;
                long j2 = ((dw0) obj3).a;
                pb7 pb7Var = pb7.a;
                sv1.o0(sv1Var, j2, sv1Var.h0(pb7.c) / 2.0f, j, null, 120);
                return dn8Var;
        }
    }
}
