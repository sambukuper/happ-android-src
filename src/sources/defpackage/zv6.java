package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zv6 implements bx8 {
    public final Application a;
    public final ax8 b;
    public final Bundle c;
    public final g94 d;
    public final xd6 e;

    public zv6(Application application, yv6 yv6Var, Bundle bundle) {
        ax8 ax8Var;
        this.e = yv6Var.f();
        this.d = yv6Var.getH0();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            ax8Var = ax8.c;
            if (ax8Var == null) {
                ax8Var = new ax8(application);
                ax8.c = ax8Var;
            }
        } else {
            ax8Var = new ax8(null);
        }
        this.b = ax8Var;
    }

    @Override // defpackage.bx8
    public final xw8 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        bt.q("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.bx8
    public final xw8 b(Class cls, sz4 sz4Var) {
        LinkedHashMap linkedHashMap = sz4Var.a;
        String str = (String) linkedHashMap.get(dx8.a);
        if (str == null) {
            bt.i("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(sv6.a) == null || linkedHashMap.get(sv6.b) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            bt.i("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(ax8.d);
        boolean zIsAssignableFrom = fi.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? aw6.a(cls, aw6.b) : aw6.a(cls, aw6.a);
        if (constructorA == null) {
            return this.b.b(cls, sz4Var);
        }
        return (!zIsAssignableFrom || application == null) ? aw6.b(cls, constructorA, sv6.a(sz4Var)) : aw6.b(cls, constructorA, application, sv6.a(sz4Var));
    }

    @Override // defpackage.bx8
    public final xw8 c(zu3 zu3Var, sz4 sz4Var) {
        zu3Var.getClass();
        return b(zc1.M(zu3Var), sz4Var);
    }

    public final xw8 d(Class cls, String str) {
        ov6 ov6Var;
        g94 g94Var = this.d;
        if (g94Var == null) {
            u52.k("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = fi.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? aw6.a(cls, aw6.b) : aw6.a(cls, aw6.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            cx8 cx8Var = cx8.a;
            if (cx8Var == null) {
                cx8Var = new cx8();
                cx8.a = cx8Var;
            }
            return cx8Var.a(cls);
        }
        xd6 xd6Var = this.e;
        xd6Var.getClass();
        Bundle bundleI = xd6Var.i(str);
        if (bundleI == null) {
            bundleI = this.c;
        }
        if (bundleI == null) {
            ov6Var = new ov6();
        } else {
            ClassLoader classLoader = ov6.class.getClassLoader();
            classLoader.getClass();
            bundleI.setClassLoader(classLoader);
            ip4 ip4Var = new ip4(bundleI.size());
            for (String str2 : bundleI.keySet()) {
                str2.getClass();
                ip4Var.put(str2, bundleI.get(str2));
            }
            ov6Var = new ov6(ip4Var.b());
        }
        pv6 pv6Var = new pv6(str, ov6Var);
        pv6Var.g(xd6Var, g94Var);
        o84 o84Var = g94Var.i;
        if (o84Var == o84.Y || o84Var.compareTo(o84.f0) >= 0) {
            xd6Var.H();
        } else {
            g94Var.a(new jf1((Object) g94Var, (Object) xd6Var, (byte) 3));
        }
        xw8 xw8VarB = (!zIsAssignableFrom || application == null) ? aw6.b(cls, constructorA, ov6Var) : aw6.b(cls, constructorA, application, ov6Var);
        xw8VarB.a("androidx.lifecycle.savedstate.vm.tag", pv6Var);
        return xw8VarB;
    }
}
