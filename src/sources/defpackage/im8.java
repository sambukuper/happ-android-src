package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class im8 extends qm8 {
    public final /* synthetic */ byte a;
    public final int b;

    public /* synthetic */ im8(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    @Override // defpackage.qm8
    public final int a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }

    @Override // defpackage.qm8
    public final char b() {
        switch (this.a) {
            case 0:
                return 'O';
            case 1:
                return 'X';
            case 2:
                return 'x';
            default:
                return 'Z';
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX WARN: Code duplicated, block: B:13:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0022 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    public final void c(wr8 wr8Var, boolean z, boolean z2) {
        g09 g09Var;
        byte b = 1;
        g09 g09Var2 = g09.Z;
        g09 g09Var3 = g09.Y;
        int i = this.b;
        byte b2 = this.a;
        switch (b2) {
            case 0:
                vm8.c(this);
                throw null;
            case 1:
                if (i == 1) {
                    g09Var2 = g09Var3;
                }
                g09Var = g09.X;
                switch (b2) {
                    case 0:
                        vm8.c(this);
                        throw null;
                    case 1:
                        if (i <= 3) {
                            g09Var3 = g09Var;
                        }
                        vz7 vz7Var = zr8.a;
                        if (g09Var2.compareTo(g09Var3) < 0) {
                            bt.q("Seconds cannot be included without minutes");
                            return;
                        } else if (z) {
                            z68.v0(wr8Var, "Z", new yr8(g09Var2, z2, g09Var3, b));
                            return;
                        } else {
                            wr8.p(wr8Var);
                            zr8.a(wr8Var, g09Var2, new zs1(z2, (Object) g09Var3, (byte) 6));
                            return;
                        }
                    case 2:
                        if (i <= 3) {
                            g09Var3 = g09Var;
                        }
                        vz7 vz7Var2 = zr8.a;
                        if (g09Var2.compareTo(g09Var3) < 0) {
                            bt.q("Seconds cannot be included without minutes");
                            return;
                        } else if (z) {
                            z68.v0(wr8Var, "Z", new yr8(g09Var2, z2, g09Var3, b));
                            return;
                        } else {
                            wr8.p(wr8Var);
                            zr8.a(wr8Var, g09Var2, new zs1(z2, (Object) g09Var3, (byte) 6));
                            return;
                        }
                    default:
                        if (i <= 3) {
                            g09Var3 = g09Var;
                        }
                        vz7 vz7Var3 = zr8.a;
                        if (g09Var2.compareTo(g09Var3) < 0) {
                            bt.q("Seconds cannot be included without minutes");
                            return;
                        } else if (z) {
                            z68.v0(wr8Var, "Z", new yr8(g09Var2, z2, g09Var3, b));
                            return;
                        } else {
                            wr8.p(wr8Var);
                            zr8.a(wr8Var, g09Var2, new zs1(z2, (Object) g09Var3, (byte) 6));
                            return;
                        }
                }
            case 2:
                if (i == 1) {
                    g09Var2 = g09Var3;
                }
                g09Var = g09.X;
                switch (b2) {
                    case 0:
                        vm8.c(this);
                        throw null;
                    case 1:
                        if (i <= 3) {
                            g09Var3 = g09Var;
                        }
                        vz7 vz7Var4 = zr8.a;
                        if (g09Var2.compareTo(g09Var3) < 0) {
                            bt.q("Seconds cannot be included without minutes");
                            return;
                        } else if (z) {
                            z68.v0(wr8Var, "Z", new yr8(g09Var2, z2, g09Var3, b));
                            return;
                        } else {
                            wr8.p(wr8Var);
                            zr8.a(wr8Var, g09Var2, new zs1(z2, (Object) g09Var3, (byte) 6));
                            return;
                        }
                    case 2:
                        if (i <= 3) {
                            g09Var3 = g09Var;
                        }
                        vz7 vz7Var5 = zr8.a;
                        if (g09Var2.compareTo(g09Var3) < 0) {
                            bt.q("Seconds cannot be included without minutes");
                            return;
                        } else if (z) {
                            z68.v0(wr8Var, "Z", new yr8(g09Var2, z2, g09Var3, b));
                            return;
                        } else {
                            wr8.p(wr8Var);
                            zr8.a(wr8Var, g09Var2, new zs1(z2, (Object) g09Var3, (byte) 6));
                            return;
                        }
                    default:
                        if (i <= 3) {
                            g09Var3 = g09Var;
                        }
                        vz7 vz7Var6 = zr8.a;
                        if (g09Var2.compareTo(g09Var3) < 0) {
                            bt.q("Seconds cannot be included without minutes");
                            return;
                        } else if (z) {
                            z68.v0(wr8Var, "Z", new yr8(g09Var2, z2, g09Var3, b));
                            return;
                        } else {
                            wr8.p(wr8Var);
                            zr8.a(wr8Var, g09Var2, new zs1(z2, (Object) g09Var3, (byte) 6));
                            return;
                        }
                }
            default:
                g09Var = g09.X;
                switch (b2) {
                    case 0:
                        vm8.c(this);
                        throw null;
                    case 1:
                        if (i <= 3) {
                            g09Var3 = g09Var;
                        }
                        vz7 vz7Var7 = zr8.a;
                        if (g09Var2.compareTo(g09Var3) < 0) {
                            bt.q("Seconds cannot be included without minutes");
                            return;
                        } else if (z) {
                            z68.v0(wr8Var, "Z", new yr8(g09Var2, z2, g09Var3, b));
                            return;
                        } else {
                            wr8.p(wr8Var);
                            zr8.a(wr8Var, g09Var2, new zs1(z2, (Object) g09Var3, (byte) 6));
                            return;
                        }
                    case 2:
                        if (i <= 3) {
                            g09Var3 = g09Var;
                        }
                        vz7 vz7Var8 = zr8.a;
                        if (g09Var2.compareTo(g09Var3) < 0) {
                            bt.q("Seconds cannot be included without minutes");
                            return;
                        } else if (z) {
                            z68.v0(wr8Var, "Z", new yr8(g09Var2, z2, g09Var3, b));
                            return;
                        } else {
                            wr8.p(wr8Var);
                            zr8.a(wr8Var, g09Var2, new zs1(z2, (Object) g09Var3, (byte) 6));
                            return;
                        }
                    default:
                        if (i <= 3) {
                            g09Var3 = g09Var;
                        }
                        vz7 vz7Var9 = zr8.a;
                        if (g09Var2.compareTo(g09Var3) < 0) {
                            bt.q("Seconds cannot be included without minutes");
                            return;
                        } else if (z) {
                            z68.v0(wr8Var, "Z", new yr8(g09Var2, z2, g09Var3, b));
                            return;
                        } else {
                            wr8.p(wr8Var);
                            zr8.a(wr8Var, g09Var2, new zs1(z2, (Object) g09Var3, (byte) 6));
                            return;
                        }
                }
        }
    }
}
