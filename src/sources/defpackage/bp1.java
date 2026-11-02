package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bp1 implements Executor {
    public static final bp1 X;
    public static final /* synthetic */ bp1[] Y;

    static {
        bp1 bp1Var = new bp1("INSTANCE", 0);
        X = bp1Var;
        Y = new bp1[]{bp1Var};
    }

    public static bp1 valueOf(String str) {
        return (bp1) Enum.valueOf(bp1.class, str);
    }

    public static bp1[] values() {
        return (bp1[]) Y.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
