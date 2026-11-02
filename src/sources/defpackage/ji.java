package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ji extends uy7 implements gn2 {
    public qk g0;
    public aa6 h0;
    public boolean i0;
    public final /* synthetic */ oi j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ t18 l0;
    public final /* synthetic */ long m0;
    public final /* synthetic */ gn2 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(oi oiVar, Object obj, t18 t18Var, long j, gn2 gn2Var, q51 q51Var) {
        super(1, q51Var);
        this.j0 = oiVar;
        this.k0 = obj;
        this.l0 = t18Var;
        this.m0 = j;
        this.n0 = gn2Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        return ((ji) m((q51) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        return new ji(this.j0, this.k0, this.l0, this.m0, this.n0, q51Var);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        oi oiVar;
        qk qkVar;
        aa6 aa6Var;
        CancellationException cancellationException;
        t18 t18Var = this.l0;
        boolean z = this.i0;
        oi oiVar2 = this.j0;
        if (!z) {
            w39.n0(obj);
            try {
                oiVar2.c.Z = (wk) oiVar2.a.a.B(this.k0);
                oiVar2.e.setValue(t18Var.c);
                oiVar2.d.setValue(Boolean.TRUE);
                qk qkVar2 = oiVar2.c;
                qk qkVar3 = new qk(qkVar2.X, qkVar2.Y.getValue(), ci8.p(qkVar2.Z), qkVar2.f0, Long.MIN_VALUE, qkVar2.h0);
                aa6 aa6Var2 = new aa6();
                long j = this.m0;
                ii iiVar = new ii(oiVar2, qkVar3, this.n0, aa6Var2, (byte) 0);
                oiVar = oiVar2;
                try {
                    this.g0 = qkVar3;
                    this.h0 = aa6Var2;
                    this.i0 = true;
                    Object objB = ry7.b(qkVar3, t18Var, j, iiVar, this);
                    c71 c71Var = c71.X;
                    if (objB == c71Var) {
                        return c71Var;
                    }
                    qkVar = qkVar3;
                    aa6Var = aa6Var2;
                } catch (CancellationException e) {
                    e = e;
                    cancellationException = e;
                    oiVar.c();
                    throw cancellationException;
                }
            } catch (CancellationException e2) {
                e = e2;
                oiVar = oiVar2;
                cancellationException = e;
                oiVar.c();
                throw cancellationException;
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aa6Var = this.h0;
            qkVar = this.g0;
            try {
                w39.n0(obj);
                oiVar = oiVar2;
            } catch (CancellationException e3) {
                cancellationException = e3;
                oiVar = oiVar2;
                oiVar.c();
                throw cancellationException;
            }
        }
        hk hkVar = aa6Var.X ? hk.X : hk.Y;
        oiVar.c();
        return new nk(qkVar, hkVar);
    }
}
