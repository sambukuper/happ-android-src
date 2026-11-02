.class public abstract Lg28;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final a(Lkx4;Llp2;I)V
    .locals 7

    .line 1
    const v0, 0x1291a6ac

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x3

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    move v0, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 18
    .line 19
    invoke-virtual {p1, v1, v0}, Llp2;->N(IZ)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    sget-object v0, Lep;->z:Lox1;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ldp;

    .line 32
    .line 33
    iget-object v0, v0, Ldp;->b:Luo;

    .line 34
    .line 35
    iget-wide v0, v0, Luo;->b:J

    .line 36
    .line 37
    sget-object v4, Lu70;->e:Lx03;

    .line 38
    .line 39
    invoke-static {p0, v0, v1, v4}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sget-object v1, Lht;->c:Ldt;

    .line 44
    .line 45
    sget-object v4, Lpz2;->q0:Ln50;

    .line 46
    .line 47
    invoke-static {v1, v4, p1, v2}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-wide v4, p1, Llp2;->T:J

    .line 52
    .line 53
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {p1}, Llp2;->l()Lkl5;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-static {p1, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget-object v6, Luz0;->j:Lpz2;

    .line 66
    .line 67
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Llp2;->Z()V

    .line 71
    .line 72
    .line 73
    iget-boolean v6, p1, Llp2;->S:Z

    .line 74
    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    invoke-virtual {p1}, Llp2;->k()V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {p1}, Llp2;->j0()V

    .line 82
    .line 83
    .line 84
    :goto_1
    sget-object v6, Lpz2;->B0:Ldx0;

    .line 85
    .line 86
    invoke-static {v6, p1, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sget-object v1, Lpz2;->A0:Ldx0;

    .line 90
    .line 91
    invoke-static {v1, p1, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    sget-object v4, Lpz2;->C0:Ldx0;

    .line 99
    .line 100
    invoke-static {v4, p1, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p1}, Lpn7;->l(Llp2;)V

    .line 104
    .line 105
    .line 106
    sget-object v1, Lpz2;->z0:Ldx0;

    .line 107
    .line 108
    invoke-static {v1, p1, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget v0, Ly46;->title_xray_log_files:I

    .line 112
    .line 113
    invoke-static {v0, p1}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 118
    .line 119
    sget-object v4, Lhr;->a:Lox1;

    .line 120
    .line 121
    invoke-virtual {p1, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, Lgr;

    .line 126
    .line 127
    iget-object v4, v4, Lgr;->a:Lsr;

    .line 128
    .line 129
    iget-object v4, v4, Lsr;->a:Lig5;

    .line 130
    .line 131
    invoke-static {v1, v4}, Los4;->w(Lkx4;Lgg5;)Lkx4;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v0, v1, p1, v2}, Loc;->b(Ljava/lang/String;Lkx4;Llp2;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v3}, Llp2;->p(Z)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_2
    invoke-virtual {p1}, Llp2;->Q()V

    .line 143
    .line 144
    .line 145
    :goto_2
    invoke-virtual {p1}, Llp2;->r()Lj86;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-eqz p1, :cond_3

    .line 150
    .line 151
    new-instance v0, Lf80;

    .line 152
    .line 153
    const/4 v1, 0x6

    .line 154
    invoke-direct {v0, p0, p2, v1}, Lf80;-><init>(Lkx4;IB)V

    .line 155
    .line 156
    .line 157
    iput-object v0, p1, Lj86;->d:Lrn2;

    .line 158
    .line 159
    :cond_3
    return-void
.end method

.method public static b(Lfb9;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "GoogleApiHandler"

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string p0, "Must not be called on GoogleApiHandler thread."

    .line 36
    .line 37
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_1
    :goto_0
    const-string v0, "Task must not be null"

    .line 42
    .line 43
    invoke-static {p0, v0}, Lw45;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lfb9;->h()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-static {p0}, Lg28;->o(Lfb9;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_2
    new-instance v0, Lq09;

    .line 58
    .line 59
    invoke-direct {v0}, Lq09;-><init>()V

    .line 60
    .line 61
    .line 62
    sget-object v1, Lb28;->b:Ldp1;

    .line 63
    .line 64
    invoke-virtual {p0, v1, v0}, Lfb9;->c(Ljava/util/concurrent/Executor;Lab5;)V

    .line 65
    .line 66
    .line 67
    new-instance v2, Lna9;

    .line 68
    .line 69
    invoke-direct {v2, v1, v0}, Lna9;-><init>(Ljava/util/concurrent/Executor;Lna5;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, p0, Lfb9;->b:Lo8;

    .line 73
    .line 74
    invoke-virtual {v3, v2}, Lo8;->r(Lza9;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lfb9;->n()V

    .line 78
    .line 79
    .line 80
    new-instance v2, Lna9;

    .line 81
    .line 82
    invoke-direct {v2, v1, v0}, Lna9;-><init>(Ljava/util/concurrent/Executor;Lba5;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v2}, Lo8;->r(Lza9;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lfb9;->n()V

    .line 89
    .line 90
    .line 91
    iget-object v0, v0, Lq09;->X:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Ljava/util/concurrent/CountDownLatch;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 96
    .line 97
    .line 98
    invoke-static {p0}, Lg28;->o(Lfb9;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_3
    const-string p0, "Must not be called on the main application thread"

    .line 104
    .line 105
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-object v2
.end method

.method public static c(Lfb9;J)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq v0, v1, :cond_4

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "GoogleApiHandler"

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string p0, "Must not be called on GoogleApiHandler thread."

    .line 36
    .line 37
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_1
    :goto_0
    const-string v0, "Task must not be null"

    .line 42
    .line 43
    invoke-static {p0, v0}, Lw45;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "TimeUnit must not be null"

    .line 47
    .line 48
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 49
    .line 50
    invoke-static {v1, v0}, Lw45;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lfb9;->h()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-static {p0}, Lg28;->o(Lfb9;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_2
    new-instance v0, Lq09;

    .line 65
    .line 66
    invoke-direct {v0}, Lq09;-><init>()V

    .line 67
    .line 68
    .line 69
    sget-object v2, Lb28;->b:Ldp1;

    .line 70
    .line 71
    invoke-virtual {p0, v2, v0}, Lfb9;->c(Ljava/util/concurrent/Executor;Lab5;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Lna9;

    .line 75
    .line 76
    invoke-direct {v3, v2, v0}, Lna9;-><init>(Ljava/util/concurrent/Executor;Lna5;)V

    .line 77
    .line 78
    .line 79
    iget-object v4, p0, Lfb9;->b:Lo8;

    .line 80
    .line 81
    invoke-virtual {v4, v3}, Lo8;->r(Lza9;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lfb9;->n()V

    .line 85
    .line 86
    .line 87
    new-instance v3, Lna9;

    .line 88
    .line 89
    invoke-direct {v3, v2, v0}, Lna9;-><init>(Ljava/util/concurrent/Executor;Lba5;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v3}, Lo8;->r(Lza9;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lfb9;->n()V

    .line 96
    .line 97
    .line 98
    iget-object v0, v0, Lq09;->X:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Ljava/util/concurrent/CountDownLatch;

    .line 101
    .line 102
    invoke-virtual {v0, p1, p2, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_3

    .line 107
    .line 108
    invoke-static {p0}, Lg28;->o(Lfb9;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :cond_3
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    .line 114
    .line 115
    const-string p1, "Timed out waiting for Task"

    .line 116
    .line 117
    invoke-direct {p0, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :cond_4
    const-string p0, "Must not be called on the main application thread"

    .line 122
    .line 123
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-object v2
.end method

.method public static d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lfb9;
    .locals 3

    .line 1
    const-string v0, "Executor must not be null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw45;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lfb9;

    .line 7
    .line 8
    invoke-direct {v0}, Lfb9;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lzo2;

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    invoke-direct {v1, v0, p1, v2}, Lzo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final i(Lou2;Lfu8;)V
    .locals 7

    .line 1
    iget-object p1, p1, Lfu8;->l0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lhu8;

    .line 15
    .line 16
    instance-of v3, v2, Liu8;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    new-instance v3, Lpi5;

    .line 22
    .line 23
    invoke-direct {v3}, Lpi5;-><init>()V

    .line 24
    .line 25
    .line 26
    check-cast v2, Liu8;

    .line 27
    .line 28
    iget-object v5, v2, Liu8;->Y:Ljava/util/List;

    .line 29
    .line 30
    iput-object v5, v3, Lpi5;->d:Ljava/util/List;

    .line 31
    .line 32
    iput-boolean v4, v3, Lpi5;->n:Z

    .line 33
    .line 34
    invoke-virtual {v3}, Ldt8;->c()V

    .line 35
    .line 36
    .line 37
    iget v5, v2, Liu8;->Z:I

    .line 38
    .line 39
    iget-object v6, v3, Lpi5;->s:Llf;

    .line 40
    .line 41
    iget-object v6, v6, Llf;->a:Landroid/graphics/Path;

    .line 42
    .line 43
    if-ne v5, v4, :cond_0

    .line 44
    .line 45
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    sget-object v5, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 49
    .line 50
    :goto_1
    invoke-virtual {v6, v5}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ldt8;->c()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Ldt8;->c()V

    .line 57
    .line 58
    .line 59
    iget-object v5, v2, Liu8;->f0:Ld90;

    .line 60
    .line 61
    iput-object v5, v3, Lpi5;->b:Ld90;

    .line 62
    .line 63
    invoke-virtual {v3}, Ldt8;->c()V

    .line 64
    .line 65
    .line 66
    iget v5, v2, Liu8;->g0:F

    .line 67
    .line 68
    iput v5, v3, Lpi5;->c:F

    .line 69
    .line 70
    invoke-virtual {v3}, Ldt8;->c()V

    .line 71
    .line 72
    .line 73
    iget-object v5, v2, Liu8;->h0:Ld90;

    .line 74
    .line 75
    iput-object v5, v3, Lpi5;->g:Ld90;

    .line 76
    .line 77
    invoke-virtual {v3}, Ldt8;->c()V

    .line 78
    .line 79
    .line 80
    iget v5, v2, Liu8;->i0:F

    .line 81
    .line 82
    iput v5, v3, Lpi5;->e:F

    .line 83
    .line 84
    invoke-virtual {v3}, Ldt8;->c()V

    .line 85
    .line 86
    .line 87
    iget v5, v2, Liu8;->j0:F

    .line 88
    .line 89
    iput v5, v3, Lpi5;->f:F

    .line 90
    .line 91
    iput-boolean v4, v3, Lpi5;->o:Z

    .line 92
    .line 93
    invoke-virtual {v3}, Ldt8;->c()V

    .line 94
    .line 95
    .line 96
    iget v5, v2, Liu8;->k0:I

    .line 97
    .line 98
    iput v5, v3, Lpi5;->h:I

    .line 99
    .line 100
    iput-boolean v4, v3, Lpi5;->o:Z

    .line 101
    .line 102
    invoke-virtual {v3}, Ldt8;->c()V

    .line 103
    .line 104
    .line 105
    iget v5, v2, Liu8;->l0:I

    .line 106
    .line 107
    iput v5, v3, Lpi5;->i:I

    .line 108
    .line 109
    iput-boolean v4, v3, Lpi5;->o:Z

    .line 110
    .line 111
    invoke-virtual {v3}, Ldt8;->c()V

    .line 112
    .line 113
    .line 114
    iget v5, v2, Liu8;->m0:F

    .line 115
    .line 116
    iput v5, v3, Lpi5;->j:F

    .line 117
    .line 118
    iput-boolean v4, v3, Lpi5;->o:Z

    .line 119
    .line 120
    invoke-virtual {v3}, Ldt8;->c()V

    .line 121
    .line 122
    .line 123
    iget v5, v2, Liu8;->n0:F

    .line 124
    .line 125
    iput v5, v3, Lpi5;->k:F

    .line 126
    .line 127
    iput-boolean v4, v3, Lpi5;->p:Z

    .line 128
    .line 129
    invoke-virtual {v3}, Ldt8;->c()V

    .line 130
    .line 131
    .line 132
    iget v5, v2, Liu8;->o0:F

    .line 133
    .line 134
    iput v5, v3, Lpi5;->l:F

    .line 135
    .line 136
    iput-boolean v4, v3, Lpi5;->p:Z

    .line 137
    .line 138
    invoke-virtual {v3}, Ldt8;->c()V

    .line 139
    .line 140
    .line 141
    iget v2, v2, Liu8;->p0:F

    .line 142
    .line 143
    iput v2, v3, Lpi5;->m:F

    .line 144
    .line 145
    iput-boolean v4, v3, Lpi5;->p:Z

    .line 146
    .line 147
    invoke-virtual {v3}, Ldt8;->c()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v1, v3}, Lou2;->e(ILdt8;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_1
    instance-of v3, v2, Lfu8;

    .line 155
    .line 156
    if-eqz v3, :cond_2

    .line 157
    .line 158
    new-instance v3, Lou2;

    .line 159
    .line 160
    invoke-direct {v3}, Lou2;-><init>()V

    .line 161
    .line 162
    .line 163
    check-cast v2, Lfu8;

    .line 164
    .line 165
    iget-object v5, v2, Lfu8;->X:Ljava/lang/String;

    .line 166
    .line 167
    iput-object v5, v3, Lou2;->k:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v3}, Ldt8;->c()V

    .line 170
    .line 171
    .line 172
    iget v5, v2, Lfu8;->Y:F

    .line 173
    .line 174
    iput v5, v3, Lou2;->l:F

    .line 175
    .line 176
    iput-boolean v4, v3, Lou2;->s:Z

    .line 177
    .line 178
    invoke-virtual {v3}, Ldt8;->c()V

    .line 179
    .line 180
    .line 181
    iget v5, v2, Lfu8;->g0:F

    .line 182
    .line 183
    iput v5, v3, Lou2;->o:F

    .line 184
    .line 185
    iput-boolean v4, v3, Lou2;->s:Z

    .line 186
    .line 187
    invoke-virtual {v3}, Ldt8;->c()V

    .line 188
    .line 189
    .line 190
    iget v5, v2, Lfu8;->h0:F

    .line 191
    .line 192
    iput v5, v3, Lou2;->p:F

    .line 193
    .line 194
    iput-boolean v4, v3, Lou2;->s:Z

    .line 195
    .line 196
    invoke-virtual {v3}, Ldt8;->c()V

    .line 197
    .line 198
    .line 199
    iget v5, v2, Lfu8;->i0:F

    .line 200
    .line 201
    iput v5, v3, Lou2;->q:F

    .line 202
    .line 203
    iput-boolean v4, v3, Lou2;->s:Z

    .line 204
    .line 205
    invoke-virtual {v3}, Ldt8;->c()V

    .line 206
    .line 207
    .line 208
    iget v5, v2, Lfu8;->j0:F

    .line 209
    .line 210
    iput v5, v3, Lou2;->r:F

    .line 211
    .line 212
    iput-boolean v4, v3, Lou2;->s:Z

    .line 213
    .line 214
    invoke-virtual {v3}, Ldt8;->c()V

    .line 215
    .line 216
    .line 217
    iget v5, v2, Lfu8;->Z:F

    .line 218
    .line 219
    iput v5, v3, Lou2;->m:F

    .line 220
    .line 221
    iput-boolean v4, v3, Lou2;->s:Z

    .line 222
    .line 223
    invoke-virtual {v3}, Ldt8;->c()V

    .line 224
    .line 225
    .line 226
    iget v5, v2, Lfu8;->f0:F

    .line 227
    .line 228
    iput v5, v3, Lou2;->n:F

    .line 229
    .line 230
    iput-boolean v4, v3, Lou2;->s:Z

    .line 231
    .line 232
    invoke-virtual {v3}, Ldt8;->c()V

    .line 233
    .line 234
    .line 235
    iget-object v5, v2, Lfu8;->k0:Ljava/util/List;

    .line 236
    .line 237
    iput-object v5, v3, Lou2;->f:Ljava/util/List;

    .line 238
    .line 239
    iput-boolean v4, v3, Lou2;->g:Z

    .line 240
    .line 241
    invoke-virtual {v3}, Ldt8;->c()V

    .line 242
    .line 243
    .line 244
    invoke-static {v3, v2}, Lg28;->i(Lou2;Lfu8;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, v1, v3}, Lou2;->e(ILdt8;)V

    .line 248
    .line 249
    .line 250
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_3
    return-void
.end method

.method public static j([Lgj2;I)Lgj2;
    .locals 10

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x190

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 v0, 0x2bc

    .line 9
    .line 10
    :goto_0
    and-int/lit8 p1, p1, 0x2

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    move p1, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move p1, v1

    .line 19
    :goto_1
    array-length v3, p0

    .line 20
    const/4 v4, 0x0

    .line 21
    const v5, 0x7fffffff

    .line 22
    .line 23
    .line 24
    move v6, v1

    .line 25
    :goto_2
    if-ge v6, v3, :cond_5

    .line 26
    .line 27
    aget-object v7, p0, v6

    .line 28
    .line 29
    iget v8, v7, Lgj2;->c:I

    .line 30
    .line 31
    sub-int/2addr v8, v0

    .line 32
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    mul-int/lit8 v8, v8, 0x2

    .line 37
    .line 38
    iget-boolean v9, v7, Lgj2;->d:Z

    .line 39
    .line 40
    if-ne v9, p1, :cond_2

    .line 41
    .line 42
    move v9, v1

    .line 43
    goto :goto_3

    .line 44
    :cond_2
    move v9, v2

    .line 45
    :goto_3
    add-int/2addr v8, v9

    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    if-le v5, v8, :cond_4

    .line 49
    .line 50
    :cond_3
    move-object v4, v7

    .line 51
    move v5, v8

    .line 52
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_5
    return-object v4
.end method

.method public static k(Ljava/lang/Exception;)Lfb9;
    .locals 1

    .line 1
    new-instance v0, Lfb9;

    .line 2
    .line 3
    invoke-direct {v0}, Lfb9;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static l(Ljava/lang/Object;)Lfb9;
    .locals 1

    .line 1
    new-instance v0, Lfb9;

    .line 2
    .line 3
    invoke-direct {v0}, Lfb9;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lfb9;->j(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final m(Lg73;Llp2;)Landroidx/compose/ui/graphics/vector/VectorPainter;
    .locals 12

    .line 1
    sget-object v0, Ly01;->h:Lox1;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lfi1;

    .line 8
    .line 9
    iget v1, p0, Lg73;->j:I

    .line 10
    .line 11
    int-to-float v1, v1

    .line 12
    invoke-interface {v0}, Lfi1;->getDensity()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    int-to-long v3, v1

    .line 21
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    int-to-long v1, v1

    .line 26
    const/16 v5, 0x20

    .line 27
    .line 28
    shl-long/2addr v3, v5

    .line 29
    const-wide v6, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v1, v6

    .line 35
    or-long/2addr v1, v3

    .line 36
    invoke-virtual {p1, v1, v2}, Llp2;->e(J)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-nez v1, :cond_0

    .line 45
    .line 46
    sget-object v1, Lzz0;->a:Lbe;

    .line 47
    .line 48
    if-ne v2, v1, :cond_4

    .line 49
    .line 50
    :cond_0
    new-instance v1, Lou2;

    .line 51
    .line 52
    invoke-direct {v1}, Lou2;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lg73;->f:Lfu8;

    .line 56
    .line 57
    invoke-static {v1, v2}, Lg28;->i(Lou2;Lfu8;)V

    .line 58
    .line 59
    .line 60
    iget v2, p0, Lg73;->b:F

    .line 61
    .line 62
    iget v3, p0, Lg73;->c:F

    .line 63
    .line 64
    invoke-interface {v0, v2}, Lfi1;->h0(F)F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-interface {v0, v3}, Lfi1;->h0(F)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    int-to-long v2, v2

    .line 77
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    int-to-long v8, v0

    .line 82
    shl-long/2addr v2, v5

    .line 83
    and-long/2addr v8, v6

    .line 84
    or-long/2addr v2, v8

    .line 85
    iget v0, p0, Lg73;->d:F

    .line 86
    .line 87
    iget v4, p0, Lg73;->e:F

    .line 88
    .line 89
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eqz v8, :cond_1

    .line 94
    .line 95
    shr-long v8, v2, v5

    .line 96
    .line 97
    long-to-int v0, v8

    .line 98
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    :cond_1
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_2

    .line 107
    .line 108
    and-long v8, v2, v6

    .line 109
    .line 110
    long-to-int v4, v8

    .line 111
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    :cond_2
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    int-to-long v8, v0

    .line 120
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    int-to-long v10, v0

    .line 125
    shl-long v4, v8, v5

    .line 126
    .line 127
    and-long/2addr v6, v10

    .line 128
    or-long/2addr v4, v6

    .line 129
    new-instance v0, Landroidx/compose/ui/graphics/vector/VectorPainter;

    .line 130
    .line 131
    invoke-direct {v0, v1}, Landroidx/compose/ui/graphics/vector/VectorPainter;-><init>(Lou2;)V

    .line 132
    .line 133
    .line 134
    iget-object v1, p0, Lg73;->a:Ljava/lang/String;

    .line 135
    .line 136
    iget-wide v6, p0, Lg73;->g:J

    .line 137
    .line 138
    iget v8, p0, Lg73;->h:I

    .line 139
    .line 140
    const-wide/16 v9, 0x10

    .line 141
    .line 142
    cmp-long v9, v6, v9

    .line 143
    .line 144
    if-eqz v9, :cond_3

    .line 145
    .line 146
    new-instance v9, Lg60;

    .line 147
    .line 148
    invoke-direct {v9, v6, v7, v8}, Lg60;-><init>(JI)V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_3
    const/4 v9, 0x0

    .line 153
    :goto_0
    iget-boolean p0, p0, Lg73;->i:Z

    .line 154
    .line 155
    new-instance v6, Lua7;

    .line 156
    .line 157
    invoke-direct {v6, v2, v3}, Lua7;-><init>(J)V

    .line 158
    .line 159
    .line 160
    iget-object v2, v0, Landroidx/compose/ui/graphics/vector/VectorPainter;->h0:Lrh5;

    .line 161
    .line 162
    invoke-virtual {v2, v6}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-object v2, v0, Landroidx/compose/ui/graphics/vector/VectorPainter;->i0:Lrh5;

    .line 166
    .line 167
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {v2, p0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    iget-object p0, v0, Landroidx/compose/ui/graphics/vector/VectorPainter;->j0:Ltt8;

    .line 175
    .line 176
    iget-object v2, p0, Ltt8;->g:Lrh5;

    .line 177
    .line 178
    invoke-virtual {v2, v9}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    iget-object v2, p0, Ltt8;->i:Lrh5;

    .line 182
    .line 183
    new-instance v3, Lua7;

    .line 184
    .line 185
    invoke-direct {v3, v4, v5}, Lua7;-><init>(J)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iput-object v1, p0, Ltt8;->c:Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {p1, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    move-object v2, v0

    .line 197
    :cond_4
    check-cast v2, Landroidx/compose/ui/graphics/vector/VectorPainter;

    .line 198
    .line 199
    return-object v2
.end method

.method public static final n(Ljava/lang/CharSequence;[CIII)V
    .locals 2

    .line 1
    instance-of v0, p0, Lh48;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lh48;

    .line 6
    .line 7
    iget-object p0, p0, Lh48;->Z:Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-static {p0, p1, p2, p3, p4}, Lg28;->n(Ljava/lang/CharSequence;[CIII)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :goto_0
    if-ge p3, p4, :cond_1

    .line 14
    .line 15
    add-int/lit8 v0, p2, 0x1

    .line 16
    .line 17
    invoke-interface {p0, p3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    aput-char v1, p1, p2

    .line 22
    .line 23
    add-int/lit8 p3, p3, 0x1

    .line 24
    .line 25
    move p2, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-void
.end method

.method public static o(Lfb9;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lfb9;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lfb9;->g()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-boolean v0, p0, Lfb9;->d:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 17
    .line 18
    const-string v0, "Task is already canceled"

    .line 19
    .line 20
    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    .line 25
    .line 26
    invoke-virtual {p0}, Lfb9;->f()Ljava/lang/Exception;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method


# virtual methods
.method public abstract e(Landroid/content/Context;Lui2;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
.end method

.method public abstract f(Landroid/content/Context;[Lgj2;I)Landroid/graphics/Typeface;
.end method

.method public g(Landroid/content/Context;Ljava/util/List;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "createFromFontInfoWithFallback must only be called on API 29+"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public h(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    invoke-static {p1}, Lu28;->h(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p0, p2, p3}, Lu28;->b(Ljava/io/File;Landroid/content/res/Resources;I)Z

    .line 10
    .line 11
    .line 12
    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :catch_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 37
    .line 38
    .line 39
    return-object p1
.end method
