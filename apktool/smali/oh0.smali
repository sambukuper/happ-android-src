.class public final Loh0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lqh0;


# instance fields
.field public final b:Lqj0;

.field public final c:Lpd2;

.field public final d:Luc8;

.field public final e:Ldj4;

.field public final f:Lt79;

.field public final g:Lxe0;


# direct methods
.method public constructor <init>(Lqj0;Lx32;Lpd2;Ldh2;Ltj7;Luc8;Ldj4;Lr79;Lt79;Lxe0;Llr8;Lpr8;Lnv8;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Loh0;->b:Lqj0;

    .line 44
    .line 45
    iput-object p3, p0, Loh0;->c:Lpd2;

    .line 46
    .line 47
    iput-object p6, p0, Loh0;->d:Luc8;

    .line 48
    .line 49
    iput-object p7, p0, Loh0;->e:Ldj4;

    .line 50
    .line 51
    iput-object p9, p0, Loh0;->f:Lt79;

    .line 52
    .line 53
    iput-object p10, p0, Loh0;->g:Lxe0;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, Loh0;->f:Lt79;

    .line 2
    .line 3
    invoke-interface {p0}, Lt79;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Lb57;)V
    .locals 0

    .line 1
    iget-object p0, p0, Loh0;->f:Lt79;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lt79;->b(Lb57;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Ll11;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Loh0;->g:Lxe0;

    .line 5
    .line 6
    new-instance v0, Lfg0;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-direct {v0, v1}, Lfg0;-><init>(B)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljn0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, v0, p1, v2}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v1}, Ll11;->g(Ljn0;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, v0, Lfg0;->Y:Lk05;

    .line 22
    .line 23
    invoke-static {p1}, Lqd5;->c(Ll11;)Lqd5;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lxe0;->a:Lye0;

    .line 31
    .line 32
    iget-object v1, v0, Lye0;->X:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter v1

    .line 35
    :try_start_0
    invoke-interface {p1}, Ll11;->b()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Lzx;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v4, v0, Lye0;->Z:Lfg0;

    .line 59
    .line 60
    iget-object v4, v4, Lfg0;->Y:Lk05;

    .line 61
    .line 62
    sget-object v5, Lk11;->X:Lk11;

    .line 63
    .line 64
    invoke-interface {p1, v3}, Ll11;->d(Lzx;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v4, v3, v5, v6}, Lk05;->l(Lzx;Lk11;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    goto :goto_2

    .line 74
    :cond_0
    monitor-exit v1

    .line 75
    const-string p1, "addCaptureRequestOptions"

    .line 76
    .line 77
    iget-object v0, p0, Lxe0;->a:Lye0;

    .line 78
    .line 79
    iget-object p0, p0, Lxe0;->d:Lqq8;

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    invoke-virtual {v0, p0, v1}, Lye0;->a(Lqq8;Z)Lux0;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    new-instance v0, Lqd0;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    new-instance v1, Lif6;

    .line 92
    .line 93
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object v1, v0, Lqd0;->c:Lif6;

    .line 97
    .line 98
    new-instance v1, Lud0;

    .line 99
    .line 100
    invoke-direct {v1, v0}, Lud0;-><init>(Lqd0;)V

    .line 101
    .line 102
    .line 103
    iput-object v1, v0, Lqd0;->b:Lud0;

    .line 104
    .line 105
    const-class v2, Lp61;

    .line 106
    .line 107
    iput-object v2, v0, Lqd0;->a:Ljava/lang/Object;

    .line 108
    .line 109
    :try_start_1
    new-instance v2, Lp0;

    .line 110
    .line 111
    const/16 v3, 0xc

    .line 112
    .line 113
    invoke-direct {v2, v0, p0, v3}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v2}, Lrm3;->D(Lgn2;)Lgq1;

    .line 117
    .line 118
    .line 119
    iput-object p1, v0, Lqd0;->a:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catch_0
    move-exception p0

    .line 123
    invoke-virtual {v1, p0}, Lud0;->b(Ljava/lang/Throwable;)Z

    .line 124
    .line 125
    .line 126
    :goto_1
    invoke-static {v1}, Lvr3;->P(Lxb4;)Lxb4;

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :goto_2
    monitor-exit v1

    .line 131
    throw p0
.end method

.method public final d(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Loh0;->c:Lpd2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, Lpd2;->c(IZ)Lux0;

    .line 5
    .line 6
    .line 7
    if-eq p1, v1, :cond_1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :cond_1
    :goto_0
    iget-object p0, p0, Loh0;->f:Lt79;

    .line 14
    .line 15
    invoke-interface {p0, v1}, Lt79;->c(Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final e(Lv53;)V
    .locals 0

    .line 1
    iget-object p0, p0, Loh0;->c:Lpd2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Z)Lxb4;
    .locals 5

    .line 1
    sget-object v0, Ljj0;->h:Lij0;

    .line 2
    .line 3
    iget-object v1, p0, Loh0;->b:Lqj0;

    .line 4
    .line 5
    iget-object v1, v1, Lqj0;->b:Ljj0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v1, Llf0;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, [I

    .line 25
    .line 26
    const/4 v1, 0x6

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v0, v1}, Leu;->a0([II)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    :goto_0
    const/4 v2, 0x1

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Loh0;->e:Ldj4;

    .line 39
    .line 40
    iget-object v0, v0, Ldj4;->f:Lyz4;

    .line 41
    .line 42
    invoke-virtual {v0}, Lqc4;->d()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/lang/Integer;

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v3, -0x1

    .line 56
    if-eq v0, v3, :cond_2

    .line 57
    .line 58
    :goto_1
    const-string p0, "CXCP"

    .line 59
    .line 60
    invoke-static {p0}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string p1, "Torch can not be enabled/disable when low-light boost is on!"

    .line 66
    .line 67
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance p1, Lu73;

    .line 71
    .line 72
    invoke-direct {p1, p0, v2}, Lu73;-><init>(Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_2
    iget-object p0, p0, Loh0;->d:Luc8;

    .line 77
    .line 78
    invoke-static {p0, p1, v1}, Luc8;->a(Luc8;ZI)Lux0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const-string p1, "Deferred.asListenableFuture"

    .line 83
    .line 84
    new-instance v0, Lqd0;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    new-instance v1, Lif6;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object v1, v0, Lqd0;->c:Lif6;

    .line 95
    .line 96
    new-instance v1, Lud0;

    .line 97
    .line 98
    invoke-direct {v1, v0}, Lud0;-><init>(Lqd0;)V

    .line 99
    .line 100
    .line 101
    iput-object v1, v0, Lqd0;->b:Lud0;

    .line 102
    .line 103
    const-class v3, Lp61;

    .line 104
    .line 105
    iput-object v3, v0, Lqd0;->a:Ljava/lang/Object;

    .line 106
    .line 107
    :try_start_0
    new-instance v3, Lp0;

    .line 108
    .line 109
    const/16 v4, 0xc

    .line 110
    .line 111
    invoke-direct {v3, v0, p0, v4}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v3}, Lrm3;->D(Lgn2;)Lgq1;

    .line 115
    .line 116
    .line 117
    iput-object p1, v0, Lqd0;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :catch_0
    move-exception p0

    .line 121
    invoke-virtual {v1, p0}, Lud0;->b(Ljava/lang/Throwable;)Z

    .line 122
    .line 123
    .line 124
    :goto_2
    invoke-static {v1}, Lyo2;->b(Lxb4;)Lyo2;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    new-instance p1, Lb61;

    .line 129
    .line 130
    invoke-direct {p1, v2}, Lb61;-><init>(B)V

    .line 131
    .line 132
    .line 133
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    new-instance v1, Lvk1;

    .line 138
    .line 139
    const/16 v2, 0xd

    .line 140
    .line 141
    invoke-direct {v1, p1, v2}, Lvk1;-><init>(Ljava/lang/Object;B)V

    .line 142
    .line 143
    .line 144
    invoke-static {p0, v1, v0}, Lvr3;->g0(Lxb4;Lvu;Ljava/util/concurrent/Executor;)Lzo0;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, Lvr3;->P(Lxb4;)Lxb4;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0
.end method

.method public final g()Ll11;
    .locals 4

    .line 1
    iget-object p0, p0, Loh0;->g:Lxe0;

    .line 2
    .line 3
    iget-object p0, p0, Lxe0;->a:Lye0;

    .line 4
    .line 5
    iget-object v0, p0, Lye0;->X:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object p0, p0, Lye0;->Z:Lfg0;

    .line 9
    .line 10
    invoke-virtual {p0}, Lfg0;->a()Lgg0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v1, Lfg0;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v1, v2}, Lfg0;-><init>(B)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljn0;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v2, v1, p0, v3}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v2}, Ll11;->g(Ljn0;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Lwl6;

    .line 30
    .line 31
    iget-object v1, v1, Lfg0;->Y:Lk05;

    .line 32
    .line 33
    invoke-static {v1}, Lqd5;->c(Ll11;)Lqd5;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/16 v2, 0x12

    .line 38
    .line 39
    invoke-direct {p0, v1, v2}, Lwl6;-><init>(Ljava/lang/Object;B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    monitor-exit v0

    .line 43
    return-object p0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    monitor-exit v0

    .line 46
    throw p0
.end method

.method public final h()V
    .locals 5

    .line 1
    iget-object p0, p0, Loh0;->g:Lxe0;

    .line 2
    .line 3
    iget-object v0, p0, Lxe0;->a:Lye0;

    .line 4
    .line 5
    iget-object v1, v0, Lye0;->X:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    new-instance v2, Lfg0;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, v3}, Lfg0;-><init>(B)V

    .line 12
    .line 13
    .line 14
    iput-object v2, v0, Lye0;->Z:Lfg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    monitor-exit v1

    .line 17
    const-string v0, "clearCaptureRequestOptions"

    .line 18
    .line 19
    iget-object v1, p0, Lxe0;->a:Lye0;

    .line 20
    .line 21
    iget-object p0, p0, Lxe0;->d:Lqq8;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, p0, v2}, Lye0;->a(Lqq8;Z)Lux0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v1, Lqd0;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lif6;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v2, v1, Lqd0;->c:Lif6;

    .line 39
    .line 40
    new-instance v2, Lud0;

    .line 41
    .line 42
    invoke-direct {v2, v1}, Lud0;-><init>(Lqd0;)V

    .line 43
    .line 44
    .line 45
    iput-object v2, v1, Lqd0;->b:Lud0;

    .line 46
    .line 47
    const-class v3, Lp61;

    .line 48
    .line 49
    iput-object v3, v1, Lqd0;->a:Ljava/lang/Object;

    .line 50
    .line 51
    :try_start_1
    new-instance v3, Lp0;

    .line 52
    .line 53
    const/16 v4, 0xc

    .line 54
    .line 55
    invoke-direct {v3, v1, p0, v4}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v3}, Lrm3;->D(Lgn2;)Lgq1;

    .line 59
    .line 60
    .line 61
    iput-object v0, v1, Lqd0;->a:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    move-exception p0

    .line 65
    invoke-virtual {v2, p0}, Lud0;->b(Ljava/lang/Throwable;)Z

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-static {v2}, Lvr3;->P(Lxb4;)Lxb4;

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    monitor-exit v1

    .line 74
    throw p0
.end method
