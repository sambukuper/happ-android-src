package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oh2 {
    public static final oh2 b = new oh2();
    public static final oh2 c = new oh2();
    public static final oh2 d = new oh2();
    public final c15 a = new c15(0, new qh2[16]);

    public static boolean a(oh2 oh2Var) {
        oh2Var.getClass();
        if (oh2Var == b) {
            bt.i("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        if (oh2Var == c) {
            bt.i("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        c15 c15Var = oh2Var.a;
        int i = c15Var.Z;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = c15Var.X;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            nh1 nh1Var = (qh2) objArr[i2];
            if (!((jx4) nh1Var).X.p0) {
                wc3.b("visitChildren called on an unattached node");
            }
            c15 c15Var2 = new c15(0, new jx4[16]);
            jx4 jx4Var = ((jx4) nh1Var).X;
            jx4 jx4Var2 = jx4Var.h0;
            if (jx4Var2 == null) {
                yn0.n(c15Var2, jx4Var);
            } else {
                c15Var2.b(jx4Var2);
            }
            while (true) {
                int i3 = c15Var2.Z;
                if (i3 == 0) {
                    break;
                }
                jx4 jx4VarT = (jx4) c15Var2.k(i3 - 1);
                if ((jx4VarT.f0 & 1024) == 0) {
                    yn0.n(c15Var2, jx4VarT);
                } else {
                    while (jx4VarT != null) {
                        if ((jx4VarT.Z & 1024) != 0) {
                            c15 c15Var3 = null;
                            while (jx4VarT != null) {
                                if (jx4VarT instanceof ai2) {
                                    if (((ai2) jx4VarT).g1(7)) {
                                        z = true;
                                        break;
                                    }
                                } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                    int i4 = 0;
                                    for (jx4 jx4Var3 = ((oh1) jx4VarT).r0; jx4Var3 != null; jx4Var3 = jx4Var3.h0) {
                                        if ((jx4Var3.Z & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                jx4VarT = jx4Var3;
                                            } else {
                                                if (c15Var3 == null) {
                                                    c15Var3 = new c15(0, new jx4[16]);
                                                }
                                                if (jx4VarT != null) {
                                                    c15Var3.b(jx4VarT);
                                                    jx4VarT = null;
                                                }
                                                c15Var3.b(jx4Var3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                jx4VarT = yn0.T(c15Var3);
                            }
                            break;
                        }
                        jx4VarT = jx4VarT.h0;
                    }
                }
            }
        }
        return z;
    }
}
