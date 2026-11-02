package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.multiprocess.RemoteWorkManagerClient;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pd6 {
    public static pd6 c(Context context) {
        x39 x39VarV0 = x39.v0(context);
        if (x39VarV0.r0 == null) {
            synchronized (x39.v0) {
                try {
                    if (x39VarV0.r0 == null) {
                        try {
                            kp5 kp5Var = RemoteWorkManagerClient.j;
                            x39VarV0.r0 = (pd6) RemoteWorkManagerClient.class.getConstructor(Context.class, x39.class).newInstance(x39VarV0.i0, x39VarV0);
                        } catch (Throwable unused) {
                            lh4.P0().getClass();
                        }
                        if (x39VarV0.r0 == null && !TextUtils.isEmpty((String) x39VarV0.j0.i0)) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        pd6 pd6Var = x39VarV0.r0;
        if (pd6Var != null) {
            return pd6Var;
        }
        bt.i("Unable to initialize RemoteWorkManager");
        return null;
    }

    public abstract wy7 a(String str);

    public abstract wy7 b(String str, fl5 fl5Var);
}
