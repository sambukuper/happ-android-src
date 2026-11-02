package defpackage;

import java.io.PrintWriter;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jg implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ jg(Object obj, boolean z, boolean z2, byte b) {
        this.X = b;
        this.f0 = obj;
        this.Y = z;
        this.Z = z2;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        boolean z = this.Z;
        boolean z2 = this.Y;
        Object obj2 = this.f0;
        switch (b) {
            case 0:
                f17 f17Var = (f17) obj;
                long jA = ((v30) obj2).a();
                f17Var.a(n07.a, new m07(z2 ? ev2.Y : ev2.Z, jA, z ? l07.X : l07.Z, (9223372034707292159L & jA) != 9205357640488583168L));
                break;
            default:
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.println(p61.q(printWriter) + " Subscription " + ((SubscriptionItem) obj2).getRemarks() + " providerID: " + z2 + " installID: " + z);
                break;
        }
        return dn8Var;
    }
}
