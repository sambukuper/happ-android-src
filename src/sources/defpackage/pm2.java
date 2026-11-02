package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pm2 {
    public static final pm2 X;
    public static final pm2 Y;
    public static final pm2 Z;
    public static final pm2 f0;
    public static final /* synthetic */ pm2[] g0;

    static {
        pm2 pm2Var = new pm2("STARTED", 0);
        X = pm2Var;
        pm2 pm2Var2 = new pm2("FRAME_INFO_COMPLETE", 1);
        Y = pm2Var2;
        pm2 pm2Var3 = new pm2("STREAM_RESULTS_COMPLETE", 2);
        Z = pm2Var3;
        pm2 pm2Var4 = new pm2("COMPLETE", 3);
        f0 = pm2Var4;
        g0 = new pm2[]{pm2Var, pm2Var2, pm2Var3, pm2Var4};
    }

    public static pm2 valueOf(String str) {
        return (pm2) Enum.valueOf(pm2.class, str);
    }

    public static pm2[] values() {
        return (pm2[]) g0.clone();
    }
}
