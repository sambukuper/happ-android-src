package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mb implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ AndroidComposeView Y;

    public /* synthetic */ mb(AndroidComposeView androidComposeView, byte b) {
        this.X = b;
        this.Y = androidComposeView;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        int i = 0;
        AndroidComposeView androidComposeView = this.Y;
        switch (b) {
            case 0:
                gi giVar = androidComposeView.R0;
                if (giVar != null) {
                    int childCount = giVar.getChildCount();
                    while (i < childCount) {
                        giVar.getChildAt(i);
                        i++;
                    }
                }
                return dn8.a;
            case 1:
                Class cls = AndroidComposeView.J1;
                if (Build.VERSION.SDK_INT > 28 && androidComposeView.isAttachedToWindow()) {
                    if (AndroidComposeView.N1 == null) {
                        v7 v7Var = new v7((byte) 1);
                        AndroidComposeView.N1 = v7Var;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (AndroidComposeView.J1 == null) {
                                AndroidComposeView.J1 = Class.forName("android.os.SystemProperties");
                            }
                            Method declaredMethod = AndroidComposeView.L1;
                            if (declaredMethod == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls2 = AndroidComposeView.J1;
                                declaredMethod = cls2 != null ? cls2.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                                AndroidComposeView.L1 = declaredMethod;
                            }
                            if (declaredMethod != null) {
                                declaredMethod.invoke(null, v7Var);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    j05 j05Var = AndroidComposeView.M1;
                    synchronized (j05Var) {
                        j05Var.a(androidComposeView);
                    }
                }
                return dn8.a;
            case 2:
                Class cls3 = AndroidComposeView.J1;
                Boolean bool = (Boolean) androidComposeView.u0.getValue();
                bool.getClass();
                return bool;
            case 3:
                Class cls4 = AndroidComposeView.J1;
                LocaleList locales = androidComposeView.getConfiguration().getLocales();
                he4 he4Var = new he4(new ie4(locales));
                if (locales.isEmpty()) {
                    he4Var = new he4(new ie4(LocaleList.getDefault()));
                }
                ie4 ie4Var = he4Var.a;
                int size = ie4Var.a.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Locale locale = ie4Var.a.get(i);
                    locale.getClass();
                    arrayList.add(new ce4(locale));
                    i++;
                }
                return new ge4(arrayList);
            default:
                MotionEvent motionEvent = androidComposeView.o1;
                if (motionEvent != null) {
                    boolean zContains = i21.L(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = androidComposeView.o1;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i = 1;
                    }
                    if (zContains && i != 0) {
                        androidComposeView.p1 = SystemClock.uptimeMillis();
                        androidComposeView.post(androidComposeView.w1);
                    }
                }
                androidComposeView.C1.invoke();
                return dn8.a;
        }
    }
}
