package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oi1 extends z91 {
    public final /* synthetic */ byte f;

    public /* synthetic */ oi1(byte b) {
        this.f = b;
    }

    @Override // defpackage.z91
    public final void j(xr6 xr6Var, Object obj) {
        switch (this.f) {
            case 0:
                ki1 ki1Var = (ki1) obj;
                xr6Var.getClass();
                ki1Var.getClass();
                xr6Var.T(1, ki1Var.a);
                xr6Var.T(2, ki1Var.b);
                break;
            case 1:
                fs5 fs5Var = (fs5) obj;
                xr6Var.getClass();
                fs5Var.getClass();
                xr6Var.T(1, fs5Var.a);
                xr6Var.i(2, fs5Var.b.longValue());
                break;
            case 2:
                j08 j08Var = (j08) obj;
                xr6Var.getClass();
                j08Var.getClass();
                xr6Var.T(1, j08Var.a);
                xr6Var.i(2, j08Var.b);
                xr6Var.i(3, j08Var.c);
                break;
            case 3:
                a49 a49Var = (a49) obj;
                xr6Var.getClass();
                a49Var.getClass();
                xr6Var.T(1, a49Var.a);
                xr6Var.T(2, a49Var.b);
                break;
            case 4:
                c49 c49Var = (c49) obj;
                xr6Var.getClass();
                c49Var.getClass();
                xr6Var.T(1, c49Var.a);
                u91 u91Var = u91.b;
                xr6Var.j(2, wl7.c0(c49Var.b));
                break;
            case 5:
                l49 l49Var = (l49) obj;
                xr6Var.getClass();
                l49Var.getClass();
                xr6Var.T(1, l49Var.a);
                xr6Var.i(2, a28.u(l49Var.b));
                xr6Var.T(3, l49Var.c);
                xr6Var.T(4, l49Var.d);
                u91 u91Var2 = u91.b;
                xr6Var.j(5, wl7.c0(l49Var.e));
                xr6Var.j(6, wl7.c0(l49Var.f));
                xr6Var.i(7, l49Var.g);
                xr6Var.i(8, l49Var.h);
                xr6Var.i(9, l49Var.i);
                xr6Var.i(10, l49Var.k);
                xr6Var.i(11, a28.a(l49Var.l));
                xr6Var.i(12, l49Var.m);
                xr6Var.i(13, l49Var.n);
                xr6Var.i(14, l49Var.o);
                xr6Var.i(15, l49Var.p);
                xr6Var.i(16, l49Var.q ? 1L : 0L);
                xr6Var.i(17, a28.r(l49Var.r));
                xr6Var.i(18, l49Var.s);
                xr6Var.i(19, l49Var.t);
                xr6Var.i(20, l49Var.u);
                xr6Var.i(21, l49Var.v);
                xr6Var.i(22, l49Var.w);
                String str = l49Var.x;
                if (str == null) {
                    xr6Var.l(23);
                } else {
                    xr6Var.T(23, str);
                }
                Boolean bool = l49Var.y;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    xr6Var.l(24);
                } else {
                    xr6Var.i(24, numValueOf.intValue());
                }
                p31 p31Var = l49Var.j;
                xr6Var.i(25, a28.p(p31Var.a));
                xr6Var.j(26, a28.d(p31Var.b));
                xr6Var.i(27, p31Var.c ? 1L : 0L);
                xr6Var.i(28, p31Var.d ? 1L : 0L);
                xr6Var.i(29, p31Var.e ? 1L : 0L);
                xr6Var.i(30, p31Var.f ? 1L : 0L);
                xr6Var.i(31, p31Var.g);
                xr6Var.i(32, p31Var.h);
                xr6Var.j(33, a28.s(p31Var.i));
                break;
            default:
                o49 o49Var = (o49) obj;
                xr6Var.getClass();
                o49Var.getClass();
                xr6Var.T(1, o49Var.a);
                xr6Var.T(2, o49Var.b);
                break;
        }
    }

    @Override // defpackage.z91
    public final String z() {
        switch (this.f) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
