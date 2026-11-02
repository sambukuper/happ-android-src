package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import android.os.Trace;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p91 {
    public Object a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public p91(Context context, List list, yr2 yr2Var) {
        this.a = context;
        this.b = list;
        this.c = yr2Var;
        this.d = i21.L("1.0.0.1", "1.0.0.2", RouteSettings.DEFAULT_REMOTE_DNS_IP, "2.56.220.2", "3.7.156.128", "8.8.4.4", RouteSettings.DEFAULT_DOMESTIC_DNS_IP, "9.9.9.9", "9.9.9.10", "9.9.9.11", "45.11.45.11", "45.67.219.208", "52.80.52.52", "52.80.60.30", "52.80.66.66", "62.192.153.242", "64.6.64.6", "64.6.65.6", "74.82.42.42", "76.76.2.0", "76.76.2.1", "76.76.2.3", "76.76.10.0", "77.88.8.1", "77.88.8.2", "77.88.8.3", "77.88.8.7", "77.88.8.8", "77.88.8.88", "78.47.64.161", "83.220.169.155", "88.198.92.222", "94.130.110.178", "94.130.180.225", "94.140.14.14", "95.85.95.85", "101.226.4.6", "104.155.237.225", "104.197.28.121", "114.114.114.114", "117.50.10.10", "117.50.60.30", "119.28.28.28", "119.29.29.29", "123.125.81.6", "149.112.112.10", "149.112.112.11", "149.112.121.10", "149.112.121.20", "149.112.121.30", "149.112.122.10", "149.112.122.20", "149.112.122.30", "155.248.232.226", "156.154.70.1", "156.154.70.2", "156.154.70.3", "156.154.70.4", "156.154.70.5", "156.154.71.1", "156.154.71.2", "156.154.71.3", "156.154.71.4", "156.154.71.5", "172.104.93.80", "174.138.21.128", "176.9.1.117", "176.9.93.198", "180.184.2.2", "180.76.76.76", "185.222.222.222", "185.228.168.9", "185.228.168.10", "185.228.168.168", "185.228.169.9", "185.228.169.11", "185.228.169.168", "194.169.169.169", "195.46.39.39", "195.46.39.40", "195.133.25.16", "195.208.4.1", "195.208.5.1", "208.67.222.2", "212.109.195.93", "212.188.31.154", "212.188.31.155", "218.30.118.6", "223.5.5.5", "223.6.6.6");
        this.e = i21.L(RouteSettings.DEFAULT_DOMESTIC_DNS_IP, RouteSettings.DEFAULT_REMOTE_DNS_IP, "77.88.8.8");
        vz7 vz7Var = new vz7(new w01((byte) 17));
        this.f = vz7Var;
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        this.h = gv3.c(g33.K(ow7VarB, ye1.Z));
        this.i = "google.com";
        try {
            String strI = ((MMKV) vz7Var.getValue()).i("WorkDomainsInStorage");
            if (strI != null) {
                a aVar = yw2.c;
                Class<?> cls = new ArrayList().getClass();
                aVar.getClass();
                Object objC = aVar.c(strI, new yi8(cls));
                objC.getClass();
                this.j = wv0.Y0((Iterable) objC);
                jh4.v(yr2Var, "loadData", null, 6);
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
        long jG = ((MMKV) ((vz7) this.f).getValue()).g("DateLastCheckDomains");
        boolean z = jG <= 1 || 259200000 + jG < System.currentTimeMillis();
        yr2 yr2Var2 = (yr2) this.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbS = pc6.s(jG, "lastCheck:", " current:");
        sbS.append(jCurrentTimeMillis);
        sbS.append(" isExpired:");
        sbS.append(z);
        jh4.v(yr2Var2, sbS.toString(), DnsTTLogType.INFO, 4);
        jm4.Q((m51) this.h, null, new qq1(z, this, null), 3);
    }

    public static final boolean g(pp2 pp2Var, c15 c15Var) {
        Object[] objArr = c15Var.X;
        int i = c15Var.Z;
        for (int i2 = 0; i2 < i; i2++) {
            vc6 vc6Var = ((pp2) objArr[i2]).a;
            if (vc6Var instanceof nj5) {
                c15 c15Var2 = ((nj5) vc6Var).Y;
                if (c15Var2.j(pp2Var) || g(pp2Var, c15Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static p91 h() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? b77.a : new p91((byte) 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(a77 a77Var, float[] fArr, float f, RectF rectF, q02 q02Var, Path path) {
        char c;
        int i;
        oy1 oy1Var;
        char c2;
        m61 es0Var;
        z91 z91Var;
        Matrix[] matrixArr = (Matrix[]) this.c;
        float[] fArr2 = (float[]) this.h;
        l77[] l77VarArr = (l77[]) this.a;
        Matrix[] matrixArr2 = (Matrix[]) this.b;
        path.rewind();
        Path path2 = (Path) this.e;
        path2.rewind();
        Path path3 = (Path) this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            c = 0;
            int i3 = 1;
            if (i2 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.d;
            if (fArr != null) {
                es0Var = new es0(fArr[i2]);
                i3 = 1;
            } else if (i2 == 1) {
                es0Var = a77Var.g;
            } else if (i2 != 2) {
                es0Var = i2 != 3 ? a77Var.f : a77Var.e;
            } else {
                es0Var = a77Var.h;
            }
            if (i2 == i3) {
                z91Var = a77Var.c;
            } else if (i2 != 2) {
                z91Var = i2 != 3 ? a77Var.b : a77Var.a;
            } else {
                z91Var = a77Var.d;
            }
            Matrix[] matrixArr3 = matrixArr;
            l77 l77Var = l77VarArr[i2];
            z91Var.getClass();
            z91Var.D(l77Var, f, es0Var.a(rectF));
            int i4 = i2 + 1;
            float f2 = (i4 % 4) * 90;
            matrixArr2[i2].reset();
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            l77 l77Var2 = l77VarArr[i2];
            fArr2[0] = l77Var2.c;
            fArr2[1] = l77Var2.d;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr3[i2].reset();
            matrixArr3[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i2].preRotate(f2);
            i2 = i4;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        char c3 = 1;
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            l77 l77Var3 = l77VarArr[i5];
            fArr2[c] = l77Var3.a;
            fArr2[c3] = l77Var3.b;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[c], fArr2[c3]);
            } else {
                path.lineTo(fArr2[c], fArr2[c3]);
            }
            l77VarArr[i5].b(matrixArr2[i5], path);
            if (q02Var != null) {
                l77 l77Var4 = l77VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                gr4 gr4Var = (gr4) q02Var.Y;
                BitSet bitSet = gr4Var.g0;
                l77Var4.getClass();
                bitSet.set(i5, (boolean) c);
                k77[] k77VarArr = gr4Var.Z;
                l77Var4.a(l77Var4.f);
                k77VarArr[i5] = new e77(new ArrayList(l77Var4.h), new Matrix(matrix));
            }
            Path path4 = (Path) this.j;
            l77 l77Var5 = (l77) this.g;
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            l77 l77Var6 = l77VarArr[i5];
            l77[] l77VarArr2 = l77VarArr;
            fArr2[0] = l77Var6.c;
            fArr2[1] = l77Var6.d;
            matrixArr2[i5].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.i;
            l77 l77Var7 = l77VarArr2[i7];
            Matrix[] matrixArr5 = matrixArr2;
            fArr3[0] = l77Var7.a;
            fArr3[1] = l77Var7.b;
            matrixArr5[i7].mapPoints(fArr3);
            Path path5 = path2;
            Path path6 = path3;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, 0.0f);
            l77 l77Var8 = l77VarArr2[i5];
            fArr2[0] = l77Var8.c;
            fArr2[1] = l77Var8.d;
            matrixArr5[i5].mapPoints(fArr2);
            float fAbs = (i5 == 1 || i5 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            l77Var5.d(0.0f, 0.0f, 270.0f, 0.0f);
            if (i5 == 1) {
                oy1Var = a77Var.k;
            } else if (i5 != 2) {
                oy1Var = i5 != 3 ? a77Var.j : a77Var.i;
            } else {
                oy1Var = a77Var.l;
            }
            oy1Var.x(fMax, fAbs, f, l77Var5);
            path4.reset();
            l77Var5.b(matrixArr4[i5], path4);
            if (oy1Var.w() || k(path4, i5) || k(path4, i7)) {
                path3 = path6;
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = l77Var5.a;
                c3 = 1;
                fArr2[1] = l77Var5.b;
                matrixArr4[i5].mapPoints(fArr2);
                path2 = path5;
                path2.moveTo(fArr2[0], fArr2[1]);
                l77Var5.b(matrixArr4[i5], path2);
            } else {
                l77Var5.b(matrixArr4[i5], path);
                path2 = path5;
                path3 = path6;
                c3 = 1;
            }
            if (q02Var != null) {
                Matrix matrix2 = matrixArr4[i5];
                gr4 gr4Var2 = (gr4) q02Var.Y;
                c2 = 0;
                gr4Var2.g0.set(i5 + 4, false);
                k77[] k77VarArr2 = gr4Var2.f0;
                l77Var5.a(l77Var5.f);
                k77VarArr2[i5] = new e77(new ArrayList(l77Var5.h), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            i5 = i6;
            c = c2;
            l77VarArr = l77VarArr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public void b() {
        this.a = null;
        this.b = null;
        c15 c15Var = (c15) this.c;
        c15Var.g();
        ((t05) this.d).b();
        this.e = c15Var;
        ((c15) this.f).g();
        ((c15) this.g).g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public void c() {
        Set set = (Set) this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                vc6 vc6Var = (vc6) it.next();
                it.remove();
                vc6Var.a();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void d() {
        c15 c15Var = (c15) this.c;
        c15 c15Var2 = (c15) this.f;
        Set set = (Set) this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        byte b = 18;
        if (c15Var2.Z != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                t05 t05Var = (t05) this.h;
                int i = c15Var2.Z;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = c15Var2.X[i];
                    try {
                        if (obj instanceof pp2) {
                            vc6 vc6Var = ((pp2) obj).a;
                            set.remove(vc6Var);
                            vc6Var.b();
                        }
                        if (obj instanceof jz0) {
                            if (t05Var == null || !t05Var.c(obj)) {
                                ((jz0) obj).b();
                            } else {
                                ((jz0) obj).a();
                            }
                        }
                    } catch (Throwable th) {
                        p01 p01Var = (p01) this.b;
                        if (p01Var != null) {
                            os4.U(th, new p5(p01Var, obj, b));
                        }
                        throw th;
                    }
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (c15Var.Z != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.a;
                if (set2 != null) {
                    Object[] objArr = c15Var.X;
                    int i2 = c15Var.Z;
                    for (int i3 = 0; i3 < i2; i3++) {
                        pp2 pp2Var = (pp2) objArr[i3];
                        vc6 vc6Var2 = pp2Var.a;
                        set2.remove(vc6Var2);
                        try {
                            vc6Var2.c();
                        } catch (Throwable th3) {
                            p01 p01Var2 = (p01) this.b;
                            if (p01Var2 != null) {
                                os4.U(th3, new p5(p01Var2, pp2Var, b));
                            }
                            throw th3;
                        }
                    }
                }
                Trace.endSection();
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        }
    }

    public void e() {
        c15 c15Var = (c15) this.g;
        if (c15Var.Z != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = c15Var.X;
                int i = c15Var.Z;
                for (int i2 = 0; i2 < i; i2++) {
                    ((dn2) objArr[i2]).invoke();
                }
                c15Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void f(pp2 pp2Var) {
        c15 c15Var = (c15) this.c;
        if (!((t05) this.d).c(pp2Var)) {
            t05 t05Var = (t05) this.k;
            if (t05Var == null || !t05Var.c(pp2Var)) {
                ((c15) this.f).b(pp2Var);
                return;
            }
            return;
        }
        ((t05) this.d).l(pp2Var);
        if (!((c15) this.e).j(pp2Var) && !c15Var.j(pp2Var)) {
            g(pp2Var, c15Var);
        }
        Set set = (Set) this.a;
        if (set == null) {
            return;
        }
        set.add(pp2Var.a);
    }

    public List i() {
        Object rj6Var;
        try {
            List listM = i21.M((String) this.g);
            Iterable iterable = (List) this.k;
            if (iterable == null) {
                iterable = d02.X;
            }
            ArrayList arrayListH0 = wv0.H0(listM, iterable);
            boolean zIsEmpty = arrayListH0.isEmpty();
            rj6Var = arrayListH0;
            if (zIsEmpty) {
                rj6Var = null;
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return (List) (rj6Var instanceof rj6 ? null : rj6Var);
    }

    public List j() {
        Object rj6Var;
        List list = (List) this.d;
        try {
            List listC = t08.c((Context) this.a);
            jh4.v((yr2) this.c, "systemResolvers:" + listC, null, 6);
            list.getClass();
            List listA1 = wv0.a1(list);
            Collections.shuffle(listA1);
            rj6Var = wv0.H0(listC, listA1);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        Object obj = (List) this.e;
        if (rj6Var instanceof rj6) {
            rj6Var = obj;
        }
        return (List) rj6Var;
    }

    public boolean k(Path path, int i) {
        Path path2 = (Path) this.k;
        path2.reset();
        ((l77[]) this.a)[i].b(((Matrix[]) this.b)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public void l(Set set, p01 p01Var) {
        b();
        this.a = set;
        this.b = p01Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(s51 s51Var) {
        rq1 rq1Var;
        if (s51Var instanceof rq1) {
            rq1Var = (rq1) s51Var;
            int i = rq1Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                rq1Var.h0 = i - Integer.MIN_VALUE;
            } else {
                rq1Var = new rq1(this, s51Var);
            }
        } else {
            rq1Var = new rq1(this, s51Var);
        }
        Object objP = rq1Var.f0;
        int i2 = rq1Var.h0;
        dn8 dn8Var = dn8.a;
        if (i2 == 0) {
            w39.n0(objP);
            List list = (List) this.j;
            if (list != null) {
                rq1Var.h0 = 1;
                objP = p(list, rq1Var);
                Object obj = c71.X;
                if (objP == obj) {
                    return obj;
                }
            }
            return dn8Var;
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(objP);
        List list2 = (List) objP;
        if (list2 != null) {
            this.k = list2;
        }
        return dn8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if (r10 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(defpackage.s51 r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f
            vz7 r0 = (defpackage.vz7) r0
            boolean r1 = r10 instanceof defpackage.sq1
            if (r1 == 0) goto L17
            r1 = r10
            sq1 r1 = (defpackage.sq1) r1
            int r2 = r1.h0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.h0 = r2
            goto L1c
        L17:
            sq1 r1 = new sq1
            r1.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r1.f0
            int r2 = r1.h0
            r3 = 0
            r4 = 2
            r5 = 1
            c71 r6 = defpackage.c71.X
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            defpackage.w39.n0(r10)
            goto L99
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r9)
            return r3
        L35:
            defpackage.w39.n0(r10)
            goto L45
        L39:
            defpackage.w39.n0(r10)
            r1.h0 = r5
            java.io.Serializable r10 = r9.o(r1)
            if (r10 != r6) goto L45
            goto L98
        L45:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L4a
            goto L9f
        L4a:
            r9.j = r10
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L90
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L85
            com.tencent.mmkv.MMKV r2 = (com.tencent.mmkv.MMKV) r2     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = "WorkDomainsInStorage"
            kw4 r7 = defpackage.kw4.a     // Catch: java.lang.Throwable -> L85
            com.google.gson.a r7 = defpackage.kw4.g()     // Catch: java.lang.Throwable -> L85
            java.lang.Object r8 = r9.j     // Catch: java.lang.Throwable -> L85
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r7.h(r8)     // Catch: java.lang.Throwable -> L85
            r2.q(r5, r7)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L85
            com.tencent.mmkv.MMKV r0 = (com.tencent.mmkv.MMKV) r0     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "DateLastCheckDomains"
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L85
            r0.m(r7, r2)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r9.c     // Catch: java.lang.Throwable -> L85
            yr2 r0 = (defpackage.yr2) r0     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "saveData"
            r5 = 6
            defpackage.jh4.v(r0, r2, r3, r5)     // Catch: java.lang.Throwable -> L85
            goto L90
        L85:
            r0 = move-exception
            boolean r2 = r0 instanceof java.lang.InterruptedException
            if (r2 != 0) goto L8f
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L8f
            goto L90
        L8f:
            throw r0
        L90:
            r1.h0 = r4
            java.io.Serializable r10 = r9.p(r10, r1)
            if (r10 != r6) goto L99
        L98:
            return r6
        L99:
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L9f
            r9.k = r10
        L9f:
            dn8 r9 = defpackage.dn8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p91.n(s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v10, types: [su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.StringBuilder] */
    public Serializable o(s51 s51Var) throws Throwable {
        tq1 tq1Var;
        ?? r1;
        ?? rj6Var;
        int i;
        Object objD;
        long j;
        Set setEntrySet;
        yr2 yr2Var = (yr2) this.c;
        if (s51Var instanceof tq1) {
            tq1Var = (tq1) s51Var;
            int i2 = tq1Var.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tq1Var.i0 = i2 - Integer.MIN_VALUE;
            } else {
                tq1Var = new tq1(this, s51Var);
            }
        } else {
            tq1Var = new tq1(this, s51Var);
        }
        tq1 tq1Var2 = tq1Var;
        Object obj = tq1Var2.g0;
        int i3 = tq1Var2.i0;
        List list = null;
        try {
            if (i3 == 0) {
                w39.n0(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                jh4.v(yr2Var, "checkDnsDomains for TUNNEL START", DnsTTLogType.INFO, 4);
                bs1 bs1Var = bs1.a;
                List listJ = j();
                List list2 = (List) this.b;
                pq1 pq1Var = new pq1(this, (byte) 0);
                tq1Var2.f0 = jCurrentTimeMillis;
                tq1Var2.i0 = 1;
                list = list2;
                r1 = 0;
                i = 4;
                try {
                    objD = bs1Var.d(listJ, list, 2500, 1500L, pq1Var, tq1Var2);
                    c71 c71Var = c71.X;
                    if (objD == c71Var) {
                        return c71Var;
                    }
                    j = jCurrentTimeMillis;
                    r1 = r1;
                } catch (Throwable th) {
                    th = th;
                    r1 = r1;
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
            } else {
                if (i3 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = tq1Var2.f0;
                w39.n0(obj);
                objD = obj;
                i = 4;
                r1 = 0;
            }
            Map map = (Map) objD;
            String str = "checkDnsDomains for TUNNEL END successCount:" + (map != null ? new Integer(map.size()) : r1);
            DnsTTLogType dnsTTLogType = DnsTTLogType.INFO;
            jh4.v(yr2Var, str, dnsTTLogType, i);
            jh4.v(yr2Var, "mapResult:" + map, r1, 6);
            if (map == null || (setEntrySet = map.entrySet()) == null) {
                rj6Var = r1;
            } else {
                List listS0 = wv0.S0(setEntrySet, new l71((byte) 17));
                jh4.v(yr2Var, "sortMap:" + listS0, dnsTTLogType, i);
                jh4.v(yr2Var, "checkDnsDomains for TUNNEL END time:" + (System.currentTimeMillis() - j), dnsTTLogType, i);
                rj6Var = new ArrayList(xv0.Z(listS0, 10));
                Iterator it = listS0.iterator();
                while (it.hasNext()) {
                    rj6Var.add((String) ((Map.Entry) it.next()).getKey());
                }
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = list;
        }
        return rj6Var instanceof rj6 ? r1 : rj6Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [rj6] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public Serializable p(List list, s51 s51Var) {
        uq1 uq1Var;
        ?? rj6Var;
        long j;
        Set setEntrySet;
        yr2 yr2Var = (yr2) this.c;
        if (s51Var instanceof uq1) {
            uq1Var = (uq1) s51Var;
            int i = uq1Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                uq1Var.i0 = i - Integer.MIN_VALUE;
            } else {
                uq1Var = new uq1(this, s51Var);
            }
        } else {
            uq1Var = new uq1(this, s51Var);
        }
        uq1 uq1Var2 = uq1Var;
        Object obj = uq1Var2.g0;
        int i2 = uq1Var2.i0;
        byte b = 1;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                jh4.v(yr2Var, "checkDnsDomains for RESOLVE START", DnsTTLogType.INFO, 4);
                oy1 oy1Var = oy1.t0;
                String str = (String) this.i;
                pq1 pq1Var = new pq1(this, b);
                uq1Var2.f0 = jCurrentTimeMillis;
                uq1Var2.i0 = 1;
                Object objF = oy1Var.F(list, str, 500, pq1Var, uq1Var2);
                c71 c71Var = c71.X;
                if (objF == c71Var) {
                    return c71Var;
                }
                obj = objF;
                j = jCurrentTimeMillis;
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = uq1Var2.f0;
                w39.n0(obj);
            }
            Map map = (Map) obj;
            String str2 = "END successCount:" + (map != null ? new Integer(map.size()) : null);
            DnsTTLogType dnsTTLogType = DnsTTLogType.INFO;
            jh4.v(yr2Var, str2, dnsTTLogType, 4);
            jh4.v(yr2Var, "mapResult:" + map, null, 6);
            if (map == null || (setEntrySet = map.entrySet()) == null) {
                rj6Var = 0;
            } else {
                List listS0 = wv0.S0(setEntrySet, new l71((byte) 18));
                jh4.v(yr2Var, "sortMap:" + listS0, dnsTTLogType, 4);
                jh4.v(yr2Var, "checkDnsDomains for RESOLVE END time:" + (System.currentTimeMillis() - j), dnsTTLogType, 4);
                rj6Var = new ArrayList(xv0.Z(listS0, 10));
                Iterator it = listS0.iterator();
                while (it.hasNext()) {
                    rj6Var.add((String) ((Map.Entry) it.next()).getKey());
                }
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            return null;
        }
        return rj6Var;
    }

    public p91(byte b) {
        switch (b) {
            case 3:
                this.a = new l77[4];
                this.b = new Matrix[4];
                this.c = new Matrix[4];
                this.d = new PointF();
                this.e = new Path();
                this.f = new Path();
                this.g = new l77();
                this.h = new float[2];
                this.i = new float[2];
                this.j = new Path();
                this.k = new Path();
                for (int i = 0; i < 4; i++) {
                    ((l77[]) this.a)[i] = new l77();
                    ((Matrix[]) this.b)[i] = new Matrix();
                    ((Matrix[]) this.c)[i] = new Matrix();
                }
                break;
            default:
                c15 c15Var = new c15(0, new pp2[16]);
                this.c = c15Var;
                t05 t05Var = vw6.a;
                this.d = new t05();
                this.e = c15Var;
                this.f = new c15(0, new Object[16]);
                this.g = new c15(0, new dn2[16]);
                break;
        }
    }

    public p91(r91 r91Var, fu6 fu6Var) {
        this.b = r91Var;
        this.a = fu6Var;
        byte b = 1;
        this.c = rs1.a(new m91(b, b, r91Var, this));
        this.d = rs1.a(new m91(b, 2, r91Var, this));
        this.g = new m91(b, 4, r91Var, this);
        this.h = new m91(b, 5, r91Var, this);
        this.i = new m91(b, 6, r91Var, this);
        this.j = new m91(b, 7, r91Var, this);
        this.k = new m91(b, 8, r91Var, this);
        this.e = rs1.a(new m91(b, 3, r91Var, this));
        this.f = rs1.a(new m91(b, 0, r91Var, this));
    }
}
