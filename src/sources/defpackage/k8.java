package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k8 implements gn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ k8(zi1 zi1Var, mf3 mf3Var, f05 f05Var, int i) {
        this.Z = zi1Var;
        this.f0 = mf3Var;
        this.g0 = f05Var;
        this.Y = i;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        z24 z24Var = z24.X;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.g0;
        int i = this.Y;
        Object obj3 = this.f0;
        Object obj4 = this.Z;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj4;
                zr4 zr4Var = (zr4) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                do5 do5Var = (do5) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    List list = (List) arrayList.get(i2);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i3 = 0;
                    while (i3 < size2) {
                        iArr[i3] = ((eo5) list.get(i3)).X + (i3 < list.size() + (-1) ? zr4Var.x0(8.0f) : 0);
                        i3++;
                    }
                    int[] iArr2 = new int[size2];
                    if (zr4Var.getLayoutDirection() == z24Var) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < size2; i5++) {
                            i4 += iArr[i5];
                        }
                        int i6 = i - i4;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < size2) {
                            int i9 = iArr[i7];
                            iArr2[i8] = i6;
                            i6 += i9;
                            i7++;
                            i8++;
                        }
                    } else {
                        int i10 = 0;
                        for (int i11 = size2 - 1; -1 < i11; i11--) {
                            int i12 = iArr[i11];
                            iArr2[i11] = i10;
                            i10 += i12;
                        }
                    }
                    int size3 = list.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        do5.f(do5Var, (eo5) list.get(i13), iArr2[i13], ((Number) arrayList2.get(i2)).intValue());
                    }
                }
                return dn8Var;
            case 1:
                mf3 mf3Var = (mf3) obj3;
                f05 f05Var = (f05) obj2;
                if (obj == ((zi1) obj4)) {
                    bt.i("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof yh7) {
                    int i14 = mf3Var.a - i;
                    int iD = f05Var.d(obj);
                    f05Var.g(Math.min(i14, iD >= 0 ? f05Var.c[iD] : Integer.MAX_VALUE), obj);
                }
                return dn8Var;
            default:
                eo5[] eo5VarArr = (eo5[]) obj4;
                wq6 wq6Var = (wq6) obj3;
                int[] iArr3 = (int[]) obj2;
                do5 do5Var2 = (do5) obj;
                int length = eo5VarArr.length;
                int i15 = 0;
                int i16 = 0;
                while (i15 < length) {
                    eo5 eo5Var = eo5VarArr[i15];
                    int i17 = i16 + 1;
                    eo5Var.getClass();
                    Object objW = eo5Var.w();
                    uq6 uq6Var = objW instanceof uq6 ? (uq6) objW : null;
                    p71 p71Var = uq6Var != null ? uq6Var.c : null;
                    do5.f(do5Var2, eo5Var, iArr3[i16], p71Var != null ? p71Var.a.a(eo5Var.Y, i, z24Var) : wq6Var.b.a(eo5Var.Y, i));
                    i15++;
                    i16 = i17;
                }
                return dn8Var;
        }
    }

    public /* synthetic */ k8(ArrayList arrayList, zr4 zr4Var, int i, ArrayList arrayList2) {
        this.Z = arrayList;
        this.g0 = zr4Var;
        this.Y = i;
        this.f0 = arrayList2;
    }

    public /* synthetic */ k8(eo5[] eo5VarArr, wq6 wq6Var, int i, int[] iArr) {
        this.Z = eo5VarArr;
        this.f0 = wq6Var;
        this.Y = i;
        this.g0 = iArr;
    }
}
