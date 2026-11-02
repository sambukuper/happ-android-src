package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gl7 extends hq8 {
    public b57 A;
    public b57 B;
    public c57 C;
    public final hl7 q;
    public final oy8 r;
    public final dq s;
    public final dq t;
    public zv7 u;
    public y5 v;
    public xx7 w;
    public xx7 x;
    public xx7 y;
    public xx7 z;

    public gl7(cj0 cj0Var, cj0 cj0Var2, dq dqVar, dq dqVar2, HashSet hashSet, hr8 hr8Var) {
        super(M(hashSet));
        this.q = M(hashSet);
        this.s = dqVar;
        this.t = dqVar2;
        this.r = new oy8(cj0Var, cj0Var2, hashSet, hr8Var, new kp5((byte) 29));
        HashSet hashSet2 = ((hq8) hashSet.iterator().next()).g;
        this.g = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    public static hl7 M(HashSet hashSet) {
        k05 k05VarJ = k05.j();
        new fg0(k05VarJ);
        k05VarJ.o(e63.p, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hq8 hq8Var = (hq8) it.next();
            if (hq8Var.h.h(er8.W)) {
                arrayList.add(hq8Var.h.s());
            }
        }
        k05VarJ.o(hl7.Y, arrayList);
        k05VarJ.o(i63.v, 2);
        k05VarJ.o(er8.e0, jl7.PREVIEW_VIDEO_STILL);
        return new hl7(qd5.c(k05VarJ));
    }

    @Override // defpackage.hq8
    public final iz A(iz izVar, iz izVar2) {
        Objects.toString(izVar);
        Objects.toString(izVar2);
        hi5.z0("StreamSharing");
        G(J(f(), j() == null ? null : j().s().e(), this.h, izVar, izVar2));
        q();
        return izVar;
    }

    @Override // defpackage.hq8
    public final void B() {
        I();
        oy8 oy8Var = this.r;
        for (hq8 hq8Var : oy8Var.X) {
            ny8 ny8Var = (ny8) oy8Var.Z.get(hq8Var);
            Objects.requireNonNull(ny8Var);
            hq8Var.F(ny8Var);
        }
    }

    public final void I() {
        c57 c57Var = this.C;
        if (c57Var != null) {
            c57Var.b();
            this.C = null;
        }
        xx7 xx7Var = this.w;
        if (xx7Var != null) {
            xx7Var.b();
            this.w = null;
        }
        xx7 xx7Var2 = this.x;
        if (xx7Var2 != null) {
            xx7Var2.b();
            this.x = null;
        }
        xx7 xx7Var3 = this.y;
        if (xx7Var3 != null) {
            xx7Var3.b();
            this.y = null;
        }
        xx7 xx7Var4 = this.z;
        if (xx7Var4 != null) {
            xx7Var4.b();
            this.z = null;
        }
        zv7 zv7Var = this.u;
        if (zv7Var != null) {
            ((jg1) zv7Var.X).a();
            s08.g(new fl6((Object) zv7Var, (byte) 7));
            this.u = null;
        }
        y5 y5Var = this.v;
        if (y5Var != null) {
            ((cy7) y5Var.Y).a();
            s08.g(new c1(y5Var, (byte) 19));
            this.v = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List J(String str, String str2, er8 er8Var, iz izVar, iz izVar2) {
        boolean z;
        px1 px1Var = izVar.c;
        s08.b();
        oy8 oy8Var = this.r;
        if (izVar2 == null) {
            xx7 xx7VarK = K(str, str2, er8Var, izVar, null);
            cj0 cj0VarD = d();
            Objects.requireNonNull(cj0VarD);
            jg1 jg1Var = new jg1(px1Var);
            zv7 zv7Var = new zv7();
            zv7Var.Y = cj0VarD;
            zv7Var.X = jg1Var;
            this.u = zv7Var;
            boolean z2 = this.k != null;
            int iH = ((i63) this.h).H(0);
            oy8Var.getClass();
            HashMap map = new HashMap();
            for (hq8 hq8Var : oy8Var.X) {
                gf6 gf6Var = oy8Var.m0;
                cj0 cj0Var = oy8Var.h0;
                oy8 oy8Var2 = oy8Var;
                boolean z3 = z2;
                xy xyVarT = oy8Var2.t(hq8Var, gf6Var, cj0Var, xx7VarK, iH, z3);
                int iN = oy8Var2.h0.c().n(((i63) hq8Var.h).H(0));
                ny8 ny8Var = (ny8) oy8Var2.Z.get(hq8Var);
                Objects.requireNonNull(ny8Var);
                ny8Var.Z.Z = iN;
                map.put(hq8Var, xyVarT);
                z2 = z3;
                oy8Var = oy8Var2;
            }
            oy8 oy8Var3 = oy8Var;
            boolean z4 = z2;
            ArrayList arrayList = new ArrayList(map.values());
            if (xx7VarK == null) {
                b61.i("Null surfaceEdge");
                return null;
            }
            jg1 jg1Var2 = (jg1) zv7Var.X;
            s08.b();
            Objects.toString(jg1Var2);
            Objects.toString(xx7VarK);
            hi5.z0("SurfaceProcessorNode");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Objects.toString((xy) it.next());
                hi5.z0("SurfaceProcessorNode");
            }
            zv7Var.Z = new ex1();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                xy xyVar = (xy) it2.next();
                ex1 ex1Var = (ex1) zv7Var.Z;
                Rect rect = xyVar.d;
                int i = xyVar.f;
                boolean z5 = xyVar.g;
                Matrix matrix = new Matrix(xx7VarK.b);
                RectF rectF = new RectF(rect);
                Size size = xyVar.e;
                Iterator it3 = it2;
                matrix.postConcat(hd8.a(rectF, hd8.h(size), i, z5));
                mb6.n(hd8.d(hd8.g(i, hd8.f(rect)), false, size));
                HashMap map2 = map;
                Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
                xy0 xy0VarB = xx7VarK.g.b();
                xy0VarB.Y = size;
                ex1Var.put(xyVar, new xx7(xyVar.b, xyVar.c, xy0VarB.b(), matrix, false, rect2, xx7VarK.i - i, -1, xx7VarK.e != z5));
                it2 = it3;
                map = map2;
            }
            HashMap map3 = map;
            jg1Var2.b(xx7VarK.c((cj0) zv7Var.Y, true));
            for (Map.Entry entry : ((ex1) zv7Var.Z).entrySet()) {
                zv7Var.b(xx7VarK, entry);
                xx7 xx7Var = (xx7) entry.getValue();
                j0 j0Var = new j0((Object) zv7Var, (Object) xx7VarK, (Object) entry, (byte) 15);
                xx7Var.getClass();
                s08.b();
                xx7Var.a();
                xx7Var.m.add(j0Var);
            }
            xx7VarK.o.add(new hp((ex1) zv7Var.Z, (byte) 3));
            ex1 ex1Var2 = (ex1) zv7Var.Z;
            HashMap map4 = new HashMap();
            for (Map.Entry entry2 : map3.entrySet()) {
                map4.put((hq8) entry2.getKey(), (xx7) ex1Var2.get(entry2.getValue()));
            }
            oy8Var3.y(map4, oy8Var3.w(xx7VarK, z4));
            Object[] objArr = {this.A.c()};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
            return Collections.unmodifiableList(arrayList2);
        }
        xx7 xx7VarK2 = K(str, str2, er8Var, izVar, izVar2);
        Matrix matrix2 = this.l;
        cj0 cj0VarJ = j();
        Objects.requireNonNull(cj0VarJ);
        boolean zQ = cj0VarJ.q();
        Size size2 = izVar2.a;
        Rect rect3 = this.k;
        if (rect3 != null) {
            z = false;
        } else {
            z = false;
            rect3 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        Rect rect4 = rect3;
        cj0 cj0VarJ2 = j();
        Objects.requireNonNull(cj0VarJ2);
        int i2 = i(cj0VarJ2, z);
        cj0 cj0VarJ3 = j();
        Objects.requireNonNull(cj0VarJ3);
        xx7 xx7Var2 = new xx7(3, 34, izVar2, matrix2, zQ, rect4, i2, -1, o(cj0VarJ3));
        this.x = xx7Var2;
        Objects.requireNonNull(j());
        this.z = xx7Var2;
        b57 b57VarL = L(this.x, er8Var, izVar2);
        this.B = b57VarL;
        c57 c57Var = this.C;
        if (c57Var != null) {
            c57Var.b();
        }
        c57 c57Var2 = new c57(new fl7(this, str, str2, er8Var, izVar, izVar2));
        this.C = c57Var2;
        b57VarL.f = c57Var2;
        xx7 xx7Var3 = this.z;
        this.v = new y5(d(), j(), new cx1(px1Var, this.s, this.t));
        boolean z6 = this.k != null;
        int iH2 = ((i63) this.h).H(0);
        oy8Var.getClass();
        HashMap map5 = new HashMap();
        for (hq8 hq8Var2 : oy8Var.X) {
            int i3 = iH2;
            xy xyVarT2 = oy8Var.t(hq8Var2, oy8Var.m0, oy8Var.h0, xx7VarK2, i3, z6);
            gf6 gf6Var2 = oy8Var.n0;
            Objects.requireNonNull(gf6Var2);
            cj0 cj0Var2 = oy8Var.i0;
            Objects.requireNonNull(cj0Var2);
            xx7 xx7Var4 = xx7Var3;
            xy xyVarT3 = oy8Var.t(hq8Var2, gf6Var2, cj0Var2, xx7Var4, i3, z6);
            int iN2 = oy8Var.h0.c().n(((i63) hq8Var2.h).H(0));
            ny8 ny8Var2 = (ny8) oy8Var.Z.get(hq8Var2);
            Objects.requireNonNull(ny8Var2);
            ny8Var2.Z.Z = iN2;
            map5.put(hq8Var2, new dy(xyVarT2, xyVarT3));
            xx7Var3 = xx7Var4;
            iH2 = i3;
        }
        xx7 xx7Var5 = xx7Var3;
        y5 y5Var = this.v;
        ArrayList arrayList3 = new ArrayList(map5.values());
        ey eyVar = new ey(xx7VarK2, xx7Var5, arrayList3);
        y5Var.getClass();
        s08.b();
        cy7 cy7Var = (cy7) y5Var.Y;
        Objects.toString(cy7Var);
        Objects.toString(xx7VarK2);
        Objects.toString(xx7Var5);
        hi5.z0("DualSurfaceProcessorNode");
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Objects.toString((dy) it4.next());
            hi5.z0("SurfaceProcessorNode");
        }
        y5Var.h0 = eyVar;
        y5Var.f0 = new ex1();
        ey eyVar2 = (ey) y5Var.h0;
        xx7 xx7Var6 = eyVar2.a;
        xx7 xx7Var7 = eyVar2.b;
        Iterator it5 = eyVar2.c.iterator();
        while (it5.hasNext()) {
            dy dyVar = (dy) it5.next();
            ex1 ex1Var3 = (ex1) y5Var.f0;
            xy xyVar2 = dyVar.a;
            Rect rect5 = xyVar2.d;
            int i4 = xyVar2.f;
            boolean z7 = xyVar2.g;
            Iterator it6 = it5;
            HashMap map6 = map5;
            Matrix matrix3 = new Matrix(xx7Var6.b);
            RectF rectF2 = new RectF(rect5);
            Size size3 = xyVar2.e;
            matrix3.postConcat(hd8.a(rectF2, hd8.h(size3), i4, z7));
            mb6.n(hd8.d(hd8.g(i4, hd8.f(rect5)), false, size3));
            Rect rect6 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
            xy0 xy0VarB2 = xx7Var6.g.b();
            xy0VarB2.Y = size3;
            ex1Var3.put(dyVar, new xx7(xyVar2.b, xyVar2.c, xy0VarB2.b(), matrix3, false, rect6, xx7Var6.i - i4, -1, xx7Var6.e != z7));
            it5 = it6;
            map5 = map6;
        }
        HashMap map7 = map5;
        cy7Var.b(xx7Var6.c((cj0) y5Var.Z, true));
        cy7Var.b(xx7Var7.c((cj0) y5Var.g0, false));
        cj0 cj0Var3 = (cj0) y5Var.Z;
        cj0 cj0Var4 = (cj0) y5Var.g0;
        for (final Map.Entry entry3 : ((ex1) y5Var.f0).entrySet()) {
            final xx7 xx7Var8 = xx7Var6;
            final xx7 xx7Var9 = xx7Var7;
            y5Var.B(cj0Var3, cj0Var4, xx7Var8, xx7Var9, entry3);
            xx7 xx7Var10 = (xx7) entry3.getValue();
            final cj0 cj0Var5 = cj0Var4;
            final cj0 cj0Var6 = cj0Var3;
            final y5 y5Var2 = y5Var;
            Runnable runnable = new Runnable() { // from class: dx1
                @Override // java.lang.Runnable
                public final void run() {
                    y5Var2.B(cj0Var6, cj0Var5, xx7Var8, xx7Var9, entry3);
                }
            };
            y5Var = y5Var2;
            cj0Var3 = cj0Var6;
            cj0Var4 = cj0Var5;
            xx7Var10.getClass();
            s08.b();
            xx7Var10.a();
            xx7Var10.m.add(runnable);
            xx7Var6 = xx7Var8;
            xx7Var7 = xx7Var9;
        }
        ex1 ex1Var4 = (ex1) y5Var.f0;
        HashMap map8 = new HashMap();
        for (Map.Entry entry4 : map7.entrySet()) {
            map8.put((hq8) entry4.getKey(), (xx7) ex1Var4.get(entry4.getValue()));
        }
        oy8Var.y(map8, oy8Var.w(xx7VarK2, z6));
        Object[] objArr2 = {this.A.c(), this.B.c()};
        ArrayList arrayList4 = new ArrayList(2);
        for (int i5 = 0; i5 < 2; i5++) {
            Object obj2 = objArr2[i5];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
        }
        return Collections.unmodifiableList(arrayList4);
    }

    public final xx7 K(String str, String str2, er8 er8Var, iz izVar, iz izVar2) {
        Matrix matrix = this.l;
        cj0 cj0VarD = d();
        Objects.requireNonNull(cj0VarD);
        boolean zQ = cj0VarD.q();
        Size size = izVar.a;
        Rect rect = this.k;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        cj0 cj0VarD2 = d();
        Objects.requireNonNull(cj0VarD2);
        int i = i(cj0VarD2, false);
        cj0 cj0VarD3 = d();
        Objects.requireNonNull(cj0VarD3);
        xx7 xx7Var = new xx7(3, 34, izVar, matrix, zQ, rect, i, -1, o(cj0VarD3));
        this.w = xx7Var;
        Objects.requireNonNull(d());
        this.y = xx7Var;
        b57 b57VarL = L(this.w, er8Var, izVar);
        this.A = b57VarL;
        c57 c57Var = this.C;
        if (c57Var != null) {
            c57Var.b();
        }
        c57 c57Var2 = new c57(new fl7(this, str, str2, er8Var, izVar, izVar2));
        this.C = c57Var2;
        b57VarL.f = c57Var2;
        return this.y;
    }

    public final b57 L(xx7 xx7Var, er8 er8Var, iz izVar) {
        b57 b57VarD = b57.d(er8Var, izVar.a);
        xm0 xm0Var = b57VarD.b;
        oy8 oy8Var = this.r;
        Iterator it = oy8Var.X.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((f57) ((hq8) it.next()).h.d(er8.L)).g.c;
            List list = f57.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            xm0Var.Y = i;
        }
        Size size = izVar.a;
        Iterator it2 = oy8Var.X.iterator();
        while (it2.hasNext()) {
            f57 f57VarC = b57.d(((hq8) it2.next()).h, size).c();
            ym0 ym0Var = f57VarC.g;
            xm0Var.b(ym0Var.d);
            List<xg0> list2 = f57VarC.e;
            ArrayList arrayList = b57VarD.e;
            for (xg0 xg0Var : list2) {
                xm0Var.c(xg0Var);
                if (!arrayList.contains(xg0Var)) {
                    arrayList.add(xg0Var);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : f57VarC.d) {
                ArrayList arrayList2 = b57VarD.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : f57VarC.c) {
                ArrayList arrayList3 = b57VarD.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            xm0Var.d(ym0Var.b);
        }
        xx7Var.getClass();
        s08.b();
        xx7Var.a();
        mb6.s("Consumer can only be linked once.", !xx7Var.j);
        xx7Var.j = true;
        b57VarD.b(xx7Var.l, izVar.c, -1);
        xm0Var.c(oy8Var.j0);
        l11 l11Var = izVar.f;
        if (l11Var != null) {
            xm0Var.d(l11Var);
        }
        b57VarD.h = izVar.d;
        a(b57VarD, izVar);
        return b57VarD;
    }

    @Override // defpackage.hq8
    public final er8 g(boolean z, hr8 hr8Var) {
        hl7 hl7Var = this.q;
        l11 l11VarA = hr8Var.a(hl7Var.s(), 1);
        if (z) {
            l11VarA = l11.q(l11VarA, hl7Var.X);
        }
        if (l11VarA == null) {
            return null;
        }
        return ((fg0) m(l11VarA)).d();
    }

    @Override // defpackage.hq8
    public final Set k(aj0 aj0Var) {
        HashSet hashSet = this.r.X;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set setK = ((hq8) it.next()).k(aj0Var);
            if (setK != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(setK);
                } else {
                    hashSet2.retainAll(setK);
                }
            }
        }
        return hashSet2;
    }

    @Override // defpackage.hq8
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.hq8
    public final dr8 m(l11 l11Var) {
        return new fg0(k05.k(l11Var));
    }

    @Override // defpackage.hq8
    public final void t() {
        oy8 oy8Var = this.r;
        for (hq8 hq8Var : oy8Var.X) {
            ny8 ny8Var = (ny8) oy8Var.Z.get(hq8Var);
            Objects.requireNonNull(ny8Var);
            hq8Var.b(ny8Var, null, null, hq8Var.g(true, oy8Var.g0));
        }
    }

    @Override // defpackage.hq8
    public final void u() {
        Iterator it = this.r.X.iterator();
        while (it.hasNext()) {
            ((hq8) it.next()).u();
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    @Override // defpackage.hq8
    public final er8 v(aj0 aj0Var, dr8 dr8Var) {
        er8 er8Var;
        er8 er8Var2;
        Object px1Var;
        ?? r5;
        ?? r4;
        k05 k05VarB = dr8Var.b();
        oy8 oy8Var = this.r;
        HashSet hashSet = oy8Var.k0;
        gf6 gf6Var = oy8Var.m0;
        List listT = gf6Var.f.t(34);
        HashSet hashSet2 = gf6Var.d;
        Iterator it = hashSet2.iterator();
        while (true) {
            er8Var = null;
            if (!it.hasNext()) {
                break;
            }
            er8 er8Var3 = (er8) it.next();
            if (!((Boolean) er8Var3.a(er8.V, Boolean.FALSE)).booleanValue() && (er8Var3 instanceof i63)) {
            }
        }
        List list = (List) k05VarB.a(i63.z, null);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    listT = new ArrayList();
                    break;
                }
                Pair pair = (Pair) it2.next();
                if (((Integer) pair.first).equals(34)) {
                    listT = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
        }
        Rational rational = gf6Var.c;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet3 = new HashSet();
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            hashSet3.addAll(gf6Var.c((er8) it3.next()));
        }
        Iterator it4 = hashSet3.iterator();
        while (it4.hasNext()) {
            if (!ru.a(rational, (Size) it4.next())) {
                arrayList.addAll(gf6Var.g(gf6Var.b, listT, false));
                break;
            }
        }
        int size = arrayList.size();
        if (!hashSet2.isEmpty()) {
            Iterator it5 = hashSet2.iterator();
            loop9: while (true) {
                if (!it5.hasNext()) {
                    er8Var2 = er8Var;
                    size = 0;
                    break;
                }
                Iterator it6 = gf6Var.c((er8) it5.next()).iterator();
                boolean z = false;
                boolean z2 = false;
                while (it6.hasNext()) {
                    er8Var2 = er8Var;
                    boolean zA = ru.a(rational, (Size) it6.next());
                    if (zA) {
                        z = true;
                    }
                    if (z2 && zA) {
                        break loop9;
                    }
                    if (!zA) {
                        z2 = true;
                    }
                    er8Var = er8Var2;
                }
                er8Var2 = er8Var;
                if (!z) {
                    break;
                }
                er8Var = er8Var2;
            }
        } else {
            er8Var2 = null;
        }
        arrayList.addAll(size, gf6Var.g(rational, listT, false));
        arrayList.addAll(gf6Var.f(listT, false));
        if (arrayList.isEmpty()) {
            hi5.z0("ResolutionsMerger");
            arrayList.addAll(gf6Var.f(listT, true));
        }
        arrayList.toString();
        hi5.z0("ResolutionsMerger");
        k05VarB.o(i63.B, arrayList);
        zx zxVar = er8.P;
        Iterator it7 = hashSet.iterator();
        int iMax = 0;
        while (it7.hasNext()) {
            iMax = Math.max(iMax, ((Integer) ((er8) it7.next()).a(er8.P, 0)).intValue());
        }
        k05VarB.o(zxVar, Integer.valueOf(iMax));
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            px1 px1Var2 = (px1) ((er8) it8.next()).a(e63.r, px1.c);
            px1Var2.getClass();
            arrayList2.add(px1Var2);
        }
        if (!arrayList2.isEmpty()) {
            px1 px1Var3 = (px1) arrayList2.get(0);
            Integer numValueOf = Integer.valueOf(px1Var3.a);
            int i = 1;
            ?? ValueOf = Integer.valueOf(px1Var3.b);
            ?? r6 = numValueOf;
            while (true) {
                if (i >= arrayList2.size()) {
                    px1Var = new px1(r6.intValue(), ValueOf.intValue());
                    break;
                }
                px1 px1Var4 = (px1) arrayList2.get(i);
                Integer numValueOf2 = Integer.valueOf(px1Var4.a);
                if (r6.equals(0)) {
                    r5 = r6;
                    r5 = numValueOf2;
                } else if (!numValueOf2.equals(0)) {
                    if (!r6.equals(2) || numValueOf2.equals(1)) {
                        r5 = r6;
                        r5 = r6;
                        if (!numValueOf2.equals(2) || r6.equals(1)) {
                            r5 = r6;
                            boolean zEquals = r6.equals(numValueOf2);
                            r5 = r6;
                            if (!zEquals) {
                                r5 = er8Var2;
                            }
                        }
                    } else {
                        r5 = r6;
                        r5 = numValueOf2;
                    }
                }
                r5 = r6;
                r5 = r6;
                Integer numValueOf3 = Integer.valueOf(px1Var4.b);
                if (ValueOf.equals(0)) {
                    r4 = numValueOf3;
                } else if (!numValueOf3.equals(0) && !ValueOf.equals(numValueOf3)) {
                    r4 = ValueOf;
                    r4 = ValueOf;
                    r4 = er8Var2;
                }
                if (r5 == 0 || r4 == 0) {
                    px1Var = er8Var2;
                    break;
                }
                i++;
                ValueOf = r4;
                r6 = r5;
            }
        } else {
            px1Var = er8Var2;
            break;
        }
        if (px1Var == null) {
            bt.q("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
            return er8Var2;
        }
        k05VarB.o(e63.r, px1Var);
        zx zxVar2 = er8.R;
        Range rangeExtend = iz.h;
        Iterator it9 = hashSet.iterator();
        while (it9.hasNext()) {
            Range range = (Range) ((er8) it9.next()).a(er8.R, rangeExtend);
            Objects.requireNonNull(range);
            if (iz.h.equals(rangeExtend)) {
                rangeExtend = range;
            } else {
                try {
                    rangeExtend = rangeExtend.intersect(range);
                } catch (IllegalArgumentException unused) {
                    Objects.toString(rangeExtend);
                    range.toString();
                    hi5.z0("VirtualCameraAdapter");
                    rangeExtend = rangeExtend.extend(range);
                }
            }
        }
        k05VarB.o(zxVar2, rangeExtend);
        Iterator it10 = oy8Var.X.iterator();
        while (it10.hasNext()) {
            er8 er8Var4 = (er8) oy8Var.l0.get((hq8) it10.next());
            Objects.requireNonNull(er8Var4);
            if (er8Var4.t() != 0) {
                k05VarB.o(er8.b0, Integer.valueOf(er8Var4.t()));
            }
            if (er8Var4.B() != 0) {
                k05VarB.o(er8.a0, Integer.valueOf(er8Var4.B()));
            }
        }
        return dr8Var.d();
    }

    @Override // defpackage.hq8
    public final void x() {
        Iterator it = this.r.X.iterator();
        while (it.hasNext()) {
            ((hq8) it.next()).x();
        }
    }

    @Override // defpackage.hq8
    public final void y() {
        Iterator it = this.r.X.iterator();
        while (it.hasNext()) {
            ((hq8) it.next()).y();
        }
    }

    @Override // defpackage.hq8
    public final iz z(l11 l11Var) {
        this.A.a(l11Var);
        Object[] objArr = {this.A.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        xy0 xy0VarB = this.i.b();
        xy0VarB.i0 = l11Var;
        return xy0VarB.b();
    }
}
