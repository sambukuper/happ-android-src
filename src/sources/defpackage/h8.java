package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h8 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ zy0 Y;

    public /* synthetic */ h8(zy0 zy0Var, byte b) {
        this.X = b;
        this.Y = zy0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, wp7, zr4] */
    /* JADX WARN: Type inference failed for: r3v1, types: [d02] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r6v0, types: [rn2, zy0] */
    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        ?? arrayList;
        Integer numValueOf;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ?? r6 = this.Y;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                n8.b(r6, (lp2) obj, w79.P(439));
                return dn8Var;
            case 1:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lr4.b(null, null, null, this.Y, lp2Var, 0);
                } else {
                    lp2Var.Q();
                }
                return dn8Var;
            case 2:
                ((Integer) obj2).getClass();
                i21.a(r6, (lp2) obj, w79.P(7));
                return dn8Var;
            case 3:
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r6.K(lp2Var2, 0);
                } else {
                    lp2Var2.Q();
                }
                return dn8Var;
            case 4:
                lp2 lp2Var3 = (lp2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    r6.K(lp2Var3, 0);
                } else {
                    lp2Var3.Q();
                }
                return dn8Var;
            case 5:
                lp2 lp2Var4 = (lp2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    r6.K(lp2Var4, 0);
                } else {
                    lp2Var4.Q();
                }
                return dn8Var;
            case 6:
                lp2 lp2Var5 = (lp2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (lp2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    r6.K(lp2Var5, 0);
                } else {
                    lp2Var5.Q();
                }
                return dn8Var;
            case 7:
                zy0 zy0Var = u70.b;
                ?? r14 = (wp7) obj;
                q31 q31Var = (q31) obj2;
                r14.getClass();
                List listX = r14.x(r6, cc7.a);
                ArrayList arrayList2 = new ArrayList(xv0.Z(listX, 10));
                Iterator it = listX.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((tr4) it.next()).o(q31Var.a));
                }
                int size = arrayList2.size();
                if (size > 1) {
                    int i = size - 1;
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(((tr4) r14.x(zy0Var, new dc7(i2)).get(0)).o(q31Var.a));
                    }
                } else {
                    arrayList = d02.X;
                }
                Iterator it2 = arrayList2.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    i3 += ((eo5) it2.next()).Y;
                }
                Iterator it3 = arrayList.iterator();
                int i4 = 0;
                while (it3.hasNext()) {
                    i4 += ((eo5) it3.next()).Y;
                }
                int i5 = i3 + i4;
                Iterator it4 = arrayList2.iterator();
                Integer numValueOf2 = null;
                if (it4.hasNext()) {
                    numValueOf = Integer.valueOf(((eo5) it4.next()).X);
                    while (it4.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(((eo5) it4.next()).X);
                        if (numValueOf.compareTo(numValueOf3) < 0) {
                            numValueOf = numValueOf3;
                        }
                    }
                } else {
                    numValueOf = null;
                }
                int iIntValue6 = numValueOf != null ? numValueOf.intValue() : 0;
                Iterator it5 = arrayList.iterator();
                if (it5.hasNext()) {
                    numValueOf2 = Integer.valueOf(((eo5) it5.next()).X);
                    while (it5.hasNext()) {
                        Integer numValueOf4 = Integer.valueOf(((eo5) it5.next()).X);
                        if (numValueOf2.compareTo(numValueOf4) < 0) {
                            numValueOf2 = numValueOf4;
                        }
                    }
                }
                int iMax = Math.max(iIntValue6, Math.max(numValueOf2 != null ? numValueOf2.intValue() : 0, q31.j(q31Var.a)));
                int iH = q31.h(q31Var.a);
                if (iMax > iH) {
                    iMax = iH;
                }
                return r14.g0(iMax, i5, e02.X, new ux2(0 == true ? 1 : 0, size, arrayList2, arrayList));
            case 8:
                ((Integer) obj2).getClass();
                w79.b(r6, (lp2) obj, w79.P(7));
                return dn8Var;
            default:
                ((Integer) obj2).getClass();
                m87.a(r6, (lp2) obj, w79.P(55));
                return dn8Var;
        }
    }

    public /* synthetic */ h8(zy0 zy0Var, int i, byte b) {
        this.X = b;
        this.Y = zy0Var;
    }
}
