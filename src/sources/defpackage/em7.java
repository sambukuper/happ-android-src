package defpackage;

import com.google.firebase.datatransport.TransportRegistrar;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class em7 implements m78, ry0, zn2 {
    public static final em7 Y = new em7(5);
    public static final em7 Z = new em7(6);
    public static final em7 f0 = new em7(7);
    public static final em7 g0 = new em7(8);
    public static final em7 h0 = new em7(9);
    public final /* synthetic */ byte X;

    public /* synthetic */ em7(byte b) {
        this.X = b;
    }

    public static /* synthetic */ void b(int i, Object obj, Object obj2) {
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + obj + obj2 + i);
    }

    public static /* synthetic */ void c(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void e(Object obj, Object obj2, Object obj3) {
        throw new AssertionError("Thread " + obj + obj2 + obj3);
    }

    public static /* synthetic */ void f(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void g(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    @Override // defpackage.zn2
    public Object apply(Object obj) {
        long j;
        long jA;
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            k49 k49Var = (k49) it.next();
            u39 u39Var = k49Var.b;
            List list2 = k49Var.r;
            u91 u91Var = !list2.isEmpty() ? (u91) list2.get(0) : u91.b;
            UUID uuidFromString = UUID.fromString(k49Var.a);
            uuidFromString.getClass();
            HashSet hashSet = new HashSet(k49Var.p);
            u91 u91Var2 = k49Var.c;
            int i = k49Var.h;
            int i2 = k49Var.m;
            p31 p31Var = k49Var.g;
            long j2 = k49Var.d;
            long j3 = k49Var.e;
            t39 t39Var = j3 != 0 ? new t39(j3, k49Var.f) : null;
            u39 u39Var2 = u39.X;
            if (u39Var == u39Var2) {
                em7 em7Var = l49.z;
                j = j2;
                jA = c18.a(u39Var == u39Var2 && i > 0, i, k49Var.i, k49Var.j, k49Var.k, k49Var.l, j3 != 0, j, k49Var.f, j3, k49Var.n);
            } else {
                j = j2;
                jA = Long.MAX_VALUE;
            }
            arrayList.add(new v39(uuidFromString, u39Var, hashSet, u91Var2, u91Var, i, i2, p31Var, j, t39Var, jA, k49Var.o, k49Var.q));
        }
        return arrayList;
    }

    @Override // defpackage.ry0
    public Object d(y5 y5Var) {
        switch (this.X) {
            case 11:
                return TransportRegistrar.lambda$getComponents$0(y5Var);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return TransportRegistrar.lambda$getComponents$1(y5Var);
            default:
                return TransportRegistrar.lambda$getComponents$2(y5Var);
        }
    }
}
