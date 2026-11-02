package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o16 extends s51 {
    public pe6 f0;
    public Iterator g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ s16 i0;
    public int j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o16(s16 s16Var, s51 s51Var) {
        super(s51Var);
        this.i0 = s16Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        this.h0 = obj;
        this.j0 |= Integer.MIN_VALUE;
        return this.i0.e(null, this);
    }
}
