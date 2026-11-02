package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ql0 {
    public static final ql0 a = new ql0();

    public void a(y53 y53Var, xm0 xm0Var) {
        int i;
        ym0 ym0Var = (ym0) y53Var.a(er8.M, null);
        qd5 qd5Var = qd5.Z;
        qd5Var.getClass();
        zx zxVar = ym0.f;
        HashSet hashSet = new HashSet();
        k05 k05VarJ = k05.j();
        ArrayList arrayList = new ArrayList();
        a15 a15VarA = a15.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        qd5 qd5VarC = qd5.c(k05VarJ);
        ArrayList arrayList3 = new ArrayList(arrayList);
        d18 d18Var = d18.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a15VarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        new ym0(arrayList2, qd5VarC, -1, arrayList3, new d18(arrayMap));
        if (ym0Var != null) {
            int i2 = ym0Var.c;
            xm0Var.b(ym0Var.d);
            qd5 qd5Var2 = ym0Var.b;
            ((a15) xm0Var.h0).a.putAll((Map) ym0Var.e.a);
            List listUnmodifiableList = Collections.unmodifiableList(ym0Var.a);
            listUnmodifiableList.getClass();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                ((HashSet) xm0Var.f0).add((wg1) it.next());
            }
            i = i2;
            qd5Var = qd5Var2;
        } else {
            i = -1;
        }
        xm0Var.g0 = k05.k(qd5Var);
        Object objA = y53Var.a(gg0.j0, Integer.valueOf(i));
        objA.getClass();
        xm0Var.Y = ((Number) objA).intValue();
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) y53Var.a(gg0.m0, null);
        if (captureCallback != null) {
            xm0Var.c(new ol0(captureCallback));
        }
        fg0 fg0Var = new fg0((byte) 2);
        y53Var.g(new jn0(fg0Var, y53Var, (byte) 0));
        xm0Var.d(new wl6((Object) qd5.c(fg0Var.Y), (byte) 18));
    }
}
