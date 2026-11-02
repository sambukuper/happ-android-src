package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p39 extends td5 {
    public final /* synthetic */ WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p39(WorkDatabase_Impl workDatabase_Impl) {
        super("08b926448d86528e697981ddd30459f7", 24, "149fd8ad55885d3fe3549a37a0163243");
        this.d = workDatabase_Impl;
    }

    @Override // defpackage.td5
    public final void a(qr6 qr6Var) {
        qr6Var.getClass();
        nr4.r(qr6Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        nr4.r(qr6Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        nr4.r(qr6Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        nr4.r(qr6Var, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        nr4.r(qr6Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        nr4.r(qr6Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        nr4.r(qr6Var, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        nr4.r(qr6Var, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        nr4.r(qr6Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        nr4.r(qr6Var, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        nr4.r(qr6Var, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        nr4.r(qr6Var, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        nr4.r(qr6Var, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        nr4.r(qr6Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        nr4.r(qr6Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // defpackage.td5
    public final void c(qr6 qr6Var) {
        qr6Var.getClass();
        nr4.r(qr6Var, "DROP TABLE IF EXISTS `Dependency`");
        nr4.r(qr6Var, "DROP TABLE IF EXISTS `WorkSpec`");
        nr4.r(qr6Var, "DROP TABLE IF EXISTS `WorkTag`");
        nr4.r(qr6Var, "DROP TABLE IF EXISTS `SystemIdInfo`");
        nr4.r(qr6Var, "DROP TABLE IF EXISTS `WorkName`");
        nr4.r(qr6Var, "DROP TABLE IF EXISTS `WorkProgress`");
        nr4.r(qr6Var, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // defpackage.td5
    public final void s(qr6 qr6Var) {
        qr6Var.getClass();
    }

    @Override // defpackage.td5
    public final void t(qr6 qr6Var) {
        qr6Var.getClass();
        nr4.r(qr6Var, "PRAGMA foreign_keys = ON");
        fi3 fi3VarF = this.d.f();
        xf8 xf8Var = fi3VarF.b;
        xf8Var.getClass();
        xr6 xr6VarX0 = qr6Var.X0("PRAGMA query_only");
        try {
            xr6VarX0.S0();
            boolean zW = xr6VarX0.W();
            u15.h(xr6VarX0, null);
            if (!zW) {
                nr4.r(qr6Var, "PRAGMA temp_store = MEMORY");
                nr4.r(qr6Var, "PRAGMA recursive_triggers = 1");
                nr4.r(qr6Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (xf8Var.d) {
                    nr4.r(qr6Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    nr4.r(qr6Var, mm7.W("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", _UrlKt.FRAGMENT_ENCODE_SET, false));
                }
                sa2 sa2Var = xf8Var.h;
                ReentrantLock reentrantLock = (ReentrantLock) sa2Var.a;
                reentrantLock.lock();
                try {
                    sa2Var.b = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (fi3VarF.g) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                u15.h(xr6VarX0, th2);
                throw th3;
            }
        }
    }

    @Override // defpackage.td5
    public final void u(qr6 qr6Var) {
        qr6Var.getClass();
    }

    @Override // defpackage.td5
    public final void v(qr6 qr6Var) {
        qr6Var.getClass();
        gb4 gb4VarR = i21.r();
        xr6 xr6VarX0 = qr6Var.X0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (xr6VarX0.S0()) {
            try {
                gb4VarR.add(xr6VarX0.p0(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u15.h(xr6VarX0, th);
                    throw th2;
                }
            }
        }
        u15.h(xr6VarX0, null);
        ListIterator listIterator = i21.j(gb4VarR).listIterator(0);
        while (true) {
            o03 o03Var = (o03) listIterator;
            if (!o03Var.hasNext()) {
                return;
            }
            String str = (String) o03Var.next();
            if (mm7.Z(str, false, "room_fts_content_sync_")) {
                nr4.r(qr6Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // defpackage.td5
    public final rl6 w(qr6 qr6Var) {
        qr6Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new x08("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap.put("prerequisite_id", new x08("prerequisite_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new z08("WorkSpec", "CASCADE", "CASCADE", i21.K("work_spec_id"), i21.K("id")));
        linkedHashSet.add(new z08("WorkSpec", "CASCADE", "CASCADE", i21.K("prerequisite_id"), i21.K("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new a18("index_Dependency_work_spec_id", false, i21.K("work_spec_id"), i21.K("ASC")));
        linkedHashSet2.add(new a18("index_Dependency_prerequisite_id", false, i21.K("prerequisite_id"), i21.K("ASC")));
        b18 b18Var = new b18("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        b18 b18VarL = y08.l(qr6Var, "Dependency");
        if (!b18Var.equals(b18VarL)) {
            return new rl6(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + b18Var + "\n Found:\n" + b18VarL);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new x08("id", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("state", new x08("state", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("worker_class_name", new x08("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input_merger_class_name", new x08("input_merger_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input", new x08("input", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("output", new x08("output", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("initial_delay", new x08("initial_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("interval_duration", new x08("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("flex_duration", new x08("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_attempt_count", new x08("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_policy", new x08("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_delay_duration", new x08("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("last_enqueue_time", new x08("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("minimum_retention_duration", new x08("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("schedule_requested_at", new x08("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_in_foreground", new x08("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("out_of_quota_policy", new x08("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("period_count", new x08("period_count", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("generation", new x08("generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("next_schedule_time_override", new x08("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new x08("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("stop_reason", new x08("stop_reason", "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new x08("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new x08("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("required_network_type", new x08("required_network_type", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("required_network_request", new x08("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new x08("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_device_idle", new x08("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_battery_not_low", new x08("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_storage_not_low", new x08("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new x08("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new x08("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("content_uri_triggers", new x08("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new a18("index_WorkSpec_schedule_requested_at", false, i21.K("schedule_requested_at"), i21.K("ASC")));
        linkedHashSet4.add(new a18("index_WorkSpec_last_enqueue_time", false, i21.K("last_enqueue_time"), i21.K("ASC")));
        b18 b18Var2 = new b18("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        b18 b18VarL2 = y08.l(qr6Var, "WorkSpec");
        if (!b18Var2.equals(b18VarL2)) {
            return new rl6(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + b18Var2 + "\n Found:\n" + b18VarL2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new x08("tag", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("work_spec_id", new x08("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new z08("WorkSpec", "CASCADE", "CASCADE", i21.K("work_spec_id"), i21.K("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new a18("index_WorkTag_work_spec_id", false, i21.K("work_spec_id"), i21.K("ASC")));
        b18 b18Var3 = new b18("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        b18 b18VarL3 = y08.l(qr6Var, "WorkTag");
        if (!b18Var3.equals(b18VarL3)) {
            return new rl6(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + b18Var3 + "\n Found:\n" + b18VarL3);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new x08("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("generation", new x08("generation", "INTEGER", true, 2, "0", 1));
        linkedHashMap4.put("system_id", new x08("system_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new z08("WorkSpec", "CASCADE", "CASCADE", i21.K("work_spec_id"), i21.K("id")));
        b18 b18Var4 = new b18("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        b18 b18VarL4 = y08.l(qr6Var, "SystemIdInfo");
        if (!b18Var4.equals(b18VarL4)) {
            return new rl6(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + b18Var4 + "\n Found:\n" + b18VarL4);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new x08("name", "TEXT", true, 1, null, 1));
        linkedHashMap5.put("work_spec_id", new x08("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new z08("WorkSpec", "CASCADE", "CASCADE", i21.K("work_spec_id"), i21.K("id")));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new a18("index_WorkName_work_spec_id", false, i21.K("work_spec_id"), i21.K("ASC")));
        b18 b18Var5 = new b18("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        b18 b18VarL5 = y08.l(qr6Var, "WorkName");
        if (!b18Var5.equals(b18VarL5)) {
            return new rl6(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + b18Var5 + "\n Found:\n" + b18VarL5);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new x08("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap6.put("progress", new x08("progress", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new z08("WorkSpec", "CASCADE", "CASCADE", i21.K("work_spec_id"), i21.K("id")));
        b18 b18Var6 = new b18("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        b18 b18VarL6 = y08.l(qr6Var, "WorkProgress");
        if (!b18Var6.equals(b18VarL6)) {
            return new rl6(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + b18Var6 + "\n Found:\n" + b18VarL6);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new x08("key", "TEXT", true, 1, null, 1));
        linkedHashMap7.put("long_value", new x08("long_value", "INTEGER", false, 0, null, 1));
        b18 b18Var7 = new b18("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        b18 b18VarL7 = y08.l(qr6Var, "Preference");
        if (b18Var7.equals(b18VarL7)) {
            return new rl6(true, (String) null);
        }
        return new rl6(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + b18Var7 + "\n Found:\n" + b18VarL7);
    }
}
