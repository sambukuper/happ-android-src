package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.service.XRayVpnService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm7 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ String Y;

    public /* synthetic */ nm7(String str, byte b) {
        this.X = b;
        this.Y = str;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x024c  */
    @Override // defpackage.gn2
    public final Object B(Object obj) throws Exception {
        l49 l49Var;
        u39 u39VarM;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        boolean z = false;
        String str = this.Y;
        switch (b) {
            case 0:
                kf3 kf3Var = (kf3) obj;
                kf3Var.getClass();
                return fm7.I0(str, kf3Var);
            case 1:
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.println(p61.q(printWriter) + " SubscriptionUpdater: sub " + str + " not found");
                return dn8Var;
            case 2:
                qr6 qr6Var = (qr6) obj;
                qr6Var.getClass();
                xr6 xr6VarX0 = qr6Var.X0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    xr6VarX0.T(1, str);
                    xr6VarX0.S0();
                    return dn8Var;
                } finally {
                    xr6VarX0.close();
                }
            case 3:
                nw3[] nw3VarArr = d17.a;
                ((f17) obj).a(c17.O, str);
                return dn8Var;
            case 4:
                qr6 qr6Var2 = (qr6) obj;
                qr6Var2.getClass();
                xr6 xr6VarX1 = qr6Var2.X0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    xr6VarX1.T(1, str);
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
            case 5:
                qr6 qr6Var3 = (qr6) obj;
                qr6Var3.getClass();
                xr6 xr6VarX2 = qr6Var3.X0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    xr6VarX2.T(1, str);
                    xr6VarX2.S0();
                    return dn8Var;
                } finally {
                    xr6VarX2.close();
                }
            case 6:
                qr6 qr6Var4 = (qr6) obj;
                qr6Var4.getClass();
                xr6 xr6VarX3 = qr6Var4.X0("SELECT * FROM workspec WHERE id=?");
                try {
                    xr6VarX3.T(1, str);
                    int iQ = u15.q(xr6VarX3, "id");
                    int iQ2 = u15.q(xr6VarX3, "state");
                    int iQ3 = u15.q(xr6VarX3, "worker_class_name");
                    int iQ4 = u15.q(xr6VarX3, "input_merger_class_name");
                    int iQ5 = u15.q(xr6VarX3, "input");
                    int iQ6 = u15.q(xr6VarX3, "output");
                    int iQ7 = u15.q(xr6VarX3, "initial_delay");
                    int iQ8 = u15.q(xr6VarX3, "interval_duration");
                    int iQ9 = u15.q(xr6VarX3, "flex_duration");
                    int iQ10 = u15.q(xr6VarX3, "run_attempt_count");
                    int iQ11 = u15.q(xr6VarX3, "backoff_policy");
                    int iQ12 = u15.q(xr6VarX3, "backoff_delay_duration");
                    int iQ13 = u15.q(xr6VarX3, "last_enqueue_time");
                    int iQ14 = u15.q(xr6VarX3, "minimum_retention_duration");
                    int iQ15 = u15.q(xr6VarX3, "schedule_requested_at");
                    int iQ16 = u15.q(xr6VarX3, "run_in_foreground");
                    int iQ17 = u15.q(xr6VarX3, "out_of_quota_policy");
                    int iQ18 = u15.q(xr6VarX3, "period_count");
                    int iQ19 = u15.q(xr6VarX3, "generation");
                    int iQ20 = u15.q(xr6VarX3, "next_schedule_time_override");
                    int iQ21 = u15.q(xr6VarX3, "next_schedule_time_override_generation");
                    int iQ22 = u15.q(xr6VarX3, "stop_reason");
                    int iQ23 = u15.q(xr6VarX3, "trace_tag");
                    int iQ24 = u15.q(xr6VarX3, "backoff_on_system_interruptions");
                    int iQ25 = u15.q(xr6VarX3, "required_network_type");
                    int iQ26 = u15.q(xr6VarX3, "required_network_request");
                    int iQ27 = u15.q(xr6VarX3, "requires_charging");
                    int iQ28 = u15.q(xr6VarX3, "requires_device_idle");
                    int iQ29 = u15.q(xr6VarX3, "requires_battery_not_low");
                    int iQ30 = u15.q(xr6VarX3, "requires_storage_not_low");
                    int iQ31 = u15.q(xr6VarX3, "trigger_content_update_delay");
                    int iQ32 = u15.q(xr6VarX3, "trigger_max_content_delay");
                    int iQ33 = u15.q(xr6VarX3, "content_uri_triggers");
                    if (xr6VarX3.S0()) {
                        String strP0 = xr6VarX3.p0(iQ);
                        u39 u39VarM2 = a28.m((int) xr6VarX3.getLong(iQ2));
                        String strP1 = xr6VarX3.p0(iQ3);
                        String strP2 = xr6VarX3.p0(iQ4);
                        byte[] blob = xr6VarX3.getBlob(iQ5);
                        u91 u91Var = u91.b;
                        u91 u91VarA = wl7.A(blob);
                        u91 u91VarA2 = wl7.A(xr6VarX3.getBlob(iQ6));
                        long j = xr6VarX3.getLong(iQ7);
                        long j2 = xr6VarX3.getLong(iQ8);
                        long j3 = xr6VarX3.getLong(iQ9);
                        int i = (int) xr6VarX3.getLong(iQ10);
                        z00 z00VarJ = a28.j((int) xr6VarX3.getLong(iQ11));
                        long j4 = xr6VarX3.getLong(iQ12);
                        long j5 = xr6VarX3.getLong(iQ13);
                        long j6 = xr6VarX3.getLong(iQ14);
                        long j7 = xr6VarX3.getLong(iQ15);
                        boolean z2 = ((int) xr6VarX3.getLong(iQ16)) != 0;
                        yd5 yd5VarL = a28.l((int) xr6VarX3.getLong(iQ17));
                        int i2 = (int) xr6VarX3.getLong(iQ18);
                        int i3 = (int) xr6VarX3.getLong(iQ19);
                        long j8 = xr6VarX3.getLong(iQ20);
                        int i4 = (int) xr6VarX3.getLong(iQ21);
                        int i5 = (int) xr6VarX3.getLong(iQ22);
                        String strP3 = xr6VarX3.isNull(iQ23) ? null : xr6VarX3.p0(iQ23);
                        Integer numValueOf = xr6VarX3.isNull(iQ24) ? null : Integer.valueOf((int) xr6VarX3.getLong(iQ24));
                        l49Var = new l49(strP0, u39VarM2, strP1, strP2, u91VarA, u91VarA2, j, j2, j3, new p31(a28.w(xr6VarX3.getBlob(iQ26)), a28.k((int) xr6VarX3.getLong(iQ25)), ((int) xr6VarX3.getLong(iQ27)) != 0, ((int) xr6VarX3.getLong(iQ28)) != 0, ((int) xr6VarX3.getLong(iQ29)) != 0, ((int) xr6VarX3.getLong(iQ30)) != 0, xr6VarX3.getLong(iQ31), xr6VarX3.getLong(iQ32), a28.b(xr6VarX3.getBlob(iQ33))), i, z00VarJ, j4, j5, j6, j7, z2, yd5VarL, i2, i3, j8, i4, i5, strP3, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        l49Var = null;
                    }
                    return l49Var;
                } finally {
                    xr6VarX3.close();
                }
            case 7:
                qr6 qr6Var5 = (qr6) obj;
                qr6Var5.getClass();
                xr6 xr6VarX4 = qr6Var5.X0("SELECT state FROM workspec WHERE id=?");
                try {
                    xr6VarX4.T(1, str);
                    if (xr6VarX4.S0()) {
                        Integer numValueOf2 = xr6VarX4.isNull(0) ? null : Integer.valueOf((int) xr6VarX4.getLong(0));
                        if (numValueOf2 != null) {
                            u39VarM = a28.m(numValueOf2.intValue());
                        } else {
                            u39VarM = null;
                        }
                        break;
                    } else {
                        u39VarM = null;
                    }
                    return u39VarM;
                } finally {
                    xr6VarX4.close();
                }
            case 8:
                qr6 qr6Var6 = (qr6) obj;
                qr6Var6.getClass();
                xr6 xr6VarX5 = qr6Var6.X0("DELETE FROM workspec WHERE id=?");
                try {
                    xr6VarX5.T(1, str);
                    xr6VarX5.S0();
                    return dn8Var;
                } finally {
                    xr6VarX5.close();
                }
            case 9:
                qr6 qr6Var7 = (qr6) obj;
                qr6Var7.getClass();
                xr6 xr6VarX6 = qr6Var7.X0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    xr6VarX6.T(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (xr6VarX6.S0()) {
                        String strP4 = xr6VarX6.p0(0);
                        u39 u39VarM3 = a28.m((int) xr6VarX6.getLong(1));
                        strP4.getClass();
                        j49 j49Var = new j49();
                        j49Var.a = strP4;
                        j49Var.b = u39VarM3;
                        arrayList2.add(j49Var);
                    }
                    xr6VarX6.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    xr6VarX6.close();
                    throw th2;
                }
            case 10:
                qr6 qr6Var8 = (qr6) obj;
                qr6Var8.getClass();
                xr6 xr6VarX7 = qr6Var8.X0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    xr6VarX7.T(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (xr6VarX7.S0()) {
                        arrayList3.add(xr6VarX7.p0(0));
                    }
                    xr6VarX7.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    xr6VarX7.close();
                    throw th3;
                }
            case 11:
                qr6 qr6Var9 = (qr6) obj;
                qr6Var9.getClass();
                xr6 xr6VarX8 = qr6Var9.X0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    xr6VarX8.T(1, str);
                    xr6VarX8.S0();
                    return Integer.valueOf(os4.r(qr6Var9));
                } finally {
                    xr6VarX8.close();
                }
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                qr6 qr6Var10 = (qr6) obj;
                qr6Var10.getClass();
                xr6 xr6VarX9 = qr6Var10.X0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    xr6VarX9.T(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (xr6VarX9.S0()) {
                        arrayList4.add(xr6VarX9.p0(0));
                    }
                    xr6VarX9.close();
                    return arrayList4;
                } catch (Throwable th4) {
                    xr6VarX9.close();
                    throw th4;
                }
            case 13:
                qr6 qr6Var11 = (qr6) obj;
                qr6Var11.getClass();
                xr6 xr6VarX10 = qr6Var11.X0("SELECT COUNT(*) > 0 FROM workspec WHERE id=? AND state=0 AND schedule_requested_at<>-1");
                try {
                    xr6VarX10.T(1, str);
                    if (xr6VarX10.S0() && ((int) xr6VarX10.getLong(0)) != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    xr6VarX10.close();
                }
            case 14:
                qr6 qr6Var12 = (qr6) obj;
                qr6Var12.getClass();
                xr6 xr6VarX11 = qr6Var12.X0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    xr6VarX11.T(1, str);
                    xr6VarX11.S0();
                    return Integer.valueOf(os4.r(qr6Var12));
                } finally {
                    xr6VarX11.close();
                }
            case 15:
                qr6 qr6Var13 = (qr6) obj;
                qr6Var13.getClass();
                xr6 xr6VarX12 = qr6Var13.X0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    xr6VarX12.T(1, str);
                    xr6VarX12.S0();
                    return dn8Var;
                } finally {
                    xr6VarX12.close();
                }
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                qr6 qr6Var14 = (qr6) obj;
                qr6Var14.getClass();
                xr6 xr6VarX13 = qr6Var14.X0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    xr6VarX13.T(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (xr6VarX13.S0()) {
                        byte[] blob2 = xr6VarX13.getBlob(0);
                        u91 u91Var2 = u91.b;
                        arrayList5.add(wl7.A(blob2));
                    }
                    xr6VarX13.close();
                    return arrayList5;
                } catch (Throwable th5) {
                    xr6VarX13.close();
                    throw th5;
                }
            case 17:
                qr6 qr6Var15 = (qr6) obj;
                qr6Var15.getClass();
                xr6 xr6VarX14 = qr6Var15.X0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    xr6VarX14.T(1, str);
                    xr6VarX14.S0();
                    return Integer.valueOf(os4.r(qr6Var15));
                } finally {
                    xr6VarX14.close();
                }
            case 18:
                qr6 qr6Var16 = (qr6) obj;
                qr6Var16.getClass();
                xr6 xr6VarX15 = qr6Var16.X0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    xr6VarX15.T(1, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (xr6VarX15.S0()) {
                        arrayList6.add(xr6VarX15.p0(0));
                    }
                    xr6VarX15.close();
                    return arrayList6;
                } catch (Throwable th6) {
                    xr6VarX15.close();
                    throw th6;
                }
            case 19:
                qr6 qr6Var17 = (qr6) obj;
                qr6Var17.getClass();
                xr6 xr6VarX16 = qr6Var17.X0("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    xr6VarX16.T(1, str);
                    xr6VarX16.S0();
                    return dn8Var;
                } finally {
                    xr6VarX16.close();
                }
            default:
                PrintWriter printWriter2 = (PrintWriter) obj;
                int i6 = XRayVpnService.v0;
                printWriter2.println(p61.q(printWriter2) + " Tunnel DNS = " + (str != null ? "DOU ".concat(str) : "DEFAULT_REMOTE_DNS"));
                return dn8Var;
        }
    }
}
