package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import su.happ.proxyutility.dto.AppInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kd implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ArrayList Y;

    public /* synthetic */ kd(ArrayList arrayList, byte b) {
        this.X = b;
        this.Y = arrayList;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ArrayList<pb3> arrayList = this.Y;
        switch (b) {
            case 0:
                do5 do5Var = (do5) obj;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    do5.h(do5Var, (eo5) arrayList.get(i), 0, 0);
                }
                return dn8Var;
            case 1:
                do5 do5Var2 = (do5) obj;
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    do5.h(do5Var2, (eo5) arrayList.get(i2), 0, 0);
                }
                return dn8Var;
            case 2:
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.println(p61.q(printWriter) + " control type:update-subscription count:" + arrayList.size());
                return dn8Var;
            case 3:
                lk5 lk5Var = (lk5) obj;
                lk5Var.getClass();
                km5 km5Var = lk5Var.d;
                ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AppInfo) ((pb3) it.next()).b).getPackageName());
                }
                km5 km5VarV = mb6.V(km5Var, arrayList2);
                qm5 qm5VarC = lk5Var.c.c();
                for (pb3 pb3Var : arrayList) {
                    qm5VarC.set(pb3Var.a, AppInfo.a((AppInfo) pb3Var.b, 1));
                }
                return lk5.a(lk5Var, null, null, qm5VarC.c(), km5VarV, null, false, 51);
            default:
                do5 do5Var3 = (do5) obj;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    do5.j(do5Var3, (eo5) arrayList.get(i3), 0, 0);
                }
                return dn8Var;
        }
    }
}
