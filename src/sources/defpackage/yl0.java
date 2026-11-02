package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yl0 implements Runnable {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ zl0 Y;
    public final /* synthetic */ Executor Z;
    public final /* synthetic */ long f0;
    public final /* synthetic */ int g0;
    public final /* synthetic */ Context h0;
    public final /* synthetic */ qd0 i0;

    public /* synthetic */ yl0(zl0 zl0Var, Context context, Executor executor, int i, qd0 qd0Var, long j) {
        this.Y = zl0Var;
        this.h0 = context;
        this.Z = executor;
        this.g0 = i;
        this.i0 = qd0Var;
        this.f0 = j;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0181  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b3 A[Catch: all -> 0x0215, TryCatch #2 {all -> 0x0215, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01a5, B:85:0x020a, B:60:0x01a9, B:61:0x01b3, B:62:0x01b6, B:66:0x01bb, B:68:0x01bf, B:69:0x01c1, B:73:0x01c6, B:77:0x01cd, B:78:0x01ce, B:80:0x01d2, B:81:0x01fa, B:83:0x01fe, B:84:0x0202, B:90:0x0214, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:64:0x01b8, B:65:0x01ba, B:71:0x01c3, B:72:0x01c5), top: B:96:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bf A[Catch: all -> 0x0215, TryCatch #2 {all -> 0x0215, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01a5, B:85:0x020a, B:60:0x01a9, B:61:0x01b3, B:62:0x01b6, B:66:0x01bb, B:68:0x01bf, B:69:0x01c1, B:73:0x01c6, B:77:0x01cd, B:78:0x01ce, B:80:0x01d2, B:81:0x01fa, B:83:0x01fe, B:84:0x0202, B:90:0x0214, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:64:0x01b8, B:65:0x01ba, B:71:0x01c3, B:72:0x01c5), top: B:96:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce A[Catch: all -> 0x0215, TryCatch #2 {all -> 0x0215, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01a5, B:85:0x020a, B:60:0x01a9, B:61:0x01b3, B:62:0x01b6, B:66:0x01bb, B:68:0x01bf, B:69:0x01c1, B:73:0x01c6, B:77:0x01cd, B:78:0x01ce, B:80:0x01d2, B:81:0x01fa, B:83:0x01fe, B:84:0x0202, B:90:0x0214, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:64:0x01b8, B:65:0x01ba, B:71:0x01c3, B:72:0x01c5), top: B:96:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01d2 A[Catch: all -> 0x0215, TryCatch #2 {all -> 0x0215, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01a5, B:85:0x020a, B:60:0x01a9, B:61:0x01b3, B:62:0x01b6, B:66:0x01bb, B:68:0x01bf, B:69:0x01c1, B:73:0x01c6, B:77:0x01cd, B:78:0x01ce, B:80:0x01d2, B:81:0x01fa, B:83:0x01fe, B:84:0x0202, B:90:0x0214, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:64:0x01b8, B:65:0x01ba, B:71:0x01c3, B:72:0x01c5), top: B:96:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01fa A[Catch: all -> 0x0215, TryCatch #2 {all -> 0x0215, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01a5, B:85:0x020a, B:60:0x01a9, B:61:0x01b3, B:62:0x01b6, B:66:0x01bb, B:68:0x01bf, B:69:0x01c1, B:73:0x01c6, B:77:0x01cd, B:78:0x01ce, B:80:0x01d2, B:81:0x01fa, B:83:0x01fe, B:84:0x0202, B:90:0x0214, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:64:0x01b8, B:65:0x01ba, B:71:0x01c3, B:72:0x01c5), top: B:96:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01fe A[Catch: all -> 0x0215, TryCatch #2 {all -> 0x0215, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01a5, B:85:0x020a, B:60:0x01a9, B:61:0x01b3, B:62:0x01b6, B:66:0x01bb, B:68:0x01bf, B:69:0x01c1, B:73:0x01c6, B:77:0x01cd, B:78:0x01ce, B:80:0x01d2, B:81:0x01fa, B:83:0x01fe, B:84:0x0202, B:90:0x0214, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:64:0x01b8, B:65:0x01ba, B:71:0x01c3, B:72:0x01c5), top: B:96:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0202 A[Catch: all -> 0x0215, TryCatch #2 {all -> 0x0215, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005d, B:13:0x0078, B:15:0x0086, B:17:0x00a7, B:24:0x00b9, B:25:0x00e2, B:27:0x00e8, B:28:0x00f8, B:30:0x012a, B:31:0x012d, B:32:0x012f, B:36:0x0134, B:40:0x013e, B:41:0x013f, B:42:0x014b, B:53:0x016f, B:57:0x0186, B:59:0x01a5, B:85:0x020a, B:60:0x01a9, B:61:0x01b3, B:62:0x01b6, B:66:0x01bb, B:68:0x01bf, B:69:0x01c1, B:73:0x01c6, B:77:0x01cd, B:78:0x01ce, B:80:0x01d2, B:81:0x01fa, B:83:0x01fe, B:84:0x0202, B:90:0x0214, B:49:0x0153, B:50:0x0160, B:51:0x0161, B:52:0x016e, B:64:0x01b8, B:65:0x01ba, B:71:0x01c3, B:72:0x01c5), top: B:96:0x0030, inners: #1, #6 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x01d2, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        ek6 ek6VarB;
        switch (this.X) {
            case 0:
                zl0 zl0Var = this.Y;
                Context context = this.h0;
                Executor executor = this.Z;
                int i = this.g0;
                qd0 qd0Var = this.i0;
                long j = this.f0;
                Trace.beginSection("CX:initAndRetryRecursively");
                try {
                    try {
                        gi0 gi0VarJ = zl0Var.c.j();
                        try {
                            if (gi0VarJ == null) {
                                throw new pc3(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                            }
                            wx wxVar = new wx(zl0Var.d, zl0Var.e);
                            lk0 lk0VarC = zl0Var.c.c();
                            context.getClass();
                            h70 h70Var = new h70(context, lk0VarC);
                            long jK = zl0Var.c.k();
                            if (zl0Var.c.o() == null) {
                                throw new pc3(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                            }
                            ul0 ul0Var = new ul0(context);
                            zl0Var.i = ul0Var;
                            xd6 xd6Var = new xd6(ul0Var);
                            zl0Var.j = xd6Var;
                            zl0Var.g = gi0VarJ.a(context, wxVar, lk0VarC, jK, zl0Var.c, xd6Var);
                            if (zl0Var.c.l() == null) {
                                throw new pc3(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                            }
                            hl0 hl0Var = new hl0(context, (l91) ((vz7) zl0Var.g.j0).getValue(), zl0Var.g.h());
                            zl0Var.h = hl0Var;
                            zl0Var.j.Z = hl0Var;
                            if (executor instanceof di0) {
                                ((di0) executor).g(zl0Var.g);
                            }
                            zl0Var.a.d(zl0Var.g);
                            vh0 vh0Var = (vh0) zl0Var.g.h0;
                            vh0Var.b(zl0Var.a);
                            zl0Var.k = new z47(zl0Var.a, vh0Var, zl0Var.i, zl0Var.j);
                            Iterator it = zl0Var.a.c().iterator();
                            while (it.hasNext()) {
                                ((cj0) it.next()).s().i(zl0Var.k);
                            }
                            zl0Var.n.g(h70Var, zl0Var.g, zl0Var.a);
                            ek0 ek0Var = zl0Var.n;
                            hl0 hl0Var2 = zl0Var.h;
                            ek0Var.getClass();
                            hl0Var2.getClass();
                            ek0Var.m.add(hl0Var2);
                            ek0 ek0Var2 = zl0Var.n;
                            vh0 vh0Var2 = (vh0) zl0Var.g.h0;
                            ek0Var2.getClass();
                            vh0Var2.getClass();
                            ek0Var2.m.add(vh0Var2);
                            h70Var.o(zl0Var.a);
                            if (i > 1) {
                                zl0.b(null);
                            }
                            synchronized (zl0Var.b) {
                                zl0Var.p = 4;
                                break;
                            }
                            qd0Var.b(null);
                            Trace.endSection();
                            return;
                        } catch (RuntimeException e) {
                            e = e;
                            fk0 fk0Var = new fk0(j, e);
                            ek6VarB = zl0Var.l.b(fk0Var);
                            zl0.b(fk0Var);
                            if (ek6VarB.b) {
                                synchronized (zl0Var.b) {
                                    zl0Var.p = 3;
                                    if (ek6VarB.c) {
                                        synchronized (zl0Var.b) {
                                            zl0Var.p = 4;
                                            qd0Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof vl0) {
                                            String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((vl0) e).X;
                                            hi5.z0("CameraX");
                                            qd0Var.d(new pc3(new kl0(str)));
                                        } else if (e instanceof pc3) {
                                            qd0Var.d(e);
                                        } else {
                                            qd0Var.d(new pc3(e));
                                        }
                                        zl0Var.n.f();
                                    }
                                }
                            } else {
                                synchronized (zl0Var.b) {
                                    zl0Var.p = 3;
                                    if (ek6VarB.c) {
                                        synchronized (zl0Var.b) {
                                            zl0Var.p = 4;
                                            qd0Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof vl0) {
                                            String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((vl0) e).X;
                                            hi5.z0("CameraX");
                                            qd0Var.d(new pc3(new kl0(str2)));
                                        } else if (e instanceof pc3) {
                                            qd0Var.d(e);
                                        } else {
                                            qd0Var.d(new pc3(e));
                                        }
                                        zl0Var.n.f();
                                    }
                                }
                            }
                        } catch (pc3 e2) {
                            e = e2;
                            fk0 fk0Var2 = new fk0(j, e);
                            ek6VarB = zl0Var.l.b(fk0Var2);
                            zl0.b(fk0Var2);
                            if (ek6VarB.b) {
                                synchronized (zl0Var.b) {
                                    zl0Var.p = 3;
                                    if (ek6VarB.c) {
                                        synchronized (zl0Var.b) {
                                            zl0Var.p = 4;
                                            qd0Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof vl0) {
                                            String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((vl0) e).X;
                                            hi5.z0("CameraX");
                                            qd0Var.d(new pc3(new kl0(str3)));
                                        } else if (e instanceof pc3) {
                                            qd0Var.d(e);
                                        } else {
                                            qd0Var.d(new pc3(e));
                                        }
                                        zl0Var.n.f();
                                    }
                                }
                            } else {
                                synchronized (zl0Var.b) {
                                    zl0Var.p = 3;
                                    if (ek6VarB.c) {
                                        synchronized (zl0Var.b) {
                                            zl0Var.p = 4;
                                            qd0Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof vl0) {
                                            String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((vl0) e).X;
                                            hi5.z0("CameraX");
                                            qd0Var.d(new pc3(new kl0(str4)));
                                        } else if (e instanceof pc3) {
                                            qd0Var.d(e);
                                        } else {
                                            qd0Var.d(new pc3(e));
                                        }
                                        zl0Var.n.f();
                                    }
                                }
                            }
                        } catch (vl0 e3) {
                            e = e3;
                            fk0 fk0Var3 = new fk0(j, e);
                            ek6VarB = zl0Var.l.b(fk0Var3);
                            zl0.b(fk0Var3);
                            if (ek6VarB.b) {
                                synchronized (zl0Var.b) {
                                    zl0Var.p = 3;
                                    if (ek6VarB.c) {
                                        synchronized (zl0Var.b) {
                                            zl0Var.p = 4;
                                            qd0Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof vl0) {
                                            String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((vl0) e).X;
                                            hi5.z0("CameraX");
                                            qd0Var.d(new pc3(new kl0(str5)));
                                        } else if (e instanceof pc3) {
                                            qd0Var.d(e);
                                        } else {
                                            qd0Var.d(new pc3(e));
                                        }
                                        zl0Var.n.f();
                                    }
                                }
                            } else {
                                synchronized (zl0Var.b) {
                                    zl0Var.p = 3;
                                    if (ek6VarB.c) {
                                        synchronized (zl0Var.b) {
                                            zl0Var.p = 4;
                                            qd0Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof vl0) {
                                            String str6 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((vl0) e).X;
                                            hi5.z0("CameraX");
                                            qd0Var.d(new pc3(new kl0(str6)));
                                        } else if (e instanceof pc3) {
                                            qd0Var.d(e);
                                        } else {
                                            qd0Var.d(new pc3(e));
                                        }
                                        zl0Var.n.f();
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (RuntimeException e4) {
                    e = e4;
                } catch (pc3 e5) {
                    e = e5;
                } catch (vl0 e6) {
                    e = e6;
                }
                fk0 fk0Var4 = new fk0(j, e);
                ek6VarB = zl0Var.l.b(fk0Var4);
                zl0.b(fk0Var4);
                if (ek6VarB.b || i >= Integer.MAX_VALUE) {
                    synchronized (zl0Var.b) {
                        zl0Var.p = 3;
                        break;
                    }
                    if (ek6VarB.c) {
                        synchronized (zl0Var.b) {
                            zl0Var.p = 4;
                            break;
                        }
                        qd0Var.b(null);
                    } else if (e instanceof vl0) {
                        String str7 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((vl0) e).X;
                        hi5.z0("CameraX");
                        qd0Var.d(new pc3(new kl0(str7)));
                    } else if (e instanceof pc3) {
                        qd0Var.d(e);
                    } else {
                        qd0Var.d(new pc3(e));
                    }
                    Trace.endSection();
                    return;
                }
                SystemClock.elapsedRealtime();
                hi5.z0("CameraX");
                Handler handler = zl0Var.e;
                yl0 yl0Var = new yl0(zl0Var, executor, j, i, context, qd0Var);
                long j2 = ek6VarB.a;
                if (Build.VERSION.SDK_INT >= 28) {
                    en.L(handler, yl0Var, j2);
                } else {
                    Message messageObtain = Message.obtain(handler, yl0Var);
                    messageObtain.obj = "retry_token";
                    handler.sendMessageDelayed(messageObtain, j2);
                }
                zl0Var.n.f();
                Trace.endSection();
                return;
            default:
                zl0 zl0Var2 = this.Y;
                Executor executor2 = this.Z;
                executor2.execute(new yl0(zl0Var2, this.h0, executor2, this.g0 + 1, this.i0, this.f0));
                return;
        }
    }

    public /* synthetic */ yl0(zl0 zl0Var, Executor executor, long j, int i, Context context, qd0 qd0Var) {
        this.Y = zl0Var;
        this.Z = executor;
        this.f0 = j;
        this.g0 = i;
        this.h0 = context;
        this.i0 = qd0Var;
    }
}
