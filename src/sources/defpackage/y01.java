package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y01 {
    public static final ox1 a = new ox1(new w60((byte) 15), (byte) 1);
    public static final ox1 b = new ox1(new w60((byte) 16), (byte) 1);
    public static final ox1 c = new ox1(new w60((byte) 21), (byte) 1);
    public static final ox1 d = new ox1(new w60((byte) 22), (byte) 1);
    public static final ox1 e = new ox1(new w60((byte) 23), (byte) 1);
    public static final ox1 f = new ox1(new w60((byte) 24), (byte) 1);
    public static final ox1 g = new ox1(new w60((byte) 25), (byte) 1);
    public static final ox1 h = new ox1(new w60((byte) 27), (byte) 1);
    public static final ox1 i = new ox1(new w60((byte) 28), (byte) 1);
    public static final ox1 j = new ox1(new w60((byte) 29), (byte) 1);
    public static final ox1 k = new ox1(new w60((byte) 26), (byte) 1);
    public static final ox1 l = new ox1(new w01(0), (byte) 1);
    public static final ox1 m = new ox1(new w01(1), (byte) 1);
    public static final ox1 n = new ox1(new w01(2), (byte) 1);
    public static final ox1 o = new ox1(new w01(3), (byte) 1);
    public static final ox1 p;
    public static final ox1 q;
    public static final ox1 r;
    public static final ox1 s;
    public static final ox1 t;
    public static final ox1 u;
    public static final ox1 v;
    public static final ox1 w;
    public static final ox1 x;
    public static final ox1 y;

    static {
        new vz7(new w01((byte) 8));
        p = new ox1(new w01((byte) 4), (byte) 1);
        q = new ox1(new w01((byte) 5), (byte) 1);
        r = new ox1(new w01((byte) 6), (byte) 1);
        s = new ox1(new w01((byte) 7), (byte) 1);
        t = new ox1(new w60((byte) 17), (byte) 1);
        u = new ox1(new w60((byte) 18), (byte) 1);
        v = new ox1(new w60((byte) 19), (byte) 1);
        w = new ox1(new w60((byte) 20), (byte) 1);
        x = new ox1(new j72((byte) 10), (byte) 0);
        y = new ox1(new w01((byte) 22), (byte) 1);
    }

    public static final void a(final mf5 mf5Var, bi biVar, zy0 zy0Var, lp2 lp2Var, int i2) {
        lp2Var.X(1925803616);
        int i3 = i2 | (lp2Var.f(mf5Var) ? 4 : 2) | (lp2Var.f(biVar) ? 32 : 16) | (lp2Var.h(zy0Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            t06 t06VarA = a.a(mf5Var.getAccessibilityManager());
            t06 t06VarA2 = b.a(mf5Var.getAutofill());
            t06 t06VarA3 = d.a(mf5Var.getAutofillManager());
            t06 t06VarA4 = c.a(mf5Var.getAutofillTree());
            t06 t06VarA5 = e.a(mf5Var.getClipboardManager());
            t06 t06VarA6 = f.a(mf5Var.getClipboard());
            t06 t06VarA7 = h.a(mf5Var.getDensity());
            t06 t06VarA8 = i.a(mf5Var.getFocusOwner());
            t06 t06VarA9 = j.a(mf5Var.getFontLoader());
            t06VarA9.g = false;
            t06 t06VarA10 = k.a(mf5Var.getFontFamilyResolver());
            t06VarA10.g = false;
            t06 t06VarA11 = l.a(mf5Var.getHapticFeedBack());
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (z || objK == beVar) {
                final byte b2 = 0;
                objK = new gn2() { // from class: v01
                    @Override // defpackage.gn2
                    public final Object B(Object obj) {
                        byte b3 = b2;
                        mf5 mf5Var2 = mf5Var;
                        switch (b3) {
                            case 0:
                                return mf5Var2.getInputModeManager();
                            case 1:
                                return mf5Var2.getTextInputService();
                            case 2:
                                return mf5Var2.getSoftwareKeyboardController();
                            case 3:
                                return mf5Var2.getTextToolbar();
                            default:
                                return mf5Var2.getPointerIconService();
                        }
                    }
                };
                lp2Var.g0(objK);
            }
            t06 t06VarC = m.c((gn2) objK);
            t06 t06VarA12 = n.a(mf5Var.getLayoutDirection());
            boolean z2 = i4 == 4;
            Object objK2 = lp2Var.K();
            if (z2 || objK2 == beVar) {
                final byte b3 = 1;
                objK2 = new gn2() { // from class: v01
                    @Override // defpackage.gn2
                    public final Object B(Object obj) {
                        byte b4 = b3;
                        mf5 mf5Var2 = mf5Var;
                        switch (b4) {
                            case 0:
                                return mf5Var2.getInputModeManager();
                            case 1:
                                return mf5Var2.getTextInputService();
                            case 2:
                                return mf5Var2.getSoftwareKeyboardController();
                            case 3:
                                return mf5Var2.getTextToolbar();
                            default:
                                return mf5Var2.getPointerIconService();
                        }
                    }
                };
                lp2Var.g0(objK2);
            }
            t06 t06VarC2 = p.c((gn2) objK2);
            boolean z3 = i4 == 4;
            Object objK3 = lp2Var.K();
            if (z3 || objK3 == beVar) {
                final byte b4 = 2;
                objK3 = new gn2() { // from class: v01
                    @Override // defpackage.gn2
                    public final Object B(Object obj) {
                        byte b5 = b4;
                        mf5 mf5Var2 = mf5Var;
                        switch (b5) {
                            case 0:
                                return mf5Var2.getInputModeManager();
                            case 1:
                                return mf5Var2.getTextInputService();
                            case 2:
                                return mf5Var2.getSoftwareKeyboardController();
                            case 3:
                                return mf5Var2.getTextToolbar();
                            default:
                                return mf5Var2.getPointerIconService();
                        }
                    }
                };
                lp2Var.g0(objK3);
            }
            t06 t06VarC3 = q.c((gn2) objK3);
            boolean z4 = i4 == 4;
            Object objK4 = lp2Var.K();
            final byte b5 = 3;
            if (z4 || objK4 == beVar) {
                objK4 = new gn2() { // from class: v01
                    @Override // defpackage.gn2
                    public final Object B(Object obj) {
                        byte b6 = b5;
                        mf5 mf5Var2 = mf5Var;
                        switch (b6) {
                            case 0:
                                return mf5Var2.getInputModeManager();
                            case 1:
                                return mf5Var2.getTextInputService();
                            case 2:
                                return mf5Var2.getSoftwareKeyboardController();
                            case 3:
                                return mf5Var2.getTextToolbar();
                            default:
                                return mf5Var2.getPointerIconService();
                        }
                    }
                };
                lp2Var.g0(objK4);
            }
            t06 t06VarC4 = r.c((gn2) objK4);
            t06 t06VarA13 = s.a(biVar);
            t06 t06VarA14 = t.a(mf5Var.getViewConfiguration());
            t06 t06VarA15 = u.a(mf5Var.getWindowInfo());
            final byte b6 = 4;
            boolean z5 = i4 == 4;
            Object objK5 = lp2Var.K();
            if (z5 || objK5 == beVar) {
                objK5 = new gn2() { // from class: v01
                    @Override // defpackage.gn2
                    public final Object B(Object obj) {
                        byte b7 = b6;
                        mf5 mf5Var2 = mf5Var;
                        switch (b7) {
                            case 0:
                                return mf5Var2.getInputModeManager();
                            case 1:
                                return mf5Var2.getTextInputService();
                            case 2:
                                return mf5Var2.getSoftwareKeyboardController();
                            case 3:
                                return mf5Var2.getTextToolbar();
                            default:
                                return mf5Var2.getPointerIconService();
                        }
                    }
                };
                lp2Var.g0(objK5);
            }
            mb6.b(new t06[]{t06VarA, t06VarA2, t06VarA3, t06VarA4, t06VarA5, t06VarA6, t06VarA7, t06VarA8, t06VarA9, t06VarA10, t06VarA11, t06VarC, t06VarA12, t06VarC2, t06VarC3, t06VarC4, t06VarA13, t06VarA14, t06VarA15, w.c((gn2) objK5), g.a(mf5Var.getGraphicsContext()), ud4.a.a(mf5Var.getRetainedValuesStore()), o.a(mf5Var.getLocaleList())}, zy0Var, lp2Var, ((i3 >> 3) & 112) | 8);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) mf5Var, (Object) biVar, (on2) zy0Var, i2, (byte) 1);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
