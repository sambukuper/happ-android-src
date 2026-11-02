package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eb1 extends s51 {
    public boolean f0;
    public Object g0;
    public ea6 h0;
    public Serializable i0;
    public int j0;
    public /* synthetic */ Object k0;
    public final /* synthetic */ ib1 l0;
    public int m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb1(ib1 ib1Var, s51 s51Var) {
        super(s51Var);
        this.l0 = ib1Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        this.k0 = obj;
        this.m0 |= Integer.MIN_VALUE;
        return this.l0.g(false, this);
    }
}
