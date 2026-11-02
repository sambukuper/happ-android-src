package defpackage;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sp3 {
    public static final be a = new be((byte) 22);

    public static final int a(e37 e37Var, vm3 vm3Var, String str) {
        e37Var.getClass();
        vm3Var.getClass();
        str.getClass();
        d(vm3Var, e37Var);
        int iD = e37Var.d(str);
        if (iD != -3 || !vm3Var.a.f) {
            return iD;
        }
        yr2 yr2Var = vm3Var.c;
        a23 a23Var = new a23((Object) e37Var, (Object) vm3Var, (byte) 1);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) yr2Var.Y;
        Map map = (Map) concurrentHashMap.get(e37Var);
        be beVar = a;
        Object obj = map != null ? map.get(beVar) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = a23Var.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(e37Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(e37Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(beVar, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(e37 e37Var, vm3 vm3Var, String str, String str2) {
        e37Var.getClass();
        vm3Var.getClass();
        str.getClass();
        int iA = a(e37Var, vm3Var, str);
        if (iA != -3) {
            return iA;
        }
        throw new m37(e37Var.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean c(vm3 vm3Var, e37 e37Var) {
        e37Var.getClass();
        vm3Var.getClass();
        if (vm3Var.a.a) {
            return true;
        }
        List annotations = e37Var.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof bp3) {
                return true;
            }
        }
        return false;
    }

    public static final void d(vm3 vm3Var, e37 e37Var) {
        e37Var.getClass();
        vm3Var.getClass();
        dh3.f(e37Var.r(), pm7.M);
    }
}
