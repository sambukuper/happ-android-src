package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f57 {
    public static final List j = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final fz b;
    public final List c;
    public final List d;
    public final List e;
    public final d57 f;
    public final ym0 g;
    public final int h;
    public final InputConfiguration i;

    public f57(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ym0 ym0Var, d57 d57Var, InputConfiguration inputConfiguration, int i, fz fzVar) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = d57Var;
        this.g = ym0Var;
        this.i = inputConfiguration;
        this.h = i;
        this.b = fzVar;
    }

    public static f57 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        k05 k05VarJ = k05.j();
        ArrayList arrayList5 = new ArrayList();
        a15 a15VarA = a15.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        qd5 qd5VarC = qd5.c(k05VarJ);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        d18 d18Var = d18.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a15VarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new f57(arrayList, arrayList2, arrayList3, arrayList4, new ym0(arrayList6, qd5VarC, -1, arrayList7, new d18(arrayMap)), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (fz fzVar : this.a) {
            arrayList.add(fzVar.a);
            Iterator it = fzVar.b.iterator();
            while (it.hasNext()) {
                arrayList.add((wg1) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
