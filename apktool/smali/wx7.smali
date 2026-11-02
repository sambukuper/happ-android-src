.class public final Lwx7;
.super Lwg1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final n:Lud0;

.field public final o:Lqd0;

.field public p:Lwg1;

.field public q:Lby7;


# direct methods
.method public constructor <init>(ILandroid/util/Size;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lwg1;-><init>(ILandroid/util/Size;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lqd0;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p2, Lif6;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p1, Lqd0;->c:Lif6;

    .line 15
    .line 16
    new-instance p2, Lud0;

    .line 17
    .line 18
    invoke-direct {p2, p1}, Lud0;-><init>(Lqd0;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p1, Lqd0;->b:Lud0;

    .line 22
    .line 23
    const-class v0, Lp61;

    .line 24
    .line 25
    iput-object v0, p1, Lqd0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    :try_start_0
    iput-object p1, p0, Lwx7;->o:Lqd0;

    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "SettableFuture hashCode: "

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p1, Lqd0;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception p1

    .line 51
    invoke-virtual {p2, p1}, Lud0;->b(Ljava/lang/Throwable;)Z

    .line 52
    .line 53
    .line 54
    :goto_0
    iput-object p2, p0, Lwx7;->n:Lud0;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    invoke-super {p0}, Lwg1;->a()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ltx7;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, v1}, Ltx7;-><init>(Lwx7;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Ls08;->g(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final f()Lxb4;
    .locals 0

    .line 1
    iget-object p0, p0, Lwx7;->n:Lud0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g(Lwg1;Ljava/lang/Runnable;)Z
    .locals 10

    .line 1
    const-string v0, ")"

    .line 2
    .line 3
    const-string v1, ") must match the parent("

    .line 4
    .line 5
    iget-object v2, p0, Lwg1;->h:Landroid/util/Size;

    .line 6
    .line 7
    invoke-static {}, Ls08;->b()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget v3, p1, Lwg1;->i:I

    .line 14
    .line 15
    iget-object v4, p1, Lwg1;->h:Landroid/util/Size;

    .line 16
    .line 17
    iget-object v5, p0, Lwx7;->p:Lwg1;

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    if-ne v5, p1, :cond_0

    .line 21
    .line 22
    return v6

    .line 23
    :cond_0
    const/4 v7, 0x1

    .line 24
    if-nez v5, :cond_1

    .line 25
    .line 26
    move v5, v7

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v5, v6

    .line 29
    :goto_0
    const-string v8, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider"

    .line 30
    .line 31
    invoke-static {v8, v5}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v4}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    new-instance v8, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v9, "The provider\'s size("

    .line 41
    .line 42
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v5, v2}, Lmb6;->o(ZLjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget v2, p0, Lwg1;->i:I

    .line 65
    .line 66
    if-ne v2, v3, :cond_2

    .line 67
    .line 68
    move v6, v7

    .line 69
    :cond_2
    const-string v4, "The provider\'s format("

    .line 70
    .line 71
    invoke-static {v2, v4, v3, v1, v0}, Lpc6;->k(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v6, v0}, Lmb6;->o(ZLjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lwg1;->a:Ljava/lang/Object;

    .line 79
    .line 80
    monitor-enter v0

    .line 81
    :try_start_0
    iget-boolean v1, p0, Lwg1;->c:Z

    .line 82
    .line 83
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    xor-int/lit8 v0, v1, 0x1

    .line 85
    .line 86
    const-string v1, "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider."

    .line 87
    .line 88
    invoke-static {v1, v0}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, Lwx7;->p:Lwg1;

    .line 92
    .line 93
    invoke-virtual {p1}, Lwg1;->c()Lxb4;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v1, p0, Lwx7;->o:Lqd0;

    .line 98
    .line 99
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {v7, v0, v1, v2}, Lvr3;->T(ZLxb4;Lqd0;Ldp1;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lwg1;->d()V

    .line 107
    .line 108
    .line 109
    iget-object p0, p0, Lwg1;->e:Lud0;

    .line 110
    .line 111
    invoke-static {p0}, Lvr3;->P(Lxb4;)Lxb4;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    new-instance v0, Ltg1;

    .line 116
    .line 117
    const/4 v1, 0x2

    .line 118
    invoke-direct {v0, p1, v1}, Ltg1;-><init>(Lwg1;B)V

    .line 119
    .line 120
    .line 121
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-interface {p0, v0, v1}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 126
    .line 127
    .line 128
    iget-object p0, p1, Lwg1;->g:Lud0;

    .line 129
    .line 130
    invoke-static {p0}, Lvr3;->P(Lxb4;)Lxb4;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-interface {p0, p2, p1}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 139
    .line 140
    .line 141
    return v7

    .line 142
    :catchall_0
    move-exception p0

    .line 143
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    throw p0
.end method
