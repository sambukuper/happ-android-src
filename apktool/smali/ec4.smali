.class public abstract Lec4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroidx/work/WorkerParameters;

.field public final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    const/16 v1, -0x100

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lec4;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    iput-object p1, p0, Lec4;->a:Landroid/content/Context;

    .line 19
    .line 20
    iput-object p2, p0, Lec4;->b:Landroidx/work/WorkerParameters;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "WorkerParameters is null"

    .line 24
    .line 25
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1
    const-string p0, "Application Context is null"

    .line 30
    .line 31
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method


# virtual methods
.method public a()Lxb4;
    .locals 4

    .line 1
    const-string p0, "default failing getForegroundInfoAsync"

    .line 2
    .line 3
    new-instance v0, Lqd0;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lif6;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, v0, Lqd0;->c:Lif6;

    .line 14
    .line 15
    new-instance v1, Lud0;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lud0;-><init>(Lqd0;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, Lqd0;->b:Lud0;

    .line 21
    .line 22
    const-class v2, Lp61;

    .line 23
    .line 24
    iput-object v2, v0, Lqd0;->a:Ljava/lang/Object;

    .line 25
    .line 26
    :try_start_0
    const-string v2, "Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"

    .line 27
    .line 28
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    invoke-direct {v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v3}, Lqd0;->d(Ljava/lang/Throwable;)Z

    .line 34
    .line 35
    .line 36
    iput-object p0, v0, Lqd0;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    return-object v1

    .line 39
    :catch_0
    move-exception p0

    .line 40
    invoke-virtual {v1, p0}, Lud0;->b(Ljava/lang/Throwable;)Z

    .line 41
    .line 42
    .line 43
    return-object v1
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public c()Lxb4;
    .locals 3

    .line 1
    iget-object v0, p0, Lec4;->b:Landroidx/work/WorkerParameters;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/work/WorkerParameters;->f:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Lv38;

    .line 6
    .line 7
    const/16 v2, 0xc

    .line 8
    .line 9
    invoke-direct {v1, p0, v2}, Lv38;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Ljn0;

    .line 13
    .line 14
    const/16 v2, 0x12

    .line 15
    .line 16
    invoke-direct {p0, v0, v1, v2}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lu15;->u(Lsd0;)Lud0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final d(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lec4;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/16 v1, -0x100

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lec4;->b()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
