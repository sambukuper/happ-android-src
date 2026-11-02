package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ux2 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ ux2(byte b, int i, Object obj, Object obj2) {
        this.X = b;
        this.Z = obj;
        this.Y = i;
        this.f0 = obj2;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        l01 l01Var;
        long[] jArr;
        boolean z;
        l01 l01Var2;
        long[] jArr2;
        boolean z2;
        int i;
        byte b = this.X;
        boolean z3 = true;
        int i2 = 0;
        Object obj2 = this.f0;
        int i3 = this.Y;
        Object obj3 = this.Z;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                List list = (List) obj2;
                do5 do5Var = (do5) obj;
                do5Var.getClass();
                int i4 = 0;
                int i5 = 0;
                for (Object obj4 : (ArrayList) obj3) {
                    int i6 = i4 + 1;
                    if (i4 < 0) {
                        i21.X();
                        throw null;
                    }
                    eo5 eo5Var = (eo5) obj4;
                    do5.h(do5Var, eo5Var, 0, i5);
                    i5 += eo5Var.Y;
                    if (i4 < i3 - 1) {
                        eo5 eo5Var2 = (eo5) list.get(i4);
                        do5.h(do5Var, eo5Var2, 0, i5);
                        i5 += eo5Var2.Y;
                    }
                    i4 = i6;
                }
                return dn8Var;
            case 1:
                pr prVar = (pr) obj2;
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.getClass();
                printWriter.println("=========================");
                SubscriptionItem subscriptionItem = (SubscriptionItem) ((ea6) obj3).X;
                printWriter.println("*** Subscription " + (subscriptionItem != null ? subscriptionItem.getRemarks() : null) + " with " + i3 + " servers: ***");
                printWriter.println(new Date() + " Server response: " + prVar.c + " " + prVar.a.length() + " symbols");
                return dn8Var;
            case 2:
                j86 j86Var = (j86) obj3;
                f05 f05Var = (f05) obj2;
                l01 l01Var3 = (l01) obj;
                if (j86Var.e == i3 && dh3.f(f05Var, j86Var.f) && (l01Var3 instanceof r01)) {
                    long[] jArr3 = f05Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr3[i7];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = i2;
                                while (i10 < i9) {
                                    if ((255 & j) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        z2 = z3;
                                        Object obj5 = f05Var.b[i11];
                                        boolean z4 = f05Var.c[i11] != i3 ? z2 : false;
                                        if (z4) {
                                            i = i8;
                                            r01 r01Var = (r01) l01Var3;
                                            l01Var2 = l01Var3;
                                            s05 s05Var = r01Var.i0;
                                            w39.i0(s05Var, obj5, j86Var);
                                            jArr2 = jArr3;
                                            if (obj5 instanceof zi1) {
                                                zi1 zi1Var = (zi1) obj5;
                                                if (!s05Var.c(zi1Var)) {
                                                    w39.j0(r01Var.l0, zi1Var);
                                                }
                                                s05 s05Var2 = j86Var.g;
                                                if (s05Var2 != null) {
                                                    s05Var2.j(obj5);
                                                }
                                            }
                                        } else {
                                            l01Var2 = l01Var3;
                                            jArr2 = jArr3;
                                            i = i8;
                                        }
                                        if (z4) {
                                            f05Var.f(i11);
                                        }
                                    } else {
                                        l01Var2 = l01Var3;
                                        jArr2 = jArr3;
                                        z2 = z3;
                                        i = i8;
                                    }
                                    j >>= i;
                                    i10++;
                                    i8 = i;
                                    l01Var3 = l01Var2;
                                    z3 = z2;
                                    jArr3 = jArr2;
                                }
                                l01Var = l01Var3;
                                jArr = jArr3;
                                z = z3;
                                if (i9 == i8) {
                                }
                            } else {
                                l01Var = l01Var3;
                                jArr = jArr3;
                                z = z3;
                            }
                            if (i7 != length) {
                                i7++;
                                l01Var3 = l01Var;
                                z3 = z;
                                jArr3 = jArr;
                                i2 = 0;
                            }
                        }
                    }
                }
                return dn8Var;
            default:
                vx6 vx6Var = (vx6) obj3;
                eo5 eo5Var3 = (eo5) obj2;
                do5 do5Var2 = (do5) obj;
                int iL = vx6Var.q0.X.l();
                if (iL < 0) {
                    iL = 0;
                }
                if (iL <= i3) {
                    i3 = iL;
                }
                int i12 = -i3;
                boolean z5 = vx6Var.r0;
                int i13 = z5 ? 0 : i12;
                if (!z5) {
                    i12 = 0;
                }
                do5Var2.X = true;
                do5.j(do5Var2, eo5Var3, i13, i12);
                do5Var2.X = false;
                return dn8Var;
        }
    }
}
