package defpackage;

import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.TreeSet;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jl3 extends qa8 {
    public static final TreeSet k0 = new TreeSet();
    public TimeZone h0;
    public transient GregorianCalendar i0;
    public volatile transient boolean j0 = false;

    static {
        for (String str : TimeZone.getAvailableIDs()) {
            k0.add(str);
        }
        try {
            TimeZone.class.getMethod("observesDaylightTime", null);
        } catch (NoSuchMethodException | SecurityException unused) {
        }
    }

    public jl3(TimeZone timeZone, String str) {
        str = str == null ? timeZone.getID() : str;
        this.h0 = timeZone;
        str.getClass();
        if (this.j0) {
            u52.k("Attempt to modify a frozen TimeZone instance.");
            throw null;
        }
        this.X = str;
        this.i0 = new GregorianCalendar(this.h0);
    }

    @Override // defpackage.qa8
    public final qa8 a() {
        jl3 jl3Var = (jl3) super.a();
        jl3Var.h0 = (TimeZone) this.h0.clone();
        jl3Var.i0 = new GregorianCalendar(this.h0);
        jl3Var.j0 = false;
        return jl3Var;
    }

    @Override // defpackage.qa8
    public final Object clone() {
        return this.j0 ? this : a();
    }

    @Override // defpackage.qa8
    public final int d(int i, int i2, int i3, int i4, int i5) {
        return this.h0.getOffset(1, i, i2, i3, i4, i5);
    }

    @Override // defpackage.qa8
    public final void e(long j, boolean z, int[] iArr) {
        synchronized (this.i0) {
            try {
                if (z) {
                    int[] iArr2 = new int[6];
                    km4.o0(j, iArr2);
                    int i = iArr2[5];
                    int i2 = i % XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
                    int i3 = i / XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
                    int i4 = i3 % 60;
                    int i5 = i3 / 60;
                    int i6 = i5 % 60;
                    int i7 = i5 / 60;
                    this.i0.clear();
                    this.i0.set(iArr2[0], iArr2[1], iArr2[2], i7, i6, i4);
                    this.i0.set(14, i2);
                    int i8 = this.i0.get(6);
                    int i9 = this.i0.get(11);
                    int i10 = this.i0.get(12);
                    int i11 = this.i0.get(13);
                    int i12 = this.i0.get(14);
                    int i13 = iArr2[4];
                    if (i13 != i8 || i7 != i9 || i6 != i10 || i4 != i11 || i2 != i12) {
                        int i14 = ((((((((((((Math.abs(i8 - i13) > 1 ? 1 : i8 - iArr2[4]) * 24) + i9) - i7) * 60) + i10) - i6) * 60) + i11) - i4) * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax) + i12) - i2;
                        GregorianCalendar gregorianCalendar = this.i0;
                        gregorianCalendar.setTimeInMillis((gregorianCalendar.getTimeInMillis() - ((long) i14)) - 1);
                    }
                } else {
                    this.i0.setTimeInMillis(j);
                }
                iArr[0] = this.i0.get(15);
                iArr[1] = this.i0.get(16);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qa8
    public final int f() {
        return this.h0.getRawOffset();
    }

    @Override // defpackage.qa8
    public final int hashCode() {
        return this.h0.hashCode() + this.X.hashCode();
    }

    @Override // defpackage.qa8
    public final boolean isFrozen() {
        return this.j0;
    }
}
