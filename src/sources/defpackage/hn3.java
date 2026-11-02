package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hn3 {
    public static final hn3 X;
    public static final hn3 Y;
    public static final hn3 Z;
    public static final hn3 f0;
    public static final /* synthetic */ hn3[] g0;

    static {
        hn3 hn3Var = new hn3("ANY", 0);
        X = hn3Var;
        hn3 hn3Var2 = new hn3("NON_PRIVATE", 1);
        hn3 hn3Var3 = new hn3("PROTECTED_AND_PUBLIC", 2);
        hn3 hn3Var4 = new hn3("PUBLIC_ONLY", 3);
        Y = hn3Var4;
        hn3 hn3Var5 = new hn3("NONE", 4);
        Z = hn3Var5;
        hn3 hn3Var6 = new hn3("DEFAULT", 5);
        f0 = hn3Var6;
        g0 = new hn3[]{hn3Var, hn3Var2, hn3Var3, hn3Var4, hn3Var5, hn3Var6};
    }

    public static hn3 valueOf(String str) {
        return (hn3) Enum.valueOf(hn3.class, str);
    }

    public static hn3[] values() {
        return (hn3[]) g0.clone();
    }

    public final boolean a(Member member) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return !Modifier.isPrivate(member.getModifiers());
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return false;
            }
        } else if (Modifier.isProtected(member.getModifiers())) {
            return true;
        }
        return Modifier.isPublic(member.getModifiers());
    }
}
