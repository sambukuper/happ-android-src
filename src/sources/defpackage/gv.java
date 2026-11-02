package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gv implements Runnable {
    public final /* synthetic */ List X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ iv f0;

    public gv(iv ivVar, List list, List list2, int i) {
        this.f0 = ivVar;
        this.X = list;
        this.Y = list2;
        this.Z = i;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x012a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        to1 to1Var;
        int i2;
        so1 so1Var;
        po1 po1Var;
        int i3;
        to1 to1Var2;
        to1 to1Var3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        yr2 yr2Var = new yr2((Object) this, (byte) 6);
        int size = this.X.size();
        int size2 = this.Y.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        so1 so1Var2 = new so1();
        int i18 = 0;
        so1Var2.a = 0;
        so1Var2.b = size;
        so1Var2.c = 0;
        so1Var2.d = size2;
        arrayList2.add(so1Var2);
        int i19 = size + size2;
        int i20 = 1;
        int i21 = (((i19 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i21];
        int i22 = i21 / 2;
        int[] iArr2 = new int[i21];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            so1 so1Var3 = (so1) arrayList2.remove(arrayList2.size() - i20);
            if (so1Var3.b() >= i20 && so1Var3.a() >= i20) {
                int iA = ((so1Var3.a() + so1Var3.b()) + i20) / 2;
                int i23 = i20 + i22;
                iArr[i23] = so1Var3.a;
                iArr2[i23] = so1Var3.b;
                int i24 = i18;
                while (true) {
                    if (i24 >= iA) {
                        i = i22;
                        to1Var = null;
                        break;
                    }
                    int i25 = Math.abs(so1Var3.b() - so1Var3.a()) % 2 == i20 ? i20 : i18;
                    int iB = so1Var3.b() - so1Var3.a();
                    int i26 = -i24;
                    int i27 = i26;
                    while (true) {
                        if (i27 > i24) {
                            i = i22;
                            i3 = iA;
                            to1Var2 = null;
                            break;
                        }
                        if (i27 != i26) {
                            if (i27 != i24) {
                                i8 = i27;
                                if (iArr[i27 + 1 + i22] > iArr[(i27 - 1) + i22]) {
                                }
                                i = i22;
                                i11 = ((i10 - so1Var3.a) + so1Var3.c) - i8;
                                if (i24 == 0 && i10 == i9) {
                                    i12 = i11 - 1;
                                } else {
                                    i12 = i11;
                                }
                                int i28 = iA;
                                i13 = i11;
                                i14 = i10;
                                i3 = i28;
                                i15 = i25;
                                while (i14 < so1Var3.b && i13 < so1Var3.d && yr2Var.g(i14, i13)) {
                                    i14++;
                                    i13++;
                                }
                                iArr[i8 + i] = i14;
                                if (i15 != 0) {
                                    i17 = iB - i8;
                                    i16 = iB;
                                    if (i17 < i26 + 1 && i17 <= i24 - 1 && iArr2[i17 + i] <= i14) {
                                        to1Var2 = new to1();
                                        to1Var2.a = i9;
                                        to1Var2.b = i12;
                                        to1Var2.c = i14;
                                        to1Var2.d = i13;
                                        to1Var2.e = false;
                                        break;
                                    }
                                } else {
                                    i16 = iB;
                                }
                                i27 = i8 + 2;
                                i22 = i;
                                iA = i3;
                                i25 = i15;
                                iB = i16;
                            } else {
                                i8 = i27;
                            }
                            i9 = iArr[(i8 - 1) + i22];
                            i10 = i9 + 1;
                            i = i22;
                            i11 = ((i10 - so1Var3.a) + so1Var3.c) - i8;
                            if (i24 == 0) {
                                i12 = i11;
                            } else {
                                i12 = i11;
                            }
                            int i29 = iA;
                            i13 = i11;
                            i14 = i10;
                            i3 = i29;
                            i15 = i25;
                            while (i14 < so1Var3.b) {
                                i14++;
                                i13++;
                            }
                            iArr[i8 + i] = i14;
                            if (i15 != 0) {
                                i17 = iB - i8;
                                i16 = iB;
                                if (i17 < i26 + 1) {
                                    continue;
                                }
                            } else {
                                i16 = iB;
                            }
                            i27 = i8 + 2;
                            i22 = i;
                            iA = i3;
                            i25 = i15;
                            iB = i16;
                        } else {
                            i8 = i27;
                        }
                        i9 = iArr[i8 + 1 + i22];
                        i10 = i9;
                        i = i22;
                        i11 = ((i10 - so1Var3.a) + so1Var3.c) - i8;
                        if (i24 == 0) {
                            i12 = i11;
                        } else {
                            i12 = i11;
                        }
                        int i210 = iA;
                        i13 = i11;
                        i14 = i10;
                        i3 = i210;
                        i15 = i25;
                        while (i14 < so1Var3.b) {
                            i14++;
                            i13++;
                        }
                        iArr[i8 + i] = i14;
                        if (i15 != 0) {
                            i17 = iB - i8;
                            i16 = iB;
                            if (i17 < i26 + 1) {
                                continue;
                            }
                        } else {
                            i16 = iB;
                        }
                        i27 = i8 + 2;
                        i22 = i;
                        iA = i3;
                        i25 = i15;
                        iB = i16;
                    }
                    if (to1Var2 != null) {
                        to1Var = to1Var2;
                        break;
                    }
                    boolean z = (so1Var3.b() - so1Var3.a()) % 2 == 0;
                    int iB2 = so1Var3.b() - so1Var3.a();
                    int i30 = i26;
                    while (true) {
                        if (i30 > i24) {
                            to1Var3 = null;
                            break;
                        }
                        if (i30 == i26 || (i30 != i24 && iArr2[i30 + 1 + i] < iArr2[(i30 - 1) + i])) {
                            i4 = iArr2[i30 + 1 + i];
                            i5 = i4;
                        } else {
                            i4 = iArr2[(i30 - 1) + i];
                            i5 = i4 - 1;
                        }
                        boolean z2 = z;
                        int i31 = so1Var3.d - ((so1Var3.b - i5) - i30);
                        int i32 = (i24 == 0 || i5 != i4) ? i31 : i31 + 1;
                        int i33 = iB2;
                        while (true) {
                            if (i5 > so1Var3.a && i31 > so1Var3.c) {
                                i6 = i30;
                                if (!yr2Var.g(i5 - 1, i31 - 1)) {
                                    break;
                                }
                                i5--;
                                i31--;
                                i30 = i6;
                            } else {
                                i6 = i30;
                                break;
                            }
                        }
                        iArr2[i6 + i] = i5;
                        if (z2 && (i7 = i33 - i6) >= i26 && i7 <= i24 && iArr[i7 + i] >= i5) {
                            to1Var3 = new to1();
                            to1Var3.a = i5;
                            to1Var3.b = i31;
                            to1Var3.c = i4;
                            to1Var3.d = i32;
                            to1Var3.e = true;
                            break;
                        }
                        i30 = i6 + 2;
                        z = z2;
                        iB2 = i33;
                    }
                    if (to1Var3 != null) {
                        to1Var = to1Var3;
                        break;
                    }
                    i24++;
                    i22 = i;
                    iA = i3;
                    i20 = 1;
                    i18 = 0;
                }
            } else {
                i = i22;
                to1Var = null;
                break;
            }
            if (to1Var != null) {
                if (to1Var.a() > 0) {
                    int i34 = to1Var.d;
                    int i35 = to1Var.b;
                    int i36 = i34 - i35;
                    int i37 = to1Var.c;
                    int i38 = to1Var.a;
                    int i39 = i37 - i38;
                    if (i36 == i39) {
                        po1Var = new po1(i38, i35, i39);
                    } else if (to1Var.e) {
                        po1Var = new po1(i38, i35, to1Var.a());
                    } else {
                        po1Var = i36 > i39 ? new po1(i38, i35 + 1, to1Var.a()) : new po1(i38 + 1, i35, to1Var.a());
                    }
                    arrayList.add(po1Var);
                }
                if (arrayList3.isEmpty()) {
                    so1Var = new so1();
                    i2 = 1;
                } else {
                    i2 = 1;
                    so1Var = (so1) arrayList3.remove(arrayList3.size() - 1);
                }
                so1Var.a = so1Var3.a;
                so1Var.c = so1Var3.c;
                so1Var.b = to1Var.a;
                so1Var.d = to1Var.b;
                arrayList2.add(so1Var);
                so1Var3.b = so1Var3.b;
                so1Var3.d = so1Var3.d;
                so1Var3.a = to1Var.c;
                so1Var3.c = to1Var.d;
                arrayList2.add(so1Var3);
            } else {
                i2 = 1;
                arrayList3.add(so1Var3);
            }
            i20 = i2;
            i22 = i;
            i18 = 0;
        }
        Collections.sort(arrayList, ci8.b);
        this.f0.c.execute(new zo2((byte) 5, this, new qo1(yr2Var, arrayList, iArr, iArr2), false));
    }
}
