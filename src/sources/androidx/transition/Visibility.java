package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import defpackage.fz8;
import defpackage.ne8;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final String[] F0 = {"android:visibility:visibility", "android:visibility:parent"};
    public byte E0 = 3;

    public static void K(ne8 ne8Var) {
        View view = ne8Var.b;
        int visibility = view.getVisibility();
        HashMap map = ne8Var.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static fz8 L(ne8 ne8Var, ne8 ne8Var2) {
        fz8 fz8Var = new fz8();
        fz8Var.a = false;
        fz8Var.b = false;
        if (ne8Var != null) {
            HashMap map = ne8Var.a;
            if (map.containsKey("android:visibility:visibility")) {
                fz8Var.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                fz8Var.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                fz8Var.c = -1;
                fz8Var.e = null;
            }
        } else {
            fz8Var.c = -1;
            fz8Var.e = null;
        }
        if (ne8Var2 != null) {
            HashMap map2 = ne8Var2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                fz8Var.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                fz8Var.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                fz8Var.d = -1;
                fz8Var.f = null;
            }
        } else {
            fz8Var.d = -1;
            fz8Var.f = null;
        }
        if (ne8Var != null && ne8Var2 != null) {
            int i = fz8Var.c;
            int i2 = fz8Var.d;
            if (i != i2 || fz8Var.e != fz8Var.f) {
                if (i != i2) {
                    if (i == 0) {
                        fz8Var.b = false;
                        fz8Var.a = true;
                        return fz8Var;
                    }
                    if (i2 == 0) {
                        fz8Var.b = true;
                        fz8Var.a = true;
                        return fz8Var;
                    }
                } else {
                    if (fz8Var.f == null) {
                        fz8Var.b = false;
                        fz8Var.a = true;
                        return fz8Var;
                    }
                    if (fz8Var.e == null) {
                        fz8Var.b = true;
                        fz8Var.a = true;
                        return fz8Var;
                    }
                }
            }
        } else {
            if (ne8Var == null && fz8Var.d == 0) {
                fz8Var.b = true;
                fz8Var.a = true;
                return fz8Var;
            }
            if (ne8Var2 == null && fz8Var.c == 0) {
                fz8Var.b = false;
                fz8Var.a = true;
            }
        }
        return fz8Var;
    }

    @Override // androidx.transition.Transition
    public final void c(ne8 ne8Var) {
        K(ne8Var);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:58:0x0132  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0141  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149  */
    /* JADX WARN: Code duplicated, block: B:66:0x0166  */
    /* JADX WARN: Code duplicated, block: B:69:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01da  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x0203  */
    /* JADX WARN: Code duplicated, block: B:83:0x0215  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (L(m(r3, false), q(r3, false)).a != false) goto L9;
     */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator j(android.view.ViewGroup r24, defpackage.ne8 r25, defpackage.ne8 r26) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.j(android.view.ViewGroup, ne8, ne8):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public final String[] p() {
        return F0;
    }

    @Override // androidx.transition.Transition
    public final boolean s(ne8 ne8Var, ne8 ne8Var2) {
        if (ne8Var == null && ne8Var2 == null) {
            return false;
        }
        if (ne8Var != null && ne8Var2 != null && ne8Var2.a.containsKey("android:visibility:visibility") != ne8Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        fz8 fz8VarL = L(ne8Var, ne8Var2);
        if (fz8VarL.a) {
            return fz8VarL.c == 0 || fz8VarL.d == 0;
        }
        return false;
    }
}
