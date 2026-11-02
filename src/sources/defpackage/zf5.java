package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zf5 {
    public static final HashMap a;

    static {
        lh4.a1("PackageManagerHelper");
        a = new HashMap();
    }

    public static final void a(PackageManager packageManager, ComponentName componentName, boolean z, rn2 rn2Var) {
        try {
            if (z == ((Boolean) rn2Var.K(packageManager, componentName)).booleanValue()) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, z ? 1 : 2, 1);
            lh4 lh4VarP0 = lh4.P0();
            componentName.getClassName();
            lh4VarP0.getClass();
        } catch (Exception unused) {
            lh4 lh4VarP1 = lh4.P0();
            componentName.getClassName();
            lh4VarP1.getClass();
        }
    }
}
