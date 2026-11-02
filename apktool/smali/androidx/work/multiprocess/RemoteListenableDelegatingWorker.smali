.class public final Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;
.super Lec4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;",
        "Lec4;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "work-multiprocess"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final e:Landroid/content/Context;

.field public final f:Landroidx/work/WorkerParameters;

.field public final g:Ljc4;

.field public h:Landroid/content/ComponentName;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lec4;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->e:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->f:Landroidx/work/WorkerParameters;

    .line 13
    .line 14
    new-instance v0, Ljc4;

    .line 15
    .line 16
    iget-object p2, p2, Landroidx/work/WorkerParameters;->f:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Ljc4;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->g:Ljc4;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()Lxb4;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->e:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lx39;->v0(Landroid/content/Context;)Lx39;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lx39;->l0:Ly5;

    .line 15
    .line 16
    iget-object v0, v0, Ly5;->Z:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lu61;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v1, Lxy7;->a:Lm51;

    .line 24
    .line 25
    new-instance v1, Lgd6;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v1, p0, v2, p0, v3}, Lgd6;-><init>(Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;Lq51;Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;B)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    invoke-static {v0, p0, v1}, Lxy7;->a(Ls61;ZLrn2;)Lwy7;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->h:Landroid/content/ComponentName;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lo61;

    .line 6
    .line 7
    const/16 v2, 0x15

    .line 8
    .line 9
    invoke-direct {v1, p0, v2}, Lo61;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->g:Ljc4;

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Ljc4;->a(Landroid/content/ComponentName;Lbd6;)Lwy7;

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final c()Lxb4;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->e:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lx39;->v0(Landroid/content/Context;)Lx39;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lx39;->l0:Ly5;

    .line 15
    .line 16
    iget-object v0, v0, Ly5;->Z:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lu61;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v1, Lxy7;->a:Lm51;

    .line 24
    .line 25
    new-instance v1, Lgd6;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-direct {v1, p0, v2, p0, v3}, Lgd6;-><init>(Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;Lq51;Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v3, v1}, Lxy7;->a(Ls61;ZLrn2;)Lwy7;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
