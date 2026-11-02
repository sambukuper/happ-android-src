package defpackage;

import java.io.PrintWriter;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import su.happ.proxyutility.dto.AppInfo;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wq0 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ wq0(int i, Collection collection) {
        this.X = (byte) 3;
        this.Y = i;
        this.Z = collection;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        Object obj2 = this.Z;
        int i = this.Y;
        switch (b) {
            case 0:
                ((PrintWriter) obj).println(new Date() + " Sub " + ((SubscriptionItem) obj2).getRemarks() + " with file type check: attempt " + i);
                return dn8.a;
            case 1:
                boolean zG1 = ((ai2) obj).g1(i);
                ((ea6) obj2).X = Boolean.valueOf(zG1);
                return Boolean.valueOf(zG1);
            case 2:
                lk5 lk5Var = (lk5) obj;
                lk5Var.getClass();
                km5 km5Var = lk5Var.d;
                String packageName = ((AppInfo) obj2).getPackageName();
                ll5 ll5Var = km5Var.Z;
                ab4 ab4Var = (ab4) ll5Var.get(packageName);
                if (ab4Var != null) {
                    Object obj3 = ab4Var.a;
                    Object obj4 = ab4Var.b;
                    ll5 ll5VarG = ll5Var.g(packageName);
                    pz2 pz2Var = pz2.N0;
                    if (obj3 != pz2Var) {
                        Object obj5 = ll5VarG.get(obj3);
                        obj5.getClass();
                        ll5VarG = ll5VarG.f(obj3, new ab4(((ab4) obj5).a, obj4));
                    }
                    if (obj4 != pz2Var) {
                        Object obj6 = ll5VarG.get(obj4);
                        obj6.getClass();
                        ll5VarG = ll5VarG.f(obj4, new ab4(obj3, ((ab4) obj6).b));
                    }
                    Object obj7 = obj3 != pz2Var ? km5Var.X : obj4;
                    if (obj4 != pz2Var) {
                        obj3 = km5Var.Y;
                    }
                    km5Var = new km5(obj7, obj3, ll5VarG);
                }
                km5 km5Var2 = km5Var;
                qm5 qm5VarC = lk5Var.c.c();
                qm5VarC.set(i, AppInfo.a((AppInfo) qm5VarC.get(i), 0));
                return lk5.a(lk5Var, null, null, qm5VarC.c(), km5Var2, null, false, 51);
            default:
                return Boolean.valueOf(((List) obj).addAll(i, (Collection) obj2));
        }
    }

    public /* synthetic */ wq0(Object obj, int i, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = i;
    }
}
