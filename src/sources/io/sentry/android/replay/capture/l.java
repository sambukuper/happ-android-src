package io.sentry.android.replay.capture;

import defpackage.dn8;
import defpackage.g24;
import defpackage.gn2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ m Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, byte b) {
        super(1);
        this.Y = b;
        this.Z = mVar;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.Y;
        dn8 dn8Var = dn8.a;
        m mVar = this.Z;
        switch (b) {
            case 0:
                k kVar = (k) obj;
                kVar.getClass();
                if (kVar instanceof i) {
                    i iVar = (i) kVar;
                    i.a(iVar, mVar.w);
                    mVar.k(mVar.e() + 1);
                    mVar.m(iVar.a.w0);
                }
                break;
            default:
                k kVar2 = (k) obj;
                kVar2.getClass();
                if (kVar2 instanceof i) {
                    i.a((i) kVar2, mVar.w);
                    mVar.k(mVar.e() + 1);
                }
                break;
        }
        return dn8Var;
    }
}
