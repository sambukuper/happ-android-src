package defpackage;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rj extends uy7 implements rn2 {
    public final /* synthetic */ Drawable g0;
    public final /* synthetic */ dn2 h0;
    public final /* synthetic */ dn2 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(Drawable drawable, dn2 dn2Var, dn2 dn2Var2, q51 q51Var) {
        super(2, q51Var);
        this.g0 = drawable;
        this.h0 = dn2Var;
        this.i0 = dn2Var2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        rj rjVar = (rj) n((q51) obj2, (b71) obj);
        dn8 dn8Var = dn8.a;
        rjVar.q(dn8Var);
        return dn8Var;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new rj(this.g0, this.h0, this.i0, q51Var);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        w39.n0(obj);
        ((AnimatedImageDrawable) this.g0).registerAnimationCallback(new us8(this.h0, this.i0));
        return dn8.a;
    }
}
