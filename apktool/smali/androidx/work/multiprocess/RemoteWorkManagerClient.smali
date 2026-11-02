.class public Landroidx/work/multiprocess/RemoteWorkManagerClient;
.super Lpd6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final j:Lkp5;


# instance fields
.field public a:Lqd6;

.field public final b:Landroid/content/Context;

.field public final c:Lx39;

.field public final d:Lh37;

.field public final e:Ljava/lang/Object;

.field public volatile f:J

.field public final g:I

.field public final h:Lyr2;

.field public final i:Lrd6;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "RemoteWorkManagerClient"

    .line 2
    .line 3
    invoke-static {v0}, Llh4;->a1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkp5;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lkp5;-><init>(B)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->j:Lkp5;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lx39;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->b:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->c:Lx39;

    .line 11
    .line 12
    iget-object p1, p2, Lx39;->l0:Ly5;

    .line 13
    .line 14
    iget-object p1, p1, Ly5;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lh37;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->d:Lh37;

    .line 19
    .line 20
    new-instance p1, Ljava/lang/Object;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->e:Ljava/lang/Object;

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->a:Lqd6;

    .line 29
    .line 30
    new-instance p1, Lrd6;

    .line 31
    .line 32
    invoke-direct {p1, p0}, Lrd6;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->i:Lrd6;

    .line 36
    .line 37
    iget-object p1, p2, Lx39;->j0:Lxy0;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const p2, 0x927c0

    .line 43
    .line 44
    .line 45
    iput p2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->g:I

    .line 46
    .line 47
    iget-object p1, p1, Lxy0;->h0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lyr2;

    .line 50
    .line 51
    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->h:Lyr2;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lwy7;
    .locals 2

    .line 1
    new-instance v0, Ljh0;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p1, v1}, Ljh0;-><init>(Ljava/lang/String;B)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->e(Lbd6;)Lwy7;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->j:Lkp5;

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->d:Lh37;

    .line 14
    .line 15
    invoke-static {p1, v0, p0}, Lkm4;->d0(Lwy7;Lzn2;Ljava/util/concurrent/Executor;)Lwy7;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final b(Ljava/lang/String;Lfl5;)Lwy7;
    .locals 2

    .line 1
    new-instance v0, Ljn0;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, p2, p1, v1}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->e(Lbd6;)Lwy7;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object p2, Landroidx/work/multiprocess/RemoteWorkManagerClient;->j:Lkp5;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->d:Lh37;

    .line 15
    .line 16
    invoke-static {p1, p2, p0}, Lkm4;->d0(Lwy7;Lzn2;Ljava/util/concurrent/Executor;)Lwy7;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Llh4;->P0()Llh4;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->a:Lqd6;

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p0
.end method

.method public final e(Lbd6;)Lwy7;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->b:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, Landroid/content/Intent;

    .line 4
    .line 5
    const-class v2, Landroidx/work/multiprocess/RemoteWorkManagerService;

    .line 6
    .line 7
    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->e:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-wide v2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->f:J

    .line 14
    .line 15
    const-wide/16 v4, 0x1

    .line 16
    .line 17
    add-long/2addr v2, v4

    .line 18
    iput-wide v2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->f:J

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->a:Lqd6;

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    invoke-static {}, Llh4;->P0()Llh4;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v2, Lqd6;

    .line 32
    .line 33
    invoke-direct {v2, p0}, Lqd6;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->a:Lqd6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    .line 38
    :try_start_1
    iget-object v3, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->b:Landroid/content/Context;

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    invoke-virtual {v3, v1, v2, v4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->a:Lqd6;

    .line 48
    .line 49
    new-instance v2, Ljava/lang/RuntimeException;

    .line 50
    .line 51
    const-string v3, "Unable to bind to service"

    .line 52
    .line 53
    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Llh4;->P0()Llh4;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v1, v1, Lqd6;->a:Lr57;

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Lr57;->h(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v1

    .line 70
    :try_start_2
    iget-object v2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->a:Lqd6;

    .line 71
    .line 72
    invoke-static {}, Llh4;->P0()Llh4;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v2, v2, Lqd6;->a:Lr57;

    .line 80
    .line 81
    invoke-virtual {v2, v1}, Lr57;->h(Ljava/lang/Throwable;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_1
    move-exception p0

    .line 86
    goto :goto_1

    .line 87
    :cond_0
    :goto_0
    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->h:Lyr2;

    .line 88
    .line 89
    iget-object v2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->i:Lrd6;

    .line 90
    .line 91
    iget-object v1, v1, Lyr2;->Y:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Landroid/os/Handler;

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->a:Lqd6;

    .line 99
    .line 100
    iget-object v1, v1, Lqd6;->a:Lr57;

    .line 101
    .line 102
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 103
    new-instance v0, Lsc4;

    .line 104
    .line 105
    const/16 v2, 0x8

    .line 106
    .line 107
    invoke-direct {v0, p0, v1, v2}, Lsc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    iget-object v2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->d:Lh37;

    .line 111
    .line 112
    invoke-virtual {v1, v0, v2}, Lr1;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v2, v1, p1}, Lnr4;->s(Ljava/util/concurrent/Executor;Lxb4;Lbd6;)Lwy7;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    new-instance v0, Lc1;

    .line 120
    .line 121
    const/16 v1, 0x1d

    .line 122
    .line 123
    invoke-direct {v0, p0, v1}, Lc1;-><init>(Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    iget-object p0, p1, Lwy7;->Y:Lif6;

    .line 127
    .line 128
    invoke-virtual {p0, v0, v2}, Lu2;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 129
    .line 130
    .line 131
    return-object p1

    .line 132
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 133
    throw p0
.end method
