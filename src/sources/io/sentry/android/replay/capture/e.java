package io.sentry.android.replay.capture;

import defpackage.dn8;
import defpackage.g24;
import defpackage.gn2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ f Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, byte b) {
        super(1);
        this.Y = b;
        this.Z = fVar;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.Y;
        dn8 dn8Var = dn8.a;
        f fVar = this.Z;
        switch (b) {
            case 0:
                k kVar = (k) obj;
                kVar.getClass();
                if (kVar instanceof i) {
                    fVar.y.add(kVar);
                    fVar.k(fVar.e() + 1);
                }
                break;
            default:
                k kVar2 = (k) obj;
                kVar2.getClass();
                if (kVar2 instanceof i) {
                    fVar.y.add(kVar2);
                    fVar.k(fVar.e() + 1);
                }
                break;
        }
        return dn8Var;
    }
}
