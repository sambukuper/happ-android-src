package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d64 {
    public final s05 a;
    public ne b;
    public int c;
    public final t05 d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public aq1 j;

    public d64() {
        long[] jArr = uw6.a;
        this.a = new s05();
        t05 t05Var = vw6.a;
        this.d = new t05();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public static void b(f74 f74Var, int i, b64 b64Var) {
        int i2 = 0;
        long jB = f74Var.b(0);
        int i3 = true & true ? (int) (jB >> 32) : 0;
        if ((1 & 2) != 0) {
            i = (int) (jB & 4294967295L);
        }
        long j = (((long) i3) << 32) | (((long) i) & 4294967295L);
        z54[] z54VarArr = b64Var.a;
        int length = z54VarArr.length;
        int i4 = 0;
        while (i2 < length) {
            z54 z54Var = z54VarArr[i2];
            int i5 = i4 + 1;
            if (z54Var != null) {
                z54Var.l = hf3.c(j, hf3.b(f74Var.b(i4), jB));
            }
            i2++;
            i4 = i5;
        }
    }

    public static int g(int[] iArr, f74 f74Var) {
        f74Var.getClass();
        int i = f74Var.o + f74Var.p + iArr[0];
        iArr[0] = i;
        return Math.max(0, i);
    }

    public final long a() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            z54 z54Var = (z54) arrayList.get(i);
            xt2 xt2Var = z54Var.o;
            if (xt2Var != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (z54Var.l >> 32)) + ((int) (xt2Var.u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (z54Var.l & 4294967295L)) + ((int) (xt2Var.u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:170:0x0405  */
    /* JADX WARN: Code duplicated, block: B:172:0x040a  */
    /* JADX WARN: Code duplicated, block: B:242:0x00c2 A[EDGE_INSN: B:242:0x00c2->B:45:0x00c2 BREAK  A[LOOP:2: B:32:0x0088->B:44:0x00bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[LOOP:2: B:32:0x0088->B:44:0x00bf, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not found block with instruction: 0x037d: MOVE (r12v8 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] (LINE:894) */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v20, types: [e71, q51, s61] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r3v25, types: [z54[]] */
    /* JADX WARN: Type inference failed for: r6v29, types: [z54[]] */
    public final void c(int i, int i2, int i3, ArrayList arrayList, ne neVar, c74 c74Var, boolean z, boolean z2, int i4, int i5, b71 b71Var, vt2 vt2Var) {
        s05 s05Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr;
        ArrayList arrayList5;
        ArrayList arrayList6;
        t05 t05Var;
        s05 s05Var2;
        ArrayList arrayList7;
        ne neVar2;
        int[] iArr2;
        s05 s05Var3;
        byte b;
        Object[] objArr;
        long[] jArr;
        ArrayList arrayList8;
        int i6;
        ?? r19;
        t05 t05Var2;
        ArrayList arrayList9;
        ?? r110;
        z54[] z54VarArr;
        ?? r13;
        ArrayList arrayList10;
        ArrayList arrayList11;
        b64 b64Var;
        ?? r14;
        boolean z3;
        aq1 aq1Var;
        int i7;
        byte b2;
        ArrayList arrayList12 = arrayList;
        ne neVar3 = this.b;
        this.b = neVar;
        int size = arrayList12.size();
        int i8 = 0;
        loop0: while (true) {
            s05Var = this.a;
            if (i8 >= size) {
                if (!s05Var.i()) {
                    break;
                }
                d();
                return;
            }
            f74 f74Var = (f74) arrayList12.get(i8);
            int size2 = f74Var.b.size();
            for (int i9 = 0; i9 < size2; i9++) {
                Object objW = ((eo5) f74Var.b.get(i9)).w();
                if ((objW instanceof q54 ? (q54) objW : null) != null) {
                    break loop0;
                }
            }
            i8++;
        }
        int i10 = this.c;
        f74 f74Var2 = (f74) wv0.t0(arrayList12);
        this.c = f74Var2 != null ? f74Var2.a : 0;
        long j = ((long) i) & 4294967295L;
        boolean z4 = z || !z2;
        Object[] objArr2 = s05Var.b;
        long[] jArr2 = s05Var.a;
        boolean z5 = false;
        int length = jArr2.length - 2;
        t05 t05Var3 = this.d;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j2 = jArr2[i11];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j2 & 255) < 128) {
                            t05Var3.a(objArr2[(i11 << 3) + i13]);
                        }
                        j2 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        int size3 = arrayList12.size();
        int i14 = 0;
        while (true) {
            arrayList2 = this.i;
            arrayList3 = this.f;
            arrayList4 = this.e;
            if (i14 >= size3) {
                break;
            }
            f74 f74Var3 = (f74) arrayList12.get(i14);
            Object obj = f74Var3.i;
            int i15 = size3;
            List list = f74Var3.b;
            t05Var3.l(obj);
            int i16 = i14;
            int size4 = list.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size4) {
                    e(obj);
                    break;
                }
                List list2 = list;
                Object objW2 = ((eo5) list.get(i17)).w();
                int i18 = size4;
                if ((objW2 instanceof q54 ? (q54) objW2 : null) != null) {
                    b64 b64Var2 = (b64) s05Var.g(obj);
                    int iE = neVar3 != null ? neVar3.e(obj) : -1;
                    boolean z6 = iE == -1 && neVar3 != null;
                    if (b64Var2 != null) {
                        if (!z4) {
                            break;
                        }
                        b64.b(b64Var2, f74Var3, b71Var, vt2Var, i4, i5);
                        z54[] z54VarArr2 = b64Var2.a;
                        int length2 = z54VarArr2.length;
                        int i19 = 0;
                        while (i19 < length2) {
                            boolean z7 = z6;
                            z54 z54Var = z54VarArr2[i19];
                            z54[] z54VarArr3 = z54VarArr2;
                            int i20 = length2;
                            if (z54Var != null && !hf3.a(z54Var.l, 9223372034707292159L)) {
                                z54Var.l = hf3.c(z54Var.l, j);
                            }
                            i19++;
                            z6 = z7;
                            z54VarArr2 = z54VarArr3;
                            length2 = i20;
                        }
                        if (z6) {
                            for (z54 z54Var2 : b64Var2.a) {
                                if (z54Var2 != null) {
                                    if (z54Var2.b()) {
                                        arrayList2.remove(z54Var2);
                                        aq1 aq1Var2 = this.j;
                                        if (aq1Var2 != null) {
                                            z68.W(aq1Var2);
                                        }
                                    }
                                    z54Var2.a();
                                }
                            }
                        }
                        f(f74Var3, false);
                        break;
                    }
                    b64 b64Var3 = new b64(this);
                    b64.b(b64Var3, f74Var3, b71Var, vt2Var, i4, i5);
                    s05Var.l(obj, b64Var3);
                    if (f74Var3.a != iE && iE != -1) {
                        if (iE < i10) {
                            arrayList4.add(f74Var3);
                            break;
                        } else {
                            arrayList3.add(f74Var3);
                            break;
                        }
                    }
                    b(f74Var3, (int) (f74Var3.b(0) & 4294967295L), b64Var3);
                    if (!z6) {
                        break;
                    }
                    z54[] z54VarArr4 = b64Var3.a;
                    for (z54 z54Var3 : z54VarArr4) {
                        if (z54Var3 != null) {
                            z54Var3.a();
                        }
                    }
                    break;
                }
                i17++;
                size4 = i18;
                list = list2;
            }
            i14 = i16 + 1;
            arrayList12 = arrayList;
            size3 = i15;
        }
        int[] iArr3 = new int[1];
        if (z4 && neVar3 != null) {
            if (arrayList4.isEmpty()) {
                i7 = 1;
                b2 = 0;
            } else {
                if (arrayList4.size() > 1) {
                    aw0.c0(arrayList4, new c64(neVar3, (byte) 2));
                }
                int size5 = arrayList4.size();
                for (int i21 = 0; i21 < size5; i21++) {
                    f74 f74Var4 = (f74) arrayList4.get(i21);
                    int iG = i4 - g(iArr3, f74Var4);
                    Object objG = s05Var.g(f74Var4.i);
                    objG.getClass();
                    b(f74Var4, iG, (b64) objG);
                    f(f74Var4, false);
                }
                i7 = 1;
                b2 = 0;
                Arrays.fill(iArr3, 0, 1, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > i7) {
                    aw0.c0(arrayList3, new c64(neVar3, b2));
                }
                int size6 = arrayList3.size();
                for (int i22 = 0; i22 < size6; i22++) {
                    f74 f74Var5 = (f74) arrayList3.get(i22);
                    int iG2 = (g(iArr3, f74Var5) + i5) - (f74Var5.o + f74Var5.p);
                    Object objG2 = s05Var.g(f74Var5.i);
                    objG2.getClass();
                    b(f74Var5, iG2, (b64) objG2);
                    f(f74Var5, false);
                }
                Arrays.fill(iArr3, 0, 1, 0);
            }
        }
        Object[] objArr3 = t05Var3.b;
        long[] jArr3 = t05Var3.a;
        int length3 = jArr3.length - 2;
        ArrayList arrayList13 = this.h;
        ArrayList arrayList14 = this.g;
        if (length3 >= 0) {
            ArrayList arrayList15 = arrayList2;
            int i23 = 0;
            while (true) {
                long j3 = jArr3[i23];
                ArrayList arrayList16 = arrayList14;
                int i24 = i23;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i25 = 8;
                    int i26 = 8 - ((~(i24 - length3)) >>> 31);
                    int i27 = 0;
                    while (i27 < i26) {
                        if ((j3 & 255) < 128) {
                            t05Var2 = t05Var3;
                            Object obj2 = objArr3[(i24 << 3) + i27];
                            ArrayList arrayList17 = arrayList16;
                            b64 b64Var4 = (b64) s05Var.g(obj2);
                            if (b64Var4 == null) {
                                r19 = z5;
                                arrayList9 = arrayList17;
                            } else {
                                objArr3 = objArr3;
                                jArr3 = jArr3;
                                int iE2 = neVar.e(obj2);
                                j3 = j3;
                                int iMin = Math.min(1, b64Var4.e);
                                b64Var4.e = iMin;
                                b64Var4.d = Math.min(1 - iMin, b64Var4.d);
                                if (iE2 == -1) {
                                    z54[] z54VarArr5 = b64Var4.a;
                                    int length4 = z54VarArr5.length;
                                    int i28 = 0;
                                    boolean z8 = false;
                                    int i29 = 0;
                                    while (i28 < length4) {
                                        int i30 = i27;
                                        z54 z54Var4 = z54VarArr5[i28];
                                        int i31 = i29 + 1;
                                        if (z54Var4 != null) {
                                            if (z54Var4.b()) {
                                                r19 = z5;
                                                r110 = r19;
                                                z54VarArr = z54VarArr5;
                                                arrayList10 = arrayList15;
                                                z3 = true;
                                            } else {
                                                z54VarArr = z54VarArr5;
                                                if (((Boolean) z54Var4.k.getValue()).booleanValue()) {
                                                    z54Var4.c();
                                                    b64Var4.a[i29] = r110;
                                                    arrayList10 = arrayList15;
                                                    arrayList10.remove(z54Var4);
                                                    aq1 aq1Var3 = this.j;
                                                    if (aq1Var3 != null) {
                                                        r19 = z5;
                                                        r110 = r19;
                                                        z68.W(aq1Var3);
                                                    }
                                                    r19 = z5;
                                                    r110 = r19;
                                                    z3 = z8;
                                                } else {
                                                    arrayList10 = arrayList15;
                                                    xt2 xt2Var = z54Var4.o;
                                                    if (xt2Var != null) {
                                                        ArrayList arrayList18 = arrayList3;
                                                        ta2 ta2Var = z54Var4.f;
                                                        if (z54Var4.b() || ta2Var == null) {
                                                            r19 = z5;
                                                            r110 = r19;
                                                            arrayList11 = arrayList18;
                                                        } else {
                                                            i28 = i28;
                                                            length4 = length4;
                                                            z54Var4.j.setValue(Boolean.TRUE);
                                                            i26 = i26;
                                                            obj2 = obj2;
                                                            ?? r15 = r110;
                                                            i25 = i25;
                                                            i24 = i24;
                                                            i30 = i30;
                                                            arrayList11 = arrayList18;
                                                            iArr3 = iArr3;
                                                            b64Var = b64Var4;
                                                            s05Var = s05Var;
                                                            arrayList17 = arrayList17;
                                                            w51.G(z54Var4.a, r15, r15, new r0((Object) z54Var4, (Object) ta2Var, (Object) xt2Var, (q51) r15, (byte) 28), 3);
                                                            r14 = r15;
                                                        }
                                                        if (z54Var4.b()) {
                                                            arrayList10.add(z54Var4);
                                                            aq1Var = this.j;
                                                            if (aq1Var != null) {
                                                                z68.W(aq1Var);
                                                            }
                                                            z3 = true;
                                                            r13 = r14;
                                                        } else {
                                                            z54Var4.c();
                                                            b64Var.a[i29] = r14;
                                                            z3 = z8;
                                                            r13 = r14;
                                                        }
                                                    } else {
                                                        r19 = z5;
                                                        r110 = r19;
                                                        arrayList11 = arrayList3;
                                                    }
                                                    b64Var = b64Var4;
                                                    r14 = r110;
                                                    if (z54Var4.b()) {
                                                        arrayList10.add(z54Var4);
                                                        aq1Var = this.j;
                                                        if (aq1Var != null) {
                                                            z68.W(aq1Var);
                                                        }
                                                        z3 = true;
                                                        r13 = r14;
                                                    } else {
                                                        z54Var4.c();
                                                        b64Var.a[i29] = r14;
                                                        z3 = z8;
                                                        r13 = r14;
                                                    }
                                                }
                                                z8 = z3;
                                            }
                                            iArr3 = iArr3;
                                            arrayList11 = arrayList3;
                                            b64Var = b64Var4;
                                            r13 = r110;
                                            z8 = z3;
                                        } else {
                                            r19 = z5;
                                            r110 = r19;
                                            z54VarArr = z54VarArr5;
                                            i28 = i28;
                                            length4 = length4;
                                            i26 = i26;
                                            obj2 = obj2;
                                            s05Var = s05Var;
                                            r13 = r110;
                                            i25 = i25;
                                            arrayList10 = arrayList15;
                                            i24 = i24;
                                            arrayList17 = arrayList17;
                                            i30 = i30;
                                            iArr3 = iArr3;
                                            arrayList11 = arrayList3;
                                            arrayList4 = arrayList4;
                                            b64Var = b64Var4;
                                        }
                                        i28++;
                                        b64Var4 = b64Var;
                                        arrayList15 = arrayList10;
                                        i27 = i30;
                                        iArr3 = iArr3;
                                        arrayList3 = arrayList11;
                                        arrayList4 = arrayList4;
                                        i29 = i31;
                                        z54VarArr5 = z54VarArr;
                                        i24 = i24;
                                        i26 = i26;
                                        i25 = i25;
                                        r110 = r13;
                                        arrayList17 = arrayList17;
                                        s05Var = s05Var;
                                        obj2 = obj2;
                                        length4 = length4;
                                    }
                                    r19 = z5;
                                    r110 = r19;
                                    i26 = i26;
                                    Object obj3 = obj2;
                                    s05Var = s05Var;
                                    int i32 = i25;
                                    ArrayList arrayList19 = arrayList15;
                                    i24 = i24;
                                    arrayList9 = arrayList17;
                                    iArr3 = iArr3;
                                    i27 = i27;
                                    arrayList3 = arrayList3;
                                    arrayList4 = arrayList4;
                                    if (!z8) {
                                        e(obj3);
                                    }
                                    i25 = i32;
                                    arrayList15 = arrayList19;
                                } else {
                                    arrayList15 = arrayList15;
                                    i26 = i26;
                                    s05Var = s05Var;
                                    int i33 = i25;
                                    i24 = i24;
                                    arrayList9 = arrayList17;
                                    iArr3 = iArr3;
                                    i27 = i27;
                                    arrayList3 = arrayList3;
                                    arrayList4 = arrayList4;
                                    q31 q31Var = b64Var4.b;
                                    q31Var.getClass();
                                    f74 f74VarA = c74Var.a(iE2, q31Var.a);
                                    boolean z9 = true;
                                    f74VarA.r = true;
                                    z54[] z54VarArr6 = b64Var4.a;
                                    int length5 = z54VarArr6.length;
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 < length5) {
                                            i25 = i33;
                                            z54 z54Var5 = z54VarArr6[i34];
                                            if (z54Var5 == null || ((Boolean) z54Var5.h.getValue()).booleanValue() != z9) {
                                                r19 = z5;
                                                i34++;
                                                i33 = i25;
                                                z9 = true;
                                            } else {
                                                r19 = z5;
                                            }
                                        } else {
                                            r19 = z5;
                                            i25 = i33;
                                            if (neVar3 != null && iE2 == neVar3.e(obj2)) {
                                                e(obj2);
                                            }
                                        }
                                        b64Var4.a(f74VarA, b71Var, vt2Var, i4, i5, b64Var4.c);
                                        if (iE2 < this.c) {
                                            arrayList9.add(f74VarA);
                                        } else {
                                            arrayList13.add(f74VarA);
                                        }
                                    }
                                }
                            }
                            i27++;
                            arrayList15 = arrayList15;
                            arrayList16 = arrayList9;
                            arrayList3 = arrayList3;
                            t05Var3 = t05Var2;
                            arrayList4 = arrayList4;
                            jArr3 = jArr3;
                            s05Var = s05Var;
                            i24 = i24;
                            i26 = i26;
                            r19 = 0;
                            j3 >>= i25;
                            iArr3 = iArr3;
                            objArr3 = objArr3;
                            i25 = i25;
                        } else {
                            r19 = z5;
                            t05Var2 = t05Var3;
                            arrayList9 = arrayList16;
                        }
                        i27++;
                        arrayList15 = arrayList15;
                        arrayList16 = arrayList9;
                        arrayList3 = arrayList3;
                        t05Var3 = t05Var2;
                        arrayList4 = arrayList4;
                        jArr3 = jArr3;
                        s05Var = s05Var;
                        i24 = i24;
                        i26 = i26;
                        r19 = 0;
                        j3 >>= i25;
                        iArr3 = iArr3;
                        objArr3 = objArr3;
                        i25 = i25;
                    }
                    r19 = z5;
                    objArr = objArr3;
                    jArr = jArr3;
                    arrayList6 = arrayList4;
                    t05Var = t05Var3;
                    s05Var2 = s05Var;
                    int i35 = i25;
                    arrayList8 = arrayList15;
                    i6 = i24;
                    iArr = iArr3;
                    arrayList5 = arrayList3;
                    arrayList7 = arrayList16;
                    if (i26 != i35) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                    iArr = iArr3;
                    jArr = jArr3;
                    arrayList6 = arrayList4;
                    t05Var = t05Var3;
                    s05Var2 = s05Var;
                    arrayList8 = arrayList15;
                    i6 = i24;
                    arrayList5 = arrayList3;
                    arrayList7 = arrayList16;
                }
                int i36 = i6;
                if (i36 == length3) {
                    break;
                }
                i23 = i36 + 1;
                arrayList15 = arrayList8;
                arrayList14 = arrayList7;
                iArr3 = iArr;
                arrayList3 = arrayList5;
                objArr3 = objArr;
                t05Var3 = t05Var;
                arrayList4 = arrayList6;
                jArr3 = jArr;
                s05Var = s05Var2;
                z5 = false;
            }
        } else {
            iArr = iArr3;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            t05Var = t05Var3;
            s05Var2 = s05Var;
            arrayList7 = arrayList14;
        }
        if (arrayList7.isEmpty()) {
            neVar2 = neVar;
            iArr2 = iArr;
            s05Var3 = s05Var2;
            b = 1;
        } else {
            if (arrayList7.size() > 1) {
                neVar2 = neVar;
                aw0.c0(arrayList7, new c64(neVar2, (byte) 3));
            } else {
                neVar2 = neVar;
            }
            int size7 = arrayList7.size();
            int i37 = 0;
            while (i37 < size7) {
                f74 f74Var6 = (f74) arrayList7.get(i37);
                s05 s05Var4 = s05Var2;
                Object objG3 = s05Var4.g(f74Var6.i);
                objG3.getClass();
                int[] iArr4 = iArr;
                f74Var6.d((z ? (int) (((f74) wv0.r0(arrayList)).b(0) & 4294967295L) : ((b64) objG3).f) - g(iArr4, f74Var6), i2, i3);
                if (z4) {
                    f(f74Var6, true);
                }
                i37++;
                s05Var2 = s05Var4;
                iArr = iArr4;
            }
            iArr2 = iArr;
            s05Var3 = s05Var2;
            b = 1;
            Arrays.fill(iArr2, 0, 1, 0);
        }
        if (!arrayList13.isEmpty()) {
            if (arrayList13.size() > b) {
                aw0.c0(arrayList13, new c64(neVar2, b));
            }
            int size8 = arrayList13.size();
            for (int i38 = 0; i38 < size8; i38++) {
                f74 f74Var7 = (f74) arrayList13.get(i38);
                Object objG4 = s05Var3.g(f74Var7.i);
                objG4.getClass();
                f74Var7.d((((b64) objG4).g - (f74Var7.o + f74Var7.p)) + g(iArr2, f74Var7), i2, i3);
                if (z4) {
                    f(f74Var7, true);
                }
            }
        }
        Collections.reverse(arrayList7);
        arrayList.addAll(0, arrayList7);
        arrayList.addAll(arrayList13);
        arrayList6.clear();
        arrayList5.clear();
        arrayList7.clear();
        arrayList13.clear();
        t05Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[LOOP:0: B:7:0x0011->B:22:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[EDGE_INSN: B:26:0x0058->B:23:0x0058 BREAK  A[LOOP:0: B:7:0x0011->B:22:0x0055], SYNTHETIC] */
    public final void d() {
        s05 s05Var = this.a;
        if (s05Var.e != 0) {
            Object[] objArr = s05Var.c;
            long[] jArr = s05Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (z54 z54Var : ((b64) objArr[(i << 3) + i3]).a) {
                                    if (z54Var != null) {
                                        z54Var.c();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            s05Var.a();
        }
    }

    public final void e(Object obj) {
        b64 b64Var = (b64) this.a.j(obj);
        if (b64Var != null) {
            for (z54 z54Var : b64Var.a) {
                if (z54Var != null) {
                    z54Var.c();
                }
            }
        }
    }

    public final void f(f74 f74Var, boolean z) {
        Object objG = this.a.g(f74Var.i);
        objG.getClass();
        z54[] z54VarArr = ((b64) objG).a;
        int length = z54VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            z54 z54Var = z54VarArr[i];
            int i3 = i2 + 1;
            if (z54Var != null) {
                long jB = f74Var.b(i2);
                long j = z54Var.l;
                if (!hf3.a(j, 9223372034707292159L) && !hf3.a(j, jB)) {
                    long jB2 = hf3.b(jB, j);
                    ta2 ta2Var = z54Var.e;
                    if (ta2Var != null) {
                        long jB3 = hf3.b(((hf3) z54Var.r.getValue()).a, jB2);
                        z54Var.d(jB3);
                        z54Var.h.setValue(Boolean.TRUE);
                        z54Var.g = z;
                        w51.G(z54Var.a, null, null, new s0(z54Var, ta2Var, jB3, null), 3);
                    }
                }
                z54Var.l = jB;
            }
            i++;
            i2 = i3;
        }
    }
}
