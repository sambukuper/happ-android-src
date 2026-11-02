package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ze7 {
    public static final we5 X;
    public static final ze7 Y;
    public static final ze7 Z;
    public static final ze7 f0;
    public static final ze7 g0;
    public static final /* synthetic */ ze7[] h0;

    static {
        ze7 ze7Var = new ze7("REMOVED", 0);
        Y = ze7Var;
        ze7 ze7Var2 = new ze7("VISIBLE", 1);
        Z = ze7Var2;
        ze7 ze7Var3 = new ze7("GONE", 2);
        f0 = ze7Var3;
        ze7 ze7Var4 = new ze7("INVISIBLE", 3);
        g0 = ze7Var4;
        h0 = new ze7[]{ze7Var, ze7Var2, ze7Var3, ze7Var4};
        X = new we5((byte) 23);
    }

    public static ze7 valueOf(String str) {
        return (ze7) Enum.valueOf(ze7.class, str);
    }

    public static ze7[] values() {
        return (ze7[]) h0.clone();
    }

    public final void a(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (ml2.K(2)) {
                    view.toString();
                    viewGroup2.toString();
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (ml2.K(2)) {
                view.toString();
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (ml2.K(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iOrdinal == 2) {
            if (ml2.K(2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (iOrdinal != 3) {
                b61.c();
                return;
            }
            if (ml2.K(2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }
}
