package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jv5 implements iv5 {
    public static final we5 i0 = new we5(6);
    public long X;
    public iv5 Y;
    public boolean Z;
    public long f0;
    public long g0;
    public iv5 h0;

    public final void a() {
        while (true) {
            synchronized (this) {
                try {
                    long j = this.f0;
                    long j2 = this.g0;
                    iv5 iv5Var = this.h0;
                    if (j == 0 && j2 == 0 && iv5Var == null) {
                        this.Z = false;
                        return;
                    }
                    this.f0 = 0L;
                    this.g0 = 0L;
                    this.h0 = null;
                    long j3 = this.X;
                    if (j3 != Long.MAX_VALUE) {
                        long j4 = j3 + j;
                        if (j4 < 0 || j4 == Long.MAX_VALUE) {
                            this.X = Long.MAX_VALUE;
                            j3 = Long.MAX_VALUE;
                        } else {
                            j3 = j4 - j2;
                            if (j3 < 0) {
                                bt.i("more produced than requested");
                                return;
                            }
                            this.X = j3;
                        }
                    }
                    if (iv5Var == null) {
                        iv5 iv5Var2 = this.Y;
                        if (iv5Var2 != null && j != 0) {
                            iv5Var2.request(j);
                        }
                    } else if (iv5Var == i0) {
                        this.Y = null;
                    } else {
                        this.Y = iv5Var;
                        iv5Var.request(j3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(iv5 iv5Var) {
        synchronized (this) {
            try {
                if (this.Z) {
                    this.h0 = iv5Var;
                    return;
                }
                this.Z = true;
                try {
                    this.Y = iv5Var;
                    iv5Var.request(this.X);
                    a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.Z = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.iv5
    public final void request(long j) {
        if (j < 0) {
            bt.q("n >= 0 required");
            return;
        }
        if (j == 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.Z) {
                    this.f0 += j;
                    return;
                }
                this.Z = true;
                try {
                    long j2 = this.X + j;
                    if (j2 < 0) {
                        j2 = Long.MAX_VALUE;
                    }
                    this.X = j2;
                    iv5 iv5Var = this.Y;
                    if (iv5Var != null) {
                        iv5Var.request(j);
                    }
                    a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.Z = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
