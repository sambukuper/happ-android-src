package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class eo7 extends uy7 implements rn2 {
    public boolean g0;
    public final /* synthetic */ r77 h0;
    public final /* synthetic */ ky2 i0;
    public final /* synthetic */ Context j0;
    public final /* synthetic */ gn2 k0;
    public final /* synthetic */ fn6 l0;
    public final /* synthetic */ gn2 m0;
    public final /* synthetic */ o87 n0;
    public final /* synthetic */ Activity o0;
    public final /* synthetic */ gn2 p0;
    public final /* synthetic */ String q0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo7(r77 r77Var, ky2 ky2Var, Context context, gn2 gn2Var, fn6 fn6Var, gn2 gn2Var2, o87 o87Var, Activity activity, gn2 gn2Var3, String str, q51 q51Var) {
        super(2, q51Var);
        this.h0 = r77Var;
        this.i0 = ky2Var;
        this.j0 = context;
        this.k0 = gn2Var;
        this.l0 = fn6Var;
        this.m0 = gn2Var2;
        this.n0 = o87Var;
        this.o0 = activity;
        this.p0 = gn2Var3;
        this.q0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        n((q51) obj2, (b71) obj).q(dn8.a);
        return c71.X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new eo7(this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        boolean z = this.g0;
        if (!z) {
            w39.n0(obj);
            do7 do7Var = new do7(this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, null);
            r77 r77Var = this.h0;
            r77Var.getClass();
            this.g0 = true;
            Object objN = z91.n(r77Var, do7Var, this);
            c71 c71Var = c71.X;
            if (objN == c71Var) {
                return c71Var;
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        bt.i("SharedFlow never completes, this call should never return.");
        return null;
    }
}
