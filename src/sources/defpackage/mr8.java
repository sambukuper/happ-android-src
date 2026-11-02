package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mr8 extends s51 {
    public /* synthetic */ Object f0;
    public final /* synthetic */ or8 g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr8(or8 or8Var, s51 s51Var) {
        super(s51Var);
        this.g0 = or8Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        return or8.a(this.g0, this);
    }
}
