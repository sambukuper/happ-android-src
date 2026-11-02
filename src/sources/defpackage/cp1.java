package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cp1 implements Executor {
    public static final cp1 X;
    public static final /* synthetic */ cp1[] Y;

    static {
        cp1 cp1Var = new cp1("INSTANCE", 0);
        X = cp1Var;
        Y = new cp1[]{cp1Var};
    }

    public static cp1 valueOf(String str) {
        return (cp1) Enum.valueOf(cp1.class, str);
    }

    public static cp1[] values() {
        return (cp1[]) Y.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
