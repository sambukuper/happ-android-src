package defpackage;

import su.happ.proxyutility.dto.ProfileRoutingSettings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f15 {
    public static final f15 X;
    public static final f15 Y;
    public static final f15 Z;
    public static final /* synthetic */ f15[] f0;

    static {
        f15 f15Var = new f15(ProfileRoutingSettings.DEFAULT_NAME, 0);
        X = f15Var;
        f15 f15Var2 = new f15("UserInput", 1);
        Y = f15Var2;
        f15 f15Var3 = new f15("PreventUserInput", 2);
        Z = f15Var3;
        f0 = new f15[]{f15Var, f15Var2, f15Var3};
    }

    public static f15 valueOf(String str) {
        return (f15) Enum.valueOf(f15.class, str);
    }

    public static f15[] values() {
        return (f15[]) f0.clone();
    }
}
