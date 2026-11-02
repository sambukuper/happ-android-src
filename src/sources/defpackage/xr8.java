package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xr8 extends g1 {
    public final sc0 a;

    public xr8(sc0 sc0Var) {
        this.a = sc0Var;
    }

    @Override // defpackage.g1
    public final sc0 b() {
        return this.a;
    }

    @Override // defpackage.g1
    public final h61 c() {
        return zr8.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g1
    public final h61 d(ld4 ld4Var) {
        gb3 gb3Var = new gb3(null, null, null, null);
        ZoneOffset zoneOffset = ((vr8) ld4Var).X;
        gb3Var.a = Boolean.valueOf(zoneOffset.getTotalSeconds() < 0);
        int iAbs = Math.abs(zoneOffset.getTotalSeconds());
        gb3Var.b = Integer.valueOf(iAbs / 3600);
        gb3Var.c = Integer.valueOf((iAbs / 60) % 60);
        gb3Var.d = Integer.valueOf(iAbs % 60);
        return gb3Var;
    }

    @Override // defpackage.g1
    public final Object f(h61 h61Var) {
        gb3 gb3Var = (gb3) h61Var;
        gb3Var.getClass();
        int i = dh3.f(gb3Var.a, Boolean.TRUE) ? -1 : 1;
        Integer num = gb3Var.b;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i) : null;
        Integer num2 = gb3Var.c;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i) : null;
        Integer num3 = gb3Var.d;
        Integer numValueOf3 = num3 != null ? Integer.valueOf(num3.intValue() * i) : null;
        vz7 vz7Var = bs8.a;
        try {
            if (numValueOf != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(numValueOf.intValue(), numValueOf2 != null ? numValueOf2.intValue() : 0, numValueOf3 != null ? numValueOf3.intValue() : 0);
                zoneOffsetOfHoursMinutesSeconds.getClass();
                return new vr8(zoneOffsetOfHoursMinutesSeconds);
            }
            if (numValueOf2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(numValueOf2.intValue() / 60, numValueOf2.intValue() % 60, numValueOf3 != null ? numValueOf3.intValue() : 0);
                zoneOffsetOfHoursMinutesSeconds2.getClass();
                return new vr8(zoneOffsetOfHoursMinutesSeconds2);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(numValueOf3 != null ? numValueOf3.intValue() : 0);
            zoneOffsetOfTotalSeconds.getClass();
            return new vr8(zoneOffsetOfTotalSeconds);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
