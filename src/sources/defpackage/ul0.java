package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.ArrayMap;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ul0 implements hr8 {
    public final wp1 b;

    public ul0(Context context) {
        context.getClass();
        this.b = wp1.g.i(context);
        if ((context instanceof Application) && hi5.k0()) {
            context.toString();
        }
        hi5.i0("CXCP");
    }

    @Override // defpackage.hr8
    public final l11 a(gr8 gr8Var, int i) {
        int i2;
        int i3;
        gr8Var.getClass();
        if (hi5.i0("CXCP")) {
            gr8Var.toString();
        }
        k05 k05VarJ = k05.j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        k05 k05VarJ2 = k05.j();
        ArrayList arrayList = new ArrayList();
        a15 a15VarA = a15.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = gr8Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            i2 = 1;
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4 && iOrdinal != 5) {
                b61.c();
                return null;
            }
            i2 = 1;
        } else {
            i2 = um1.a().b(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
        }
        zx zxVar = er8.L;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        qd5 qd5VarC = qd5.c(k05VarJ2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        d18 d18Var = d18.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a15VarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        k05VarJ.o(zxVar, new f57(arrayList5, arrayList6, arrayList7, arrayList8, new ym0(arrayList9, qd5VarC, i2, arrayList10, new d18(arrayMap)), null, null, 0, null));
        HashSet hashSet2 = new HashSet();
        k05 k05VarJ3 = k05.j();
        ArrayList arrayList11 = new ArrayList();
        ArrayMap arrayMap3 = a15.a().a;
        int iOrdinal2 = gr8Var.ordinal();
        if (iOrdinal2 == 0) {
            i3 = i == 2 ? 5 : 2;
        } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
            i3 = 1;
        } else if (iOrdinal2 != 3) {
            if (iOrdinal2 != 4 && iOrdinal2 != 5) {
                b61.c();
                return null;
            }
            i3 = 1;
        } else {
            i3 = um1.a().b(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
        }
        zx zxVar2 = er8.M;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        qd5 qd5VarC2 = qd5.c(k05VarJ3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        d18 d18Var2 = d18.b;
        ArrayMap arrayMap4 = new ArrayMap();
        for (String str2 : arrayMap3.keySet()) {
            arrayMap4.put(str2, arrayMap3.get(str2));
        }
        k05VarJ.o(zxVar2, new ym0(arrayList12, qd5VarC2, i3, arrayList13, new d18(arrayMap4)));
        k05VarJ.o(er8.O, gr8Var == gr8.X ? sl0.b : ql0.a);
        k05VarJ.o(er8.N, rl0.a);
        gr8 gr8Var2 = gr8.Y;
        wp1 wp1Var = this.b;
        if (gr8Var == gr8Var2) {
            k05VarJ.o(i63.y, wp1Var.c());
        }
        zx zxVar3 = i63.t;
        be beVar = wp1.g;
        k05VarJ.o(zxVar3, Integer.valueOf(wp1Var.b(true).getRotation()));
        return qd5.c(k05VarJ);
    }
}
