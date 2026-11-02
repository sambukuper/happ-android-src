package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lp5 extends uy7 implements rn2 {
    public boolean g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ op5 i0;
    public final /* synthetic */ CharSequence j0;
    public final /* synthetic */ long k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp5(long j, q51 q51Var, op5 op5Var, CharSequence charSequence) {
        super(2, q51Var);
        this.i0 = op5Var;
        this.j0 = charSequence;
        this.k0 = j;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((lp5) n((q51) obj2, kp5.d(obj))).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        lp5 lp5Var = new lp5(this.k0, q51Var, this.i0, this.j0);
        lp5Var.h0 = obj;
        return lp5Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        boolean z = this.g0;
        if (!z) {
            w39.n0(obj);
            TextClassifier textClassifierD = kp5.d(this.h0);
            this.g0 = true;
            Object objB = this.i0.b(this.j0, this.k0, textClassifierD, this);
            c71 c71Var = c71.X;
            if (objB == c71Var) {
                return c71Var;
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }
}
