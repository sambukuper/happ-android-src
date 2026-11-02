package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.widget.TextView;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import io.sentry.c2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class os4 {
    public static final cv X = new cv();
    public static final Object Y = new Object();
    public static final char[] Z = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final long[] f0 = new long[0];

    public static kx4 A(kx4 kx4Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return kx4Var.y(new eg5(f, f2, f3, f4));
    }

    public static final m81 B(ai2 ai2Var) {
        int iOrdinal = ai2Var.d1().ordinal();
        m81 m81Var = m81.X;
        if (iOrdinal != 0) {
            m81 m81Var2 = m81.Y;
            if (iOrdinal == 1) {
                ai2 ai2VarP = u15.p(ai2Var);
                if (ai2VarP == null) {
                    bt.q("ActiveParent with no focused child");
                    return null;
                }
                m81 m81VarB = B(ai2VarP);
                m81 m81Var3 = m81VarB != m81Var ? m81VarB : null;
                if (m81Var3 != null) {
                    return m81Var3;
                }
                if (ai2Var.r0) {
                    return m81Var;
                }
                ai2Var.r0 = true;
                try {
                    jh2 jh2VarA1 = ai2Var.a1();
                    fm0 fm0Var = new fm0();
                    gh2 gh2Var = (gh2) yn0.a0(ai2Var).getFocusOwner();
                    ai2 ai2VarF = gh2Var.f();
                    jh2VarA1.k.B(fm0Var);
                    ai2 ai2VarF2 = gh2Var.f();
                    if (fm0Var.a) {
                        oh2 oh2Var = oh2.b;
                        return m81Var2;
                    }
                    if (ai2VarF == ai2VarF2 || ai2VarF2 == null) {
                        return m81Var;
                    }
                    return oh2.d == oh2.c ? m81Var2 : m81.Z;
                } finally {
                    ai2Var.r0 = false;
                }
            }
            if (iOrdinal == 2) {
                return m81Var2;
            }
            if (iOrdinal != 3) {
                b61.c();
                return null;
            }
        }
        return m81Var;
    }

    public static final m81 C(ai2 ai2Var) {
        if (!ai2Var.s0) {
            ai2Var.s0 = true;
            try {
                jh2 jh2VarA1 = ai2Var.a1();
                fm0 fm0Var = new fm0();
                gh2 gh2Var = (gh2) yn0.a0(ai2Var).getFocusOwner();
                ai2 ai2VarF = gh2Var.f();
                jh2VarA1.j.B(fm0Var);
                ai2 ai2VarF2 = gh2Var.f();
                boolean z = fm0Var.a;
                m81 m81Var = m81.Y;
                if (z) {
                    oh2 oh2Var = oh2.b;
                    return m81Var;
                }
                if (ai2VarF != ai2VarF2 && ai2VarF2 != null) {
                    return oh2.d == oh2.c ? m81Var : m81.Z;
                }
            } finally {
                ai2Var.s0 = false;
            }
        }
        return m81.X;
    }

    public static final m81 D(ai2 ai2Var) {
        jx4 jx4VarT;
        t6 t6Var;
        int iOrdinal = ai2Var.d1().ordinal();
        m81 m81Var = m81.X;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ai2 ai2VarP = u15.p(ai2Var);
                if (ai2VarP != null) {
                    return B(ai2VarP);
                }
                bt.q("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    b61.c();
                    return null;
                }
                if (!ai2Var.X.p0) {
                    wc3.b("visitAncestors called on an unattached node");
                }
                jx4 jx4Var = ai2Var.X.g0;
                LayoutNode layoutNodeZ = yn0.Z(ai2Var);
                loop0: while (true) {
                    if (layoutNodeZ == null) {
                        jx4VarT = null;
                        break;
                    }
                    if ((((jx4) layoutNodeZ.H0.i0).f0 & 1024) != 0) {
                        while (jx4Var != null) {
                            if ((jx4Var.Z & 1024) != 0) {
                                jx4VarT = jx4Var;
                                c15 c15Var = null;
                                while (jx4VarT != null) {
                                    if (jx4VarT instanceof ai2) {
                                        break loop0;
                                    }
                                    if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                        int i = 0;
                                        for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                            if ((jx4Var2.Z & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    jx4VarT = jx4Var2;
                                                } else {
                                                    if (c15Var == null) {
                                                        c15Var = new c15(0, new jx4[16]);
                                                    }
                                                    if (jx4VarT != null) {
                                                        c15Var.b(jx4VarT);
                                                        jx4VarT = null;
                                                    }
                                                    c15Var.b(jx4Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    jx4VarT = yn0.T(c15Var);
                                }
                            }
                            jx4Var = jx4Var.g0;
                        }
                    }
                    layoutNodeZ = layoutNodeZ.w();
                    jx4Var = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
                }
                ai2 ai2Var2 = (ai2) jx4VarT;
                if (ai2Var2 == null) {
                    return m81Var;
                }
                int iOrdinal2 = ai2Var2.d1().ordinal();
                if (iOrdinal2 == 0) {
                    return C(ai2Var2);
                }
                if (iOrdinal2 == 1) {
                    return D(ai2Var2);
                }
                if (iOrdinal2 == 2) {
                    return m81.Y;
                }
                if (iOrdinal2 != 3) {
                    b61.c();
                    return null;
                }
                m81 m81VarD = D(ai2Var2);
                m81 m81Var2 = m81VarD != m81Var ? m81VarD : null;
                return m81Var2 == null ? C(ai2Var2) : m81Var2;
            }
        }
        return m81Var;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02ac A[PHI: r14 r15
  0x02ac: PHI (r14v4 java.util.List) = (r14v3 java.util.List), (r14v5 java.util.List) binds: [B:102:0x0260, B:115:0x02aa] A[DONT_GENERATE, DONT_INLINE]
  0x02ac: PHI (r15v6 int) = (r15v5 int), (r15v7 int) binds: [B:102:0x0260, B:115:0x02aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x02b0 A[LOOP:3: B:101:0x0252->B:118:0x02b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:180:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:185:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:194:0x03df A[LOOP:5: B:193:0x03dd->B:194:0x03df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x041f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0435  */
    /* JADX WARN: Code duplicated, block: B:232:0x02b8 A[EDGE_INSN: B:232:0x02b8->B:120:0x02b8 BREAK  A[LOOP:3: B:101:0x0252->B:118:0x02b0], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:194:0x03df, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r41v0, types: [android.view.ViewStructure] */
    public static final void E(ViewStructure viewStructure, LayoutNode layoutNode, AutofillId autofillId, String str, u86 u86Var) {
        ?? r38;
        long j;
        long j2;
        char c;
        long j3;
        boolean zBooleanValue;
        wc wcVar;
        ql qlVar;
        yd ydVar;
        ib8 ib8Var;
        kl6 kl6Var;
        boolean z;
        c51 c51Var;
        Boolean bool;
        boolean z2;
        Integer num;
        Object obj;
        List list;
        Integer numValueOf;
        int i;
        int i2;
        int i3;
        int i4;
        ?? r15;
        String strX;
        int size;
        String str2;
        int i5;
        String[] strArrH;
        String[] strArrH2;
        int i6;
        int i7;
        int i8;
        boolean z3;
        wc wcVar2;
        ib8 ib8Var2;
        ql qlVar2;
        yd ydVar2;
        kl6 kl6Var2;
        boolean z4;
        e17 e17Var = c17.a;
        e17 e17Var2 = s07.a;
        t07 t07VarY = layoutNode.y();
        boolean z5 = true;
        if (t07VarY != null) {
            s05 s05Var = t07VarY.X;
            j = 128;
            Object[] objArr = s05Var.b;
            Object[] objArr2 = s05Var.c;
            long[] jArr = s05Var.a;
            j2 = 255;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i9 = 0;
                wcVar2 = null;
                z = false;
                ib8Var2 = null;
                qlVar2 = null;
                ydVar2 = null;
                c51Var = null;
                bool = null;
                kl6Var2 = null;
                z2 = false;
                num = null;
                obj = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i9];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j4 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                Object obj2 = objArr[i12];
                                Object obj3 = objArr2[i12];
                                e17 e17Var3 = (e17) obj2;
                                if (dh3.f(e17Var3, c17.s)) {
                                    obj3.getClass();
                                    wcVar2 = (wc) obj3;
                                } else if (dh3.f(e17Var3, c17.a)) {
                                    obj3.getClass();
                                    String str3 = (String) wv0.t0((List) obj3);
                                    if (str3 != null) {
                                        viewStructure.setContentDescription(str3);
                                    }
                                } else if (dh3.f(e17Var3, c17.r)) {
                                    obj3.getClass();
                                    c51Var = (c51) obj3;
                                } else if (dh3.f(e17Var3, c17.t)) {
                                    obj3.getClass();
                                    ydVar2 = (yd) obj3;
                                } else if (dh3.f(e17Var3, c17.G)) {
                                    obj3.getClass();
                                    qlVar2 = (ql) obj3;
                                } else if (dh3.f(e17Var3, c17.l)) {
                                    obj3.getClass();
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (dh3.f(e17Var3, c17.R)) {
                                    obj3.getClass();
                                    num = (Integer) obj3;
                                } else if (dh3.f(e17Var3, c17.N)) {
                                    z2 = z5;
                                } else if (dh3.f(e17Var3, c17.o)) {
                                    obj3.getClass();
                                    zBooleanValue = ((Boolean) obj3).booleanValue();
                                } else if (dh3.f(e17Var3, c17.z)) {
                                    obj3.getClass();
                                    kl6Var2 = (kl6) obj3;
                                } else if (dh3.f(e17Var3, c17.K)) {
                                    obj3.getClass();
                                    bool = (Boolean) obj3;
                                } else if (dh3.f(e17Var3, c17.L)) {
                                    obj3.getClass();
                                    ib8Var2 = (ib8) obj3;
                                } else if (dh3.f(e17Var3, s07.b)) {
                                    viewStructure.setClickable(z5);
                                } else if (dh3.f(e17Var3, s07.c)) {
                                    viewStructure.setLongClickable(z5);
                                } else if (dh3.f(e17Var3, s07.w)) {
                                    viewStructure.setFocusable(z5);
                                } else if (dh3.f(e17Var3, s07.k)) {
                                    z = z5;
                                }
                                z4 = z5;
                                if (Build.VERSION.SDK_INT >= 34 && dh3.f(e17Var3, km4.k)) {
                                    obj = obj3;
                                }
                            } else {
                                z4 = z5;
                            }
                            j4 >>= 8;
                            i11++;
                            z5 = z4;
                        }
                        z3 = z5;
                        z3 = z3;
                        if (i10 != 8) {
                            break;
                        }
                    } else {
                        z3 = z5 ? 1 : 0;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                    z5 = z3 ? 1 : 0;
                }
            } else {
                z3 = true;
                c = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                wcVar2 = null;
                z = false;
                ib8Var2 = null;
                qlVar2 = null;
                ydVar2 = null;
                c51Var = null;
                bool = null;
                kl6Var2 = null;
                z2 = false;
                num = null;
                obj = null;
            }
            wcVar = wcVar2;
            ib8Var = ib8Var2;
            qlVar = qlVar2;
            ydVar = ydVar2;
            kl6Var = kl6Var2;
            r38 = z3;
        } else {
            r38 = 1;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            wcVar = null;
            qlVar = null;
            ydVar = null;
            ib8Var = null;
            kl6Var = null;
            z = false;
            c51Var = null;
            bool = null;
            z2 = false;
            num = null;
            obj = null;
        }
        t07 t07VarY2 = layoutNode.y();
        if (t07VarY2 != null && t07VarY2.Z && !t07VarY2.f0) {
            t07VarY2 = t07VarY2.b();
            j05 j05Var = new j05(layoutNode.getChildrenInfo().size());
            j05Var.c(layoutNode.getChildrenInfo());
            while (j05Var.j()) {
                LayoutNode layoutNode2 = (LayoutNode) j05Var.l(j05Var.b - 1);
                t07 t07VarY3 = layoutNode2.y();
                if (t07VarY3 != null && !t07VarY3.Z) {
                    t07VarY2.e(t07VarY3);
                    if (!t07VarY3.f0) {
                        j05Var.c(layoutNode2.getChildrenInfo());
                    }
                }
            }
        }
        if (t07VarY2 != null) {
            s05 s05Var2 = t07VarY2.X;
            Object[] objArr3 = s05Var2.b;
            Object[] objArr4 = s05Var2.c;
            long[] jArr2 = s05Var2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i13 = 8;
                list = null;
                int i14 = 0;
                while (true) {
                    long j5 = jArr2[i14];
                    long[] jArr3 = jArr2;
                    Object[] objArr5 = objArr3;
                    if ((((~j5) << c) & j5 & j3) == j3) {
                        i6 = i14;
                        if (i6 != length2) {
                            break;
                            break;
                        } else {
                            i14 = i6 + 1;
                            objArr3 = objArr5;
                            jArr2 = jArr3;
                        }
                    } else {
                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j5 & j2) < j) {
                                int i17 = (i14 << 3) + i16;
                                Object obj4 = objArr5[i17];
                                Object obj5 = objArr4[i17];
                                i8 = i13;
                                e17 e17Var4 = (e17) obj4;
                                i7 = i16;
                                if (dh3.f(e17Var4, c17.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (dh3.f(e17Var4, c17.C)) {
                                    obj5.getClass();
                                    list = (List) obj5;
                                }
                            } else {
                                i7 = i16;
                                i8 = i13;
                            }
                            j5 >>= i8;
                            i16 = i7 + 1;
                            i13 = i8;
                        }
                        if (i15 != i13) {
                            break;
                        }
                        i6 = i14;
                        if (i6 != length2) {
                            break;
                        }
                        i14 = i6 + 1;
                        objArr3 = objArr5;
                        jArr2 = jArr3;
                    }
                }
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        Integer numValueOf2 = Integer.valueOf(layoutNode.Y);
        if (layoutNode.w() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        ue3.O(viewStructure, autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (wcVar != null) {
            numValueOf = Integer.valueOf(wcVar.a);
        } else if (z) {
            numValueOf = Integer.valueOf((int) r38);
        } else {
            numValueOf = ib8Var != null ? 2 : null;
        }
        if (numValueOf != null) {
            ue3.P(viewStructure, numValueOf.intValue());
        }
        if (qlVar != null) {
            ue3.Q(viewStructure, ue3.u(qlVar.Y));
        }
        if (ydVar != null) {
            ue3.Q(viewStructure, ydVar.a);
        }
        if (c51Var != null && (strArrH2 = vj8.H(c51Var)) != null) {
            ue3.N(viewStructure, strArrH2);
        }
        LayoutNode layoutNode3 = (LayoutNode) u86Var.a.b(layoutNode.Y);
        if (layoutNode3 == null || layoutNode3.i0 == -4) {
            i = 0;
        } else {
            ne neVar = u86Var.c;
            int iD = u86Var.d(layoutNode3);
            long[] jArr4 = (long[]) neVar.c;
            long j6 = jArr4[iD];
            long j7 = jArr4[iD + 1];
            int i18 = (int) (j6 >> 32);
            int i19 = (int) j6;
            i = 0;
            viewStructure.setDimens(i18, i19, 0, 0, ((int) (j7 >> 32)) - i18, ((int) j7) - i19);
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (ib8Var != null) {
            viewStructure.setCheckable(r38);
            viewStructure.setChecked(ib8Var == ib8.X ? 1 : i);
        } else if (bool != null && (kl6Var == null || kl6Var.a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        c51.a.getClass();
        String str4 = (String) eu.r0(vj8.H(b51.b));
        if (c51Var != null && (strArrH = vj8.H(c51Var)) != null) {
            boolean Z2 = eu.Z(str4, strArrH);
            i2 = 1;
            if (Z2) {
                i3 = 1;
            }
            if (z2 && i3 == 0) {
                i4 = i;
            } else {
                i4 = i2;
            }
            if (i4 == 0 || zBooleanValue) {
                r15 = i2;
            } else {
                r15 = i;
            }
            ue3.U(viewStructure, r15);
            viewStructure.setVisibility(layoutNode.getOuterCoordinator$ui().e1() ? 4 : i);
            if (list != null) {
                size = list.size();
                str2 = _UrlKt.FRAGMENT_ENCODE_SET;
                for (i5 = i; i5 < size; i5++) {
                    str2 = ((Object) str2) + ((ql) list.get(i5)).Y + "\n";
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (layoutNode.getChildrenInfo().isEmpty() && kl6Var != null && (strX = gv3.X(kl6Var.a)) != null) {
                viewStructure.setClassName(strX);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    en.U(viewStructure, num.intValue());
                }
                if (i4 != 0) {
                    ue3.Z(viewStructure);
                }
            }
            if (Build.VERSION.SDK_INT >= 35 || obj == null) {
            }
            c2.m();
            return;
        }
        i2 = 1;
        i3 = i;
        if (z2) {
            i4 = i2;
        } else {
            i4 = i2;
        }
        if (i4 == 0) {
            r15 = i2;
        } else {
            r15 = i2;
        }
        ue3.U(viewStructure, r15);
        viewStructure.setVisibility(layoutNode.getOuterCoordinator$ui().e1() ? 4 : i);
        if (list != null) {
            size = list.size();
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
            while (i5 < size) {
                str2 = ((Object) str2) + ((ql) list.get(i5)).Y + "\n";
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (layoutNode.getChildrenInfo().isEmpty()) {
            viewStructure.setClassName(strX);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                en.U(viewStructure, num.intValue());
            }
            if (i4 != 0) {
                ue3.Z(viewStructure);
            }
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static final boolean F(ai2 ai2Var, boolean z) {
        int iOrdinal = ai2Var.d1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ai2 ai2VarP = u15.p(ai2Var);
                if (!(ai2VarP != null ? F(ai2VarP, z) : true)) {
                    return false;
                }
                ai2Var.Z0(yh2.Y, yh2.Z);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                b61.c();
                return false;
            }
        }
        return true;
    }

    public static ev4 G(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            u52.s("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    ev4 ev4Var = new ev4();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    ev4Var.f0 = byteBufferDuplicate;
                    ev4Var.X = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    ev4Var.Y = i6;
                    ev4Var.Z = ((ByteBuffer) ev4Var.f0).getShort(i6);
                    return ev4Var;
                }
            }
        }
        u52.s("Cannot read metadata.");
        return null;
    }

    public static final String H(String str, String str2, dn2 dn2Var, dn2 dn2Var2, gn2 gn2Var) {
        str.getClass();
        str2.getClass();
        gn2Var.getClass();
        String str3 = (String) dn2Var.invoke();
        String strJ = J(str, pc6.o(str3, "Mutable"), str2, str3, pc6.o(str3, "(Mutable)"));
        if (strJ != null) {
            return strJ;
        }
        String strJ2 = J(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (strJ2 != null) {
            return strJ2;
        }
        String str4 = (String) dn2Var2.invoke();
        String strJ3 = J(str, str4 + ((String) gn2Var.B("Array<")), str2, str4 + ((String) gn2Var.B("Array<out ")), str4 + ((String) gn2Var.B("Array<(out) ")));
        if (strJ3 != null) {
            return strJ3;
        }
        return null;
    }

    public static final String I(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v15 v15Var = (v15) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(pu.K(v15Var));
        }
        return sb.toString();
    }

    public static final String J(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        if (!mm7.Z(str, false, str2) || !mm7.Z(str3, false, str4)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (V(strSubstring, strSubstring2)) {
            return strConcat.concat("!");
        }
        return null;
    }

    public static final int K(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final lf3 L(s86 s86Var) {
        return new lf3(Math.round(s86Var.a), Math.round(s86Var.b), Math.round(s86Var.c), Math.round(s86Var.d));
    }

    public static final void M(View view, int i) {
        Context context = view.getContext();
        context.getClass();
        view.setBackgroundColor(q(context, i));
    }

    public static final void N(TextView textView, int i) {
        textView.getClass();
        Context context = textView.getContext();
        context.getClass();
        textView.setTextColor(q(context, i));
    }

    public static final t14 O(hi8 hi8Var) {
        hi8Var.getClass();
        ed1 ed1VarP = hi8Var.p();
        ed1VarP.getClass();
        boolean z = ed1VarP instanceof pt0;
        byte b = 0;
        rt8 rt8Var = rt8.OUT_VARIANCE;
        if (z) {
            List listG = ((pt0) ed1VarP).l().g();
            listG.getClass();
            ArrayList arrayList = new ArrayList(xv0.Z(listG, 10));
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                arrayList.add(((hi8) it.next()).l());
            }
            List upperBounds = hi8Var.getUpperBounds();
            upperBounds.getClass();
            zz3 zz3VarE = el1.e(hi8Var);
            t14 t14VarH = new wi8(new xg7(arrayList, b)).h((t14) wv0.r0(upperBounds), rt8Var);
            return t14VarH == null ? zz3VarE.n() : t14VarH;
        }
        if (!(ed1VarP instanceof ho2)) {
            bt.q("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List typeParameters = ((ho2) ed1VarP).getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList2 = new ArrayList(xv0.Z(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((hi8) it2.next()).l());
        }
        List upperBounds2 = hi8Var.getUpperBounds();
        upperBounds2.getClass();
        zz3 zz3VarE2 = el1.e(hi8Var);
        t14 t14VarH2 = new wi8(new xg7(arrayList2, b)).h((t14) wv0.r0(upperBounds2), rt8Var);
        return t14VarH2 == null ? zz3VarE2.n() : t14VarH2;
    }

    public static boolean P(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String Q(byte b) {
        char[] cArr = oc.a;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    public static final String R(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = oc.a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        wl7.s(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }

    public static final float S(float f, lp2 lp2Var) {
        return ((fi1) lp2Var.j(y01.h)).h0(f);
    }

    public static void T(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            T((View) parent, fArr, fArr2, iArr);
            oc.B(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            oc.B(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            oc.B(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            oc.B(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        nr4.S(matrix, fArr2);
        oc.A(fArr, fArr2);
    }

    public static final boolean U(Throwable th, dn2 dn2Var) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = bj3.a;
        wm1 wm1Var = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = to5.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = d02.X;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof wm1) {
                return false;
            }
        }
        try {
            rz0 rz0Var = (rz0) dn2Var.invoke();
            if (rz0Var != null) {
                boolean z2 = rz0Var.b;
                List list = rz0Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((tz0) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                rz0Var.getClass();
                wm1Var = new wm1(rz0Var);
            }
        } catch (Throwable th2) {
            wm1Var = th2;
        }
        if (wm1Var != null) {
            gv3.g(th, wm1Var);
        }
        return z;
    }

    public static final boolean V(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(mm7.W(str2, "?", _UrlKt.FRAGMENT_ENCODE_SET, false))) {
            return true;
        }
        if (mm7.R(str2, false, "?") && str.concat("?").equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return sb.toString().equals(str2);
    }

    public static final Exception W(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean zEquals = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (Throwable unused) {
                i = 0;
            }
            Object objInvoke = method.invoke(null, "sys.user." + i + ".ce_available", "false");
            objInvoke.getClass();
            zEquals = ((String) objInvoke).equals("true");
        } catch (Throwable th) {
            gv3.g(fileNotFoundException, th);
        }
        if (zEquals || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new ap1(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final void a(g73 g73Var, kx4 kx4Var, String str, long j, lp2 lp2Var, int i, int i2) {
        g73Var.getClass();
        if ((i2 & 2) != 0) {
            kx4Var = hx4.X;
        }
        kx4 kx4Var2 = kx4Var;
        if ((i2 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            j = dw0.g;
        }
        w43.a(g73Var, str2, kx4Var2, j, lp2Var, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896) | (i & 7168));
    }

    public static final lf3 b(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new lf3(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static final void c(sf4 sf4Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        kx4 kx4Var2;
        lp2 lp2Var2;
        gn2Var.getClass();
        lp2Var.X(529063307);
        int i2 = (lp2Var.f(sf4Var) ? 4 : 2) | i | (lp2Var.h(gn2Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            kx4Var2 = kx4Var;
            lp2Var2 = lp2Var;
            ci8.a(kx4Var2, vj8.j0(y46.logs_settings, lp2Var), jm4.U(-1569891305, new p90(sf4Var, gn2Var, b.a, (byte) 3), lp2Var), lp2Var2, 390, 0);
        } else {
            kx4Var2 = kx4Var;
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new rf4(sf4Var, gn2Var, kx4Var2, i);
        }
    }

    public static ig5 d(int i) {
        float f = (i & 1) != 0 ? 0.0f : 16.0f;
        return new ig5(f, 0.0f, f, 0.0f);
    }

    public static ig5 e(int i, float f) {
        float f2 = (i & 1) != 0 ? 0.0f : 16.0f;
        float f3 = (i & 2) != 0 ? 0.0f : 8.0f;
        float f4 = (i & 4) != 0 ? 0.0f : 16.0f;
        if ((i & 8) != 0) {
            f = 0.0f;
        }
        return new ig5(f2, f3, f4, f);
    }

    public static final boolean f(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final float g(gg5 gg5Var, z24 z24Var) {
        return z24Var == z24.X ? gg5Var.c(z24Var) : gg5Var.b(z24Var);
    }

    public static final float h(gg5 gg5Var, z24 z24Var) {
        return z24Var == z24.X ? gg5Var.b(z24Var) : gg5Var.c(z24Var);
    }

    public static final void i(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbS = pc6.s(j, "size=", " offset=");
            sbS.append(j2);
            sbS.append(" byteCount=");
            sbS.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbS.toString());
        }
    }

    public static final void j(long j, sd5 sd5Var) {
        if (sd5Var == sd5.X) {
            if (q31.g(j) != Integer.MAX_VALUE) {
                return;
            }
            zc3.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (q31.h(j) != Integer.MAX_VALUE) {
                return;
            }
            zc3.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] k(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static void n(ArrayList arrayList) {
        int i;
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cy0 cy0Var = (cy0) it.next();
            u81 u81Var = new u81(cy0Var);
            for (e26 e26Var : cy0Var.b) {
                boolean z = cy0Var.e;
                v81 v81Var = new v81(e26Var, z);
                if (!map.containsKey(v81Var)) {
                    map.put(v81Var, new HashSet());
                }
                Set set = (Set) map.get(v81Var);
                if (!set.isEmpty() && !z) {
                    c2.j("Multiple components provide ", e26Var, ".");
                    return;
                }
                set.add(u81Var);
            }
        }
        Iterator it2 = map.values().iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            for (u81 u81Var2 : (Set) it2.next()) {
                for (li1 li1Var : u81Var2.a.c) {
                    if (!li1Var.c) {
                        Set<u81> set2 = (Set) map.get(new v81(li1Var.a, li1Var.b == 2));
                        if (set2 != null) {
                            for (u81 u81Var3 : set2) {
                                u81Var2.b.add(u81Var3);
                                u81Var3.c.add(u81Var2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<u81> hashSet = new HashSet();
        Iterator it3 = map.values().iterator();
        while (it3.hasNext()) {
            hashSet.addAll((Set) it3.next());
        }
        HashSet hashSet2 = new HashSet();
        for (u81 u81Var4 : hashSet) {
            if (u81Var4.c.isEmpty()) {
                hashSet2.add(u81Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            u81 u81Var5 = (u81) hashSet2.iterator().next();
            hashSet2.remove(u81Var5);
            i++;
            for (u81 u81Var6 : u81Var5.b) {
                u81Var6.c.remove(u81Var5);
                if (u81Var6.c.isEmpty()) {
                    hashSet2.add(u81Var6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (u81 u81Var7 : hashSet) {
            if (!u81Var7.c.isEmpty() && !u81Var7.b.isEmpty()) {
                arrayList2.add(u81Var7.a);
            }
        }
        throw new ni1("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static final void o(bz4 bz4Var, sm0 sm0Var, d90 d90Var, float f, t67 t67Var, x38 x38Var, tv1 tv1Var) {
        ArrayList arrayList = bz4Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tg5 tg5Var = (tg5) arrayList.get(i);
            tg5Var.a.f(sm0Var, d90Var, f, t67Var, x38Var, tv1Var);
            sm0Var.n(0.0f, tg5Var.a.f);
        }
    }

    public static void p(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(os4.class.getClassLoader());
        }
    }

    public static final int q(Context context, int i) {
        context.getClass();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static final int r(qr6 qr6Var) {
        qr6Var.getClass();
        xr6 xr6VarX0 = qr6Var.X0("SELECT changes()");
        try {
            xr6VarX0.S0();
            int i = (int) xr6VarX0.getLong(0);
            u15.h(xr6VarX0, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(xr6VarX0, th);
                throw th2;
            }
        }
    }

    public static final boolean s(xu3 xu3Var) {
        wd0 wd0VarY;
        if (xu3Var instanceof zv3) {
            nw3 nw3Var = (nw3) xu3Var;
            Field fieldE = i21.E(nw3Var);
            if (!(fieldE != null ? fieldE.isAccessible() : true)) {
                return false;
            }
            Method methodF = i21.F(nw3Var.b());
            if (!(methodF != null ? methodF.isAccessible() : true)) {
                return false;
            }
            Method methodF2 = i21.F(((zv3) xu3Var).d());
            if (!(methodF2 != null ? methodF2.isAccessible() : true)) {
                return false;
            }
        } else if (xu3Var instanceof nw3) {
            nw3 nw3Var2 = (nw3) xu3Var;
            Field fieldE2 = i21.E(nw3Var2);
            if (!(fieldE2 != null ? fieldE2.isAccessible() : true)) {
                return false;
            }
            Method methodF3 = i21.F(nw3Var2.b());
            if (!(methodF3 != null ? methodF3.isAccessible() : true)) {
                return false;
            }
        } else if (xu3Var instanceof hw3) {
            Field fieldE3 = i21.E(((hw3) xu3Var).f());
            if (!(fieldE3 != null ? fieldE3.isAccessible() : true)) {
                return false;
            }
            Method methodF4 = i21.F((pv3) xu3Var);
            if (!(methodF4 != null ? methodF4.isAccessible() : true)) {
                return false;
            }
        } else if (xu3Var instanceof uv3) {
            Field fieldE4 = i21.E(((uv3) xu3Var).f());
            if (!(fieldE4 != null ? fieldE4.isAccessible() : true)) {
                return false;
            }
            Method methodF5 = i21.F((pv3) xu3Var);
            if (!(methodF5 != null ? methodF5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(xu3Var instanceof pv3)) {
                StringBuilder sb = new StringBuilder("Unknown callable: ");
                sb.append(xu3Var);
                Class<?> cls = xu3Var.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new UnsupportedOperationException(sb.toString());
            }
            pv3 pv3Var = (pv3) xu3Var;
            Method methodF6 = i21.F(pv3Var);
            if (!(methodF6 != null ? methodF6.isAccessible() : true)) {
                return false;
            }
            kb6 kb6VarA = ms8.a(xu3Var);
            Member memberB = (kb6VarA == null || (wd0VarY = kb6VarA.y()) == null) ? null : wd0VarY.b();
            AccessibleObject accessibleObject = memberB instanceof AccessibleObject ? (AccessibleObject) memberB : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Constructor constructorD = i21.D(pv3Var);
            if (!(constructorD != null ? constructorD.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean t(LayoutNode layoutNode) {
        if (layoutNode.k0 == null) {
            return false;
        }
        LayoutNode layoutNodeW = layoutNode.w();
        return (layoutNodeW != null ? layoutNodeW.k0 : null) == null || layoutNode.I0.b;
    }

    public static final wl6 u(ra raVar, String str, Executor executor, dn2 dn2Var) {
        dn8 dn8Var = dn8.a;
        raVar.getClass();
        executor.getClass();
        yz4 yz4Var = new yz4(wl6.i0);
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            executor.execute(new ey1(raVar, str, dn2Var, yz4Var, qd0Var, (byte) 1));
            qd0Var.a = dn8Var;
        } catch (Exception e) {
            ud0Var.b(e);
        }
        return new wl6(yz4Var, ud0Var);
    }

    public static int v(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        u52.s(pc6.m("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
        return 0;
    }

    public static final kx4 w(kx4 kx4Var, gg5 gg5Var) {
        return kx4Var.y(new hg5(gg5Var));
    }

    public static final kx4 x(kx4 kx4Var, float f) {
        return kx4Var.y(new eg5(f, f, f, f));
    }

    public static final kx4 y(kx4 kx4Var, float f, float f2) {
        return kx4Var.y(new eg5(f, f2, f, f2));
    }

    public static kx4 z(kx4 kx4Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return y(kx4Var, f, f2);
    }

    public abstract ar3 l(t37 t37Var, dh8 dh8Var);

    public abstract si8 m(l37 l37Var, dh8 dh8Var);
}
