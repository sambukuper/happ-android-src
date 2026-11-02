package defpackage;

import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.service.d;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ls extends s51 {
    public zo8 f0;
    public String g0;
    public String h0;
    public HappApplication i0;
    public d j0;
    public ms k0;
    public int l0;
    public /* synthetic */ Object m0;
    public final /* synthetic */ ms n0;
    public int o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(ms msVar, s51 s51Var) {
        super(s51Var);
        this.n0 = msVar;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        this.m0 = obj;
        this.o0 |= Integer.MIN_VALUE;
        Object objE = this.n0.e(null, this);
        return objE == c71.X ? objE : new sj6(objE);
    }
}
