package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q37 implements u85 {
    public final u85 X;
    public boolean Y;
    public volatile boolean Z;
    public er5 f0;

    public q37(aq7 aq7Var) {
        this.X = aq7Var;
    }

    @Override // defpackage.u85
    public final void b() {
        if (this.Z) {
            return;
        }
        synchronized (this) {
            try {
                if (this.Z) {
                    return;
                }
                this.Z = true;
                if (!this.Y) {
                    this.Y = true;
                    this.X.b();
                    return;
                }
                er5 er5Var = this.f0;
                if (er5Var == null) {
                    er5Var = new er5();
                    this.f0 = er5Var;
                }
                er5Var.b(ch3.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        vr3.c0(th);
        if (this.Z) {
            return;
        }
        synchronized (this) {
            try {
                if (this.Z) {
                    return;
                }
                this.Z = true;
                if (!this.Y) {
                    this.Y = true;
                    this.X.onError(th);
                    return;
                }
                er5 er5Var = this.f0;
                if (er5Var == null) {
                    er5Var = new er5();
                    this.f0 = er5Var;
                }
                er5Var.b(new t65(th));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.u85
    public final void onNext(Object obj) {
        if (this.Z) {
            return;
        }
        synchronized (this) {
            try {
                if (this.Z) {
                    return;
                }
                if (this.Y) {
                    er5 er5Var = this.f0;
                    if (er5Var == null) {
                        er5Var = new er5();
                        this.f0 = er5Var;
                    }
                    if (obj == null) {
                        obj = ch3.d;
                    }
                    er5Var.b(obj);
                    return;
                }
                this.Y = true;
                try {
                    this.X.onNext(obj);
                    while (true) {
                        synchronized (this) {
                            try {
                                er5 er5Var2 = this.f0;
                                if (er5Var2 == null) {
                                    this.Y = false;
                                    return;
                                }
                                this.f0 = null;
                                for (Object obj2 : er5Var2.a) {
                                    if (obj2 == null) {
                                        break;
                                    }
                                    try {
                                        u85 u85Var = this.X;
                                        if (obj2 == ch3.c) {
                                            u85Var.b();
                                        } else {
                                            if (obj2 == ch3.d) {
                                                u85Var.onNext(null);
                                            } else if (obj2.getClass() == t65.class) {
                                                u85Var.onError(((t65) obj2).X);
                                            } else {
                                                u85Var.onNext(obj2);
                                            }
                                        }
                                        this.Z = true;
                                        return;
                                    } catch (Throwable th) {
                                        this.Z = true;
                                        vr3.c0(th);
                                        u85 u85Var2 = this.X;
                                        ma5.a(obj, th);
                                        u85Var2.onError(th);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    this.Z = true;
                    vr3.e0(th3, this.X, obj);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
