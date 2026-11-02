.class public final Lp84;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lc94;
.implements Llg0;


# instance fields
.field public final X:Ljava/lang/Object;

.field public final Y:Lsu/happ/proxyutility/ui/ScannerActivity;

.field public final Z:Ltl0;

.field public f0:Z

.field public g0:Lxy0;


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/ui/ScannerActivity;Ltl0;Ldm6;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p3, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, Lp84;->X:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    iput-boolean p3, p0, Lp84;->f0:Z

    .line 13
    .line 14
    const/4 p3, 0x0

    .line 15
    iput-object p3, p0, Lp84;->g0:Lxy0;

    .line 16
    .line 17
    iput-object p1, p0, Lp84;->Y:Lsu/happ/proxyutility/ui/ScannerActivity;

    .line 18
    .line 19
    iput-object p2, p0, Lp84;->Z:Ltl0;

    .line 20
    .line 21
    iget-object p1, p1, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 22
    .line 23
    iget-object p3, p1, Lg94;->i:Lo84;

    .line 24
    .line 25
    sget-object v0, Lo84;->f0:Lo84;

    .line 26
    .line 27
    invoke-virtual {p3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    if-ltz p3, :cond_0

    .line 32
    .line 33
    invoke-virtual {p2}, Ltl0;->k()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p2}, Ltl0;->w()V

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-virtual {p1, p0}, Lg94;->a(Lc94;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final c()Lxi0;
    .locals 0

    .line 1
    iget-object p0, p0, Lp84;->Z:Ltl0;

    .line 2
    .line 3
    iget-object p0, p0, Ltl0;->X:Lb7;

    .line 4
    .line 5
    iget-object p0, p0, Lb7;->Y:La7;

    .line 6
    .line 7
    return-object p0
.end method

.method public final d(Lxy0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lp84;->X:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lp84;->g0:Lxy0;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lp84;->g0:Lxy0;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v2, p0, Lp84;->g0:Lxy0;

    .line 16
    .line 17
    iget-object v2, v2, Lxy0;->h0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ljava/util/List;

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p1, Lxy0;->h0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    new-instance v2, Lxy0;

    .line 32
    .line 33
    iget-object v3, p1, Lxy0;->Y:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Ljava/util/List;

    .line 36
    .line 37
    invoke-direct {v2, v1, v3}, Lxy0;-><init>(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Lp84;->g0:Lxy0;

    .line 41
    .line 42
    :goto_0
    iget-object v1, p0, Lp84;->Z:Ltl0;

    .line 43
    .line 44
    iget-object v1, v1, Ltl0;->m0:Ljava/lang/Object;

    .line 45
    .line 46
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 48
    :try_start_2
    iget-object v1, p0, Lp84;->Z:Ltl0;

    .line 49
    .line 50
    iget-object v2, p1, Lxy0;->Y:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/util/List;

    .line 53
    .line 54
    iget-object v3, v1, Ltl0;->m0:Ljava/lang/Object;

    .line 55
    .line 56
    monitor-enter v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    :try_start_3
    iput-object v2, v1, Ltl0;->j0:Ljava/util/List;

    .line 58
    .line 59
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 60
    :try_start_4
    iget-object v1, p0, Lp84;->Z:Ltl0;

    .line 61
    .line 62
    iget-object v1, v1, Ltl0;->m0:Ljava/lang/Object;

    .line 63
    .line 64
    monitor-enter v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 65
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 66
    :try_start_6
    iget-object v1, p0, Lp84;->Z:Ltl0;

    .line 67
    .line 68
    iget-object v2, p1, Lxy0;->Z:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Landroid/util/Range;

    .line 71
    .line 72
    iget-object v3, v1, Ltl0;->m0:Ljava/lang/Object;

    .line 73
    .line 74
    monitor-enter v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 75
    :try_start_7
    iput-object v2, v1, Ltl0;->k0:Landroid/util/Range;

    .line 76
    .line 77
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 78
    :try_start_8
    invoke-virtual {p0}, Lp84;->c()Lxi0;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Laj0;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {v1, p1}, Lg55;->w(Laj0;Lxy0;)Ljf6;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v2, p1, Lxy0;->j0:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 94
    .line 95
    new-instance v3, Lsc;

    .line 96
    .line 97
    const/16 v4, 0x1d

    .line 98
    .line 99
    invoke-direct {v3, v1, p1, v4}, Lsc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, Lp84;->Z:Ltl0;

    .line 106
    .line 107
    iget-object p1, p1, Lxy0;->h0:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p1, Ljava/util/List;

    .line 110
    .line 111
    invoke-virtual {p0, p1, v1}, Ltl0;->d(Ljava/util/Collection;Ljf6;)V

    .line 112
    .line 113
    .line 114
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 115
    return-void

    .line 116
    :catchall_1
    move-exception p0

    .line 117
    :try_start_9
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 118
    :try_start_a
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 119
    :catchall_2
    move-exception p0

    .line 120
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 121
    :try_start_c
    throw p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 122
    :catchall_3
    move-exception p0

    .line 123
    :try_start_d
    monitor-exit v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 124
    :try_start_e
    throw p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 125
    :catchall_4
    move-exception p0

    .line 126
    :try_start_f
    monitor-exit v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 127
    :try_start_10
    throw p0

    .line 128
    :goto_1
    monitor-exit v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 129
    throw p0
.end method

.method public final f()Ld94;
    .locals 1

    .line 1
    iget-object v0, p0, Lp84;->X:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lp84;->Y:Lsu/happ/proxyutility/ui/ScannerActivity;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object p0

    .line 8
    :catchall_0
    move-exception p0

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p0
.end method

.method public final i()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lp84;->X:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lp84;->Z:Ltl0;

    .line 5
    .line 6
    invoke-virtual {p0}, Ltl0;->A()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    monitor-exit v0

    .line 15
    return-object p0

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

.method public onDestroy(Ld94;)V
    .locals 1
    .annotation runtime Lqa5;
        value = .enum Ln84;->ON_DESTROY:Ln84;
    .end annotation

    .line 1
    iget-object p1, p0, Lp84;->X:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-object p0, p0, Lp84;->Z:Ltl0;

    .line 5
    .line 6
    invoke-virtual {p0}, Ltl0;->A()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ltl0;->C(Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    monitor-exit p1

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p0
.end method

.method public onPause(Ld94;)V
    .locals 0
    .annotation runtime Lqa5;
        value = .enum Ln84;->ON_PAUSE:Ln84;
    .end annotation

    .line 1
    const/4 p1, 0x0

    .line 2
    iget-object p0, p0, Lp84;->Z:Ltl0;

    .line 3
    .line 4
    iget-object p0, p0, Ltl0;->X:Lb7;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lb7;->l(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume(Ld94;)V
    .locals 0
    .annotation runtime Lqa5;
        value = .enum Ln84;->ON_RESUME:Ln84;
    .end annotation

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object p0, p0, Lp84;->Z:Ltl0;

    .line 3
    .line 4
    iget-object p0, p0, Ltl0;->X:Lb7;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lb7;->l(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onStart(Ld94;)V
    .locals 1
    .annotation runtime Lqa5;
        value = .enum Ln84;->ON_START:Ln84;
    .end annotation

    .line 1
    iget-object p1, p0, Lp84;->X:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-boolean v0, p0, Lp84;->f0:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lp84;->Z:Ltl0;

    .line 9
    .line 10
    invoke-virtual {p0}, Ltl0;->k()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    monitor-exit p1

    .line 17
    return-void

    .line 18
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p0
.end method

.method public onStop(Ld94;)V
    .locals 1
    .annotation runtime Lqa5;
        value = .enum Ln84;->ON_STOP:Ln84;
    .end annotation

    .line 1
    iget-object p1, p0, Lp84;->X:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-boolean v0, p0, Lp84;->f0:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lp84;->Z:Ltl0;

    .line 9
    .line 10
    invoke-virtual {p0}, Ltl0;->w()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    monitor-exit p1

    .line 17
    return-void

    .line 18
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p0
.end method

.method public final t()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp84;->X:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lp84;->f0:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lp84;->Y:Lsu/happ/proxyutility/ui/ScannerActivity;

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lp84;->onStop(Ld94;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, p0, Lp84;->f0:Z

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
.end method

.method public final u()V
    .locals 4

    .line 1
    iget-object v0, p0, Lp84;->X:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lp84;->Z:Ltl0;

    .line 5
    .line 6
    invoke-virtual {v1}, Ltl0;->A()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p0, Lp84;->Z:Ltl0;

    .line 11
    .line 12
    move-object v3, v1

    .line 13
    check-cast v3, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Ltl0;->C(Ljava/util/ArrayList;)V

    .line 16
    .line 17
    .line 18
    check-cast v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lhq8;

    .line 35
    .line 36
    invoke-virtual {v2}, Lhq8;->n()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    iget-object v2, v2, Lhq8;->c:Ljava/lang/Object;

    .line 43
    .line 44
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 45
    :try_start_1
    monitor-exit v2

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    :try_start_2
    throw p0

    .line 50
    :cond_1
    const/4 v1, 0x0

    .line 51
    iput-object v1, p0, Lp84;->g0:Lxy0;

    .line 52
    .line 53
    monitor-exit v0

    .line 54
    return-void

    .line 55
    :catchall_1
    move-exception p0

    .line 56
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 57
    throw p0
.end method

.method public final v()V
    .locals 4

    .line 1
    iget-object v0, p0, Lp84;->X:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lp84;->f0:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, Lp84;->f0:Z

    .line 14
    .line 15
    iget-object v2, p0, Lp84;->Y:Lsu/happ/proxyutility/ui/ScannerActivity;

    .line 16
    .line 17
    iget-object v2, v2, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 18
    .line 19
    iget-object v2, v2, Lg94;->i:Lo84;

    .line 20
    .line 21
    sget-object v3, Lo84;->f0:Lo84;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ltz v2, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    :cond_1
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v1, p0, Lp84;->Y:Lsu/happ/proxyutility/ui/ScannerActivity;

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lp84;->onStart(Ld94;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p0
.end method
