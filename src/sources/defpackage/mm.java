package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mm extends e0 {
    public static List m(s21 s21Var) {
        if (!(s21Var instanceof du)) {
            return s21Var instanceof x22 ? i21.K(((x22) s21Var).c.c()) : d02.X;
        }
        Iterable iterable = (Iterable) ((du) s21Var).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bw0.d0(arrayList, m((s21) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.e0
    public final Iterable a(Object obj, boolean z) {
        gm gmVar = (gm) obj;
        gmVar.getClass();
        Map mapE = gmVar.e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapE.entrySet()) {
            bw0.d0(arrayList, (!z || dh3.f((v15) entry.getKey(), ks3.b)) ? m((s21) entry.getValue()) : d02.X);
        }
        return arrayList;
    }
}
