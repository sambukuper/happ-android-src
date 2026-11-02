package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r86 implements a94 {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ r86(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // defpackage.a94
    public final void k(d94 d94Var, n84 n84Var) {
        View view;
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                yv6 yv6Var = (yv6) obj;
                if (n84Var != n84.ON_CREATE) {
                    bt.g("Next event must be ON_CREATE");
                    return;
                }
                d94Var.getH0().f(this);
                Bundle bundleI = yv6Var.f().i("androidx.savedstate.Restarter");
                if (bundleI == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleI.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    bt.i("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, r86.class.getClassLoader()).asSubclass(vv6.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(yv6Var instanceof fx8)) {
                                    xw3.s(yv6Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                ex8 ex8VarE = ((fx8) yv6Var).e();
                                xd6 xd6VarF = yv6Var.f();
                                LinkedHashMap linkedHashMap = ex8VarE.a;
                                LinkedHashMap linkedHashMap2 = ex8VarE.a;
                                Iterator it = wv0.c1(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    xw8 xw8Var = (xw8) linkedHashMap2.get(it.next());
                                    if (xw8Var != null) {
                                        pu.h(xw8Var, xd6VarF, yv6Var.getH0());
                                    }
                                }
                                if (!wv0.c1(linkedHashMap2.keySet()).isEmpty()) {
                                    xd6VarF.H();
                                }
                            } catch (Exception e) {
                                xw3.o(oi0.l("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        xw3.o(pc6.p("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i = ComponentActivity.x0;
                if (componentActivity.g0 == null) {
                    jy0 jy0Var = (jy0) componentActivity.getLastNonConfigurationInstance();
                    if (jy0Var != null) {
                        componentActivity.g0 = jy0Var.a;
                    }
                    if (componentActivity.g0 == null) {
                        componentActivity.g0 = new ex8();
                    }
                }
                componentActivity.X.f(this);
                return;
            case 2:
                new HashMap();
                sp2[] sp2VarArr = (sp2[]) obj;
                if (sp2VarArr.length > 0) {
                    sp2 sp2Var = sp2VarArr[0];
                    throw null;
                }
                if (sp2VarArr.length <= 0) {
                    return;
                }
                sp2 sp2Var2 = sp2VarArr[0];
                throw null;
            case 3:
                if (n84Var != n84.ON_STOP || (view = ((qk2) obj).J0) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 4:
                ((vl2) obj).b(false);
                return;
            default:
                if (n84Var != n84.ON_CREATE) {
                    xw3.s(n84Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    d94Var.getH0().f(this);
                    ((tv6) obj).b();
                    return;
                }
        }
    }
}
