package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class za implements yh0 {
    public final jj0 X;
    public final CameraDevice Y;
    public final String Z;
    public final eg0 f0;
    public final dq g0;
    public final s98 h0;
    public final pv i0;
    public final tv j0;

    public za(jj0 jj0Var, CameraDevice cameraDevice, String str, eg0 eg0Var, dq dqVar, s98 s98Var) {
        jj0Var.getClass();
        str.getClass();
        eg0Var.getClass();
        s98Var.getClass();
        this.X = jj0Var;
        this.Y = cameraDevice;
        this.Z = str;
        this.f0 = eg0Var;
        this.g0 = dqVar;
        this.h0 = s98Var;
        this.i0 = nr4.e(false);
        this.j0 = nr4.g(null);
    }

    @Override // defpackage.yh0
    public final void B0() {
        if (!this.i0.b()) {
            bt.i("Check failed.");
            return;
        }
        n57 n57Var = (n57) this.j0.b(null);
        if (n57Var != null) {
            c(n57Var);
        }
    }

    @Override // defpackage.yh0
    public final void C(int i) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String str = this.Z;
            eg0 eg0Var = this.f0;
            try {
                b4.p(this.Y, i);
            } catch (Exception e) {
                int i2 = 0;
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i2 = 3;
                    } else if (reason == 2) {
                        i2 = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i2 = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i2 = 11;
                        } else {
                            i2 = 2;
                        }
                    }
                    eg0Var.a(i2, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    eg0Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        if (zu3Var.equals(yb6.a.b(CameraDevice.class))) {
            return this.Y;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x012f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x0139 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yh0
    public final boolean H0(w62 w62Var) throws Throwable {
        Locale locale;
        long j;
        Locale locale2;
        boolean z;
        Object obj;
        int i;
        long j2;
        long j3;
        hv hvVar = w62Var.b;
        CameraDevice cameraDevice = this.Y;
        Integer num = w62Var.f;
        x62 x62Var = w62Var.g;
        qg5 qg5VarA = a(x62Var);
        boolean zBooleanValue = ((Boolean) qg5VarA.X).booleanValue();
        n57 n57Var = (n57) qg5VarA.Y;
        if (!zBooleanValue) {
            return false;
        }
        if (n57Var != null) {
            b(n57Var);
        }
        String str = this.Z;
        String strL = oi0.l("CXCP#createExtensionSession-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strL);
                eg0 eg0Var = this.f0;
                try {
                    int iIntValue = num.intValue();
                    ArrayList arrayList = w62Var.a;
                    ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((OutputConfiguration) ((af) it.next()).C0(yb6.a.b(OutputConfiguration.class)));
                        iIntValue = iIntValue;
                    }
                    long j4 = jElapsedRealtimeNanos;
                    locale2 = null;
                    try {
                        ExtensionSessionConfiguration extensionSessionConfiguration = new ExtensionSessionConfiguration(iIntValue, arrayList2, hvVar, new xd(this, x62Var, n57Var, this.f0, this.g0, hvVar));
                        af afVar = w62Var.h;
                        if (afVar != null && Build.VERSION.SDK_INT >= 34) {
                            OutputConfiguration outputConfiguration = (OutputConfiguration) afVar.C0(yb6.a.b(OutputConfiguration.class));
                            if (outputConfiguration == null) {
                                throw new IllegalStateException("Failed to unwrap Postview OutputConfiguration");
                            }
                            u3.G(extensionSessionConfiguration, outputConfiguration);
                        }
                        cameraDevice.createExtensionSession(extensionSessionConfiguration);
                        obj = dn8.a;
                        j3 = j4;
                    } catch (Exception e) {
                        e = e;
                        j = j4;
                        if (!(e instanceof CameraAccessException)) {
                            if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                e.getMessage();
                                z = false;
                                eg0Var.a(9, str, false);
                                obj = locale2;
                                j2 = j;
                            } else if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            String.format(locale2, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(j2) / 1000000.0d)}, 1));
                            if (obj == null) {
                                Objects.toString(cameraDevice);
                                if (n57Var != null) {
                                    c(n57Var);
                                }
                            }
                            if (obj != null) {
                                return true;
                            }
                            return z;
                        }
                        e.getMessage();
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        boolean z2 = true;
                        if (reason != 1) {
                            if (reason == 2) {
                                i = 6;
                            } else if (reason == 3) {
                                i = 0;
                            } else if (reason == 4) {
                                i = 1;
                            } else if (reason != 5) {
                                cameraAccessException.toString();
                                i = 11;
                            } else {
                                i = 2;
                            }
                            z2 = true;
                        } else {
                            i = 3;
                        }
                        eg0Var.a(i, str, z2);
                        obj = locale2;
                        j3 = j;
                    }
                } catch (Exception e2) {
                    e = e2;
                    j = jElapsedRealtimeNanos;
                    locale2 = null;
                }
                z = false;
                j2 = j3;
                String.format(locale2, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(j2) / 1000000.0d)}, 1));
                if (obj == null) {
                    Objects.toString(cameraDevice);
                    if (n57Var != null) {
                        c(n57Var);
                    }
                }
                if (obj != null) {
                    return true;
                }
                return z;
            } catch (Throwable th) {
                th = th;
                locale = jElapsedRealtimeNanos;
                String.format(locale, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            locale = 0;
            String.format(locale, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            throw th;
        }
    }

    @Override // defpackage.yh0
    public final void J() {
        n57 n57Var;
        if (!this.i0.a() || (n57Var = (n57) this.j0.a) == null) {
            return;
        }
        b(n57Var);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008e A[Catch: all -> 0x0061, TryCatch #2 {all -> 0x0061, blocks: (B:17:0x0051, B:37:0x008a, B:39:0x008e, B:48:0x00a5, B:53:0x00b2, B:55:0x00b7, B:57:0x00bb, B:59:0x00bf, B:61:0x00c3, B:64:0x00c8, B:67:0x00cd, B:68:0x00ce), top: B:82:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5 A[Catch: all -> 0x0061, TryCatch #2 {all -> 0x0061, blocks: (B:17:0x0051, B:37:0x008a, B:39:0x008e, B:48:0x00a5, B:53:0x00b2, B:55:0x00b7, B:57:0x00bb, B:59:0x00bf, B:61:0x00c3, B:64:0x00c8, B:67:0x00cd, B:68:0x00ce), top: B:82:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7 A[Catch: all -> 0x0061, TryCatch #2 {all -> 0x0061, blocks: (B:17:0x0051, B:37:0x008a, B:39:0x008e, B:48:0x00a5, B:53:0x00b2, B:55:0x00b7, B:57:0x00bb, B:59:0x00bf, B:61:0x00c3, B:64:0x00c8, B:67:0x00cd, B:68:0x00ce), top: B:82:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb A[Catch: all -> 0x0061, TryCatch #2 {all -> 0x0061, blocks: (B:17:0x0051, B:37:0x008a, B:39:0x008e, B:48:0x00a5, B:53:0x00b2, B:55:0x00b7, B:57:0x00bb, B:59:0x00bf, B:61:0x00c3, B:64:0x00c8, B:67:0x00cd, B:68:0x00ce), top: B:82:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #2 {all -> 0x0061, blocks: (B:17:0x0051, B:37:0x008a, B:39:0x008e, B:48:0x00a5, B:53:0x00b2, B:55:0x00b7, B:57:0x00bb, B:59:0x00bf, B:61:0x00c3, B:64:0x00c8, B:67:0x00cd, B:68:0x00ce), top: B:82:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    @Override // defpackage.yh0
    public final boolean J0(ArrayList arrayList, sn0 sn0Var) throws Throwable {
        int i;
        n57 n57Var;
        boolean z;
        eg0 eg0Var;
        double d;
        dn8 dn8Var;
        CameraAccessException cameraAccessException;
        int reason;
        int i2;
        ?? r15;
        s98 s98Var = this.h0;
        CameraDevice cameraDevice = this.Y;
        qg5 qg5VarA = a(sn0Var);
        boolean zBooleanValue = ((Boolean) qg5VarA.X).booleanValue();
        n57 n57Var2 = (n57) qg5VarA.Y;
        if (!zBooleanValue) {
            return false;
        }
        if (n57Var2 != null) {
            b(n57Var2);
        }
        String str = this.Z;
        String strL = oi0.l("CXCP#createConstrainedHighSpeedCaptureSession-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strL);
                eg0 eg0Var2 = this.f0;
                try {
                    n57Var = n57Var2;
                    try {
                        try {
                            try {
                                try {
                                    z = true;
                                    eg0Var = eg0Var2;
                                    d = 1000000.0d;
                                    try {
                                        cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, new hb(this, sn0Var, n57Var, this.f0, this.g0, s98Var.a()), s98Var.a());
                                        dn8Var = dn8.a;
                                        r15 = z;
                                    } catch (Exception e) {
                                        e = e;
                                        if (e instanceof CameraAccessException) {
                                            e.getMessage();
                                            cameraAccessException = (CameraAccessException) e;
                                            reason = cameraAccessException.getReason();
                                            i2 = 3;
                                            if (reason != z) {
                                                if (reason == 2) {
                                                    i2 = 6;
                                                } else if (reason == 3) {
                                                    i2 = 0;
                                                } else if (reason == 4) {
                                                    i2 = z ? 1 : 0;
                                                } else if (reason != 5) {
                                                    cameraAccessException.toString();
                                                    i2 = 11;
                                                } else {
                                                    i2 = 2;
                                                }
                                            }
                                            eg0Var.a(i2, str, z);
                                        } else if (e instanceof IllegalArgumentException) {
                                            e.getMessage();
                                            eg0Var.a(9, str, false);
                                        } else {
                                            e.getMessage();
                                            eg0Var.a(9, str, false);
                                        }
                                        dn8Var = null;
                                        r15 = z;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    z = true;
                                    eg0Var = eg0Var2;
                                    d = 1000000.0d;
                                    if (e instanceof CameraAccessException) {
                                        e.getMessage();
                                        cameraAccessException = (CameraAccessException) e;
                                        reason = cameraAccessException.getReason();
                                        i2 = 3;
                                        if (reason != z) {
                                            if (reason == 2) {
                                                i2 = 6;
                                            } else if (reason == 3) {
                                                i2 = 0;
                                            } else if (reason == 4) {
                                                i2 = z ? 1 : 0;
                                            } else if (reason != 5) {
                                                cameraAccessException.toString();
                                                i2 = 11;
                                            } else {
                                                i2 = 2;
                                            }
                                        }
                                        eg0Var.a(i2, str, z);
                                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        e.getMessage();
                                        eg0Var.a(9, str, false);
                                    } else if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    dn8Var = null;
                                    r15 = z;
                                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                                    if (dn8Var == null) {
                                        Objects.toString(cameraDevice);
                                        if (n57Var != null) {
                                            c(n57Var);
                                        }
                                    }
                                    if (dn8Var != null) {
                                        return r15;
                                    }
                                    return false;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                eg0Var = eg0Var2;
                                z = true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = 1;
                            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, i));
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        z = true;
                        eg0Var = eg0Var2;
                        d = 1000000.0d;
                        if (e instanceof CameraAccessException) {
                            e.getMessage();
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i2 = 3;
                            if (reason != z) {
                                if (reason == 2) {
                                    i2 = 6;
                                } else if (reason == 3) {
                                    i2 = 0;
                                } else if (reason == 4) {
                                    i2 = z ? 1 : 0;
                                } else if (reason != 5) {
                                    cameraAccessException.toString();
                                    i2 = 11;
                                } else {
                                    i2 = 2;
                                }
                            }
                            eg0Var.a(i2, str, z);
                        } else if (e instanceof IllegalArgumentException) {
                            e.getMessage();
                            eg0Var.a(9, str, false);
                        } else {
                            e.getMessage();
                            eg0Var.a(9, str, false);
                        }
                        dn8Var = null;
                        r15 = z;
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                        if (dn8Var == null) {
                            Objects.toString(cameraDevice);
                            if (n57Var != null) {
                                c(n57Var);
                            }
                        }
                        if (dn8Var != null) {
                            return r15;
                        }
                        return false;
                    }
                } catch (Exception e5) {
                    e = e5;
                    n57Var = n57Var2;
                }
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                if (dn8Var == null) {
                    Objects.toString(cameraDevice);
                    if (n57Var != null) {
                        c(n57Var);
                    }
                }
                if (dn8Var != null) {
                    return r15;
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                i = 1;
            }
        } catch (Throwable th3) {
            th = th3;
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, i));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0204  */
    /* JADX WARN: Code duplicated, block: B:105:0x0209  */
    /* JADX WARN: Code duplicated, block: B:107:0x020e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0210  */
    /* JADX WARN: Code duplicated, block: B:69:0x019b A[Catch: all -> 0x00b4, TryCatch #4 {all -> 0x00b4, blocks: (B:25:0x009a, B:27:0x00a6, B:29:0x00ac, B:34:0x00ba, B:37:0x00e5, B:38:0x0108, B:40:0x010e, B:41:0x011c, B:42:0x0126, B:44:0x012c, B:46:0x013e, B:48:0x014b, B:50:0x0152, B:51:0x015b, B:53:0x016d, B:56:0x0176, B:57:0x0179, B:59:0x017b, B:60:0x017e, B:67:0x0197, B:69:0x019b, B:78:0x01b3, B:84:0x01c4, B:86:0x01c9, B:88:0x01cd, B:90:0x01d1, B:92:0x01d5, B:95:0x01da, B:98:0x01df, B:99:0x01e0), top: B:116:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b3 A[Catch: all -> 0x00b4, TryCatch #4 {all -> 0x00b4, blocks: (B:25:0x009a, B:27:0x00a6, B:29:0x00ac, B:34:0x00ba, B:37:0x00e5, B:38:0x0108, B:40:0x010e, B:41:0x011c, B:42:0x0126, B:44:0x012c, B:46:0x013e, B:48:0x014b, B:50:0x0152, B:51:0x015b, B:53:0x016d, B:56:0x0176, B:57:0x0179, B:59:0x017b, B:60:0x017e, B:67:0x0197, B:69:0x019b, B:78:0x01b3, B:84:0x01c4, B:86:0x01c9, B:88:0x01cd, B:90:0x01d1, B:92:0x01d5, B:95:0x01da, B:98:0x01df, B:99:0x01e0), top: B:116:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c9 A[Catch: all -> 0x00b4, TryCatch #4 {all -> 0x00b4, blocks: (B:25:0x009a, B:27:0x00a6, B:29:0x00ac, B:34:0x00ba, B:37:0x00e5, B:38:0x0108, B:40:0x010e, B:41:0x011c, B:42:0x0126, B:44:0x012c, B:46:0x013e, B:48:0x014b, B:50:0x0152, B:51:0x015b, B:53:0x016d, B:56:0x0176, B:57:0x0179, B:59:0x017b, B:60:0x017e, B:67:0x0197, B:69:0x019b, B:78:0x01b3, B:84:0x01c4, B:86:0x01c9, B:88:0x01cd, B:90:0x01d1, B:92:0x01d5, B:95:0x01da, B:98:0x01df, B:99:0x01e0), top: B:116:0x0032 }] */
    @Override // defpackage.yh0
    public final boolean X(i57 i57Var) throws Throwable {
        double d;
        n57 n57Var;
        boolean z;
        dn8 dn8Var;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z2;
        CameraDevice cameraDevice = this.Y;
        List list = i57Var.b;
        sn0 sn0Var = i57Var.e;
        qg5 qg5VarA = a(sn0Var);
        boolean zBooleanValue = ((Boolean) qg5VarA.X).booleanValue();
        n57 n57Var2 = (n57) qg5VarA.Y;
        if (!zBooleanValue) {
            return false;
        }
        if (n57Var2 != null) {
            b(n57Var2);
        }
        String str = this.Z;
        String strL = oi0.l("CXCP#createCaptureSession-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strL);
                eg0 eg0Var = this.f0;
                try {
                    int i2 = i57Var.a;
                    ArrayList arrayList = i57Var.c;
                    d = 1000000.0d;
                    try {
                        try {
                            ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add((OutputConfiguration) ((af) it.next()).C0(yb6.a.b(OutputConfiguration.class)));
                                i2 = i2;
                            }
                            int i3 = i2;
                            Executor executor = i57Var.d;
                            n57Var = n57Var2;
                            try {
                                jElapsedRealtimeNanos = jElapsedRealtimeNanos;
                                try {
                                    hb hbVar = new hb(this, sn0Var, n57Var, this.f0, this.g0, this.h0.a());
                                    executor.getClass();
                                    SessionConfiguration sessionConfigurationA = fn.a(i3, arrayList2, executor, hbVar);
                                    if (list != null) {
                                        if (Build.VERSION.SDK_INT >= 31) {
                                            en.T(sessionConfigurationA, tc.t(str, list));
                                        } else {
                                            en.T(sessionConfigurationA, new InputConfiguration(((hd3) wv0.O0(list)).a, ((hd3) wv0.O0(list)).b, ((hd3) wv0.O0(list)).c));
                                        }
                                    }
                                    try {
                                        Trace.beginSection("createCaptureRequest");
                                        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i57Var.f);
                                        Trace.endSection();
                                        builderCreateCaptureRequest.getClass();
                                        Set set = (Set) ((lf0) this.X).k0.getValue();
                                        ArrayList arrayList3 = new ArrayList(xv0.Z(set, 10));
                                        Iterator it2 = set.iterator();
                                        while (it2.hasNext()) {
                                            arrayList3.add(((CaptureRequest.Key) it2.next()).getName());
                                        }
                                        for (Map.Entry entry : i57Var.g.entrySet()) {
                                            Object key = entry.getKey();
                                            Object value = entry.getValue();
                                            if ((key instanceof CaptureRequest.Key) && arrayList3.contains(((CaptureRequest.Key) key).getName())) {
                                                try {
                                                    builderCreateCaptureRequest.set((CaptureRequest.Key) key, value);
                                                } catch (IllegalArgumentException unused) {
                                                    ((CaptureRequest.Key) key).getName();
                                                    Objects.toString(value);
                                                }
                                            }
                                        }
                                        CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
                                        captureRequestBuild.getClass();
                                        en.Z(sessionConfigurationA, captureRequestBuild);
                                        try {
                                            Trace.beginSection("Api28Compat.createCaptureSession");
                                            en.h(cameraDevice, sessionConfigurationA);
                                            Trace.endSection();
                                            dn8Var = dn8.a;
                                            z = false;
                                            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, 1));
                                            if (dn8Var == null) {
                                                Objects.toString(cameraDevice);
                                                if (n57Var != null) {
                                                    c(n57Var);
                                                }
                                            }
                                            if (dn8Var != null) {
                                                return true;
                                            }
                                            return z;
                                        } catch (Throwable th) {
                                            Trace.endSection();
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        Trace.endSection();
                                        throw th2;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    if (e instanceof CameraAccessException) {
                                        if (e instanceof IllegalArgumentException) {
                                        }
                                        e.getMessage();
                                        z = false;
                                        eg0Var.a(9, str, false);
                                        dn8Var = null;
                                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, 1));
                                        if (dn8Var == null) {
                                            Objects.toString(cameraDevice);
                                            if (n57Var != null) {
                                                c(n57Var);
                                            }
                                        }
                                        if (dn8Var != null) {
                                            return true;
                                        }
                                        return z;
                                    }
                                    e.getMessage();
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i = 3;
                                    z2 = true;
                                    if (reason != 1) {
                                        if (reason != 2) {
                                            i = 6;
                                        } else if (reason != 3) {
                                            z2 = true;
                                            i = 0;
                                        } else if (reason != 4) {
                                            z2 = true;
                                            i = 1;
                                        } else if (reason != 5) {
                                            cameraAccessException.toString();
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                        z2 = true;
                                    }
                                    eg0Var.a(i, str, z2);
                                    dn8Var = null;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                if (e instanceof CameraAccessException) {
                                    if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        e.getMessage();
                                        z = false;
                                        eg0Var.a(9, str, false);
                                        dn8Var = null;
                                    } else if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, 1));
                                    if (dn8Var == null) {
                                        Objects.toString(cameraDevice);
                                        if (n57Var != null) {
                                            c(n57Var);
                                        }
                                    }
                                    if (dn8Var != null) {
                                        return true;
                                    }
                                    return z;
                                }
                                e.getMessage();
                                cameraAccessException = (CameraAccessException) e;
                                reason = cameraAccessException.getReason();
                                i = 3;
                                z2 = true;
                                if (reason != 1) {
                                    if (reason != 2) {
                                        i = 6;
                                    } else if (reason != 3) {
                                        z2 = true;
                                        i = 0;
                                    } else if (reason != 4) {
                                        z2 = true;
                                        i = 1;
                                    } else if (reason != 5) {
                                        cameraAccessException.toString();
                                        i = 11;
                                    } else {
                                        i = 2;
                                    }
                                    z2 = true;
                                }
                                eg0Var.a(i, str, z2);
                                dn8Var = null;
                                z = false;
                                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, 1));
                                if (dn8Var == null) {
                                    Objects.toString(cameraDevice);
                                    if (n57Var != null) {
                                        c(n57Var);
                                    }
                                }
                                if (dn8Var != null) {
                                    return true;
                                }
                                return z;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, 1));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        n57Var = n57Var2;
                    }
                } catch (Exception e4) {
                    e = e4;
                    n57Var = n57Var2;
                    d = 1000000.0d;
                }
            } catch (Throwable th4) {
                th = th4;
                d = 1000000.0d;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.yh0
    public final CaptureRequest.Builder Y(int i) {
        CaptureRequest.Builder builderCreateCaptureRequest;
        StringBuilder sb = new StringBuilder("CXCP#createCaptureRequest-");
        String str = this.Z;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            eg0 eg0Var = this.f0;
            try {
                builderCreateCaptureRequest = this.Y.createCaptureRequest(i);
            } catch (Exception e) {
                int i2 = 0;
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i2 = 3;
                    } else if (reason == 2) {
                        i2 = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i2 = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i2 = 11;
                        } else {
                            i2 = 2;
                        }
                    }
                    eg0Var.a(i2, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    eg0Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                builderCreateCaptureRequest = null;
            }
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            return builderCreateCaptureRequest;
        } catch (Throwable th) {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            throw th;
        }
    }

    public final qg5 a(n57 n57Var) {
        if (!this.i0.b()) {
            return new qg5(Boolean.TRUE, this.j0.b(n57Var));
        }
        c(n57Var);
        return new qg5(Boolean.FALSE, null);
    }

    public final void b(n57 n57Var) {
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            n57Var.b();
        } finally {
            Trace.endSection();
        }
    }

    public final void c(n57 n57Var) {
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            n57Var.a();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008e A[Catch: all -> 0x0061, TryCatch #2 {all -> 0x0061, blocks: (B:17:0x0051, B:37:0x008a, B:39:0x008e, B:48:0x00a5, B:53:0x00b2, B:55:0x00b7, B:57:0x00bb, B:59:0x00bf, B:61:0x00c3, B:64:0x00c8, B:67:0x00cd, B:68:0x00ce), top: B:82:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5 A[Catch: all -> 0x0061, TryCatch #2 {all -> 0x0061, blocks: (B:17:0x0051, B:37:0x008a, B:39:0x008e, B:48:0x00a5, B:53:0x00b2, B:55:0x00b7, B:57:0x00bb, B:59:0x00bf, B:61:0x00c3, B:64:0x00c8, B:67:0x00cd, B:68:0x00ce), top: B:82:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7 A[Catch: all -> 0x0061, TryCatch #2 {all -> 0x0061, blocks: (B:17:0x0051, B:37:0x008a, B:39:0x008e, B:48:0x00a5, B:53:0x00b2, B:55:0x00b7, B:57:0x00bb, B:59:0x00bf, B:61:0x00c3, B:64:0x00c8, B:67:0x00cd, B:68:0x00ce), top: B:82:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb A[Catch: all -> 0x0061, TryCatch #2 {all -> 0x0061, blocks: (B:17:0x0051, B:37:0x008a, B:39:0x008e, B:48:0x00a5, B:53:0x00b2, B:55:0x00b7, B:57:0x00bb, B:59:0x00bf, B:61:0x00c3, B:64:0x00c8, B:67:0x00cd, B:68:0x00ce), top: B:82:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #2 {all -> 0x0061, blocks: (B:17:0x0051, B:37:0x008a, B:39:0x008e, B:48:0x00a5, B:53:0x00b2, B:55:0x00b7, B:57:0x00bb, B:59:0x00bf, B:61:0x00c3, B:64:0x00c8, B:67:0x00cd, B:68:0x00ce), top: B:82:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    @Override // defpackage.yh0
    public final boolean c0(List list, fh0 fh0Var) throws Throwable {
        int i;
        n57 n57Var;
        boolean z;
        eg0 eg0Var;
        double d;
        dn8 dn8Var;
        CameraAccessException cameraAccessException;
        int reason;
        int i2;
        ?? r15;
        s98 s98Var = this.h0;
        CameraDevice cameraDevice = this.Y;
        qg5 qg5VarA = a(fh0Var);
        boolean zBooleanValue = ((Boolean) qg5VarA.X).booleanValue();
        n57 n57Var2 = (n57) qg5VarA.Y;
        if (!zBooleanValue) {
            return false;
        }
        if (n57Var2 != null) {
            b(n57Var2);
        }
        String str = this.Z;
        String strL = oi0.l("CXCP#createCaptureSession-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strL);
                eg0 eg0Var2 = this.f0;
                try {
                    n57Var = n57Var2;
                    try {
                        try {
                            try {
                                try {
                                    z = true;
                                    eg0Var = eg0Var2;
                                    d = 1000000.0d;
                                    try {
                                        cameraDevice.createCaptureSession(list, new hb(this, fh0Var, n57Var, this.f0, this.g0, s98Var.a()), s98Var.a());
                                        dn8Var = dn8.a;
                                        r15 = z;
                                    } catch (Exception e) {
                                        e = e;
                                        if (e instanceof CameraAccessException) {
                                            e.getMessage();
                                            cameraAccessException = (CameraAccessException) e;
                                            reason = cameraAccessException.getReason();
                                            i2 = 3;
                                            if (reason != z) {
                                                if (reason == 2) {
                                                    i2 = 6;
                                                } else if (reason == 3) {
                                                    i2 = 0;
                                                } else if (reason == 4) {
                                                    i2 = z ? 1 : 0;
                                                } else if (reason != 5) {
                                                    cameraAccessException.toString();
                                                    i2 = 11;
                                                } else {
                                                    i2 = 2;
                                                }
                                            }
                                            eg0Var.a(i2, str, z);
                                        } else if (e instanceof IllegalArgumentException) {
                                            e.getMessage();
                                            eg0Var.a(9, str, false);
                                        } else {
                                            e.getMessage();
                                            eg0Var.a(9, str, false);
                                        }
                                        dn8Var = null;
                                        r15 = z;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    z = true;
                                    eg0Var = eg0Var2;
                                    d = 1000000.0d;
                                    if (e instanceof CameraAccessException) {
                                        e.getMessage();
                                        cameraAccessException = (CameraAccessException) e;
                                        reason = cameraAccessException.getReason();
                                        i2 = 3;
                                        if (reason != z) {
                                            if (reason == 2) {
                                                i2 = 6;
                                            } else if (reason == 3) {
                                                i2 = 0;
                                            } else if (reason == 4) {
                                                i2 = z ? 1 : 0;
                                            } else if (reason != 5) {
                                                cameraAccessException.toString();
                                                i2 = 11;
                                            } else {
                                                i2 = 2;
                                            }
                                        }
                                        eg0Var.a(i2, str, z);
                                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        e.getMessage();
                                        eg0Var.a(9, str, false);
                                    } else if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    dn8Var = null;
                                    r15 = z;
                                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                                    if (dn8Var == null) {
                                        Objects.toString(cameraDevice);
                                        if (n57Var != null) {
                                            c(n57Var);
                                        }
                                    }
                                    if (dn8Var != null) {
                                        return r15;
                                    }
                                    return false;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                eg0Var = eg0Var2;
                                z = true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = 1;
                            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, i));
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        z = true;
                        eg0Var = eg0Var2;
                        d = 1000000.0d;
                        if (e instanceof CameraAccessException) {
                            e.getMessage();
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i2 = 3;
                            if (reason != z) {
                                if (reason == 2) {
                                    i2 = 6;
                                } else if (reason == 3) {
                                    i2 = 0;
                                } else if (reason == 4) {
                                    i2 = z ? 1 : 0;
                                } else if (reason != 5) {
                                    cameraAccessException.toString();
                                    i2 = 11;
                                } else {
                                    i2 = 2;
                                }
                            }
                            eg0Var.a(i2, str, z);
                        } else if (e instanceof IllegalArgumentException) {
                            e.getMessage();
                            eg0Var.a(9, str, false);
                        } else {
                            e.getMessage();
                            eg0Var.a(9, str, false);
                        }
                        dn8Var = null;
                        r15 = z;
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                        if (dn8Var == null) {
                            Objects.toString(cameraDevice);
                            if (n57Var != null) {
                                c(n57Var);
                            }
                        }
                        if (dn8Var != null) {
                            return r15;
                        }
                        return false;
                    }
                } catch (Exception e5) {
                    e = e5;
                    n57Var = n57Var2;
                }
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                if (dn8Var == null) {
                    Objects.toString(cameraDevice);
                    if (n57Var != null) {
                        c(n57Var);
                    }
                }
                if (dn8Var != null) {
                    return r15;
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                i = 1;
            }
        } catch (Throwable th3) {
            th = th3;
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, i));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3 A[Catch: all -> 0x009e, TryCatch #6 {all -> 0x009e, blocks: (B:27:0x008f, B:39:0x00af, B:41:0x00b3, B:50:0x00ca, B:56:0x00dc, B:59:0x00e2, B:61:0x00e8, B:63:0x00ec, B:65:0x00f0, B:68:0x00f5, B:71:0x00fa, B:72:0x00fb), top: B:97:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ca A[Catch: all -> 0x009e, TryCatch #6 {all -> 0x009e, blocks: (B:27:0x008f, B:39:0x00af, B:41:0x00b3, B:50:0x00ca, B:56:0x00dc, B:59:0x00e2, B:61:0x00e8, B:63:0x00ec, B:65:0x00f0, B:68:0x00f5, B:71:0x00fa, B:72:0x00fb), top: B:97:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf A[PHI: r6
  0x00cf: PHI (r6v1 int) = (r6v0 int), (r6v3 int), (r6v5 int), (r6v6 int), (r6v7 int) binds: [B:42:0x00bd, B:55:0x00da, B:53:0x00d4, B:52:0x00d2, B:50:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2 A[Catch: all -> 0x009e, TryCatch #6 {all -> 0x009e, blocks: (B:27:0x008f, B:39:0x00af, B:41:0x00b3, B:50:0x00ca, B:56:0x00dc, B:59:0x00e2, B:61:0x00e8, B:63:0x00ec, B:65:0x00f0, B:68:0x00f5, B:71:0x00fa, B:72:0x00fb), top: B:97:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0123  */
    /* JADX WARN: Code duplicated, block: B:81:0x0129  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    @Override // defpackage.yh0
    public final boolean g(hd3 hd3Var, ArrayList arrayList, sn0 sn0Var) throws Throwable {
        double d;
        eg0 eg0Var;
        boolean z;
        boolean z2;
        dn8 dn8Var;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        ?? r10;
        s98 s98Var = this.h0;
        CameraDevice cameraDevice = this.Y;
        qg5 qg5VarA = a(sn0Var);
        boolean zBooleanValue = ((Boolean) qg5VarA.X).booleanValue();
        n57 n57Var = (n57) qg5VarA.Y;
        int i2 = 0;
        if (!zBooleanValue) {
            return false;
        }
        if (n57Var != null) {
            b(n57Var);
        }
        String str = this.Z;
        String strL = oi0.l("CXCP#createReprocessableCaptureSessionByConfigurations-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strL);
            eg0 eg0Var2 = this.f0;
            d = 1000000.0d;
            try {
                try {
                    try {
                        InputConfiguration inputConfiguration = new InputConfiguration(hd3Var.a, hd3Var.b, hd3Var.c);
                        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((OutputConfiguration) ((af) it.next()).C0(yb6.a.b(OutputConfiguration.class)));
                        }
                        try {
                            try {
                                try {
                                    eg0Var = eg0Var2;
                                    z = true;
                                    r10 = 1;
                                    try {
                                        cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, arrayList2, new hb(this, sn0Var, n57Var, this.f0, this.g0, s98Var.a()), s98Var.a());
                                        dn8Var = dn8.a;
                                        z2 = false;
                                    } catch (Exception e) {
                                        e = e;
                                        if (!(e instanceof CameraAccessException)) {
                                            e.getMessage();
                                            cameraAccessException = (CameraAccessException) e;
                                            reason = cameraAccessException.getReason();
                                            i = 3;
                                            if (reason == z) {
                                                if (reason != 2) {
                                                    i = 6;
                                                } else if (reason != 3) {
                                                    i = 0;
                                                } else if (reason != 4) {
                                                    i = z ? 1 : 0;
                                                } else if (reason != 5) {
                                                    cameraAccessException.toString();
                                                    i = 11;
                                                } else {
                                                    i = 2;
                                                }
                                            }
                                            eg0Var.a(i, str, z);
                                        } else {
                                            eg0 eg0Var3 = eg0Var;
                                            if (e instanceof IllegalArgumentException) {
                                            }
                                            e.getMessage();
                                            z2 = false;
                                            eg0Var3.a(9, str, false);
                                            dn8Var = null;
                                            r10 = z;
                                        }
                                        z2 = false;
                                        dn8Var = null;
                                        r10 = z;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    eg0Var = eg0Var2;
                                    z = true;
                                    if (!(e instanceof CameraAccessException)) {
                                        eg0 eg0Var4 = eg0Var;
                                        if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                            e.getMessage();
                                            z2 = false;
                                            eg0Var4.a(9, str, false);
                                        } else if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        dn8Var = null;
                                        r10 = z;
                                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r10));
                                        if (dn8Var == null) {
                                            Objects.toString(cameraDevice);
                                            if (n57Var != null) {
                                                c(n57Var);
                                            }
                                        }
                                        if (dn8Var != null) {
                                            return r10;
                                        }
                                        return z2;
                                    }
                                    e.getMessage();
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i = 3;
                                    if (reason == z) {
                                        if (reason != 2) {
                                            i = 6;
                                        } else if (reason != 3) {
                                            i = 0;
                                        } else if (reason != 4) {
                                            i = z ? 1 : 0;
                                        } else if (reason != 5) {
                                            cameraAccessException.toString();
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                    eg0Var.a(i, str, z);
                                    z2 = false;
                                    dn8Var = null;
                                    r10 = z;
                                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r10));
                                    if (dn8Var == null) {
                                        Objects.toString(cameraDevice);
                                        if (n57Var != null) {
                                            c(n57Var);
                                        }
                                    }
                                    if (dn8Var != null) {
                                        return r10;
                                    }
                                    return z2;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                eg0Var = eg0Var2;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            eg0Var = eg0Var2;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        eg0Var = eg0Var2;
                    }
                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r10));
                    if (dn8Var == null) {
                        Objects.toString(cameraDevice);
                        if (n57Var != null) {
                            c(n57Var);
                        }
                    }
                    if (dn8Var != null) {
                        return r10;
                    }
                    return z2;
                } catch (Throwable th) {
                    th = th;
                    i2 = 1;
                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, i2));
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            i2 = 1;
            d = 1000000.0d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c6 A[Catch: all -> 0x00a6, TryCatch #5 {all -> 0x00a6, blocks: (B:45:0x00c2, B:47:0x00c6, B:56:0x00dd, B:61:0x00ea, B:63:0x00ef, B:65:0x00f3, B:67:0x00f7, B:69:0x00fb, B:72:0x0100, B:75:0x0105, B:76:0x0106, B:31:0x0097), top: B:89:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd A[Catch: all -> 0x00a6, TryCatch #5 {all -> 0x00a6, blocks: (B:45:0x00c2, B:47:0x00c6, B:56:0x00dd, B:61:0x00ea, B:63:0x00ef, B:65:0x00f3, B:67:0x00f7, B:69:0x00fb, B:72:0x0100, B:75:0x0105, B:76:0x0106, B:31:0x0097), top: B:89:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ef A[Catch: all -> 0x00a6, TryCatch #5 {all -> 0x00a6, blocks: (B:45:0x00c2, B:47:0x00c6, B:56:0x00dd, B:61:0x00ea, B:63:0x00ef, B:65:0x00f3, B:67:0x00f7, B:69:0x00fb, B:72:0x0100, B:75:0x0105, B:76:0x0106, B:31:0x0097), top: B:89:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f3 A[Catch: all -> 0x00a6, TryCatch #5 {all -> 0x00a6, blocks: (B:45:0x00c2, B:47:0x00c6, B:56:0x00dd, B:61:0x00ea, B:63:0x00ef, B:65:0x00f3, B:67:0x00f7, B:69:0x00fb, B:72:0x0100, B:75:0x0105, B:76:0x0106, B:31:0x0097), top: B:89:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:82:0x012e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0133  */
    /* JADX WARN: Code duplicated, block: B:85:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    @Override // defpackage.yh0
    public final boolean k(ArrayList arrayList, sn0 sn0Var) throws Throwable {
        int i;
        double d;
        n57 n57Var;
        eg0 eg0Var;
        boolean z;
        ?? r15;
        boolean z2;
        dn8 dn8Var;
        boolean z3;
        CameraAccessException cameraAccessException;
        int reason;
        int i2;
        s98 s98Var = this.h0;
        CameraDevice cameraDevice = this.Y;
        qg5 qg5VarA = a(sn0Var);
        boolean zBooleanValue = ((Boolean) qg5VarA.X).booleanValue();
        n57 n57Var2 = (n57) qg5VarA.Y;
        if (!zBooleanValue) {
            return false;
        }
        if (n57Var2 != null) {
            b(n57Var2);
        }
        String str = this.Z;
        String strL = oi0.l("CXCP#createCaptureSessionByOutputConfigurations-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strL);
                eg0 eg0Var2 = this.f0;
                try {
                    ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            d = 1000000.0d;
                            try {
                                try {
                                    arrayList2.add((OutputConfiguration) ((af) it.next()).C0(yb6.a.b(OutputConfiguration.class)));
                                } catch (Exception e) {
                                    e = e;
                                    n57Var = n57Var2;
                                    eg0Var = eg0Var2;
                                    z = true;
                                    if (!(e instanceof CameraAccessException)) {
                                        if (e instanceof IllegalArgumentException) {
                                        }
                                        e.getMessage();
                                        z2 = false;
                                        eg0Var.a(9, str, false);
                                        dn8Var = null;
                                        r15 = z;
                                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                                        if (dn8Var == null) {
                                            Objects.toString(cameraDevice);
                                            if (n57Var != null) {
                                                c(n57Var);
                                            }
                                        }
                                        return dn8Var != null ? r15 : z2;
                                    }
                                    e.getMessage();
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i2 = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i2 = 6;
                                        } else if (reason == 3) {
                                            i2 = 0;
                                        } else if (reason == 4) {
                                            i2 = z ? 1 : 0;
                                        } else if (reason != 5) {
                                            cameraAccessException.toString();
                                            i2 = 11;
                                        } else {
                                            i2 = 2;
                                        }
                                    }
                                    eg0Var.a(i2, str, z);
                                    dn8Var = null;
                                    z3 = z;
                                    z2 = false;
                                    r15 = z3;
                                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                                    if (dn8Var == null) {
                                        Objects.toString(cameraDevice);
                                        if (n57Var != null) {
                                            c(n57Var);
                                        }
                                    }
                                    if (dn8Var != null) {
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                i = 1;
                                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, i));
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            d = 1000000.0d;
                            n57Var = n57Var2;
                            eg0Var = eg0Var2;
                            z = true;
                            if (!(e instanceof CameraAccessException)) {
                                if (e instanceof IllegalArgumentException) {
                                }
                                e.getMessage();
                                z2 = false;
                                eg0Var.a(9, str, false);
                                dn8Var = null;
                                r15 = z;
                                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                                if (dn8Var == null) {
                                    Objects.toString(cameraDevice);
                                    if (n57Var != null) {
                                        c(n57Var);
                                    }
                                }
                                if (dn8Var != null) {
                                }
                            }
                            e.getMessage();
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i2 = 3;
                            if (reason != z) {
                                if (reason == 2) {
                                    i2 = 6;
                                } else if (reason == 3) {
                                    i2 = 0;
                                } else if (reason == 4) {
                                    i2 = z ? 1 : 0;
                                } else if (reason != 5) {
                                    cameraAccessException.toString();
                                    i2 = 11;
                                } else {
                                    i2 = 2;
                                }
                            }
                            eg0Var.a(i2, str, z);
                            dn8Var = null;
                            z3 = z;
                            z2 = false;
                            r15 = z3;
                            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                            if (dn8Var == null) {
                                Objects.toString(cameraDevice);
                                if (n57Var != null) {
                                    c(n57Var);
                                }
                            }
                            if (dn8Var != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            d = 1000000.0d;
                            i = 1;
                            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, i));
                            throw th;
                        }
                    }
                    d = 1000000.0d;
                    n57Var = n57Var2;
                    try {
                        try {
                            eg0Var = eg0Var2;
                            z = true;
                            z3 = true;
                            try {
                                cameraDevice.createCaptureSessionByOutputConfigurations(arrayList2, new hb(this, sn0Var, n57Var, this.f0, this.g0, s98Var.a()), s98Var.a());
                                dn8Var = dn8.a;
                            } catch (Exception e3) {
                                e = e3;
                                if (!(e instanceof CameraAccessException)) {
                                    if (e instanceof IllegalArgumentException) {
                                    }
                                    e.getMessage();
                                    z2 = false;
                                    eg0Var.a(9, str, false);
                                    dn8Var = null;
                                    r15 = z;
                                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                                    if (dn8Var == null) {
                                        Objects.toString(cameraDevice);
                                        if (n57Var != null) {
                                            c(n57Var);
                                        }
                                    }
                                    if (dn8Var != null) {
                                    }
                                }
                                e.getMessage();
                                cameraAccessException = (CameraAccessException) e;
                                reason = cameraAccessException.getReason();
                                i2 = 3;
                                if (reason != z) {
                                    if (reason == 2) {
                                        i2 = 6;
                                    } else if (reason == 3) {
                                        i2 = 0;
                                    } else if (reason == 4) {
                                        i2 = z ? 1 : 0;
                                    } else if (reason != 5) {
                                        cameraAccessException.toString();
                                        i2 = 11;
                                    } else {
                                        i2 = 2;
                                    }
                                }
                                eg0Var.a(i2, str, z);
                                dn8Var = null;
                                z3 = z;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            eg0Var = eg0Var2;
                            z = true;
                            if (!(e instanceof CameraAccessException)) {
                                if (e instanceof IllegalArgumentException) {
                                }
                                e.getMessage();
                                z2 = false;
                                eg0Var.a(9, str, false);
                                dn8Var = null;
                                r15 = z;
                                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                                if (dn8Var == null) {
                                    Objects.toString(cameraDevice);
                                    if (n57Var != null) {
                                        c(n57Var);
                                    }
                                }
                                if (dn8Var != null) {
                                }
                            }
                            e.getMessage();
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i2 = 3;
                            if (reason != z) {
                                if (reason == 2) {
                                    i2 = 6;
                                } else if (reason == 3) {
                                    i2 = 0;
                                } else if (reason == 4) {
                                    i2 = z ? 1 : 0;
                                } else if (reason != 5) {
                                    cameraAccessException.toString();
                                    i2 = 11;
                                } else {
                                    i2 = 2;
                                }
                            }
                            eg0Var.a(i2, str, z);
                            dn8Var = null;
                            z3 = z;
                            z2 = false;
                            r15 = z3;
                            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                            if (dn8Var == null) {
                                Objects.toString(cameraDevice);
                                if (n57Var != null) {
                                    c(n57Var);
                                }
                            }
                            if (dn8Var != null) {
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        eg0Var = eg0Var2;
                        z = true;
                        if (!(e instanceof CameraAccessException)) {
                            if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                e.getMessage();
                                z2 = false;
                                eg0Var.a(9, str, false);
                                dn8Var = null;
                                r15 = z;
                            } else if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                            if (dn8Var == null) {
                                Objects.toString(cameraDevice);
                                if (n57Var != null) {
                                    c(n57Var);
                                }
                            }
                            if (dn8Var != null) {
                            }
                        }
                        e.getMessage();
                        cameraAccessException = (CameraAccessException) e;
                        reason = cameraAccessException.getReason();
                        i2 = 3;
                        if (reason != z) {
                            if (reason == 2) {
                                i2 = 6;
                            } else if (reason == 3) {
                                i2 = 0;
                            } else if (reason == 4) {
                                i2 = z ? 1 : 0;
                            } else if (reason != 5) {
                                cameraAccessException.toString();
                                i2 = 11;
                            } else {
                                i2 = 2;
                            }
                        }
                        eg0Var.a(i2, str, z);
                        dn8Var = null;
                        z3 = z;
                        z2 = false;
                        r15 = z3;
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                        if (dn8Var == null) {
                            Objects.toString(cameraDevice);
                            if (n57Var != null) {
                                c(n57Var);
                            }
                        }
                        if (dn8Var != null) {
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    n57Var = n57Var2;
                    eg0Var = eg0Var2;
                    z = true;
                    d = 1000000.0d;
                }
                z2 = false;
                r15 = z3;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                if (dn8Var == null) {
                    Objects.toString(cameraDevice);
                    if (n57Var != null) {
                        c(n57Var);
                    }
                }
                if (dn8Var != null) {
                }
            } catch (Throwable th3) {
                th = th3;
                i = 1;
                d = 1000000.0d;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.yh0
    public final String m() {
        return this.Z;
    }

    @Override // defpackage.yh0
    public final CaptureRequest.Builder p(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder builderCreateReprocessCaptureRequest;
        StringBuilder sb = new StringBuilder("CXCP#createReprocessCaptureRequest-");
        String str = this.Z;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            eg0 eg0Var = this.f0;
            try {
                builderCreateReprocessCaptureRequest = this.Y.createReprocessCaptureRequest(totalCaptureResult);
            } catch (Exception e) {
                int i = 0;
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i = 3;
                    } else if (reason == 2) {
                        i = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    eg0Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    eg0Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                builderCreateReprocessCaptureRequest = null;
            }
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            return builderCreateReprocessCaptureRequest;
        } catch (Throwable th) {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            throw th;
        }
    }

    public final String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) vi0.b(this.Z)) + ')';
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0051, B:37:0x008c, B:39:0x0090, B:48:0x00a7, B:53:0x00b4, B:55:0x00b9, B:57:0x00bd, B:59:0x00c1, B:61:0x00c5, B:64:0x00ca, B:67:0x00cf, B:68:0x00d0), top: B:80:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0051, B:37:0x008c, B:39:0x0090, B:48:0x00a7, B:53:0x00b4, B:55:0x00b9, B:57:0x00bd, B:59:0x00c1, B:61:0x00c5, B:64:0x00ca, B:67:0x00cf, B:68:0x00d0), top: B:80:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0051, B:37:0x008c, B:39:0x0090, B:48:0x00a7, B:53:0x00b4, B:55:0x00b9, B:57:0x00bd, B:59:0x00c1, B:61:0x00c5, B:64:0x00ca, B:67:0x00cf, B:68:0x00d0), top: B:80:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0051, B:37:0x008c, B:39:0x0090, B:48:0x00a7, B:53:0x00b4, B:55:0x00b9, B:57:0x00bd, B:59:0x00c1, B:61:0x00c5, B:64:0x00ca, B:67:0x00cf, B:68:0x00d0), top: B:80:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0051, B:37:0x008c, B:39:0x0090, B:48:0x00a7, B:53:0x00b4, B:55:0x00b9, B:57:0x00bd, B:59:0x00c1, B:61:0x00c5, B:64:0x00ca, B:67:0x00cf, B:68:0x00d0), top: B:80:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    @Override // defpackage.yh0
    public final boolean u(InputConfiguration inputConfiguration, ArrayList arrayList, sn0 sn0Var) throws Throwable {
        int i;
        n57 n57Var;
        boolean z;
        eg0 eg0Var;
        double d;
        dn8 dn8Var;
        CameraAccessException cameraAccessException;
        int reason;
        int i2;
        ?? r15;
        s98 s98Var = this.h0;
        CameraDevice cameraDevice = this.Y;
        qg5 qg5VarA = a(sn0Var);
        boolean zBooleanValue = ((Boolean) qg5VarA.X).booleanValue();
        n57 n57Var2 = (n57) qg5VarA.Y;
        if (!zBooleanValue) {
            return false;
        }
        if (n57Var2 != null) {
            b(n57Var2);
        }
        String str = this.Z;
        String strL = oi0.l("CXCP#createReprocessableCaptureSession-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strL);
                eg0 eg0Var2 = this.f0;
                try {
                    n57Var = n57Var2;
                    try {
                        try {
                            try {
                                try {
                                    z = true;
                                    eg0Var = eg0Var2;
                                    d = 1000000.0d;
                                    try {
                                        cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayList, new hb(this, sn0Var, n57Var, this.f0, this.g0, s98Var.a()), s98Var.a());
                                        dn8Var = dn8.a;
                                        r15 = z;
                                    } catch (Exception e) {
                                        e = e;
                                        if (e instanceof CameraAccessException) {
                                            e.getMessage();
                                            cameraAccessException = (CameraAccessException) e;
                                            reason = cameraAccessException.getReason();
                                            i2 = 3;
                                            if (reason != z) {
                                                if (reason == 2) {
                                                    i2 = 6;
                                                } else if (reason == 3) {
                                                    i2 = 0;
                                                } else if (reason == 4) {
                                                    i2 = z ? 1 : 0;
                                                } else if (reason != 5) {
                                                    cameraAccessException.toString();
                                                    i2 = 11;
                                                } else {
                                                    i2 = 2;
                                                }
                                            }
                                            eg0Var.a(i2, str, z);
                                        } else if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                            e.getMessage();
                                            eg0Var.a(9, str, false);
                                        } else if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        dn8Var = null;
                                        r15 = z;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    z = true;
                                    eg0Var = eg0Var2;
                                    d = 1000000.0d;
                                    if (e instanceof CameraAccessException) {
                                        e.getMessage();
                                        cameraAccessException = (CameraAccessException) e;
                                        reason = cameraAccessException.getReason();
                                        i2 = 3;
                                        if (reason != z) {
                                            if (reason == 2) {
                                                i2 = 6;
                                            } else if (reason == 3) {
                                                i2 = 0;
                                            } else if (reason == 4) {
                                                i2 = z ? 1 : 0;
                                            } else if (reason != 5) {
                                                cameraAccessException.toString();
                                                i2 = 11;
                                            } else {
                                                i2 = 2;
                                            }
                                        }
                                        eg0Var.a(i2, str, z);
                                    } else if (e instanceof IllegalArgumentException) {
                                        e.getMessage();
                                        eg0Var.a(9, str, false);
                                    } else {
                                        e.getMessage();
                                        eg0Var.a(9, str, false);
                                    }
                                    dn8Var = null;
                                    r15 = z;
                                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                                    if (dn8Var == null) {
                                        Objects.toString(cameraDevice);
                                        if (n57Var != null) {
                                            c(n57Var);
                                        }
                                    }
                                    if (dn8Var != null) {
                                        return r15;
                                    }
                                    return false;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                eg0Var = eg0Var2;
                                z = true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = 1;
                            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, i));
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        z = true;
                        eg0Var = eg0Var2;
                        d = 1000000.0d;
                        if (e instanceof CameraAccessException) {
                            e.getMessage();
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i2 = 3;
                            if (reason != z) {
                                if (reason == 2) {
                                    i2 = 6;
                                } else if (reason == 3) {
                                    i2 = 0;
                                } else if (reason == 4) {
                                    i2 = z ? 1 : 0;
                                } else if (reason != 5) {
                                    cameraAccessException.toString();
                                    i2 = 11;
                                } else {
                                    i2 = 2;
                                }
                            }
                            eg0Var.a(i2, str, z);
                        } else if (e instanceof IllegalArgumentException) {
                            e.getMessage();
                            eg0Var.a(9, str, false);
                        } else {
                            e.getMessage();
                            eg0Var.a(9, str, false);
                        }
                        dn8Var = null;
                        r15 = z;
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                        if (dn8Var == null) {
                            Objects.toString(cameraDevice);
                            if (n57Var != null) {
                                c(n57Var);
                            }
                        }
                        if (dn8Var != null) {
                            return r15;
                        }
                        return false;
                    }
                } catch (Exception e5) {
                    e = e5;
                    n57Var = n57Var2;
                }
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / d)}, (int) r15));
                if (dn8Var == null) {
                    Objects.toString(cameraDevice);
                    if (n57Var != null) {
                        c(n57Var);
                    }
                }
                if (dn8Var != null) {
                    return r15;
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                i = 1;
            }
        } catch (Throwable th3) {
            th = th3;
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, i));
            throw th;
        }
    }
}
