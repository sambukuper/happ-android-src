package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dk2 extends ta8 {
    public ta8 a;

    public dk2(ta8 ta8Var) {
        ta8Var.getClass();
        this.a = ta8Var;
    }

    @Override // defpackage.ta8
    public final void awaitSignal(Condition condition) throws InterruptedIOException {
        condition.getClass();
        this.a.awaitSignal(condition);
    }

    @Override // defpackage.ta8
    public final ta8 clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override // defpackage.ta8
    public final ta8 clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override // defpackage.ta8
    public final long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override // defpackage.ta8
    public final boolean hasDeadline() {
        return this.a.hasDeadline();
    }

    @Override // defpackage.ta8
    public final void throwIfReached() throws IOException {
        this.a.throwIfReached();
    }

    @Override // defpackage.ta8
    public final ta8 timeout(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a.timeout(j, timeUnit);
    }

    @Override // defpackage.ta8
    public final long timeoutNanos() {
        return this.a.timeoutNanos();
    }

    @Override // defpackage.ta8
    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        obj.getClass();
        this.a.waitUntilNotified(obj);
    }

    @Override // defpackage.ta8
    public final ta8 deadlineNanoTime(long j) {
        return this.a.deadlineNanoTime(j);
    }
}
