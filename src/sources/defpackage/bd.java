package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bd implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ long Y;

    public /* synthetic */ bd(long j, byte b) {
        this.X = b;
        this.Y = j;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) throws Exception {
        mm0 mm0Var;
        Object rj6Var;
        xr6 xr6Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        long j = this.Y;
        switch (b) {
            case 0:
                jc0 jc0Var = (jc0) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jc0Var.X.e() >> 32)) / 2.0f;
                return jc0Var.a(new cd(fIntBitsToFloat, w45.D(jc0Var, fIntBitsToFloat), new g60(j, 5)));
            case 1:
                z80 z80Var = (z80) obj;
                gn2 gn2Var = z80Var.b;
                if (gn2Var != null && (mm0Var = z80Var.a) != null) {
                    try {
                        rj6Var = gn2Var.B(Long.valueOf(j));
                    } catch (Throwable th) {
                        rj6Var = new rj6(th);
                    }
                    mm0Var.f(rj6Var);
                    break;
                }
                return dn8Var;
            case 2:
                return Boolean.valueOf(((Number) ((qg5) obj).Y).longValue() > j);
            case 3:
                ((o05) obj).e(sz2.b, Long.valueOf(j));
                return null;
            case 4:
                sv1 sv1Var = (sv1) obj;
                float fMin = Math.min(sv1Var.h0(4.0f), Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L)));
                float fH0 = sv1Var.h0(6.0f);
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L)) - fMin) / 2.0f;
                if (fIntBitsToFloat2 <= fH0) {
                    fH0 = fIntBitsToFloat2;
                }
                if (sv1Var.getLayoutDirection() == z24.Y) {
                    long jA0 = sv1Var.A0();
                    lr lrVarN0 = sv1Var.n0();
                    long jP = lrVarN0.p();
                    lrVarN0.k().g();
                    try {
                        ((wl6) lrVarN0.Y).U(-1.0f, 1.0f, jA0);
                        w51.v(sv1Var, j, fMin, fH0);
                    } finally {
                        p61.w(lrVarN0, jP);
                    }
                } else {
                    w51.v(sv1Var, j, fMin, fH0);
                }
                return dn8Var;
            default:
                qr6 qr6Var = (qr6) obj;
                qr6Var.getClass();
                xr6 xr6VarX0 = qr6Var.X0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    xr6VarX0.i(1, j);
                    int iQ = u15.q(xr6VarX0, "id");
                    int iQ2 = u15.q(xr6VarX0, "state");
                    int iQ3 = u15.q(xr6VarX0, "worker_class_name");
                    int iQ4 = u15.q(xr6VarX0, "input_merger_class_name");
                    int iQ5 = u15.q(xr6VarX0, "input");
                    int iQ6 = u15.q(xr6VarX0, "output");
                    int iQ7 = u15.q(xr6VarX0, "initial_delay");
                    int iQ8 = u15.q(xr6VarX0, "interval_duration");
                    int iQ9 = u15.q(xr6VarX0, "flex_duration");
                    int iQ10 = u15.q(xr6VarX0, "run_attempt_count");
                    int iQ11 = u15.q(xr6VarX0, "backoff_policy");
                    int iQ12 = u15.q(xr6VarX0, "backoff_delay_duration");
                    int iQ13 = u15.q(xr6VarX0, "last_enqueue_time");
                    int iQ14 = u15.q(xr6VarX0, "minimum_retention_duration");
                    int iQ15 = u15.q(xr6VarX0, "schedule_requested_at");
                    int iQ16 = u15.q(xr6VarX0, "run_in_foreground");
                    int iQ17 = u15.q(xr6VarX0, "out_of_quota_policy");
                    int iQ18 = u15.q(xr6VarX0, "period_count");
                    int iQ19 = u15.q(xr6VarX0, "generation");
                    int iQ20 = u15.q(xr6VarX0, "next_schedule_time_override");
                    int iQ21 = u15.q(xr6VarX0, "next_schedule_time_override_generation");
                    int iQ22 = u15.q(xr6VarX0, "stop_reason");
                    int iQ23 = u15.q(xr6VarX0, "trace_tag");
                    int iQ24 = u15.q(xr6VarX0, "backoff_on_system_interruptions");
                    int iQ25 = u15.q(xr6VarX0, "required_network_type");
                    int iQ26 = u15.q(xr6VarX0, "required_network_request");
                    int iQ27 = u15.q(xr6VarX0, "requires_charging");
                    int iQ28 = u15.q(xr6VarX0, "requires_device_idle");
                    int iQ29 = u15.q(xr6VarX0, "requires_battery_not_low");
                    int iQ30 = u15.q(xr6VarX0, "requires_storage_not_low");
                    int iQ31 = u15.q(xr6VarX0, "trigger_content_update_delay");
                    int iQ32 = u15.q(xr6VarX0, "trigger_max_content_delay");
                    int iQ33 = u15.q(xr6VarX0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (xr6VarX0.S0()) {
                        String strP0 = xr6VarX0.p0(iQ);
                        int i = iQ14;
                        ArrayList arrayList2 = arrayList;
                        u39 u39VarM = a28.m((int) xr6VarX0.getLong(iQ2));
                        String strP1 = xr6VarX0.p0(iQ3);
                        String strP2 = xr6VarX0.p0(iQ4);
                        byte[] blob = xr6VarX0.getBlob(iQ5);
                        u91 u91Var = u91.b;
                        u91 u91VarA = wl7.A(blob);
                        u91 u91VarA2 = wl7.A(xr6VarX0.getBlob(iQ6));
                        long j2 = xr6VarX0.getLong(iQ7);
                        long j3 = xr6VarX0.getLong(iQ8);
                        long j4 = xr6VarX0.getLong(iQ9);
                        int i2 = (int) xr6VarX0.getLong(iQ10);
                        int i3 = iQ2;
                        int i4 = iQ3;
                        z00 z00VarJ = a28.j((int) xr6VarX0.getLong(iQ11));
                        long j5 = xr6VarX0.getLong(iQ12);
                        long j6 = xr6VarX0.getLong(iQ13);
                        long j7 = xr6VarX0.getLong(i);
                        int i5 = iQ15;
                        long j8 = xr6VarX0.getLong(i5);
                        int i6 = iQ;
                        int i7 = iQ16;
                        boolean z = ((int) xr6VarX0.getLong(i7)) != 0;
                        int i8 = iQ17;
                        int i9 = iQ13;
                        yd5 yd5VarL = a28.l((int) xr6VarX0.getLong(i8));
                        int i10 = iQ18;
                        int i11 = (int) xr6VarX0.getLong(i10);
                        int i12 = iQ19;
                        int i13 = (int) xr6VarX0.getLong(i12);
                        int i14 = iQ20;
                        long j9 = xr6VarX0.getLong(i14);
                        int i15 = iQ21;
                        int i16 = (int) xr6VarX0.getLong(i15);
                        int i17 = iQ22;
                        int i18 = (int) xr6VarX0.getLong(i17);
                        int i19 = iQ23;
                        String strP3 = xr6VarX0.isNull(i19) ? null : xr6VarX0.p0(i19);
                        int i20 = iQ24;
                        Integer numValueOf = xr6VarX0.isNull(i20) ? null : Integer.valueOf((int) xr6VarX0.getLong(i20));
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i21 = iQ25;
                        b45 b45VarK = a28.k((int) xr6VarX0.getLong(i21));
                        int i22 = iQ26;
                        u35 u35VarW = a28.w(xr6VarX0.getBlob(i22));
                        iQ25 = i21;
                        iQ26 = i22;
                        int i23 = iQ27;
                        boolean z2 = ((int) xr6VarX0.getLong(i23)) != 0;
                        iQ27 = i23;
                        int i24 = iQ28;
                        boolean z3 = ((int) xr6VarX0.getLong(i24)) != 0;
                        int i25 = iQ29;
                        boolean z4 = ((int) xr6VarX0.getLong(i25)) != 0;
                        iQ29 = i25;
                        int i26 = iQ30;
                        int i27 = iQ31;
                        int i28 = iQ32;
                        int i29 = iQ33;
                        iQ33 = i29;
                        xr6Var = xr6VarX0;
                        try {
                            arrayList2.add(new l49(strP0, u39VarM, strP1, strP2, u91VarA, u91VarA2, j2, j3, j4, new p31(u35VarW, b45VarK, z2, z3, z4, ((int) xr6VarX0.getLong(i26)) != 0, xr6VarX0.getLong(i27), xr6VarX0.getLong(i28), a28.b(xr6VarX0.getBlob(i29))), i2, z00VarJ, j5, j6, j7, j8, z, yd5VarL, i11, i13, j9, i16, i18, strP3, boolValueOf));
                            arrayList = arrayList2;
                            xr6VarX0 = xr6Var;
                            iQ31 = i27;
                            iQ2 = i3;
                            iQ30 = i26;
                            iQ13 = i9;
                            iQ17 = i8;
                            iQ18 = i10;
                            iQ19 = i12;
                            iQ22 = i17;
                            iQ24 = i20;
                            iQ = i6;
                            iQ15 = i5;
                            iQ32 = i28;
                            iQ16 = i7;
                            iQ20 = i14;
                            iQ21 = i15;
                            iQ23 = i19;
                            iQ3 = i4;
                            iQ28 = i24;
                            iQ14 = i;
                        } catch (Throwable th2) {
                            th = th2;
                            xr6Var.close();
                            throw th;
                        }
                        break;
                    }
                    xr6 xr6Var2 = xr6VarX0;
                    ArrayList arrayList3 = arrayList;
                    xr6Var2.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    th = th3;
                    xr6Var = xr6VarX0;
                }
                break;
        }
    }
}
