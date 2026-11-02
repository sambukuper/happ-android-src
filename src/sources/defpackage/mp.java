package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mp {
    public static final lp X = new lp(new dp1((byte) 2));
    public static int Y = -100;
    public static he4 Z = null;
    public static he4 f0 = null;
    public static Boolean g0 = null;
    public static boolean h0 = false;
    public static final bu i0 = new bu(0);
    public static final Object j0 = new Object();
    public static final Object k0 = new Object();

    public static boolean b(Context context) {
        if (g0 == null) {
            try {
                int i = AppLocalesMetadataHolderService.X;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), 640).metaData;
                if (bundle != null) {
                    g0 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                g0 = Boolean.FALSE;
            }
        }
        return g0.booleanValue();
    }

    public static void e(wp wpVar) {
        synchronized (j0) {
            try {
                bu buVar = i0;
                buVar.getClass();
                qt qtVar = new qt(buVar);
                while (qtVar.hasNext()) {
                    mp mpVar = (mp) ((WeakReference) qtVar.next()).get();
                    if (mpVar == wpVar || mpVar == null) {
                        qtVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void j(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && Y != i) {
            Y = i;
            synchronized (j0) {
                try {
                    bu buVar = i0;
                    buVar.getClass();
                    qt qtVar = new qt(buVar);
                    while (qtVar.hasNext()) {
                        mp mpVar = (mp) ((WeakReference) qtVar.next()).get();
                        if (mpVar != null) {
                            ((wp) mpVar).m(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i);

    public abstract void g(int i);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}
