package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cc5 extends ld2 {
    public static final cc5 d = new cc5(1, 0, 2);

    @Override // defpackage.ld2
    public final void d(xr0 xr0Var, rs rsVar, bc7 bc7Var, p91 p91Var, vc5 vc5Var) {
        int[] iArr;
        gp2 gp2Var;
        int iC;
        int iH = xr0Var.h(0);
        if (bc7Var.n != 0) {
            d01.a("Cannot move a group while inserting");
        }
        if (iH < 0) {
            d01.a("Parameter offset is out of bounds");
        }
        if (iH == 0) {
            return;
        }
        int i = bc7Var.t;
        int i2 = bc7Var.v;
        int i3 = bc7Var.u;
        int i4 = i;
        while (true) {
            iArr = bc7Var.b;
            if (iH <= 0) {
                break;
            }
            i4 += iArr[(bc7Var.q(i4) * 5) + 3];
            if (i4 > i3) {
                d01.a("Parameter offset is out of bounds");
            }
            iH--;
        }
        int i5 = iArr[(bc7Var.q(i4) * 5) + 3];
        int iF = bc7Var.f(bc7Var.b, bc7Var.q(bc7Var.t));
        int iF2 = bc7Var.f(bc7Var.b, bc7Var.q(i4));
        int i6 = i4 + i5;
        int iF3 = bc7Var.f(bc7Var.b, bc7Var.q(i6));
        int i7 = iF3 - iF2;
        bc7Var.w(i7, Math.max(bc7Var.t - 1, 0));
        bc7Var.v(i5);
        int[] iArr2 = bc7Var.b;
        int iQ = bc7Var.q(i6) * 5;
        eu.e0(bc7Var.q(i) * 5, iQ, (i5 * 5) + iQ, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = bc7Var.c;
            int iG = bc7Var.g(iF2 + i7);
            System.arraycopy(objArr, iG, objArr, iF, bc7Var.g(iF3 + i7) - iG);
        }
        int i8 = iF2 + i7;
        int i9 = i8 - iF;
        int i10 = bc7Var.k;
        int i11 = bc7Var.l;
        int length = bc7Var.c.length;
        int i12 = bc7Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iQ2 = bc7Var.q(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iQ2 * 5) + 4] = bc7.h(bc7.h(bc7Var.f(iArr2, iQ2) - i15, i12 < iQ2 ? 0 : i10, i11, length), bc7Var.k, bc7Var.l, bc7Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iO = bc7Var.o();
        int iB = ac7.b(bc7Var.d, i6, iO);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < bc7Var.d.size() && (iC = bc7Var.c((gp2Var = (gp2) bc7Var.d.get(iB)))) >= i6 && iC < i16) {
                arrayList.add(gp2Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            gp2 gp2Var2 = (gp2) arrayList.get(i18);
            int iC2 = bc7Var.c(gp2Var2) + i17;
            if (iC2 >= bc7Var.g) {
                gp2Var2.a = -(iO - iC2);
            } else {
                gp2Var2.a = iC2;
            }
            bc7Var.d.add(ac7.b(bc7Var.d, iC2, iO), gp2Var2);
        }
        if (bc7Var.H(i6, i5)) {
            d01.a("Unexpectedly removed anchors");
        }
        bc7Var.l(i2, bc7Var.u, i);
        if (i7 > 0) {
            bc7Var.I(i8, i7, i6 - 1);
        }
    }
}
