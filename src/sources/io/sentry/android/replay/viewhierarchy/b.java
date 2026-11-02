package io.sentry.android.replay.viewhierarchy;

import androidx.compose.ui.node.LayoutNode;
import defpackage.b61;
import defpackage.c17;
import defpackage.dh3;
import defpackage.dw0;
import defpackage.fd3;
import defpackage.fm7;
import defpackage.fw0;
import defpackage.g44;
import defpackage.gn2;
import defpackage.jm4;
import defpackage.kx4;
import defpackage.lx4;
import defpackage.o88;
import defpackage.og5;
import defpackage.q3;
import defpackage.s05;
import defpackage.s07;
import defpackage.s86;
import defpackage.t07;
import defpackage.t6;
import defpackage.v3;
import defpackage.v88;
import defpackage.w74;
import defpackage.wv0;
import defpackage.x78;
import defpackage.x97;
import defpackage.y24;
import defpackage.z51;
import io.sentry.ILogger;
import io.sentry.android.replay.f0;
import io.sentry.s5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final g44 a = x97.P(w74.Y, a.Y);
    public static boolean b;
    public static WeakReference c;

    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    public static boolean a(t07 t07Var, boolean z, v3 v3Var) {
        String str;
        Object obj = null;
        if (t07Var != null) {
            Object objG = t07Var.X.g(f0.a);
            obj = (String) (objG != null ? objG : null);
        }
        if (dh3.f(obj, "unmask")) {
            v3Var.w();
            return false;
        }
        if (dh3.f(obj, "mask")) {
            v3Var.w();
            return true;
        }
        if (z) {
            str = "android.widget.ImageView";
        } else if (t07Var != null) {
            s05 s05Var = t07Var.X;
            if (s05Var.c(c17.C) || s05Var.c(s07.k) || s05Var.c(c17.G)) {
                str = "android.widget.TextView";
            } else {
                str = "android.view.View";
            }
        } else {
            str = "android.view.View";
        }
        if (((CopyOnWriteArraySet) v3Var.b).contains(str)) {
            return false;
        }
        return ((CopyOnWriteArraySet) v3Var.a).contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0272  */
    /* JADX WARN: Code duplicated, block: B:106:0x027c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0281  */
    /* JADX WARN: Code duplicated, block: B:114:0x0295  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:135:0x0319  */
    /* JADX WARN: Code duplicated, block: B:137:0x031e  */
    /* JADX WARN: Code duplicated, block: B:140:0x032e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0333  */
    /* JADX WARN: Code duplicated, block: B:144:0x0337  */
    /* JADX WARN: Code duplicated, block: B:147:0x0343 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x034e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0351  */
    /* JADX WARN: Code duplicated, block: B:153:0x035f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0390  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:161:0x03d7 A[Catch: all -> 0x03db, EDGE_INSN: B:161:0x03d7->B:165:0x03e1 BREAK  A[LOOP:2: B:156:0x03a7->B:164:0x03de], TRY_LEAVE, TryCatch #6 {all -> 0x03db, blocks: (B:159:0x03c1, B:161:0x03d7), top: B:234:0x03c1 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x03de A[LOOP:2: B:156:0x03a7->B:164:0x03de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:170:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:173:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:175:0x040c  */
    /* JADX WARN: Code duplicated, block: B:180:0x041e  */
    /* JADX WARN: Code duplicated, block: B:182:0x042a  */
    /* JADX WARN: Code duplicated, block: B:183:0x042c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0434  */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:197:0x047d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0496  */
    /* JADX WARN: Code duplicated, block: B:202:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:207:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:211:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:214:0x04de  */
    /* JADX WARN: Code duplicated, block: B:234:0x03c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x04e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x03db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x021b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0231  */
    /* JADX WARN: Code duplicated, block: B:90:0x024d A[PHI: r9
  0x024d: PHI (r9v6 boolean) = (r9v15 boolean), (r9v17 boolean) binds: [B:89:0x024b, B:84:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0252  */
    /* JADX WARN: Code duplicated, block: B:96:0x025d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x025f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0261  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [y24] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [y24] */
    public static void b(LayoutNode layoutNode, g gVar, boolean z, v3 v3Var, ILogger iLogger) throws Throwable {
        List<LayoutNode> children$ui;
        List<LayoutNode> children$ui2;
        ArrayList arrayList;
        int size;
        int i;
        LayoutNode layoutNode2;
        boolean zL;
        ArrayList arrayList2;
        int i2;
        g gVar2;
        ?? r15;
        g fVar;
        ArrayList arrayList3;
        ?? X;
        s86 s86Var;
        int i3;
        g cVar;
        ?? r6;
        t07 t07VarY;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        List listU;
        int size2;
        int i5;
        og5 og5Var;
        boolean z6;
        boolean z7;
        og5 og5Var2;
        boolean z8;
        String name;
        kx4 kx4Var;
        Object obj;
        boolean z9;
        ArrayList arrayList4;
        x78 x78Var;
        dw0 dw0Var;
        boolean z10;
        v88 v88Var;
        long j;
        boolean zA;
        io.sentry.d dVar;
        Integer numValueOf;
        o88 o88Var;
        o88 o88Var2;
        Object objG;
        q3 q3Var;
        gn2 gn2Var;
        y24 y24Var;
        g gVar3 = gVar;
        g44 g44Var = a;
        Boolean bool = io.sentry.config.a.a;
        Boolean bool2 = Boolean.FALSE;
        g gVar4 = null;
        if (dh3.f(bool, bool2)) {
            children$ui = layoutNode.getChildren$ui();
        } else {
            if (!dh3.f(bool, Boolean.TRUE)) {
                if (bool != null) {
                    b61.c();
                    return;
                }
                try {
                    children$ui2 = layoutNode.getChildren$ui();
                    io.sentry.config.a.a = bool2;
                } catch (NoSuchMethodError unused) {
                    io.sentry.config.a.a = Boolean.TRUE;
                    Method method = (Method) io.sentry.config.a.j().Y;
                    method.getClass();
                    Object objInvoke = method.invoke(layoutNode, null);
                    objInvoke.getClass();
                    children$ui = (List) objInvoke;
                    children$ui2 = children$ui;
                }
                if (children$ui2.isEmpty()) {
                    return;
                }
                arrayList = new ArrayList(children$ui2.size());
                size = children$ui2.size();
                for (i = 0; i < size; i = i2 + 1) {
                    layoutNode2 = children$ui2.get(i);
                    zL = layoutNode2.L();
                    t6 t6Var = layoutNode2.H0;
                    if (zL || !layoutNode2.K()) {
                        children$ui2 = children$ui2;
                        arrayList2 = arrayList;
                        size = size;
                        i2 = i;
                        layoutNode2 = layoutNode2;
                        gVar2 = gVar4;
                        r15 = 0;
                        fVar = gVar2;
                    } else {
                        if (z) {
                            c = new WeakReference(jm4.x((fd3) t6Var.f0));
                        }
                        fd3 fd3Var = (fd3) t6Var.f0;
                        WeakReference weakReference = c;
                        if (weakReference != null) {
                            y24Var = (y24) weakReference.get();
                        } else {
                            X = gVar4;
                        }
                        if (X == 0) {
                            X = y24Var;
                            X = jm4.x(fd3Var);
                        }
                        X = y24Var;
                        float fJ = (int) (X.j() >> 32);
                        int i6 = i;
                        float fJ2 = (int) (X.j() & 4294967295L);
                        s86 s86VarH = X.H(fd3Var, true);
                        float f = s86VarH.a;
                        if (f < 0.0f) {
                            f = 0.0f;
                        }
                        if (f > fJ) {
                            f = fJ;
                        }
                        float f2 = s86VarH.b;
                        if (f2 < 0.0f) {
                            f2 = 0.0f;
                        }
                        if (f2 > fJ2) {
                            f2 = fJ2;
                        }
                        float f3 = s86VarH.c;
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        }
                        if (f3 <= fJ) {
                            fJ = f3;
                        }
                        float f4 = s86VarH.d;
                        if (f4 < 0.0f) {
                            f4 = 0.0f;
                        }
                        if (f4 <= fJ2) {
                            fJ2 = f4;
                        }
                        if (f == fJ || f2 == fJ2) {
                            s86Var = new s86(0.0f, 0.0f, 0.0f, 0.0f);
                            arrayList2 = arrayList;
                            i2 = i6;
                        } else {
                            List<LayoutNode> list = children$ui2;
                            long jB = X.b((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
                            long jB2 = X.b((((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
                            long jB3 = X.b((((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(fJ2)) & 4294967295L));
                            long jB4 = X.b((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fJ2)) & 4294967295L));
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 >> 32));
                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jB4 >> 32));
                            ArrayList arrayList5 = arrayList;
                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jB3 >> 32));
                            float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
                            float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
                            children$ui2 = list;
                            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jB & 4294967295L));
                            arrayList2 = arrayList5;
                            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jB2 & 4294967295L));
                            float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jB4 & 4294967295L));
                            i2 = i6;
                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jB3 & 4294967295L));
                            s86Var = new s86(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
                        }
                        try {
                            t07VarY = layoutNode2.y();
                        } catch (Throwable th) {
                            try {
                                if (((Method) g44Var.getValue()) != null) {
                                    Method method2 = (Method) g44Var.getValue();
                                    method2.getClass();
                                    try {
                                        t07VarY = (t07) method2.invoke(layoutNode2, null);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        gVar2 = null;
                                        i3 = 0;
                                        if (!b) {
                                            b = true;
                                            iLogger.d(s5.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[i3]);
                                        }
                                        if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
                                            throw th;
                                        }
                                        int iZ = layoutNode2.z();
                                        int iO = layoutNode2.o();
                                        float f5 = gVar3.c;
                                        if (io.sentry.config.a.q(layoutNode2)) {
                                            r6 = i3;
                                        } else {
                                            r6 = i3;
                                        }
                                        cVar = new c(iZ, iO, f5, gVar3, true, r6, io.sentry.config.a.t(s86Var));
                                        i4 = i3;
                                    }
                                } else {
                                    i3 = 0;
                                    gVar2 = null;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (!b) {
                                            b = true;
                                            iLogger.d(s5.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[i3]);
                                        }
                                        if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
                                            throw th;
                                        }
                                        int iZ2 = layoutNode2.z();
                                        int iO2 = layoutNode2.o();
                                        float f6 = gVar3.c;
                                        if (io.sentry.config.a.q(layoutNode2)) {
                                            r6 = i3;
                                        } else {
                                            r6 = i3;
                                        }
                                        cVar = new c(iZ2, iO2, f6, gVar3, true, r6, io.sentry.config.a.t(s86Var));
                                        i4 = i3;
                                        fVar = cVar;
                                        r15 = i4;
                                        arrayList3 = arrayList2;
                                        if (fVar != null) {
                                            arrayList3.add(fVar);
                                            b(layoutNode2, fVar, r15, v3Var, iLogger);
                                        }
                                        arrayList = arrayList3;
                                        children$ui2 = children$ui2;
                                        size = size;
                                        gVar4 = gVar2;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                i3 = 0;
                                gVar2 = null;
                            }
                            if (!b) {
                                b = true;
                                iLogger.d(s5.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[i3]);
                            }
                            if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
                                throw th;
                            }
                            int iZ3 = layoutNode2.z();
                            int iO3 = layoutNode2.o();
                            float f7 = gVar3.c;
                            if (io.sentry.config.a.q(layoutNode2) || s86Var.d - s86Var.b <= 0.0f || s86Var.c - s86Var.a <= 0.0f) {
                                r6 = i3;
                            } else {
                                r6 = 1;
                            }
                            cVar = new c(iZ3, iO3, f7, gVar3, true, r6, io.sentry.config.a.t(s86Var));
                            i4 = i3;
                            fVar = cVar;
                            r15 = i4;
                            arrayList3 = arrayList2;
                            if (fVar != null) {
                                arrayList3.add(fVar);
                                b(layoutNode2, fVar, r15, v3Var, iLogger);
                            }
                            arrayList = arrayList3;
                            children$ui2 = children$ui2;
                            size = size;
                            gVar4 = gVar2;
                        }
                        if (io.sentry.config.a.q(layoutNode2)) {
                            z2 = false;
                        } else if (t07VarY != null) {
                            if (t07VarY.X.c(c17.p)) {
                                z2 = false;
                            } else if (s86Var.d - s86Var.b > 0.0f || s86Var.c - s86Var.a <= 0.0f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (s86Var.d - s86Var.b > 0.0f) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (t07VarY != null) {
                            z3 = true;
                            z4 = t07VarY.X.c(s07.k) ? z3 : false;
                            if (t07VarY != null) {
                                if (t07VarY.X.c(c17.C) != z3) {
                                    if (z4) {
                                        children$ui2 = children$ui2;
                                        size = size;
                                        arrayList2 = arrayList2;
                                        layoutNode2 = layoutNode2;
                                        z5 = z2;
                                        i2 = i2;
                                        i4 = 0;
                                        i4 = 0;
                                        gVar2 = null;
                                        listU = layoutNode2.u();
                                        size2 = listU.size();
                                        i5 = 0;
                                        while (true) {
                                            if (i5 < size2) {
                                                kx4Var = ((lx4) listU.get(i5)).a;
                                                if (fm7.d0(kx4Var.getClass().getName(), "Painter", false)) {
                                                    try {
                                                        Field declaredField = kx4Var.getClass().getDeclaredField("painter");
                                                        declaredField.setAccessible(true);
                                                        obj = declaredField.get(kx4Var);
                                                        if (obj instanceof og5) {
                                                            og5Var = (og5) obj;
                                                            break;
                                                        }
                                                    } catch (Throwable unused2) {
                                                    }
                                                } else {
                                                    i5++;
                                                }
                                            }
                                            og5Var = null;
                                            break;
                                        }
                                        if (og5Var != null) {
                                            if (z5 || !a(t07VarY, true, v3Var)) {
                                                z7 = false;
                                            } else {
                                                z7 = true;
                                            }
                                            int iZ4 = layoutNode2.z();
                                            og5Var2 = og5Var;
                                            int iO4 = layoutNode2.o();
                                            float f8 = gVar3.c;
                                            if (z7) {
                                                name = og5Var2.getClass().getName();
                                                if (!fm7.d0(name, "Vector", false) || fm7.d0(name, "Color", false) || fm7.d0(name, "Brush", false)) {
                                                    z8 = false;
                                                } else {
                                                    z8 = true;
                                                }
                                            } else {
                                                z8 = false;
                                            }
                                            cVar = new d(iZ4, iO4, f8, gVar3, z8, z5, io.sentry.config.a.t(s86Var));
                                        } else {
                                            if (z5 || !a(t07VarY, false, v3Var)) {
                                                z6 = false;
                                            } else {
                                                z6 = true;
                                            }
                                            cVar = new c(layoutNode2.z(), layoutNode2.o(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.t(s86Var));
                                        }
                                        fVar = cVar;
                                        r15 = i4;
                                    }
                                }
                                if (z2 || !a(t07VarY, false, v3Var)) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                arrayList4 = new ArrayList();
                                if (t07VarY != null) {
                                    objG = t07VarY.X.g(s07.a);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    q3Var = (q3) objG;
                                    if (q3Var != null && (gn2Var = (gn2) q3Var.b) != null) {
                                    }
                                }
                                x78Var = (x78) wv0.t0(arrayList4);
                                if (x78Var != null || (o88Var2 = x78Var.a.b) == null) {
                                    dw0Var = null;
                                } else {
                                    dw0Var = new dw0(o88Var2.b());
                                }
                                if (dw0Var == null && dw0Var.a == 16) {
                                    List listU2 = layoutNode2.u();
                                    int size3 = listU2.size();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 < size3) {
                                            List list2 = listU2;
                                            kx4 kx4Var2 = ((lx4) listU2.get(i7)).a;
                                            int i8 = size3;
                                            int i9 = i7;
                                            z10 = z4;
                                            if (fm7.d0(kx4Var2.getClass().getName(), "Text", false)) {
                                                try {
                                                    Field declaredField2 = kx4Var2.getClass().getDeclaredField("color");
                                                    declaredField2.setAccessible(true);
                                                    Object obj2 = declaredField2.get(kx4Var2);
                                                    fw0 fw0Var = obj2 instanceof fw0 ? (fw0) obj2 : null;
                                                    if (fw0Var != null) {
                                                        dw0Var = new dw0(fw0Var.a());
                                                        break;
                                                    }
                                                } catch (Throwable unused3) {
                                                }
                                            } else {
                                                i7 = i9 + 1;
                                                listU2 = list2;
                                                size3 = i8;
                                                z4 = z10;
                                            }
                                        } else {
                                            z10 = z4;
                                        }
                                        dw0Var = null;
                                        break;
                                    }
                                } else {
                                    z10 = z4;
                                }
                                if (x78Var != null || (o88Var = x78Var.a.b) == null) {
                                    v88Var = null;
                                } else {
                                    v88Var = new v88(o88Var.a.b);
                                }
                                j = v88.c;
                                if (v88Var == null) {
                                    zA = false;
                                } else {
                                    zA = v88.a(v88Var.a, j);
                                }
                                if (x78Var != null || z10 || zA) {
                                    dVar = null;
                                } else {
                                    dVar = new io.sentry.d(x78Var, (byte) 6);
                                }
                                if (dw0Var != null) {
                                    numValueOf = Integer.valueOf(z51.U(dw0Var.a) | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                                layoutNode2 = layoutNode2;
                                i2 = i2;
                                arrayList2 = arrayList2;
                                r15 = 0;
                                gVar2 = null;
                                size = size;
                                children$ui2 = children$ui2;
                                fVar = new f(dVar, numValueOf, 0, 0, layoutNode2.z(), layoutNode2.o(), gVar3.c, gVar, z9, z2, io.sentry.config.a.t(s86Var));
                                gVar3 = gVar;
                            } else if (z4) {
                                children$ui2 = children$ui2;
                                size = size;
                                arrayList2 = arrayList2;
                                layoutNode2 = layoutNode2;
                                z5 = z2;
                                i2 = i2;
                                i4 = 0;
                                i4 = 0;
                                gVar2 = null;
                                listU = layoutNode2.u();
                                size2 = listU.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size2) {
                                        kx4Var = ((lx4) listU.get(i5)).a;
                                        if (fm7.d0(kx4Var.getClass().getName(), "Painter", false)) {
                                            Field declaredField3 = kx4Var.getClass().getDeclaredField("painter");
                                            declaredField3.setAccessible(true);
                                            obj = declaredField3.get(kx4Var);
                                            if (obj instanceof og5) {
                                                og5Var = (og5) obj;
                                                break;
                                            }
                                        } else {
                                            i5++;
                                        }
                                    }
                                    og5Var = null;
                                    break;
                                }
                                if (og5Var != null) {
                                    if (z5) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                    }
                                    int iZ5 = layoutNode2.z();
                                    og5Var2 = og5Var;
                                    int iO5 = layoutNode2.o();
                                    float f9 = gVar3.c;
                                    if (z7) {
                                        name = og5Var2.getClass().getName();
                                        if (fm7.d0(name, "Vector", false)) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                    } else {
                                        z8 = false;
                                    }
                                    cVar = new d(iZ5, iO5, f9, gVar3, z8, z5, io.sentry.config.a.t(s86Var));
                                } else {
                                    if (z5) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    cVar = new c(layoutNode2.z(), layoutNode2.o(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.t(s86Var));
                                }
                                fVar = cVar;
                                r15 = i4;
                            } else {
                                if (z2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                arrayList4 = new ArrayList();
                                if (t07VarY != null) {
                                    objG = t07VarY.X.g(s07.a);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    q3Var = (q3) objG;
                                    if (q3Var != null) {
                                    }
                                }
                                x78Var = (x78) wv0.t0(arrayList4);
                                if (x78Var != null) {
                                    dw0Var = null;
                                } else {
                                    dw0Var = null;
                                }
                                if (dw0Var == null) {
                                    z10 = z4;
                                } else {
                                    z10 = z4;
                                }
                                if (x78Var != null) {
                                    v88Var = null;
                                } else {
                                    v88Var = null;
                                }
                                j = v88.c;
                                if (v88Var == null) {
                                    zA = false;
                                } else {
                                    zA = v88.a(v88Var.a, j);
                                }
                                if (x78Var != null) {
                                    dVar = null;
                                } else {
                                    dVar = null;
                                }
                                if (dw0Var != null) {
                                    numValueOf = Integer.valueOf(z51.U(dw0Var.a) | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                                layoutNode2 = layoutNode2;
                                i2 = i2;
                                arrayList2 = arrayList2;
                                r15 = 0;
                                gVar2 = null;
                                size = size;
                                children$ui2 = children$ui2;
                                fVar = new f(dVar, numValueOf, 0, 0, layoutNode2.z(), layoutNode2.o(), gVar3.c, gVar, z9, z2, io.sentry.config.a.t(s86Var));
                                gVar3 = gVar;
                            }
                        } else {
                            z3 = true;
                        }
                        if (t07VarY != null) {
                            if (t07VarY.X.c(c17.G) == z3) {
                            }
                            if (t07VarY != null) {
                                if (t07VarY.X.c(c17.C) != z3) {
                                    if (z4) {
                                        children$ui2 = children$ui2;
                                        size = size;
                                        arrayList2 = arrayList2;
                                        layoutNode2 = layoutNode2;
                                        z5 = z2;
                                        i2 = i2;
                                        i4 = 0;
                                        i4 = 0;
                                        gVar2 = null;
                                        listU = layoutNode2.u();
                                        size2 = listU.size();
                                        i5 = 0;
                                        while (true) {
                                            if (i5 < size2) {
                                                kx4Var = ((lx4) listU.get(i5)).a;
                                                if (fm7.d0(kx4Var.getClass().getName(), "Painter", false)) {
                                                    Field declaredField4 = kx4Var.getClass().getDeclaredField("painter");
                                                    declaredField4.setAccessible(true);
                                                    obj = declaredField4.get(kx4Var);
                                                    if (obj instanceof og5) {
                                                        og5Var = (og5) obj;
                                                        break;
                                                    }
                                                } else {
                                                    i5++;
                                                }
                                            }
                                            og5Var = null;
                                            break;
                                        }
                                        if (og5Var != null) {
                                            if (z5) {
                                                z7 = false;
                                            } else {
                                                z7 = false;
                                            }
                                            int iZ6 = layoutNode2.z();
                                            og5Var2 = og5Var;
                                            int iO6 = layoutNode2.o();
                                            float f10 = gVar3.c;
                                            if (z7) {
                                                name = og5Var2.getClass().getName();
                                                if (fm7.d0(name, "Vector", false)) {
                                                    z8 = false;
                                                } else {
                                                    z8 = false;
                                                }
                                            } else {
                                                z8 = false;
                                            }
                                            cVar = new d(iZ6, iO6, f10, gVar3, z8, z5, io.sentry.config.a.t(s86Var));
                                        } else {
                                            if (z5) {
                                                z6 = false;
                                            } else {
                                                z6 = false;
                                            }
                                            cVar = new c(layoutNode2.z(), layoutNode2.o(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.t(s86Var));
                                        }
                                        fVar = cVar;
                                        r15 = i4;
                                    }
                                }
                                if (z2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                arrayList4 = new ArrayList();
                                if (t07VarY != null) {
                                    objG = t07VarY.X.g(s07.a);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    q3Var = (q3) objG;
                                    if (q3Var != null) {
                                    }
                                }
                                x78Var = (x78) wv0.t0(arrayList4);
                                if (x78Var != null) {
                                    dw0Var = null;
                                } else {
                                    dw0Var = null;
                                }
                                if (dw0Var == null) {
                                    z10 = z4;
                                } else {
                                    z10 = z4;
                                }
                                if (x78Var != null) {
                                    v88Var = null;
                                } else {
                                    v88Var = null;
                                }
                                j = v88.c;
                                if (v88Var == null) {
                                    zA = false;
                                } else {
                                    zA = v88.a(v88Var.a, j);
                                }
                                if (x78Var != null) {
                                    dVar = null;
                                } else {
                                    dVar = null;
                                }
                                if (dw0Var != null) {
                                    numValueOf = Integer.valueOf(z51.U(dw0Var.a) | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                                layoutNode2 = layoutNode2;
                                i2 = i2;
                                arrayList2 = arrayList2;
                                r15 = 0;
                                gVar2 = null;
                                size = size;
                                children$ui2 = children$ui2;
                                fVar = new f(dVar, numValueOf, 0, 0, layoutNode2.z(), layoutNode2.o(), gVar3.c, gVar, z9, z2, io.sentry.config.a.t(s86Var));
                                gVar3 = gVar;
                            } else if (z4) {
                                if (z2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                arrayList4 = new ArrayList();
                                if (t07VarY != null) {
                                    objG = t07VarY.X.g(s07.a);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    q3Var = (q3) objG;
                                    if (q3Var != null) {
                                    }
                                }
                                x78Var = (x78) wv0.t0(arrayList4);
                                if (x78Var != null) {
                                    dw0Var = null;
                                } else {
                                    dw0Var = null;
                                }
                                if (dw0Var == null) {
                                    z10 = z4;
                                } else {
                                    z10 = z4;
                                }
                                if (x78Var != null) {
                                    v88Var = null;
                                } else {
                                    v88Var = null;
                                }
                                j = v88.c;
                                if (v88Var == null) {
                                    zA = false;
                                } else {
                                    zA = v88.a(v88Var.a, j);
                                }
                                if (x78Var != null) {
                                    dVar = null;
                                } else {
                                    dVar = null;
                                }
                                if (dw0Var != null) {
                                    numValueOf = Integer.valueOf(z51.U(dw0Var.a) | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                                layoutNode2 = layoutNode2;
                                i2 = i2;
                                arrayList2 = arrayList2;
                                r15 = 0;
                                gVar2 = null;
                                size = size;
                                children$ui2 = children$ui2;
                                fVar = new f(dVar, numValueOf, 0, 0, layoutNode2.z(), layoutNode2.o(), gVar3.c, gVar, z9, z2, io.sentry.config.a.t(s86Var));
                                gVar3 = gVar;
                            } else {
                                children$ui2 = children$ui2;
                                size = size;
                                arrayList2 = arrayList2;
                                layoutNode2 = layoutNode2;
                                z5 = z2;
                                i2 = i2;
                                i4 = 0;
                                i4 = 0;
                                gVar2 = null;
                                listU = layoutNode2.u();
                                size2 = listU.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size2) {
                                        kx4Var = ((lx4) listU.get(i5)).a;
                                        if (fm7.d0(kx4Var.getClass().getName(), "Painter", false)) {
                                            Field declaredField5 = kx4Var.getClass().getDeclaredField("painter");
                                            declaredField5.setAccessible(true);
                                            obj = declaredField5.get(kx4Var);
                                            if (obj instanceof og5) {
                                                og5Var = (og5) obj;
                                                break;
                                            }
                                        } else {
                                            i5++;
                                        }
                                    }
                                    og5Var = null;
                                    break;
                                }
                                if (og5Var != null) {
                                    if (z5) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                    }
                                    int iZ7 = layoutNode2.z();
                                    og5Var2 = og5Var;
                                    int iO7 = layoutNode2.o();
                                    float f11 = gVar3.c;
                                    if (z7) {
                                        name = og5Var2.getClass().getName();
                                        if (fm7.d0(name, "Vector", false)) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                    } else {
                                        z8 = false;
                                    }
                                    cVar = new d(iZ7, iO7, f11, gVar3, z8, z5, io.sentry.config.a.t(s86Var));
                                } else {
                                    if (z5) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    cVar = new c(layoutNode2.z(), layoutNode2.o(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.t(s86Var));
                                }
                                fVar = cVar;
                                r15 = i4;
                            }
                        }
                        if (t07VarY != null) {
                            if (t07VarY.X.c(c17.C) != z3) {
                                if (z4) {
                                    children$ui2 = children$ui2;
                                    size = size;
                                    arrayList2 = arrayList2;
                                    layoutNode2 = layoutNode2;
                                    z5 = z2;
                                    i2 = i2;
                                    i4 = 0;
                                    i4 = 0;
                                    gVar2 = null;
                                    listU = layoutNode2.u();
                                    size2 = listU.size();
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < size2) {
                                            kx4Var = ((lx4) listU.get(i5)).a;
                                            if (fm7.d0(kx4Var.getClass().getName(), "Painter", false)) {
                                                Field declaredField6 = kx4Var.getClass().getDeclaredField("painter");
                                                declaredField6.setAccessible(true);
                                                obj = declaredField6.get(kx4Var);
                                                if (obj instanceof og5) {
                                                    og5Var = (og5) obj;
                                                    break;
                                                }
                                            } else {
                                                i5++;
                                            }
                                        }
                                        og5Var = null;
                                        break;
                                    }
                                    if (og5Var != null) {
                                        if (z5) {
                                            z7 = false;
                                        } else {
                                            z7 = false;
                                        }
                                        int iZ8 = layoutNode2.z();
                                        og5Var2 = og5Var;
                                        int iO8 = layoutNode2.o();
                                        float f12 = gVar3.c;
                                        if (z7) {
                                            name = og5Var2.getClass().getName();
                                            if (fm7.d0(name, "Vector", false)) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                        } else {
                                            z8 = false;
                                        }
                                        cVar = new d(iZ8, iO8, f12, gVar3, z8, z5, io.sentry.config.a.t(s86Var));
                                    } else {
                                        if (z5) {
                                            z6 = false;
                                        } else {
                                            z6 = false;
                                        }
                                        cVar = new c(layoutNode2.z(), layoutNode2.o(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.t(s86Var));
                                    }
                                    fVar = cVar;
                                    r15 = i4;
                                }
                            }
                            if (z2) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            arrayList4 = new ArrayList();
                            if (t07VarY != null) {
                                objG = t07VarY.X.g(s07.a);
                                if (objG == null) {
                                    objG = null;
                                }
                                q3Var = (q3) objG;
                                if (q3Var != null) {
                                }
                            }
                            x78Var = (x78) wv0.t0(arrayList4);
                            if (x78Var != null) {
                                dw0Var = null;
                            } else {
                                dw0Var = null;
                            }
                            if (dw0Var == null) {
                                z10 = z4;
                            } else {
                                z10 = z4;
                            }
                            if (x78Var != null) {
                                v88Var = null;
                            } else {
                                v88Var = null;
                            }
                            j = v88.c;
                            if (v88Var == null) {
                                zA = false;
                            } else {
                                zA = v88.a(v88Var.a, j);
                            }
                            if (x78Var != null) {
                                dVar = null;
                            } else {
                                dVar = null;
                            }
                            if (dw0Var != null) {
                                numValueOf = Integer.valueOf(z51.U(dw0Var.a) | (-16777216));
                            } else {
                                numValueOf = null;
                            }
                            layoutNode2 = layoutNode2;
                            i2 = i2;
                            arrayList2 = arrayList2;
                            r15 = 0;
                            gVar2 = null;
                            size = size;
                            children$ui2 = children$ui2;
                            fVar = new f(dVar, numValueOf, 0, 0, layoutNode2.z(), layoutNode2.o(), gVar3.c, gVar, z9, z2, io.sentry.config.a.t(s86Var));
                            gVar3 = gVar;
                        } else if (z4) {
                            if (z2) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            arrayList4 = new ArrayList();
                            if (t07VarY != null) {
                                objG = t07VarY.X.g(s07.a);
                                if (objG == null) {
                                    objG = null;
                                }
                                q3Var = (q3) objG;
                                if (q3Var != null) {
                                }
                            }
                            x78Var = (x78) wv0.t0(arrayList4);
                            if (x78Var != null) {
                                dw0Var = null;
                            } else {
                                dw0Var = null;
                            }
                            if (dw0Var == null) {
                                z10 = z4;
                            } else {
                                z10 = z4;
                            }
                            if (x78Var != null) {
                                v88Var = null;
                            } else {
                                v88Var = null;
                            }
                            j = v88.c;
                            if (v88Var == null) {
                                zA = false;
                            } else {
                                zA = v88.a(v88Var.a, j);
                            }
                            if (x78Var != null) {
                                dVar = null;
                            } else {
                                dVar = null;
                            }
                            if (dw0Var != null) {
                                numValueOf = Integer.valueOf(z51.U(dw0Var.a) | (-16777216));
                            } else {
                                numValueOf = null;
                            }
                            layoutNode2 = layoutNode2;
                            i2 = i2;
                            arrayList2 = arrayList2;
                            r15 = 0;
                            gVar2 = null;
                            size = size;
                            children$ui2 = children$ui2;
                            fVar = new f(dVar, numValueOf, 0, 0, layoutNode2.z(), layoutNode2.o(), gVar3.c, gVar, z9, z2, io.sentry.config.a.t(s86Var));
                            gVar3 = gVar;
                        } else {
                            children$ui2 = children$ui2;
                            size = size;
                            arrayList2 = arrayList2;
                            layoutNode2 = layoutNode2;
                            z5 = z2;
                            i2 = i2;
                            i4 = 0;
                            i4 = 0;
                            gVar2 = null;
                            listU = layoutNode2.u();
                            size2 = listU.size();
                            i5 = 0;
                            while (true) {
                                if (i5 < size2) {
                                    kx4Var = ((lx4) listU.get(i5)).a;
                                    if (fm7.d0(kx4Var.getClass().getName(), "Painter", false)) {
                                        Field declaredField7 = kx4Var.getClass().getDeclaredField("painter");
                                        declaredField7.setAccessible(true);
                                        obj = declaredField7.get(kx4Var);
                                        if (obj instanceof og5) {
                                            og5Var = (og5) obj;
                                            break;
                                        }
                                    } else {
                                        i5++;
                                    }
                                }
                                og5Var = null;
                                break;
                            }
                            if (og5Var != null) {
                                if (z5) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                int iZ9 = layoutNode2.z();
                                og5Var2 = og5Var;
                                int iO9 = layoutNode2.o();
                                float f13 = gVar3.c;
                                if (z7) {
                                    name = og5Var2.getClass().getName();
                                    if (fm7.d0(name, "Vector", false)) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                } else {
                                    z8 = false;
                                }
                                cVar = new d(iZ9, iO9, f13, gVar3, z8, z5, io.sentry.config.a.t(s86Var));
                            } else {
                                if (z5) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                cVar = new c(layoutNode2.z(), layoutNode2.o(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.t(s86Var));
                            }
                            fVar = cVar;
                            r15 = i4;
                        }
                    }
                    arrayList3 = arrayList2;
                    if (fVar != null) {
                        arrayList3.add(fVar);
                        b(layoutNode2, fVar, r15, v3Var, iLogger);
                    }
                    arrayList = arrayList3;
                    children$ui2 = children$ui2;
                    size = size;
                    gVar4 = gVar2;
                }
                gVar3.g = arrayList;
            }
            Method method3 = (Method) io.sentry.config.a.j().Y;
            method3.getClass();
            Object objInvoke2 = method3.invoke(layoutNode, null);
            objInvoke2.getClass();
            children$ui = (List) objInvoke2;
        }
        children$ui2 = children$ui;
        if (children$ui2.isEmpty()) {
            return;
        }
        arrayList = new ArrayList(children$ui2.size());
        size = children$ui2.size();
        while (i < size) {
            layoutNode2 = children$ui2.get(i);
            zL = layoutNode2.L();
            t6 t6Var2 = layoutNode2.H0;
            if (zL) {
                children$ui2 = children$ui2;
                arrayList2 = arrayList;
                size = size;
                i2 = i;
                layoutNode2 = layoutNode2;
                gVar2 = gVar4;
                r15 = 0;
                fVar = gVar2;
            } else {
                children$ui2 = children$ui2;
                arrayList2 = arrayList;
                size = size;
                i2 = i;
                layoutNode2 = layoutNode2;
                gVar2 = gVar4;
                r15 = 0;
                fVar = gVar2;
            }
            arrayList3 = arrayList2;
            if (fVar != null) {
                arrayList3.add(fVar);
                b(layoutNode2, fVar, r15, v3Var, iLogger);
            }
            arrayList = arrayList3;
            children$ui2 = children$ui2;
            size = size;
            gVar4 = gVar2;
        }
        gVar3.g = arrayList;
    }
}
