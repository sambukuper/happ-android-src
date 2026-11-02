package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sv6 {
    public static final we5 a = new we5(18);
    public static final g55 b;
    public static final we5 c;

    static {
        byte b2 = 19;
        b = new g55(b2);
        c = new we5(b2);
    }

    public static final ov6 a(sz4 sz4Var) {
        ov6 ov6Var;
        LinkedHashMap linkedHashMap = sz4Var.a;
        yv6 yv6Var = (yv6) linkedHashMap.get(a);
        Bundle bundle = null;
        if (yv6Var == null) {
            bt.q("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        fx8 fx8Var = (fx8) linkedHashMap.get(b);
        if (fx8Var == null) {
            bt.q("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(c);
        String str = (String) linkedHashMap.get(dx8.a);
        if (str == null) {
            bt.q("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        wv6 wv6VarS = yv6Var.f().s("androidx.lifecycle.internal.SavedStateHandlesProvider");
        tv6 tv6Var = wv6VarS instanceof tv6 ? (tv6) wv6VarS : null;
        if (tv6Var == null) {
            bt.i("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = c(fx8Var).b;
        ov6 ov6Var2 = (ov6) linkedHashMap2.get(str);
        if (ov6Var2 != null) {
            return ov6Var2;
        }
        tv6Var.b();
        Bundle bundle3 = tv6Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = dh3.h((qg5[]) Arrays.copyOf(new qg5[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                tv6Var.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            ov6Var = new ov6();
        } else {
            ClassLoader classLoader = ov6.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            ip4 ip4Var = new ip4(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                ip4Var.put(str2, bundle2.get(str2));
            }
            ov6Var = new ov6(ip4Var.b());
        }
        linkedHashMap2.put(str, ov6Var);
        return ov6Var;
    }

    public static final void b(yv6 yv6Var) {
        o84 o84Var = yv6Var.getH0().i;
        if (o84Var == o84.Y || o84Var == o84.Z) {
            if (yv6Var.f().s("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
                tv6 tv6Var = new tv6(yv6Var.f(), (fx8) yv6Var);
                yv6Var.f().D("androidx.lifecycle.internal.SavedStateHandlesProvider", tv6Var);
                yv6Var.getH0().a(new r86(tv6Var, (byte) 5));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Failed to enable `SavedStateHandle` for `" + yv6Var + "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `" + o84Var + "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.").toString());
    }

    public static final uv6 c(fx8 fx8Var) {
        rv6 rv6Var = new rv6();
        o71 o71VarD = fx8Var instanceof iz2 ? ((iz2) fx8Var).d() : n71.b;
        o71VarD.getClass();
        ex8 ex8VarE = fx8Var.e();
        ex8VarE.getClass();
        return (uv6) new yr6(ex8VarE, rv6Var, o71VarD).g(yb6.a.b(uv6.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
