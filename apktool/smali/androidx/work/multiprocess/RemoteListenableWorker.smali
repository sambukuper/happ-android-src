.class public abstract Landroidx/work/multiprocess/RemoteListenableWorker;
.super Lec4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "RemoteListenableWorker"

    .line 2
    .line 3
    invoke-static {v0}, Llh4;->a1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lec4;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final c()Lxb4;
    .locals 4

    .line 1
    const-string p0, "startWork() shouldn\'t never be called on RemoteListenableWorker"

    .line 2
    .line 3
    const-string v0, "RemoteListenableWorker Failed Future"

    .line 4
    .line 5
    new-instance v1, Lqd0;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lif6;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v2, v1, Lqd0;->c:Lif6;

    .line 16
    .line 17
    new-instance v2, Lud0;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Lud0;-><init>(Lqd0;)V

    .line 20
    .line 21
    .line 22
    iput-object v2, v1, Lqd0;->b:Lud0;

    .line 23
    .line 24
    const-class v3, Lp61;

    .line 25
    .line 26
    iput-object v3, v1, Lqd0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    :try_start_0
    invoke-static {}, Llh4;->P0()Llh4;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    invoke-direct {v3, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v3}, Lqd0;->d(Ljava/lang/Throwable;)Z

    .line 41
    .line 42
    .line 43
    iput-object v0, v1, Lqd0;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    return-object v2

    .line 46
    :catch_0
    move-exception p0

    .line 47
    invoke-virtual {v2, p0}, Lud0;->b(Ljava/lang/Throwable;)Z

    .line 48
    .line 49
    .line 50
    return-object v2
.end method

.method public abstract e()Lxb4;
.end method
