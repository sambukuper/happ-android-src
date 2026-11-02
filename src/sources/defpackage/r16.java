package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r16 extends s51 {
    public String f0;
    public ve6 g0;
    public Iterator h0;
    public s5 i0;
    public /* synthetic */ Object j0;
    public final /* synthetic */ s16 k0;
    public int l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r16(s16 s16Var, s51 s51Var) {
        super(s51Var);
        this.k0 = s16Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        this.j0 = obj;
        this.l0 |= Integer.MIN_VALUE;
        return this.k0.h(null, null, this);
    }
}
