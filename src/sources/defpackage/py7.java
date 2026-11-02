package defpackage;

import android.content.ClipDescription;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class py7 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ py7(n49 n49Var, l49 l49Var) {
        this.X = (byte) 13;
        this.Y = l49Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        qi0 qi0VarC;
        byte b = this.X;
        boolean z = false;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                ok okVar = (ok) obj;
                ((rn2) obj2).K(okVar.e.getValue(), ys0.j0.b.B(okVar.f));
                return dn8.a;
            case 1:
                MotionEvent motionEvent = (MotionEvent) obj2;
                yl8 yl8Var = (yl8) obj;
                yl8Var.getClass();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = yl8Var.h;
                if (rect == null) {
                    Boolean bool = Boolean.FALSE;
                    return new qg5(bool, bool);
                }
                if (rect.contains((int) x, (int) y)) {
                    yl8Var.f.y(yl8Var.g);
                    return new qg5(Boolean.TRUE, Boolean.valueOf(yl8Var.e));
                }
                Boolean bool2 = Boolean.FALSE;
                return new qg5(bool2, bool2);
            case 2:
                Drawable drawable = (Drawable) obj2;
                sv1 sv1Var = (sv1) obj;
                sm0 sm0VarK = sv1Var.n0().k();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (sv1Var.e() >> 32)), (int) Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L)));
                drawable.draw(fb.b(sm0VarK));
                return dn8.a;
            case 3:
                ((gn2) obj).B((e38) obj2);
                return dn8.a;
            case 4:
                py7 py7Var = (py7) obj2;
                ye8 ye8Var = (ye8) obj;
                if (ye8Var instanceof e7) {
                    py7Var.B(((e7) ye8Var).q0);
                    return Boolean.TRUE;
                }
                bt.i("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 5:
                n48 n48Var = (n48) obj2;
                y24 y24Var = (y24) obj;
                s86 s86Var = s86.e;
                s86 s86Var2 = (s86) n48Var.w0.x.getValue();
                if (s86Var2 == null) {
                    s86Var2 = s86Var;
                }
                y24 y24VarE = n48Var.u0.e();
                if (y24VarE == null) {
                    zc3.d("Required value was null.");
                    b61.n();
                    return null;
                }
                if (y24VarE.g() && y24Var.g()) {
                    return u70.n(y24Var.E(jm4.x(y24VarE).n(s86Var2.f())), s86Var2.e());
                }
                return s86Var;
            case 6:
                ClipDescription clipDescription = ((pt1) obj).a.getClipDescription();
                Iterable<ps4> iterable = (Iterable) ((s48) obj2).invoke();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (ps4 ps4Var : iterable) {
                        if (dh3.f(ps4Var, ps4.c) || (clipDescription != null && clipDescription.hasMimeType(ps4Var.a))) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                c88 c88Var = (c88) obj2;
                pl plVar = (pl) obj;
                ml mlVar = (ml) plVar.a;
                if (mlVar instanceof oa4) {
                    oa4 oa4Var = (oa4) mlVar;
                    if (oa4Var.b == null) {
                        return pl.a(plVar, new oa4(oa4Var.a, c88Var), 0, 0, 14);
                    }
                }
                if (!(mlVar instanceof na4)) {
                    return plVar;
                }
                na4 na4Var = (na4) mlVar;
                return na4Var.b == null ? pl.a(plVar, new na4(na4Var.a, c88Var), 0, 0, 14) : plVar;
            case 8:
                return (y24) ((hc8) obj2).a.invoke();
            case 9:
                ((uc8) obj2).j = null;
                return dn8.a;
            case 10:
                cc1 cc1Var = (cc1) obj;
                cc1Var.getClass();
                vm8.b(cc1Var, ((rm8) obj2).a);
                return dn8.a;
            case 11:
                hi0 hi0Var = (hi0) obj;
                hi0Var.getClass();
                rj0 rj0Var = ((lr8) obj2).a;
                synchronized (rj0Var.c) {
                    if (rj0Var.d) {
                        throw new IllegalStateException("Check failed.");
                    }
                    StringBuilder sb = new StringBuilder("CameraGraph-");
                    qv qvVar = ni0.b;
                    qvVar.getClass();
                    sb.append(qv.b.incrementAndGet(qvVar));
                    qi0VarC = rj0Var.c(hi0Var, new ni0(sb.toString()));
                }
                return qi0VarC;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    ((wg1) it.next()).b();
                }
                return dn8.a;
            default:
                l49 l49Var = (l49) obj2;
                qr6 qr6Var = (qr6) obj;
                qr6Var.getClass();
                xr6 xr6VarX0 = qr6Var.X0("UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?");
                try {
                    f08.b(xr6VarX0, l49Var);
                    xr6VarX0.S0();
                    u15.h(xr6VarX0, null);
                    os4.r(qr6Var);
                    return dn8.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u15.h(xr6VarX0, th);
                        throw th2;
                    }
                }
        }
    }

    public /* synthetic */ py7(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    public /* synthetic */ py7(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
