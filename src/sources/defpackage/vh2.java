package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vh2 extends jx4 implements s01, lh2, qh2 {
    public oh2 q0;
    public final uh2 r0;
    public final uh2 s0;

    /* JADX WARN: Type inference failed for: r2v1, types: [uh2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [uh2] */
    public vh2(oh2 oh2Var) {
        this.q0 = oh2Var;
        final byte b = 0;
        this.r0 = new gn2(this) { // from class: uh2
            public final /* synthetic */ vh2 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.gn2
            public final Object B(Object obj) {
                byte b2 = b;
                dn8 dn8Var = dn8.a;
                vh2 vh2Var = this.Y;
                fm0 fm0Var = (fm0) obj;
                switch (b2) {
                    case 0:
                        jx4 jx4VarT = vh2Var.X;
                        c15 c15Var = null;
                        while (jx4VarT != null) {
                            if (jx4VarT instanceof ai2) {
                                if (g33.Q((ai2) jx4VarT)) {
                                }
                                break;
                            } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                int i = 0;
                                for (jx4 jx4Var = ((oh1) jx4VarT).r0; jx4Var != null; jx4Var = jx4Var.h0) {
                                    if ((jx4Var.Z & 1024) != 0) {
                                        i++;
                                        if (i == 1) {
                                            jx4VarT = jx4Var;
                                        } else {
                                            if (c15Var == null) {
                                                c15Var = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT != null) {
                                                c15Var.b(jx4VarT);
                                                jx4VarT = null;
                                            }
                                            c15Var.b(jx4Var);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            jx4VarT = yn0.T(c15Var);
                        }
                        if (!vh2Var.X.p0) {
                            wc3.b("visitChildren called on an unattached node");
                        }
                        c15 c15Var2 = new c15(0, new jx4[16]);
                        jx4 jx4Var2 = vh2Var.X;
                        jx4 jx4Var3 = jx4Var2.h0;
                        if (jx4Var3 == null) {
                            yn0.n(c15Var2, jx4Var2);
                        } else {
                            c15Var2.b(jx4Var3);
                        }
                        while (true) {
                            int i2 = c15Var2.Z;
                            if (i2 != 0) {
                                jx4 jx4VarT2 = (jx4) c15Var2.k(i2 - 1);
                                if ((jx4VarT2.f0 & 1024) == 0) {
                                    yn0.n(c15Var2, jx4VarT2);
                                } else {
                                    while (jx4VarT2 != null) {
                                        if ((jx4VarT2.Z & 1024) != 0) {
                                            c15 c15Var3 = null;
                                            while (jx4VarT2 != null) {
                                                if (jx4VarT2 instanceof ai2) {
                                                    if (g33.Q((ai2) jx4VarT2)) {
                                                    }
                                                    break;
                                                } else if ((jx4VarT2.Z & 1024) != 0 && (jx4VarT2 instanceof oh1)) {
                                                    int i3 = 0;
                                                    for (jx4 jx4Var4 = ((oh1) jx4VarT2).r0; jx4Var4 != null; jx4Var4 = jx4Var4.h0) {
                                                        if ((jx4Var4.Z & 1024) != 0) {
                                                            i3++;
                                                            if (i3 == 1) {
                                                                jx4VarT2 = jx4Var4;
                                                            } else {
                                                                if (c15Var3 == null) {
                                                                    c15Var3 = new c15(0, new jx4[16]);
                                                                }
                                                                if (jx4VarT2 != null) {
                                                                    c15Var3.b(jx4VarT2);
                                                                    jx4VarT2 = null;
                                                                }
                                                                c15Var3.b(jx4Var4);
                                                            }
                                                        }
                                                    }
                                                    if (i3 == 1) {
                                                    }
                                                }
                                                jx4VarT2 = yn0.T(c15Var3);
                                            }
                                        }
                                        jx4VarT2 = jx4VarT2.h0;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        jx4 jx4VarT3 = vh2Var.X;
                        c15 c15Var4 = null;
                        while (jx4VarT3 != null) {
                            if (jx4VarT3 instanceof ai2) {
                                if (g33.P((ai2) jx4VarT3)) {
                                }
                                break;
                            } else if ((jx4VarT3.Z & 1024) != 0 && (jx4VarT3 instanceof oh1)) {
                                int i4 = 0;
                                for (jx4 jx4Var5 = ((oh1) jx4VarT3).r0; jx4Var5 != null; jx4Var5 = jx4Var5.h0) {
                                    if ((jx4Var5.Z & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            jx4VarT3 = jx4Var5;
                                        } else {
                                            if (c15Var4 == null) {
                                                c15Var4 = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT3 != null) {
                                                c15Var4.b(jx4VarT3);
                                                jx4VarT3 = null;
                                            }
                                            c15Var4.b(jx4Var5);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            jx4VarT3 = yn0.T(c15Var4);
                        }
                        if (!vh2Var.X.p0) {
                            wc3.b("visitChildren called on an unattached node");
                        }
                        c15 c15Var5 = new c15(0, new jx4[16]);
                        jx4 jx4Var6 = vh2Var.X;
                        jx4 jx4Var7 = jx4Var6.h0;
                        if (jx4Var7 == null) {
                            yn0.n(c15Var5, jx4Var6);
                        } else {
                            c15Var5.b(jx4Var7);
                        }
                        while (true) {
                            int i5 = c15Var5.Z;
                            if (i5 != 0) {
                                jx4 jx4VarT4 = (jx4) c15Var5.k(i5 - 1);
                                if ((jx4VarT4.f0 & 1024) == 0) {
                                    yn0.n(c15Var5, jx4VarT4);
                                } else {
                                    while (jx4VarT4 != null) {
                                        if ((jx4VarT4.Z & 1024) != 0) {
                                            c15 c15Var6 = null;
                                            while (jx4VarT4 != null) {
                                                if (jx4VarT4 instanceof ai2) {
                                                    if (g33.P((ai2) jx4VarT4)) {
                                                    }
                                                    break;
                                                } else if ((jx4VarT4.Z & 1024) != 0 && (jx4VarT4 instanceof oh1)) {
                                                    int i6 = 0;
                                                    for (jx4 jx4Var8 = ((oh1) jx4VarT4).r0; jx4Var8 != null; jx4Var8 = jx4Var8.h0) {
                                                        if ((jx4Var8.Z & 1024) != 0) {
                                                            i6++;
                                                            if (i6 == 1) {
                                                                jx4VarT4 = jx4Var8;
                                                            } else {
                                                                if (c15Var6 == null) {
                                                                    c15Var6 = new c15(0, new jx4[16]);
                                                                }
                                                                if (jx4VarT4 != null) {
                                                                    c15Var6.b(jx4VarT4);
                                                                    jx4VarT4 = null;
                                                                }
                                                                c15Var6.b(jx4Var8);
                                                            }
                                                        }
                                                    }
                                                    if (i6 == 1) {
                                                    }
                                                }
                                                jx4VarT4 = yn0.T(c15Var6);
                                            }
                                        }
                                        jx4VarT4 = jx4VarT4.h0;
                                    }
                                }
                            } else if (!dh3.f(vh2Var.q0, oh2.b)) {
                                if (dh3.f(vh2Var.q0, oh2.c)) {
                                    fm0Var.a = true;
                                } else {
                                    oh2.a(vh2Var.q0);
                                }
                            }
                            break;
                        }
                        break;
                }
                return dn8Var;
            }
        };
        final byte b2 = 1;
        this.s0 = new gn2(this) { // from class: uh2
            public final /* synthetic */ vh2 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.gn2
            public final Object B(Object obj) {
                byte b3 = b2;
                dn8 dn8Var = dn8.a;
                vh2 vh2Var = this.Y;
                fm0 fm0Var = (fm0) obj;
                switch (b3) {
                    case 0:
                        jx4 jx4VarT = vh2Var.X;
                        c15 c15Var = null;
                        while (jx4VarT != null) {
                            if (jx4VarT instanceof ai2) {
                                if (g33.Q((ai2) jx4VarT)) {
                                }
                                break;
                            } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                int i = 0;
                                for (jx4 jx4Var = ((oh1) jx4VarT).r0; jx4Var != null; jx4Var = jx4Var.h0) {
                                    if ((jx4Var.Z & 1024) != 0) {
                                        i++;
                                        if (i == 1) {
                                            jx4VarT = jx4Var;
                                        } else {
                                            if (c15Var == null) {
                                                c15Var = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT != null) {
                                                c15Var.b(jx4VarT);
                                                jx4VarT = null;
                                            }
                                            c15Var.b(jx4Var);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            jx4VarT = yn0.T(c15Var);
                        }
                        if (!vh2Var.X.p0) {
                            wc3.b("visitChildren called on an unattached node");
                        }
                        c15 c15Var2 = new c15(0, new jx4[16]);
                        jx4 jx4Var2 = vh2Var.X;
                        jx4 jx4Var3 = jx4Var2.h0;
                        if (jx4Var3 == null) {
                            yn0.n(c15Var2, jx4Var2);
                        } else {
                            c15Var2.b(jx4Var3);
                        }
                        while (true) {
                            int i2 = c15Var2.Z;
                            if (i2 != 0) {
                                jx4 jx4VarT2 = (jx4) c15Var2.k(i2 - 1);
                                if ((jx4VarT2.f0 & 1024) == 0) {
                                    yn0.n(c15Var2, jx4VarT2);
                                } else {
                                    while (jx4VarT2 != null) {
                                        if ((jx4VarT2.Z & 1024) != 0) {
                                            c15 c15Var3 = null;
                                            while (jx4VarT2 != null) {
                                                if (jx4VarT2 instanceof ai2) {
                                                    if (g33.Q((ai2) jx4VarT2)) {
                                                    }
                                                    break;
                                                } else if ((jx4VarT2.Z & 1024) != 0 && (jx4VarT2 instanceof oh1)) {
                                                    int i3 = 0;
                                                    for (jx4 jx4Var4 = ((oh1) jx4VarT2).r0; jx4Var4 != null; jx4Var4 = jx4Var4.h0) {
                                                        if ((jx4Var4.Z & 1024) != 0) {
                                                            i3++;
                                                            if (i3 == 1) {
                                                                jx4VarT2 = jx4Var4;
                                                            } else {
                                                                if (c15Var3 == null) {
                                                                    c15Var3 = new c15(0, new jx4[16]);
                                                                }
                                                                if (jx4VarT2 != null) {
                                                                    c15Var3.b(jx4VarT2);
                                                                    jx4VarT2 = null;
                                                                }
                                                                c15Var3.b(jx4Var4);
                                                            }
                                                        }
                                                    }
                                                    if (i3 == 1) {
                                                    }
                                                }
                                                jx4VarT2 = yn0.T(c15Var3);
                                            }
                                        }
                                        jx4VarT2 = jx4VarT2.h0;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        jx4 jx4VarT3 = vh2Var.X;
                        c15 c15Var4 = null;
                        while (jx4VarT3 != null) {
                            if (jx4VarT3 instanceof ai2) {
                                if (g33.P((ai2) jx4VarT3)) {
                                }
                                break;
                            } else if ((jx4VarT3.Z & 1024) != 0 && (jx4VarT3 instanceof oh1)) {
                                int i4 = 0;
                                for (jx4 jx4Var5 = ((oh1) jx4VarT3).r0; jx4Var5 != null; jx4Var5 = jx4Var5.h0) {
                                    if ((jx4Var5.Z & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            jx4VarT3 = jx4Var5;
                                        } else {
                                            if (c15Var4 == null) {
                                                c15Var4 = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT3 != null) {
                                                c15Var4.b(jx4VarT3);
                                                jx4VarT3 = null;
                                            }
                                            c15Var4.b(jx4Var5);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            jx4VarT3 = yn0.T(c15Var4);
                        }
                        if (!vh2Var.X.p0) {
                            wc3.b("visitChildren called on an unattached node");
                        }
                        c15 c15Var5 = new c15(0, new jx4[16]);
                        jx4 jx4Var6 = vh2Var.X;
                        jx4 jx4Var7 = jx4Var6.h0;
                        if (jx4Var7 == null) {
                            yn0.n(c15Var5, jx4Var6);
                        } else {
                            c15Var5.b(jx4Var7);
                        }
                        while (true) {
                            int i5 = c15Var5.Z;
                            if (i5 != 0) {
                                jx4 jx4VarT4 = (jx4) c15Var5.k(i5 - 1);
                                if ((jx4VarT4.f0 & 1024) == 0) {
                                    yn0.n(c15Var5, jx4VarT4);
                                } else {
                                    while (jx4VarT4 != null) {
                                        if ((jx4VarT4.Z & 1024) != 0) {
                                            c15 c15Var6 = null;
                                            while (jx4VarT4 != null) {
                                                if (jx4VarT4 instanceof ai2) {
                                                    if (g33.P((ai2) jx4VarT4)) {
                                                    }
                                                    break;
                                                } else if ((jx4VarT4.Z & 1024) != 0 && (jx4VarT4 instanceof oh1)) {
                                                    int i6 = 0;
                                                    for (jx4 jx4Var8 = ((oh1) jx4VarT4).r0; jx4Var8 != null; jx4Var8 = jx4Var8.h0) {
                                                        if ((jx4Var8.Z & 1024) != 0) {
                                                            i6++;
                                                            if (i6 == 1) {
                                                                jx4VarT4 = jx4Var8;
                                                            } else {
                                                                if (c15Var6 == null) {
                                                                    c15Var6 = new c15(0, new jx4[16]);
                                                                }
                                                                if (jx4VarT4 != null) {
                                                                    c15Var6.b(jx4VarT4);
                                                                    jx4VarT4 = null;
                                                                }
                                                                c15Var6.b(jx4Var8);
                                                            }
                                                        }
                                                    }
                                                    if (i6 == 1) {
                                                    }
                                                }
                                                jx4VarT4 = yn0.T(c15Var6);
                                            }
                                        }
                                        jx4VarT4 = jx4VarT4.h0;
                                    }
                                }
                            } else if (!dh3.f(vh2Var.q0, oh2.b)) {
                                if (dh3.f(vh2Var.q0, oh2.c)) {
                                    fm0Var.a = true;
                                } else {
                                    oh2.a(vh2Var.q0);
                                }
                            }
                            break;
                        }
                        break;
                }
                return dn8Var;
            }
        };
    }

    @Override // defpackage.lh2
    public final void E(hh2 hh2Var) {
        hh2Var.a(this.s0);
        hh2Var.d(this.r0);
    }
}
