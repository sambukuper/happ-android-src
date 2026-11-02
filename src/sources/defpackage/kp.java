package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kp implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Context Y;

    public /* synthetic */ kp(Context context, byte b) {
        this.X = b;
        this.Y = context;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    @Override // java.lang.Runnable
    public final void run() {
        he4 he4Var;
        Object systemService;
        Context context;
        byte b = this.X;
        byte b2 = 2;
        Context context2 = this.Y;
        switch (b) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i >= 33) {
                            bu buVar = mp.i0;
                            buVar.getClass();
                            qt qtVar = new qt(buVar);
                            while (true) {
                                if (qtVar.hasNext()) {
                                    mp mpVar = (mp) ((WeakReference) qtVar.next()).get();
                                    if (mpVar != null && (context = ((wp) mpVar).m0) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                he4Var = new he4(new ie4(c4.u(systemService)));
                            } else {
                                he4Var = he4.b;
                            }
                        } else {
                            he4Var = mp.Z;
                            if (he4Var == null) {
                                he4Var = he4.b;
                            }
                        }
                        if (he4Var.a.a.isEmpty()) {
                            String strP = gv3.P(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                c4.v(systemService2, LocaleList.forLanguageTags(strP));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                mp.h0 = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new kp(context2, b2));
                break;
            default:
                iw5.b(context2, new nd((byte) 2), iw5.a, false);
                break;
        }
    }
}
