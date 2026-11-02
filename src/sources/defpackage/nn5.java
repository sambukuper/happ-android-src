package defpackage;

import java.util.Collection;
import java.util.Iterator;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nn5 extends s51 {
    public XRayConfig.OutboundBean f0;
    public Collection g0;
    public Iterator h0;
    public Collection i0;
    public int j0;
    public /* synthetic */ Object k0;
    public final /* synthetic */ un5 l0;
    public int m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn5(un5 un5Var, s51 s51Var) {
        super(s51Var);
        this.l0 = un5Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        this.k0 = obj;
        this.m0 |= Integer.MIN_VALUE;
        return this.l0.b(null, null, this);
    }
}
