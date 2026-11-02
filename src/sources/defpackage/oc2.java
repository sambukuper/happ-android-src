package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class oc2 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ qc2 i0;
    public final /* synthetic */ String j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oc2(qc2 qc2Var, String str, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = qc2Var;
        this.j0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        o05 o05Var = (o05) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                n(q51Var, o05Var).q(dn8Var);
                break;
            default:
                n(q51Var, o05Var).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        String str = this.j0;
        qc2 qc2Var = this.i0;
        switch (b) {
            case 0:
                oc2 oc2Var = new oc2(qc2Var, str, q51Var, (byte) 0);
                oc2Var.h0 = obj;
                return oc2Var;
            default:
                oc2 oc2Var2 = new oc2(qc2Var, str, q51Var, (byte) 1);
                oc2Var2.h0 = obj;
                return oc2Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        String str = this.j0;
        qc2 qc2Var = this.i0;
        o05 o05Var = (o05) this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                o05Var.e(qc2Var.c, str);
                break;
            default:
                w39.n0(obj);
                js5 js5Var = qc2Var.b;
                m02 m02Var = (Set) o05Var.c(js5Var);
                if (m02Var == null) {
                    m02Var = m02.X;
                }
                o05Var.f(js5Var, w27.o0(w27.l0(w27.m0(new hu((Iterable) m02Var, (byte) 1), new ya2((byte) 7)), new m40(str, (byte) 8))));
                break;
        }
        return dn8Var;
    }
}
