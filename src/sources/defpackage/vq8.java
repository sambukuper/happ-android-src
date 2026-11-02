package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vq8 extends uy7 implements gn2 {
    public boolean g0;
    public final /* synthetic */ LinkedHashSet h0;
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ wq8 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq8(LinkedHashSet linkedHashSet, boolean z, wq8 wq8Var, q51 q51Var) {
        super(1, q51Var);
        this.h0 = linkedHashSet;
        this.i0 = z;
        this.j0 = wq8Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        return ((vq8) m((q51) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        return new vq8(this.h0, this.i0, this.j0, q51Var);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        String str;
        wq8 wq8Var = this.j0;
        LinkedHashMap linkedHashMap = wq8Var.k;
        boolean z = this.g0;
        boolean z2 = true;
        if (z) {
            if (z) {
                w39.n0(obj);
                return obj;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        String str2 = "CXCP";
        hi5.i0("CXCP");
        h57 h57Var = new h57(this.h0, this.i0);
        f57 f57Var = ((e57) h57Var.e.getValue()).c() ? (f57) h57Var.f.getValue() : null;
        if (f57Var == null) {
            hi5.i0("CXCP");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashSet hashSet = new HashSet();
            k05 k05VarJ = k05.j();
            ArrayList arrayList = new ArrayList();
            a15 a15VarA = a15.a();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList(linkedHashSet);
            ArrayList arrayList6 = new ArrayList(arrayList2);
            ArrayList arrayList7 = new ArrayList(arrayList3);
            ArrayList arrayList8 = new ArrayList(arrayList4);
            ArrayList arrayList9 = new ArrayList(hashSet);
            qd5 qd5VarC = qd5.c(k05VarJ);
            ArrayList arrayList10 = new ArrayList(arrayList);
            d18 d18Var = d18.b;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = a15VarA.a;
            for (String str3 : arrayMap2.keySet()) {
                arrayMap.put(str3, arrayMap2.get(str3));
                str2 = str2;
            }
            str = str2;
            z2 = true;
            f57Var = new f57(arrayList5, arrayList6, arrayList7, arrayList8, new ym0(arrayList9, qd5VarC, 1, arrayList10, new d18(arrayMap)), null, null, 0, null);
        } else {
            str = "CXCP";
        }
        ym0 ym0Var = f57Var.g;
        hi5.i0(str);
        ux0 ux0Var = wq8.l;
        ob obVar = wq8Var.e.e;
        fg0 fg0Var = new fg0((byte) 0);
        if (!ym0Var.a().equals(iz.h)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            key.getClass();
            fg0Var.Y.o(w45.B(key), ym0Var.a());
        }
        fg0Var.c(ym0Var.b);
        d18 d18Var2 = ym0Var.e;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayMap arrayMap3 = d18Var2.a;
        Set<String> setKeySet = arrayMap3.keySet();
        setKeySet.getClass();
        for (String str4 : setKeySet) {
            Object obj2 = arrayMap3.get(str4);
            obj2.getClass();
            linkedHashMap2.put(str4, obj2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        obVar.getClass();
        List list = ym0Var.d;
        list.getClass();
        wg0 wg0Var = new wg0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wg0Var.a((xg0) it.next(), obVar);
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(aq4.G(1));
        eu.I0(new me6[]{wg0Var}, linkedHashSet2);
        linkedHashMap.put(pq8.X, new sq8(fg0Var, linkedHashMap3, linkedHashSet2, new we6(ym0Var.c)));
        jr8 jr8Var = wq8Var.c;
        List listUnmodifiableList = Collections.unmodifiableList(ym0Var.a);
        listUnmodifiableList.getClass();
        LinkedHashSet linkedHashSetB = jr8Var.b(listUnmodifiableList);
        hi5.i0(str);
        sq8 sq8VarJ = wq8.j(linkedHashMap);
        this.g0 = z2;
        Object objM = wq8Var.m(sq8VarJ, linkedHashSetB, this);
        c71 c71Var = c71.X;
        return objM == c71Var ? c71Var : objM;
    }
}
