package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class va0 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static final pz4 a(zu3 zu3Var) {
        qs0 qs0VarF0;
        qs0 qs0Var;
        Object objPutIfAbsent;
        ev3 ev3Var = zu3Var instanceof ev3 ? (ev3) zu3Var : null;
        if (ev3Var == null || (qs0VarF0 = ev3Var.f0()) == null || (qs0Var = (qs0) ll3.m.get(qs0VarF0)) == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = b;
        Object rz4Var = concurrentHashMap.get(qs0Var);
        if (rz4Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(qs0Var, (rz4Var = new rz4((ev3) zu3Var, qs0Var)))) != null) {
            rz4Var = objPutIfAbsent;
        }
        return (pz4) rz4Var;
    }

    public static final yy3 b(qs0 qs0Var) throws IOException {
        InputStream inputStreamA;
        ra0 ra0Var;
        qs0Var.getClass();
        fk2 fk2Var = qs0Var.a;
        if (!ug7.q.contains(fk2Var)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = a;
        SoftReference softReference = (SoftReference) concurrentHashMap.get(fk2Var);
        if (softReference == null || (ra0Var = (ra0) softReference.get()) == null) {
            ia6.d(dn8.class);
            fk2Var.getClass();
            v15 v15Var = ug7.j;
            v15Var.getClass();
            if (fk2Var.a.h(v15Var)) {
                ja0.m.getClass();
                inputStreamA = qa0.a(ja0.a(fk2Var));
            } else {
                inputStreamA = null;
            }
            if (inputStreamA == null) {
                ra0Var = ra0.b;
            } else {
                az5 az5Var = (az5) z68.z0(inputStreamA).X;
                q02 q02Var = az5Var != null ? new q02(az5Var) : null;
                if (q02Var == null) {
                    throw new p14("Builtins metadata for " + fk2Var + " has unsupported version. Please update kotlin-reflect.");
                }
                ra0Var = new ra0((ps) q02Var.Y);
                concurrentHashMap.put(fk2Var, new SoftReference(ra0Var));
            }
        }
        yy3 yy3Var = (yy3) ra0Var.a.get(qs0Var.b());
        if (yy3Var != null) {
            return yy3Var;
        }
        throw new p14("Builtin class metadata not found for " + qs0Var + '.');
    }
}
