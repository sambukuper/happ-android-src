.class public final Ldk2;
.super Lta8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:Lta8;


# direct methods
.method public constructor <init>(Lta8;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldk2;->a:Lta8;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final awaitSignal(Ljava/util/concurrent/locks/Condition;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldk2;->a:Lta8;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lta8;->awaitSignal(Ljava/util/concurrent/locks/Condition;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final clearDeadline()Lta8;
    .locals 0

    .line 1
    iget-object p0, p0, Ldk2;->a:Lta8;

    .line 2
    .line 3
    invoke-virtual {p0}, Lta8;->clearDeadline()Lta8;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final clearTimeout()Lta8;
    .locals 0

    .line 1
    iget-object p0, p0, Ldk2;->a:Lta8;

    .line 2
    .line 3
    invoke-virtual {p0}, Lta8;->clearTimeout()Lta8;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final deadlineNanoTime()J
    .locals 2

    .line 1
    iget-object p0, p0, Ldk2;->a:Lta8;

    .line 2
    .line 3
    invoke-virtual {p0}, Lta8;->deadlineNanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final deadlineNanoTime(J)Lta8;
    .locals 0

    .line 8
    iget-object p0, p0, Ldk2;->a:Lta8;

    invoke-virtual {p0, p1, p2}, Lta8;->deadlineNanoTime(J)Lta8;

    move-result-object p0

    return-object p0
.end method

.method public final hasDeadline()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldk2;->a:Lta8;

    .line 2
    .line 3
    invoke-virtual {p0}, Lta8;->hasDeadline()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final throwIfReached()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldk2;->a:Lta8;

    .line 2
    .line 3
    invoke-virtual {p0}, Lta8;->throwIfReached()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final timeout(JLjava/util/concurrent/TimeUnit;)Lta8;
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldk2;->a:Lta8;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lta8;->timeout(JLjava/util/concurrent/TimeUnit;)Lta8;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final timeoutNanos()J
    .locals 2

    .line 1
    iget-object p0, p0, Ldk2;->a:Lta8;

    .line 2
    .line 3
    invoke-virtual {p0}, Lta8;->timeoutNanos()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final waitUntilNotified(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldk2;->a:Lta8;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lta8;->waitUntilNotified(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
