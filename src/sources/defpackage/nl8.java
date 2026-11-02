package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nl8 implements Executor {
    public static final nl8 X;
    public static final Handler Y;
    public static final /* synthetic */ nl8[] Z;

    static {
        nl8 nl8Var = new nl8("INSTANCE", 0);
        X = nl8Var;
        Z = new nl8[]{nl8Var};
        Y = new Handler(Looper.getMainLooper());
    }

    public static nl8 valueOf(String str) {
        return (nl8) Enum.valueOf(nl8.class, str);
    }

    public static nl8[] values() {
        return (nl8[]) Z.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Y.post(runnable);
    }
}
