package defpackage;

import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ey2 extends uy7 implements rn2 {
    public boolean g0;
    public final /* synthetic */ float h0;
    public final /* synthetic */ float i0;
    public final /* synthetic */ oi j0;
    public final /* synthetic */ ky2 k0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey2(float f, float f2, oi oiVar, ky2 ky2Var, q51 q51Var) {
        super(2, q51Var);
        this.h0 = f;
        this.i0 = f2;
        this.j0 = oiVar;
        this.k0 = ky2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new ey2(this.h0, this.i0, this.j0, this.k0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        ey2 ey2Var;
        boolean z = this.g0;
        if (!z) {
            w39.n0(obj);
            float f = this.h0;
            float f2 = this.i0;
            if (f <= 0.0f) {
                f2 = -f2;
            }
            Float f3 = new Float(f2);
            sg8 sg8VarI0 = wl7.i0(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, 6, null);
            this.g0 = true;
            ey2Var = this;
            Object objA = oi.a(this.j0, f3, sg8VarI0, (gn2) null, ey2Var, 12);
            c71 c71Var = c71.X;
            if (objA == c71Var) {
                return c71Var;
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
            ey2Var = this;
        }
        ey2Var.k0.a(null);
        return dn8.a;
    }
}
