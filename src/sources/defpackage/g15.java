package defpackage;

import su.happ.proxyutility.dto.ProfileRoutingSettings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g15 {
    public static final g15 X;
    public static final /* synthetic */ g15[] Y;

    static {
        g15 g15Var = new g15(ProfileRoutingSettings.DEFAULT_NAME, 0);
        X = g15Var;
        Y = new g15[]{g15Var, new g15("UserInput", 1), new g15("PreventUserInput", 2)};
    }

    public static g15 valueOf(String str) {
        return (g15) Enum.valueOf(g15.class, str);
    }

    public static g15[] values() {
        return (g15[]) Y.clone();
    }
}
