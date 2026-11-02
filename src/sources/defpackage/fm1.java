package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fm1 {
    public static final /* synthetic */ nw3[] j = {new lx5(fm1.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new lx5(fm1.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final pe4 d;
    public final pe4 e;
    public final vt1 f;
    public final te4 g;
    public final te4 h;
    public final /* synthetic */ gm1 i;

    public fm1(gm1 gm1Var, List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.i = gm1Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            v15 v15VarS = u70.S((w15) gm1Var.b.Y, ((vy5) ((d2) obj)).h0);
            Object arrayList = linkedHashMap.get(v15VarS);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(v15VarS, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = a(linkedHashMap);
        gm1 gm1Var2 = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            v15 v15VarS2 = u70.S((w15) gm1Var2.b.Y, ((cz5) ((d2) obj2)).h0);
            Object arrayList2 = linkedHashMap2.get(v15VarS2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(v15VarS2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.b = a(linkedHashMap2);
        ((hl1) this.i.b.X).c.getClass();
        gm1 gm1Var3 = this.i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            v15 v15VarS3 = u70.S((w15) gm1Var3.b.Y, ((pz5) ((d2) obj3)).g0);
            Object arrayList3 = linkedHashMap3.get(v15VarS3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(v15VarS3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.c = a(linkedHashMap3);
        byte b = 0;
        this.d = ((hl1) this.i.b.X).a.b(new cm1(this, b));
        byte b2 = 1;
        this.e = ((hl1) this.i.b.X).a.b(new cm1(this, b2));
        this.f = ((hl1) this.i.b.X).a.c(new cm1(this, (byte) 2));
        gm1 gm1Var4 = this.i;
        ve4 ve4Var = ((hl1) gm1Var4.b.X).a;
        dm1 dm1Var = new dm1(this, gm1Var4, b);
        ve4Var.getClass();
        this.g = new te4(ve4Var, dm1Var);
        gm1 gm1Var5 = this.i;
        ve4 ve4Var2 = ((hl1) gm1Var5.b.X).a;
        dm1 dm1Var2 = new dm1(this, gm1Var5, b2);
        ve4Var2.getClass();
        this.h = new te4(ve4Var2, dm1Var2);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(aq4.G(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<d2> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(xv0.Z(iterable, 10));
            for (d2 d2Var : iterable) {
                int iB = d2Var.b();
                int iP = nv0.p(iB) + iB;
                if (iP > 4096) {
                    iP = 4096;
                }
                nv0 nv0VarG = nv0.G(byteArrayOutputStream, iP);
                nv0VarG.e0(iB);
                d2Var.f(nv0VarG);
                nv0VarG.R();
                arrayList.add(dn8.a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
