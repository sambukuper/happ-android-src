package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ld implements xr4 {
    public static final ld b = new ld(0);
    public static final ld c = new ld(1);
    public static final ld d = new ld(2);
    public static final ld e = new ld(3);
    public static final ld f = new ld(4);
    public static final h80 g = new h80((byte) 20);
    public static final ld h = new ld(5);
    public static final ld i = new ld(6);
    public final /* synthetic */ byte a;

    public /* synthetic */ ld(byte b2) {
        this.a = b2;
    }

    public static final void a(ArrayList arrayList, ca6 ca6Var, zr4 zr4Var, ArrayList arrayList2, ArrayList arrayList3, ca6 ca6Var2, ArrayList arrayList4, ca6 ca6Var3, ca6 ca6Var4) {
        if (!arrayList.isEmpty()) {
            ca6Var.X = zr4Var.x0(12.0f) + ca6Var.X;
        }
        arrayList.add(0, wv0.Y0(arrayList2));
        arrayList3.add(Integer.valueOf(ca6Var2.X));
        arrayList4.add(Integer.valueOf(ca6Var.X));
        ca6Var.X += ca6Var2.X;
        ca6Var3.X = Math.max(ca6Var3.X, ca6Var4.X);
        arrayList2.clear();
        ca6Var4.X = 0;
        ca6Var2.X = 0;
    }

    @Override // defpackage.xr4
    public final yr4 c(zr4 zr4Var, List list, long j) {
        ArrayList arrayList;
        byte b2 = this.a;
        e02 e02Var = e02.X;
        switch (b2) {
            case 0:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    eo5 eo5VarO = ((tr4) list.get(i3)).o(j);
                    iJ = Math.max(iJ, eo5VarO.X);
                    i2 = Math.max(i2, eo5VarO.Y);
                    arrayList2.add(eo5VarO);
                }
                if (list.isEmpty()) {
                    iJ = q31.j(j);
                    i2 = q31.i(j);
                }
                return zr4Var.g0(iJ, i2, e02Var, new kd(arrayList2, (byte) 0));
            case 1:
                int iMax = 0;
                int size2 = list.size();
                if (size2 == 0) {
                    return zr4Var.g0(0, 0, e02Var, ag.Y);
                }
                if (size2 == 1) {
                    eo5 eo5VarO2 = ((tr4) list.get(0)).o(j);
                    return zr4Var.g0(eo5VarO2.X, eo5VarO2.Y, e02Var, new f0(eo5VarO2, (byte) 5));
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax2 = 0;
                for (int i4 = 0; i4 < size3; i4++) {
                    eo5 eo5VarO3 = ((tr4) list.get(i4)).o(j);
                    iMax = Math.max(iMax, eo5VarO3.X);
                    iMax2 = Math.max(iMax2, eo5VarO3.Y);
                    arrayList3.add(eo5VarO3);
                }
                return zr4Var.g0(iMax, iMax2, e02Var, new f0(arrayList3, (byte) 6));
            case 2:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    arrayList4.add(((tr4) list.get(i5)).o(j));
                }
                return zr4Var.g0(q31.h(j), q31.g(j), e02Var, new kd(arrayList4, (byte) 1));
            case 3:
                return zr4Var.g0(q31.j(j), q31.i(j), e02Var, new y2((byte) 29));
            case 4:
                return zr4Var.g0(q31.h(j), q31.g(j), e02Var, g);
            case 5:
                return zr4Var.g0(q31.f(j) ? q31.h(j) : 0, q31.e(j) ? q31.g(j) : 0, e02Var, new zx6((byte) 9));
            case 6:
                return zr4Var.g0(q31.j(j), q31.i(j), e02Var, new b58((byte) 22));
            default:
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ca6 ca6Var = new ca6();
                ca6 ca6Var2 = new ca6();
                ArrayList arrayList8 = new ArrayList();
                ca6 ca6Var3 = new ca6();
                int i6 = 0;
                ca6 ca6Var4 = new ca6();
                int size5 = list.size();
                while (i6 < size5) {
                    eo5 eo5VarO4 = ((tr4) list.get(i6)).o(j);
                    int i7 = i6;
                    if (!arrayList8.isEmpty()) {
                        ArrayList arrayList9 = arrayList5;
                        if (zr4Var.x0(8.0f) + ca6Var3.X + eo5VarO4.X <= q31.h(j)) {
                            arrayList5 = arrayList9;
                        } else {
                            arrayList5 = arrayList9;
                            a(arrayList5, ca6Var2, zr4Var, arrayList8, arrayList6, ca6Var4, arrayList7, ca6Var, ca6Var3);
                        }
                    }
                    if (!arrayList8.isEmpty()) {
                        ca6Var3.X = zr4Var.x0(8.0f) + ca6Var3.X;
                    }
                    arrayList8.add(eo5VarO4);
                    ca6Var3.X += eo5VarO4.X;
                    ca6Var4.X = Math.max(ca6Var4.X, eo5VarO4.Y);
                    i6 = i7 + 1;
                    arrayList5 = arrayList5;
                }
                ArrayList arrayList10 = arrayList5;
                if (arrayList8.isEmpty()) {
                    arrayList = arrayList10;
                } else {
                    arrayList = arrayList10;
                    a(arrayList, ca6Var2, zr4Var, arrayList8, arrayList6, ca6Var4, arrayList7, ca6Var, ca6Var3);
                }
                int iMax3 = Math.max(ca6Var.X, q31.j(j));
                return zr4Var.g0(iMax3, Math.max(ca6Var2.X, q31.i(j)), e02Var, new k8(arrayList, zr4Var, iMax3, arrayList7));
        }
    }
}
