.class public final Lhu2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxw6;
.implements Lha5;
.implements Lp52;


# instance fields
.field public final X:Landroid/content/Context;

.field public final Y:Ljava/util/HashMap;

.field public final Z:Lmh1;

.field public f0:Z

.field public final g0:Ljava/lang/Object;

.field public final h0:Lxd6;

.field public final i0:Lfv5;

.field public final j0:Lxd6;

.field public final k0:Lxy0;

.field public final l0:Ljava/util/HashMap;

.field public m0:Ljava/lang/Boolean;

.field public final n0:Lcc0;

.field public final o0:Ly5;

.field public final p0:Lyr6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "GreedyScheduler"

    .line 2
    .line 3
    invoke-static {v0}, Llh4;->a1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lxy0;Ly5;Lfv5;Lxd6;Ly5;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lhu2;->Y:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lhu2;->g0:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Lfj4;

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-direct {v0, v1}, Lfj4;-><init>(B)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lxd6;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lxd6;-><init>(Lfj4;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lhu2;->h0:Lxd6;

    .line 30
    .line 31
    new-instance v0, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lhu2;->l0:Ljava/util/HashMap;

    .line 37
    .line 38
    iput-object p1, p0, Lhu2;->X:Landroid/content/Context;

    .line 39
    .line 40
    iget-object p1, p2, Lxy0;->h0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lyr2;

    .line 43
    .line 44
    new-instance v0, Lmh1;

    .line 45
    .line 46
    iget-object v1, p2, Lxy0;->g0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lf08;

    .line 49
    .line 50
    invoke-direct {v0, p0, p1, v1}, Lmh1;-><init>(Lhu2;Lyr2;Lf08;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lhu2;->Z:Lmh1;

    .line 54
    .line 55
    new-instance v0, Lyr6;

    .line 56
    .line 57
    invoke-direct {v0, p1, p5}, Lyr6;-><init>(Lyr2;Lxd6;)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lhu2;->p0:Lyr6;

    .line 61
    .line 62
    iput-object p6, p0, Lhu2;->o0:Ly5;

    .line 63
    .line 64
    new-instance p1, Lcc0;

    .line 65
    .line 66
    invoke-direct {p1, p3}, Lcc0;-><init>(Ly5;)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Lhu2;->n0:Lcc0;

    .line 70
    .line 71
    iput-object p2, p0, Lhu2;->k0:Lxy0;

    .line 72
    .line 73
    iput-object p4, p0, Lhu2;->i0:Lfv5;

    .line 74
    .line 75
    iput-object p5, p0, Lhu2;->j0:Lxd6;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final a(Ll49;Lx31;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lv18;->b(Ll49;)Ls39;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p2, Lv31;

    .line 6
    .line 7
    iget-object v1, p0, Lhu2;->j0:Lxd6;

    .line 8
    .line 9
    iget-object v2, p0, Lhu2;->p0:Lyr6;

    .line 10
    .line 11
    iget-object p0, p0, Lhu2;->h0:Lxd6;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lxd6;->j(Ls39;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    invoke-static {}, Llh4;->P0()Llh4;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p1}, Ls39;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lxd6;->L(Ls39;)Lbh7;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v2, p0}, Lyr6;->q(Lbh7;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    invoke-virtual {v1, p0, p1}, Lxd6;->I(Lbh7;Lzv7;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    invoke-static {}, Llh4;->P0()Llh4;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1}, Ls39;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lxd6;->E(Ls39;)Lbh7;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    invoke-virtual {v2, p0}, Lyr6;->b(Lbh7;)V

    .line 63
    .line 64
    .line 65
    check-cast p2, Lw31;

    .line 66
    .line 67
    iget p1, p2, Lw31;->a:I

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, p0, p1}, Lxd6;->J(Lbh7;I)V

    .line 73
    .line 74
    .line 75
    :cond_1
    return-void
.end method

.method public final b(Ls39;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lhu2;->h0:Lxd6;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lxd6;->E(Ls39;)Lbh7;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lhu2;->p0:Lyr6;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lyr6;->b(Lbh7;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lhu2;->g0:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    iget-object v1, p0, Lhu2;->Y:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lbm3;

    .line 24
    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-static {}, Llh4;->P0()Llh4;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-interface {v1, v0}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    if-nez p2, :cond_2

    .line 43
    .line 44
    iget-object p2, p0, Lhu2;->g0:Ljava/lang/Object;

    .line 45
    .line 46
    monitor-enter p2

    .line 47
    :try_start_1
    iget-object p0, p0, Lhu2;->l0:Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    monitor-exit p2

    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p0

    .line 57
    :cond_2
    return-void

    .line 58
    :catchall_1
    move-exception p0

    .line 59
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 60
    throw p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lhu2;->m0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lhu2;->X:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p0, Lhu2;->k0:Lxy0;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ldv5;->a(Landroid/content/Context;Lxy0;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lhu2;->m0:Ljava/lang/Boolean;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-static {}, Llh4;->P0()Llh4;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-boolean v0, p0, Lhu2;->f0:Z

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lhu2;->i0:Lfv5;

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Lfv5;->a(Lp52;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Lhu2;->f0:Z

    .line 44
    .line 45
    :cond_2
    invoke-static {}, Llh4;->P0()Llh4;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lhu2;->Z:Lmh1;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v1, v0, Lmh1;->c:Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ljava/lang/Runnable;

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    iget-object v0, v0, Lmh1;->b:Lyr2;

    .line 67
    .line 68
    iget-object v0, v0, Lyr2;->Y:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Landroid/os/Handler;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object v0, p0, Lhu2;->h0:Lxd6;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-object v1, v0, Lxd6;->Z:Ljava/lang/Object;

    .line 84
    .line 85
    monitor-enter v1

    .line 86
    :try_start_0
    iget-object v0, v0, Lxd6;->Y:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lfj4;

    .line 89
    .line 90
    invoke-virtual {v0, p1}, Lfj4;->b(Ljava/lang/String;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    monitor-exit v1

    .line 95
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Lbh7;

    .line 110
    .line 111
    iget-object v1, p0, Lhu2;->p0:Lyr6;

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Lyr6;->b(Lbh7;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Lhu2;->j0:Lxd6;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const/16 v2, -0x200

    .line 122
    .line 123
    invoke-virtual {v1, v0, v2}, Lxd6;->J(Lbh7;I)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_4
    return-void

    .line 128
    :catchall_0
    move-exception p0

    .line 129
    monitor-exit v1

    .line 130
    throw p0
.end method

.method public final varargs e([Ll49;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lhu2;->m0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lhu2;->X:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p0, Lhu2;->k0:Lxy0;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ldv5;->a(Landroid/content/Context;Lxy0;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lhu2;->m0:Ljava/lang/Boolean;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-static {}, Llh4;->P0()Llh4;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-boolean v0, p0, Lhu2;->f0:Z

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lhu2;->i0:Lfv5;

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Lfv5;->a(Lp52;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Lhu2;->f0:Z

    .line 44
    .line 45
    :cond_2
    new-instance v0, Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v1, Ljava/util/HashSet;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 53
    .line 54
    .line 55
    array-length v2, p1

    .line 56
    const/4 v3, 0x0

    .line 57
    move v4, v3

    .line 58
    :goto_0
    if-ge v4, v2, :cond_b

    .line 59
    .line 60
    aget-object v5, p1, v4

    .line 61
    .line 62
    invoke-static {v5}, Lv18;->b(Ll49;)Ls39;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    iget-object v7, p0, Lhu2;->h0:Lxd6;

    .line 67
    .line 68
    invoke-virtual {v7, v6}, Lxd6;->j(Ls39;)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eqz v6, :cond_3

    .line 73
    .line 74
    goto/16 :goto_2

    .line 75
    .line 76
    :cond_3
    iget-object v6, p0, Lhu2;->g0:Ljava/lang/Object;

    .line 77
    .line 78
    monitor-enter v6

    .line 79
    :try_start_0
    invoke-static {v5}, Lv18;->b(Ll49;)Ls39;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    iget-object v8, p0, Lhu2;->l0:Ljava/util/HashMap;

    .line 84
    .line 85
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    check-cast v8, Lgu2;

    .line 90
    .line 91
    if-nez v8, :cond_4

    .line 92
    .line 93
    new-instance v8, Lgu2;

    .line 94
    .line 95
    iget v9, v5, Ll49;->k:I

    .line 96
    .line 97
    iget-object v10, p0, Lhu2;->k0:Lxy0;

    .line 98
    .line 99
    iget-object v10, v10, Lxy0;->g0:Ljava/lang/Object;

    .line 100
    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 102
    .line 103
    .line 104
    move-result-wide v10

    .line 105
    invoke-direct {v8, v9, v10, v11}, Lgu2;-><init>(IJ)V

    .line 106
    .line 107
    .line 108
    iget-object v9, p0, Lhu2;->l0:Ljava/util/HashMap;

    .line 109
    .line 110
    invoke-virtual {v9, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :catchall_0
    move-exception p0

    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :cond_4
    :goto_1
    iget-wide v9, v8, Lgu2;->b:J

    .line 118
    .line 119
    iget v7, v5, Ll49;->k:I

    .line 120
    .line 121
    iget v8, v8, Lgu2;->a:I

    .line 122
    .line 123
    sub-int/2addr v7, v8

    .line 124
    add-int/lit8 v7, v7, -0x5

    .line 125
    .line 126
    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    int-to-long v7, v7

    .line 131
    const-wide/16 v11, 0x7530

    .line 132
    .line 133
    mul-long/2addr v7, v11

    .line 134
    add-long/2addr v7, v9

    .line 135
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    invoke-virtual {v5}, Ll49;->a()J

    .line 137
    .line 138
    .line 139
    move-result-wide v9

    .line 140
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 141
    .line 142
    .line 143
    move-result-wide v6

    .line 144
    iget-object v8, p0, Lhu2;->k0:Lxy0;

    .line 145
    .line 146
    iget-object v8, v8, Lxy0;->g0:Ljava/lang/Object;

    .line 147
    .line 148
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 149
    .line 150
    .line 151
    move-result-wide v8

    .line 152
    iget-object v10, v5, Ll49;->b:Lu39;

    .line 153
    .line 154
    sget-object v11, Lu39;->X:Lu39;

    .line 155
    .line 156
    if-ne v10, v11, :cond_a

    .line 157
    .line 158
    cmp-long v8, v8, v6

    .line 159
    .line 160
    if-gez v8, :cond_6

    .line 161
    .line 162
    iget-object v8, p0, Lhu2;->Z:Lmh1;

    .line 163
    .line 164
    if-eqz v8, :cond_a

    .line 165
    .line 166
    iget-object v9, v8, Lmh1;->b:Lyr2;

    .line 167
    .line 168
    iget-object v10, v8, Lmh1;->c:Ljava/util/HashMap;

    .line 169
    .line 170
    iget-object v11, v5, Ll49;->a:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v10, v11}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    check-cast v11, Ljava/lang/Runnable;

    .line 177
    .line 178
    if-eqz v11, :cond_5

    .line 179
    .line 180
    iget-object v12, v9, Lyr2;->Y:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v12, Landroid/os/Handler;

    .line 183
    .line 184
    invoke-virtual {v12, v11}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 185
    .line 186
    .line 187
    :cond_5
    new-instance v11, Lzo2;

    .line 188
    .line 189
    const/16 v12, 0x8

    .line 190
    .line 191
    invoke-direct {v11, v12, v8, v5, v3}, Lzo2;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 192
    .line 193
    .line 194
    iget-object v5, v5, Ll49;->a:Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v10, v5, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 200
    .line 201
    .line 202
    move-result-wide v12

    .line 203
    sub-long/2addr v6, v12

    .line 204
    iget-object v5, v9, Lyr2;->Y:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v5, Landroid/os/Handler;

    .line 207
    .line 208
    invoke-virtual {v5, v11, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_6
    sget-object v6, Lp31;->j:Lp31;

    .line 213
    .line 214
    iget-object v7, v5, Ll49;->j:Lp31;

    .line 215
    .line 216
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    if-nez v6, :cond_9

    .line 221
    .line 222
    iget-object v6, v5, Ll49;->j:Lp31;

    .line 223
    .line 224
    iget-boolean v7, v6, Lp31;->d:Z

    .line 225
    .line 226
    if-eqz v7, :cond_7

    .line 227
    .line 228
    invoke-static {}, Llh4;->P0()Llh4;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-virtual {v5}, Ll49;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_7
    invoke-virtual {v6}, Lp31;->b()Z

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    if-eqz v6, :cond_8

    .line 244
    .line 245
    invoke-static {}, Llh4;->P0()Llh4;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-virtual {v5}, Ll49;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_8
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    iget-object v5, v5, Ll49;->a:Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_9
    iget-object v6, p0, Lhu2;->h0:Lxd6;

    .line 266
    .line 267
    invoke-static {v5}, Lv18;->b(Ll49;)Ls39;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    invoke-virtual {v6, v7}, Lxd6;->j(Ls39;)Z

    .line 272
    .line 273
    .line 274
    move-result v6

    .line 275
    if-nez v6, :cond_a

    .line 276
    .line 277
    invoke-static {}, Llh4;->P0()Llh4;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    iget-object v6, p0, Lhu2;->h0:Lxd6;

    .line 285
    .line 286
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-static {v5}, Lv18;->b(Ll49;)Ls39;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-virtual {v6, v5}, Lxd6;->L(Ls39;)Lbh7;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    iget-object v6, p0, Lhu2;->p0:Lyr6;

    .line 298
    .line 299
    invoke-virtual {v6, v5}, Lyr6;->q(Lbh7;)V

    .line 300
    .line 301
    .line 302
    iget-object v6, p0, Lhu2;->j0:Lxd6;

    .line 303
    .line 304
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    const/4 v7, 0x0

    .line 308
    invoke-virtual {v6, v5, v7}, Lxd6;->I(Lbh7;Lzv7;)V

    .line 309
    .line 310
    .line 311
    :cond_a
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 312
    .line 313
    goto/16 :goto_0

    .line 314
    .line 315
    :goto_3
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 316
    throw p0

    .line 317
    :cond_b
    iget-object p1, p0, Lhu2;->g0:Ljava/lang/Object;

    .line 318
    .line 319
    monitor-enter p1

    .line 320
    :try_start_2
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    if-nez v2, :cond_d

    .line 325
    .line 326
    const-string v2, ","

    .line 327
    .line 328
    invoke-static {v2, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    invoke-static {}, Llh4;->P0()Llh4;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    :cond_c
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    if-eqz v1, :cond_d

    .line 347
    .line 348
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    check-cast v1, Ll49;

    .line 353
    .line 354
    invoke-static {v1}, Lv18;->b(Ll49;)Ls39;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    iget-object v3, p0, Lhu2;->Y:Ljava/util/HashMap;

    .line 359
    .line 360
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    if-nez v3, :cond_c

    .line 365
    .line 366
    iget-object v3, p0, Lhu2;->n0:Lcc0;

    .line 367
    .line 368
    iget-object v4, p0, Lhu2;->o0:Ly5;

    .line 369
    .line 370
    iget-object v4, v4, Ly5;->Z:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v4, Lu61;

    .line 373
    .line 374
    invoke-static {v3, v1, v4, p0}, Lk39;->a(Lcc0;Ll49;Lu61;Lha5;)Log7;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    iget-object v3, p0, Lhu2;->Y:Ljava/util/HashMap;

    .line 379
    .line 380
    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    goto :goto_4

    .line 384
    :catchall_1
    move-exception p0

    .line 385
    goto :goto_5

    .line 386
    :cond_d
    monitor-exit p1

    .line 387
    return-void

    .line 388
    :goto_5
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 389
    throw p0
.end method
