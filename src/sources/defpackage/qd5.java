package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class qd5 implements l11 {
    public static final cg Y;
    public static final qd5 Z;
    public final TreeMap X;

    static {
        cg cgVar = new cg((byte) 6);
        Y = cgVar;
        Z = new qd5(new TreeMap(cgVar));
    }

    public qd5(TreeMap treeMap) {
        this.X = treeMap;
    }

    public static qd5 c(l11 l11Var) {
        if (qd5.class.equals(l11Var.getClass())) {
            return (qd5) l11Var;
        }
        TreeMap treeMap = new TreeMap(Y);
        for (zx zxVar : l11Var.b()) {
            Set<k11> setE = l11Var.e(zxVar);
            ArrayMap arrayMap = new ArrayMap();
            for (k11 k11Var : setE) {
                arrayMap.put(k11Var, l11Var.f(zxVar, k11Var));
            }
            treeMap.put(zxVar, arrayMap);
        }
        return new qd5(treeMap);
    }

    @Override // defpackage.l11
    public final Object a(zx zxVar, Object obj) {
        Map map = (Map) this.X.get(zxVar);
        return map == null ? obj : map.get((k11) Collections.min(map.keySet()));
    }

    @Override // defpackage.l11
    public final Set b() {
        return Collections.unmodifiableSet(this.X.keySet());
    }

    @Override // defpackage.l11
    public final Object d(zx zxVar) {
        Map map = (Map) this.X.get(zxVar);
        if (map != null) {
            return map.get((k11) Collections.min(map.keySet()));
        }
        u52.j(zxVar, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.l11
    public final Set e(zx zxVar) {
        Map map = (Map) this.X.get(zxVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.l11
    public final Object f(zx zxVar, k11 k11Var) {
        Map map = (Map) this.X.get(zxVar);
        if (map == null) {
            u52.j(zxVar, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(k11Var)) {
            return map.get(k11Var);
        }
        b61.l("Option does not exist: ", zxVar, " with priority=", k11Var);
        return null;
    }

    @Override // defpackage.l11
    public final void g(jn0 jn0Var) {
        for (Map.Entry entry : this.X.tailMap(new zx("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((zx) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            zx zxVar = (zx) entry.getKey();
            fg0 fg0Var = (fg0) jn0Var.Y;
            l11 l11Var = (l11) jn0Var.Z;
            zxVar.getClass();
            fg0Var.Y.l(zxVar, l11Var.i(zxVar), l11Var.d(zxVar));
        }
    }

    @Override // defpackage.l11
    public final boolean h(zx zxVar) {
        return this.X.containsKey(zxVar);
    }

    @Override // defpackage.l11
    public final k11 i(zx zxVar) {
        Map map = (Map) this.X.get(zxVar);
        if (map != null) {
            return (k11) Collections.min(map.keySet());
        }
        u52.j(zxVar, "Option does not exist: ");
        return null;
    }
}
