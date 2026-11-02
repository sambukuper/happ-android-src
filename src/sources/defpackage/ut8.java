package defpackage;

import java.util.ArrayList;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ut8 implements gn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ ut8(byte b) {
        this.X = b;
    }

    private final Object c(Object obj) throws Exception {
        qr6 qr6Var = (qr6) obj;
        qr6Var.getClass();
        xr6 xr6VarX0 = qr6Var.X0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            xr6VarX0.i(1, 200L);
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
                int i = iQ13;
                int i2 = iQ14;
                u39 u39VarM = a28.m((int) xr6VarX0.getLong(iQ2));
                String strP1 = xr6VarX0.p0(iQ3);
                String strP2 = xr6VarX0.p0(iQ4);
                byte[] blob = xr6VarX0.getBlob(iQ5);
                u91 u91Var = u91.b;
                u91 u91VarA = wl7.A(blob);
                u91 u91VarA2 = wl7.A(xr6VarX0.getBlob(iQ6));
                long j = xr6VarX0.getLong(iQ7);
                long j2 = xr6VarX0.getLong(iQ8);
                long j3 = xr6VarX0.getLong(iQ9);
                int i3 = (int) xr6VarX0.getLong(iQ10);
                int i4 = iQ;
                int i5 = iQ2;
                z00 z00VarJ = a28.j((int) xr6VarX0.getLong(iQ11));
                long j4 = xr6VarX0.getLong(iQ12);
                long j5 = xr6VarX0.getLong(i);
                long j6 = xr6VarX0.getLong(i2);
                int i6 = iQ15;
                long j7 = xr6VarX0.getLong(i6);
                iQ15 = i6;
                int i7 = iQ16;
                int i8 = iQ3;
                boolean z = ((int) xr6VarX0.getLong(i7)) != 0;
                int i9 = iQ17;
                int i10 = iQ4;
                yd5 yd5VarL = a28.l((int) xr6VarX0.getLong(i9));
                int i11 = iQ18;
                int i12 = (int) xr6VarX0.getLong(i11);
                int i13 = iQ19;
                int i14 = (int) xr6VarX0.getLong(i13);
                int i15 = iQ20;
                long j8 = xr6VarX0.getLong(i15);
                int i16 = iQ21;
                int i17 = (int) xr6VarX0.getLong(i16);
                iQ21 = i16;
                iQ22 = iQ22;
                int i18 = (int) xr6VarX0.getLong(iQ22);
                int i19 = iQ23;
                Boolean boolValueOf = null;
                String strP3 = xr6VarX0.isNull(i19) ? null : xr6VarX0.p0(i19);
                int i20 = iQ24;
                Integer numValueOf = xr6VarX0.isNull(i20) ? null : Integer.valueOf((int) xr6VarX0.getLong(i20));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i21 = iQ25;
                b45 b45VarK = a28.k((int) xr6VarX0.getLong(i21));
                int i22 = iQ26;
                u35 u35VarW = a28.w(xr6VarX0.getBlob(i22));
                int i23 = iQ27;
                boolean z2 = ((int) xr6VarX0.getLong(i23)) != 0;
                int i24 = iQ28;
                boolean z3 = ((int) xr6VarX0.getLong(i24)) != 0;
                int i25 = iQ29;
                boolean z4 = ((int) xr6VarX0.getLong(i25)) != 0;
                iQ29 = i25;
                int i26 = iQ30;
                int i27 = iQ31;
                int i28 = iQ32;
                iQ31 = i27;
                int i29 = iQ33;
                arrayList.add(new l49(strP0, u39VarM, strP1, strP2, u91VarA, u91VarA2, j, j2, j3, new p31(u35VarW, b45VarK, z2, z3, z4, ((int) xr6VarX0.getLong(i26)) != 0, xr6VarX0.getLong(i27), xr6VarX0.getLong(i28), a28.b(xr6VarX0.getBlob(i29))), i3, z00VarJ, j4, j5, j6, j7, z, yd5VarL, i12, i14, j8, i17, i18, strP3, bool));
                iQ28 = i24;
                iQ4 = i10;
                iQ17 = i9;
                iQ18 = i11;
                iQ19 = i13;
                iQ20 = i15;
                iQ23 = i19;
                iQ24 = i20;
                iQ25 = i21;
                iQ26 = i22;
                iQ27 = i23;
                iQ33 = i29;
                iQ32 = i28;
                iQ30 = i26;
                iQ = i4;
                iQ3 = i8;
                iQ13 = i;
                iQ14 = i2;
                iQ2 = i5;
                iQ16 = i7;
            }
            return arrayList;
        } finally {
            xr6VarX0.close();
        }
    }

    private final Object e(Object obj) throws Exception {
        qr6 qr6Var = (qr6) obj;
        qr6Var.getClass();
        xr6 xr6VarX0 = qr6Var.X0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        try {
            xr6VarX0.i(1, 20L);
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
                int i = iQ13;
                int i2 = iQ14;
                u39 u39VarM = a28.m((int) xr6VarX0.getLong(iQ2));
                String strP1 = xr6VarX0.p0(iQ3);
                String strP2 = xr6VarX0.p0(iQ4);
                byte[] blob = xr6VarX0.getBlob(iQ5);
                u91 u91Var = u91.b;
                u91 u91VarA = wl7.A(blob);
                u91 u91VarA2 = wl7.A(xr6VarX0.getBlob(iQ6));
                long j = xr6VarX0.getLong(iQ7);
                long j2 = xr6VarX0.getLong(iQ8);
                long j3 = xr6VarX0.getLong(iQ9);
                int i3 = (int) xr6VarX0.getLong(iQ10);
                int i4 = iQ;
                int i5 = iQ2;
                z00 z00VarJ = a28.j((int) xr6VarX0.getLong(iQ11));
                long j4 = xr6VarX0.getLong(iQ12);
                long j5 = xr6VarX0.getLong(i);
                long j6 = xr6VarX0.getLong(i2);
                int i6 = iQ15;
                long j7 = xr6VarX0.getLong(i6);
                iQ15 = i6;
                int i7 = iQ16;
                int i8 = iQ3;
                boolean z = ((int) xr6VarX0.getLong(i7)) != 0;
                int i9 = iQ17;
                int i10 = iQ4;
                yd5 yd5VarL = a28.l((int) xr6VarX0.getLong(i9));
                int i11 = iQ18;
                int i12 = (int) xr6VarX0.getLong(i11);
                int i13 = iQ19;
                int i14 = (int) xr6VarX0.getLong(i13);
                int i15 = iQ20;
                long j8 = xr6VarX0.getLong(i15);
                int i16 = iQ21;
                int i17 = (int) xr6VarX0.getLong(i16);
                iQ21 = i16;
                iQ22 = iQ22;
                int i18 = (int) xr6VarX0.getLong(iQ22);
                int i19 = iQ23;
                Boolean boolValueOf = null;
                String strP3 = xr6VarX0.isNull(i19) ? null : xr6VarX0.p0(i19);
                int i20 = iQ24;
                Integer numValueOf = xr6VarX0.isNull(i20) ? null : Integer.valueOf((int) xr6VarX0.getLong(i20));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i21 = iQ25;
                b45 b45VarK = a28.k((int) xr6VarX0.getLong(i21));
                int i22 = iQ26;
                u35 u35VarW = a28.w(xr6VarX0.getBlob(i22));
                int i23 = iQ27;
                boolean z2 = ((int) xr6VarX0.getLong(i23)) != 0;
                int i24 = iQ28;
                boolean z3 = ((int) xr6VarX0.getLong(i24)) != 0;
                int i25 = iQ29;
                boolean z4 = ((int) xr6VarX0.getLong(i25)) != 0;
                iQ29 = i25;
                int i26 = iQ30;
                int i27 = iQ31;
                int i28 = iQ32;
                iQ31 = i27;
                int i29 = iQ33;
                arrayList.add(new l49(strP0, u39VarM, strP1, strP2, u91VarA, u91VarA2, j, j2, j3, new p31(u35VarW, b45VarK, z2, z3, z4, ((int) xr6VarX0.getLong(i26)) != 0, xr6VarX0.getLong(i27), xr6VarX0.getLong(i28), a28.b(xr6VarX0.getBlob(i29))), i3, z00VarJ, j4, j5, j6, j7, z, yd5VarL, i12, i14, j8, i17, i18, strP3, bool));
                iQ28 = i24;
                iQ4 = i10;
                iQ17 = i9;
                iQ18 = i11;
                iQ19 = i13;
                iQ20 = i15;
                iQ23 = i19;
                iQ24 = i20;
                iQ25 = i21;
                iQ26 = i22;
                iQ27 = i23;
                iQ33 = i29;
                iQ32 = i28;
                iQ30 = i26;
                iQ = i4;
                iQ3 = i8;
                iQ13 = i;
                iQ14 = i2;
                iQ2 = i5;
                iQ16 = i7;
            }
            return arrayList;
        } finally {
            xr6VarX0.close();
        }
    }

    private final Object f(Object obj) throws Exception {
        qr6 qr6Var = (qr6) obj;
        qr6Var.getClass();
        xr6 xr6VarX0 = qr6Var.X0("SELECT * FROM workspec WHERE state=1");
        try {
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
                long j = xr6VarX0.getLong(iQ7);
                long j2 = xr6VarX0.getLong(iQ8);
                long j3 = xr6VarX0.getLong(iQ9);
                int i2 = (int) xr6VarX0.getLong(iQ10);
                int i3 = iQ2;
                int i4 = iQ3;
                z00 z00VarJ = a28.j((int) xr6VarX0.getLong(iQ11));
                long j4 = xr6VarX0.getLong(iQ12);
                long j5 = xr6VarX0.getLong(iQ13);
                long j6 = xr6VarX0.getLong(i);
                int i5 = iQ15;
                long j7 = xr6VarX0.getLong(i5);
                int i6 = iQ;
                int i7 = iQ16;
                boolean z = ((int) xr6VarX0.getLong(i7)) != 0;
                int i8 = iQ17;
                int i9 = iQ4;
                yd5 yd5VarL = a28.l((int) xr6VarX0.getLong(i8));
                int i10 = iQ18;
                int i11 = iQ5;
                int i12 = (int) xr6VarX0.getLong(i10);
                int i13 = iQ19;
                int i14 = (int) xr6VarX0.getLong(i13);
                int i15 = iQ20;
                long j8 = xr6VarX0.getLong(i15);
                int i16 = iQ21;
                int i17 = (int) xr6VarX0.getLong(i16);
                int i18 = iQ22;
                int i19 = (int) xr6VarX0.getLong(i18);
                int i20 = iQ23;
                Boolean boolValueOf = null;
                String strP3 = xr6VarX0.isNull(i20) ? null : xr6VarX0.p0(i20);
                int i21 = iQ24;
                Integer numValueOf = xr6VarX0.isNull(i21) ? null : Integer.valueOf((int) xr6VarX0.getLong(i21));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i22 = iQ25;
                Boolean bool = boolValueOf;
                b45 b45VarK = a28.k((int) xr6VarX0.getLong(i22));
                int i23 = iQ26;
                u35 u35VarW = a28.w(xr6VarX0.getBlob(i23));
                iQ25 = i22;
                iQ26 = i23;
                int i24 = iQ27;
                boolean z2 = ((int) xr6VarX0.getLong(i24)) != 0;
                iQ27 = i24;
                int i25 = iQ28;
                boolean z3 = ((int) xr6VarX0.getLong(i25)) != 0;
                int i26 = iQ29;
                boolean z4 = ((int) xr6VarX0.getLong(i26)) != 0;
                iQ29 = i26;
                int i27 = iQ30;
                int i28 = iQ31;
                int i29 = iQ32;
                int i30 = iQ33;
                iQ33 = i30;
                arrayList2.add(new l49(strP0, u39VarM, strP1, strP2, u91VarA, u91VarA2, j, j2, j3, new p31(u35VarW, b45VarK, z2, z3, z4, ((int) xr6VarX0.getLong(i27)) != 0, xr6VarX0.getLong(i28), xr6VarX0.getLong(i29), a28.b(xr6VarX0.getBlob(i30))), i2, z00VarJ, j4, j5, j6, j7, z, yd5VarL, i12, i14, j8, i17, i19, strP3, bool));
                iQ30 = i27;
                iQ4 = i9;
                iQ17 = i8;
                iQ19 = i13;
                iQ22 = i18;
                iQ24 = i21;
                iQ31 = i28;
                iQ32 = i29;
                iQ2 = i3;
                iQ14 = i;
                iQ3 = i4;
                arrayList = arrayList2;
                iQ = i6;
                iQ15 = i5;
                iQ16 = i7;
                iQ20 = i15;
                iQ21 = i16;
                iQ23 = i20;
                iQ28 = i25;
                iQ5 = i11;
                iQ18 = i10;
            }
            return arrayList;
        } finally {
            xr6VarX0.close();
        }
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        boolean z = true;
        boolean z2 = false;
        switch (this.X) {
            case 0:
                ua7 ua7Var = (ua7) obj;
                return new tk(Float.intBitsToFloat((int) (ua7Var.a >> 32)), Float.intBitsToFloat((int) (ua7Var.a & 4294967295L)));
            case 1:
                tk tkVar = (tk) obj;
                return new ua7((((long) Float.floatToRawIntBits(tkVar.a)) << 32) | (((long) Float.floatToRawIntBits(tkVar.b)) & 4294967295L));
            case 2:
                z85 z85Var = (z85) obj;
                return new tk(Float.intBitsToFloat((int) (z85Var.a >> 32)), Float.intBitsToFloat((int) (z85Var.a & 4294967295L)));
            case 3:
                tk tkVar2 = (tk) obj;
                return new z85((((long) Float.floatToRawIntBits(tkVar2.a)) << 32) | (((long) Float.floatToRawIntBits(tkVar2.b)) & 4294967295L));
            case 4:
                long j = ((hf3) obj).a;
                return new tk((int) (j >> 32), (int) (j & 4294967295L));
            case 5:
                tk tkVar3 = (tk) obj;
                return new hf3((((long) Math.round(tkVar3.a)) << 32) | (((long) Math.round(tkVar3.b)) & 4294967295L));
            case 6:
                long j2 = ((pf3) obj).a;
                return new tk((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 7:
                tk tkVar4 = (tk) obj;
                int iRound = Math.round(tkVar4.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(tkVar4.b);
                return new pf3((((long) iRound) << 32) | (((long) (iRound2 < 0 ? 0 : iRound2)) & 4294967295L));
            case 8:
                s86 s86Var = (s86) obj;
                return new vk(s86Var.a, s86Var.b, s86Var.c, s86Var.d);
            case 9:
                vk vkVar = (vk) obj;
                return new s86(vkVar.a, vkVar.b, vkVar.c, vkVar.d);
            case 10:
                return Float.valueOf(((sk) obj).a);
            case 11:
                return ((c29) obj).g;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return ((c29) obj).f;
            case 13:
                return ((c29) obj).c;
            case 14:
                j29 j29Var = (j29) obj;
                j29Var.getClass();
                return j29Var;
            case 15:
                w21 w21Var = (w21) obj;
                w21Var.getClass();
                return w21Var.getClass().getSimpleName();
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                qr6 qr6Var = (qr6) obj;
                qr6Var.getClass();
                xr6 xr6VarX0 = qr6Var.X0("DELETE FROM WorkProgress");
                try {
                    xr6VarX0.S0();
                    return dn8.a;
                } finally {
                    xr6VarX0.close();
                }
            case 17:
                qr6 qr6Var2 = (qr6) obj;
                qr6Var2.getClass();
                xr6 xr6VarX1 = qr6Var2.X0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (xr6VarX1.S0()) {
                        arrayList.add(xr6VarX1.p0(0));
                    }
                    xr6VarX1.close();
                    return arrayList;
                } catch (Throwable th) {
                    xr6VarX1.close();
                    throw th;
                }
            case 18:
                qr6 qr6Var3 = (qr6) obj;
                qr6Var3.getClass();
                xr6 xr6VarX2 = qr6Var3.X0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int iQ = u15.q(xr6VarX2, "id");
                    int iQ2 = u15.q(xr6VarX2, "state");
                    int iQ3 = u15.q(xr6VarX2, "worker_class_name");
                    int iQ4 = u15.q(xr6VarX2, "input_merger_class_name");
                    int iQ5 = u15.q(xr6VarX2, "input");
                    int iQ6 = u15.q(xr6VarX2, "output");
                    int iQ7 = u15.q(xr6VarX2, "initial_delay");
                    int iQ8 = u15.q(xr6VarX2, "interval_duration");
                    int iQ9 = u15.q(xr6VarX2, "flex_duration");
                    int iQ10 = u15.q(xr6VarX2, "run_attempt_count");
                    int iQ11 = u15.q(xr6VarX2, "backoff_policy");
                    int iQ12 = u15.q(xr6VarX2, "backoff_delay_duration");
                    int iQ13 = u15.q(xr6VarX2, "last_enqueue_time");
                    int iQ14 = u15.q(xr6VarX2, "minimum_retention_duration");
                    int iQ15 = u15.q(xr6VarX2, "schedule_requested_at");
                    int iQ16 = u15.q(xr6VarX2, "run_in_foreground");
                    int iQ17 = u15.q(xr6VarX2, "out_of_quota_policy");
                    int iQ18 = u15.q(xr6VarX2, "period_count");
                    int iQ19 = u15.q(xr6VarX2, "generation");
                    int iQ20 = u15.q(xr6VarX2, "next_schedule_time_override");
                    int iQ21 = u15.q(xr6VarX2, "next_schedule_time_override_generation");
                    int iQ22 = u15.q(xr6VarX2, "stop_reason");
                    int iQ23 = u15.q(xr6VarX2, "trace_tag");
                    int iQ24 = u15.q(xr6VarX2, "backoff_on_system_interruptions");
                    int iQ25 = u15.q(xr6VarX2, "required_network_type");
                    int iQ26 = u15.q(xr6VarX2, "required_network_request");
                    int iQ27 = u15.q(xr6VarX2, "requires_charging");
                    int iQ28 = u15.q(xr6VarX2, "requires_device_idle");
                    int iQ29 = u15.q(xr6VarX2, "requires_battery_not_low");
                    int iQ30 = u15.q(xr6VarX2, "requires_storage_not_low");
                    int iQ31 = u15.q(xr6VarX2, "trigger_content_update_delay");
                    int iQ32 = u15.q(xr6VarX2, "trigger_max_content_delay");
                    int iQ33 = u15.q(xr6VarX2, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (xr6VarX2.S0()) {
                        String strP0 = xr6VarX2.p0(iQ);
                        int i = iQ14;
                        int i2 = iQ13;
                        u39 u39VarM = a28.m((int) xr6VarX2.getLong(iQ2));
                        String strP1 = xr6VarX2.p0(iQ3);
                        String strP2 = xr6VarX2.p0(iQ4);
                        byte[] blob = xr6VarX2.getBlob(iQ5);
                        u91 u91Var = u91.b;
                        u91 u91VarA = wl7.A(blob);
                        u91 u91VarA2 = wl7.A(xr6VarX2.getBlob(iQ6));
                        long j3 = xr6VarX2.getLong(iQ7);
                        long j4 = xr6VarX2.getLong(iQ8);
                        long j5 = xr6VarX2.getLong(iQ9);
                        int i3 = (int) xr6VarX2.getLong(iQ10);
                        int i4 = iQ3;
                        int i5 = iQ2;
                        z00 z00VarJ = a28.j((int) xr6VarX2.getLong(iQ11));
                        long j6 = xr6VarX2.getLong(iQ12);
                        long j7 = xr6VarX2.getLong(i2);
                        long j8 = xr6VarX2.getLong(i);
                        int i6 = iQ15;
                        long j9 = xr6VarX2.getLong(i6);
                        iQ15 = i6;
                        int i7 = iQ16;
                        int i8 = iQ;
                        boolean z3 = ((int) xr6VarX2.getLong(i7)) != 0;
                        int i9 = iQ4;
                        int i10 = iQ17;
                        yd5 yd5VarL = a28.l((int) xr6VarX2.getLong(i10));
                        iQ17 = i10;
                        int i11 = iQ18;
                        int i12 = (int) xr6VarX2.getLong(i11);
                        iQ18 = i11;
                        int i13 = iQ19;
                        int i14 = (int) xr6VarX2.getLong(i13);
                        int i15 = iQ20;
                        long j10 = xr6VarX2.getLong(i15);
                        int i16 = iQ21;
                        int i17 = (int) xr6VarX2.getLong(i16);
                        int i18 = iQ22;
                        int i19 = (int) xr6VarX2.getLong(i18);
                        int i20 = iQ23;
                        String strP3 = xr6VarX2.isNull(i20) ? null : xr6VarX2.p0(i20);
                        int i21 = iQ24;
                        Integer numValueOf = xr6VarX2.isNull(i21) ? null : Integer.valueOf((int) xr6VarX2.getLong(i21));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i22 = iQ25;
                        b45 b45VarK = a28.k((int) xr6VarX2.getLong(i22));
                        int i23 = iQ26;
                        u35 u35VarW = a28.w(xr6VarX2.getBlob(i23));
                        int i24 = iQ27;
                        boolean z4 = ((int) xr6VarX2.getLong(i24)) != 0;
                        int i25 = iQ28;
                        boolean z5 = ((int) xr6VarX2.getLong(i25)) != 0;
                        int i26 = iQ29;
                        boolean z6 = ((int) xr6VarX2.getLong(i26)) != 0;
                        iQ29 = i26;
                        int i27 = iQ30;
                        int i28 = iQ31;
                        int i29 = iQ32;
                        iQ31 = i28;
                        int i30 = iQ33;
                        iQ33 = i30;
                        arrayList2.add(new l49(strP0, u39VarM, strP1, strP2, u91VarA, u91VarA2, j3, j4, j5, new p31(u35VarW, b45VarK, z4, z5, z6, ((int) xr6VarX2.getLong(i27)) != 0, xr6VarX2.getLong(i28), xr6VarX2.getLong(i29), a28.b(xr6VarX2.getBlob(i30))), i3, z00VarJ, j6, j7, j8, j9, z3, yd5VarL, i12, i14, j10, i17, i19, strP3, boolValueOf));
                        iQ = i8;
                        iQ16 = i7;
                        iQ19 = i13;
                        iQ21 = i16;
                        iQ22 = i18;
                        iQ23 = i20;
                        iQ24 = i21;
                        iQ25 = i22;
                        iQ26 = i23;
                        iQ32 = i29;
                        iQ30 = i27;
                        iQ2 = i5;
                        iQ4 = i9;
                        iQ20 = i15;
                        iQ27 = i24;
                        iQ13 = i2;
                        iQ3 = i4;
                        iQ28 = i25;
                        iQ14 = i;
                        break;
                    }
                    return arrayList2;
                } finally {
                    xr6VarX2.close();
                }
            case 19:
                qr6 qr6Var4 = (qr6) obj;
                qr6Var4.getClass();
                xr6 xr6VarX3 = qr6Var4.X0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i31 = xr6VarX3.S0() ? (int) xr6VarX3.getLong(0) : 0;
                    xr6VarX3.close();
                    return Integer.valueOf(i31);
                } catch (Throwable th2) {
                    xr6VarX3.close();
                    throw th2;
                }
            case 20:
                qr6 qr6Var5 = (qr6) obj;
                qr6Var5.getClass();
                xr6 xr6VarX4 = qr6Var5.X0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int iQ34 = u15.q(xr6VarX4, "id");
                    int iQ35 = u15.q(xr6VarX4, "state");
                    int iQ36 = u15.q(xr6VarX4, "worker_class_name");
                    int iQ37 = u15.q(xr6VarX4, "input_merger_class_name");
                    int iQ38 = u15.q(xr6VarX4, "input");
                    int iQ39 = u15.q(xr6VarX4, "output");
                    int iQ40 = u15.q(xr6VarX4, "initial_delay");
                    int iQ41 = u15.q(xr6VarX4, "interval_duration");
                    int iQ42 = u15.q(xr6VarX4, "flex_duration");
                    int iQ43 = u15.q(xr6VarX4, "run_attempt_count");
                    int iQ44 = u15.q(xr6VarX4, "backoff_policy");
                    int iQ45 = u15.q(xr6VarX4, "backoff_delay_duration");
                    int iQ46 = u15.q(xr6VarX4, "last_enqueue_time");
                    int iQ47 = u15.q(xr6VarX4, "minimum_retention_duration");
                    int iQ48 = u15.q(xr6VarX4, "schedule_requested_at");
                    int iQ49 = u15.q(xr6VarX4, "run_in_foreground");
                    int iQ50 = u15.q(xr6VarX4, "out_of_quota_policy");
                    int iQ51 = u15.q(xr6VarX4, "period_count");
                    int iQ52 = u15.q(xr6VarX4, "generation");
                    int iQ53 = u15.q(xr6VarX4, "next_schedule_time_override");
                    int iQ54 = u15.q(xr6VarX4, "next_schedule_time_override_generation");
                    int iQ55 = u15.q(xr6VarX4, "stop_reason");
                    int iQ56 = u15.q(xr6VarX4, "trace_tag");
                    int iQ57 = u15.q(xr6VarX4, "backoff_on_system_interruptions");
                    int iQ58 = u15.q(xr6VarX4, "required_network_type");
                    int iQ59 = u15.q(xr6VarX4, "required_network_request");
                    int iQ60 = u15.q(xr6VarX4, "requires_charging");
                    int iQ61 = u15.q(xr6VarX4, "requires_device_idle");
                    int iQ62 = u15.q(xr6VarX4, "requires_battery_not_low");
                    int iQ63 = u15.q(xr6VarX4, "requires_storage_not_low");
                    int iQ64 = u15.q(xr6VarX4, "trigger_content_update_delay");
                    int iQ65 = u15.q(xr6VarX4, "trigger_max_content_delay");
                    int iQ66 = u15.q(xr6VarX4, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (xr6VarX4.S0()) {
                        String strP4 = xr6VarX4.p0(iQ34);
                        int i32 = iQ47;
                        int i33 = iQ46;
                        u39 u39VarM2 = a28.m((int) xr6VarX4.getLong(iQ35));
                        String strP5 = xr6VarX4.p0(iQ36);
                        String strP6 = xr6VarX4.p0(iQ37);
                        byte[] blob2 = xr6VarX4.getBlob(iQ38);
                        u91 u91Var2 = u91.b;
                        u91 u91VarA3 = wl7.A(blob2);
                        u91 u91VarA4 = wl7.A(xr6VarX4.getBlob(iQ39));
                        long j11 = xr6VarX4.getLong(iQ40);
                        long j12 = xr6VarX4.getLong(iQ41);
                        long j13 = xr6VarX4.getLong(iQ42);
                        int i34 = (int) xr6VarX4.getLong(iQ43);
                        int i35 = iQ36;
                        int i36 = iQ35;
                        z00 z00VarJ2 = a28.j((int) xr6VarX4.getLong(iQ44));
                        long j14 = xr6VarX4.getLong(iQ45);
                        long j15 = xr6VarX4.getLong(i33);
                        long j16 = xr6VarX4.getLong(i32);
                        int i37 = iQ48;
                        long j17 = xr6VarX4.getLong(i37);
                        int i38 = iQ34;
                        int i39 = iQ49;
                        boolean z7 = ((int) xr6VarX4.getLong(i39)) != 0;
                        int i40 = iQ37;
                        int i41 = iQ50;
                        yd5 yd5VarL2 = a28.l((int) xr6VarX4.getLong(i41));
                        int i42 = iQ51;
                        int i43 = (int) xr6VarX4.getLong(i42);
                        int i44 = iQ52;
                        int i45 = (int) xr6VarX4.getLong(i44);
                        long j18 = xr6VarX4.getLong(iQ53);
                        int i46 = iQ54;
                        int i47 = (int) xr6VarX4.getLong(i46);
                        iQ54 = i46;
                        iQ55 = iQ55;
                        int i48 = (int) xr6VarX4.getLong(iQ55);
                        iQ56 = iQ56;
                        String strP7 = xr6VarX4.isNull(iQ56) ? null : xr6VarX4.p0(iQ56);
                        int i49 = iQ57;
                        Integer numValueOf2 = xr6VarX4.isNull(i49) ? null : Integer.valueOf((int) xr6VarX4.getLong(i49));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i50 = iQ58;
                        b45 b45VarK2 = a28.k((int) xr6VarX4.getLong(i50));
                        int i51 = iQ59;
                        u35 u35VarW2 = a28.w(xr6VarX4.getBlob(i51));
                        iQ57 = i49;
                        iQ58 = i50;
                        int i52 = iQ60;
                        boolean z8 = ((int) xr6VarX4.getLong(i52)) != 0;
                        int i53 = iQ61;
                        boolean z9 = ((int) xr6VarX4.getLong(i53)) != 0;
                        iQ60 = i52;
                        int i54 = iQ62;
                        boolean z10 = ((int) xr6VarX4.getLong(i54)) != 0;
                        iQ61 = i53;
                        iQ62 = i54;
                        int i55 = iQ63;
                        int i56 = iQ64;
                        int i57 = iQ65;
                        int i58 = iQ66;
                        iQ64 = i56;
                        arrayList3.add(new l49(strP4, u39VarM2, strP5, strP6, u91VarA3, u91VarA4, j11, j12, j13, new p31(u35VarW2, b45VarK2, z8, z9, z10, ((int) xr6VarX4.getLong(i55)) != 0, xr6VarX4.getLong(i56), xr6VarX4.getLong(i57), a28.b(xr6VarX4.getBlob(i58))), i34, z00VarJ2, j14, j15, j16, j17, z7, yd5VarL2, i43, i45, j18, i47, i48, strP7, boolValueOf2));
                        iQ65 = i57;
                        iQ63 = i55;
                        iQ66 = i58;
                        iQ47 = i32;
                        iQ35 = i36;
                        iQ36 = i35;
                        iQ37 = i40;
                        iQ49 = i39;
                        iQ50 = i41;
                        iQ51 = i42;
                        iQ52 = i44;
                        iQ59 = i51;
                        iQ34 = i38;
                        iQ48 = i37;
                        iQ46 = i33;
                        break;
                    }
                    return arrayList3;
                } finally {
                    xr6VarX4.close();
                }
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                qr6 qr6Var6 = (qr6) obj;
                qr6Var6.getClass();
                xr6 xr6VarX5 = qr6Var6.X0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (xr6VarX5.S0()) {
                        z2 = ((int) xr6VarX5.getLong(0)) != 0;
                    }
                    return Boolean.valueOf(z2);
                } finally {
                    xr6VarX5.close();
                }
            case 22:
                return c(obj);
            case 23:
                qr6 qr6Var7 = (qr6) obj;
                qr6Var7.getClass();
                xr6 xr6VarX6 = qr6Var7.X0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    xr6VarX6.S0();
                    return Integer.valueOf(os4.r(qr6Var7));
                } finally {
                    xr6VarX6.close();
                }
            case 24:
                return e(obj);
            case 25:
                return f(obj);
            case 26:
                bq3 bq3Var = (bq3) obj;
                String strD = bq3Var.j("protocol").d();
                int iA = bq3Var.j("port").a();
                if ((!dh3.f(strD, "socks") || iA != n67.d()) && (!dh3.f(strD, "http") || iA != n67.b())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                bo3 bo3Var = (bo3) obj;
                bo3Var.getClass();
                return Boolean.valueOf(bo3Var instanceof bq3);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return ((bo3) obj).c();
            default:
                bo3 bo3Var2 = (bo3) obj;
                bo3Var2.getClass();
                return Boolean.valueOf(bo3Var2 instanceof bq3);
        }
    }
}
