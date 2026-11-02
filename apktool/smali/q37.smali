.class public final Lq37;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lu85;


# instance fields
.field public final X:Lu85;

.field public Y:Z

.field public volatile Z:Z

.field public f0:Ler5;


# direct methods
.method public constructor <init>(Laq7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq37;->X:Lu85;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lq37;->Z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lq37;->Z:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lq37;->Z:Z

    .line 17
    .line 18
    iget-boolean v1, p0, Lq37;->Y:Z

    .line 19
    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, Lq37;->f0:Ler5;

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    new-instance v0, Ler5;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lq37;->f0:Ler5;

    .line 32
    .line 33
    :cond_2
    sget-object v1, Lch3;->c:Lmd0;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ler5;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :cond_3
    iput-boolean v0, p0, Lq37;->Y:Z

    .line 41
    .line 42
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    iget-object p0, p0, Lq37;->X:Lu85;

    .line 44
    .line 45
    invoke-interface {p0}, Lu85;->b()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw v0
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lvr3;->c0(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lq37;->Z:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    monitor-enter p0

    .line 10
    :try_start_0
    iget-boolean v0, p0, Lq37;->Z:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lq37;->Z:Z

    .line 20
    .line 21
    iget-boolean v1, p0, Lq37;->Y:Z

    .line 22
    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    iget-object v0, p0, Lq37;->f0:Ler5;

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    new-instance v0, Ler5;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lq37;->f0:Ler5;

    .line 35
    .line 36
    :cond_2
    new-instance v1, Lt65;

    .line 37
    .line 38
    invoke-direct {v1, p1}, Lt65;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ler5;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :cond_3
    iput-boolean v0, p0, Lq37;->Y:Z

    .line 47
    .line 48
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    iget-object p0, p0, Lq37;->X:Lu85;

    .line 50
    .line 51
    invoke-interface {p0, p1}, Lu85;->onError(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p1
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lq37;->Z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lq37;->Z:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto/16 :goto_6

    .line 15
    .line 16
    :cond_1
    iget-boolean v0, p0, Lq37;->Y:Z

    .line 17
    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    iget-object v0, p0, Lq37;->f0:Ler5;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    new-instance v0, Ler5;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lq37;->f0:Ler5;

    .line 30
    .line 31
    :cond_2
    if-nez p1, :cond_3

    .line 32
    .line 33
    sget-object p1, Lch3;->d:Lmd0;

    .line 34
    .line 35
    :cond_3
    invoke-virtual {v0, p1}, Ler5;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :cond_4
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lq37;->Y:Z

    .line 42
    .line 43
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :try_start_1
    iget-object v1, p0, Lq37;->X:Lu85;

    .line 45
    .line 46
    invoke-interface {v1, p1}, Lu85;->onNext(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 47
    .line 48
    .line 49
    :cond_5
    :goto_0
    monitor-enter p0

    .line 50
    :try_start_2
    iget-object v1, p0, Lq37;->f0:Ler5;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    if-nez v1, :cond_6

    .line 54
    .line 55
    iput-boolean v2, p0, Lq37;->Y:Z

    .line 56
    .line 57
    monitor-exit p0

    .line 58
    return-void

    .line 59
    :catchall_1
    move-exception p1

    .line 60
    goto :goto_5

    .line 61
    :cond_6
    const/4 v3, 0x0

    .line 62
    iput-object v3, p0, Lq37;->f0:Ler5;

    .line 63
    .line 64
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 65
    iget-object v1, v1, Ler5;->a:[Ljava/lang/Object;

    .line 66
    .line 67
    array-length v4, v1

    .line 68
    :goto_1
    if-ge v2, v4, :cond_5

    .line 69
    .line 70
    aget-object v5, v1, v2

    .line 71
    .line 72
    if-nez v5, :cond_7

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_7
    :try_start_3
    iget-object v6, p0, Lq37;->X:Lu85;

    .line 76
    .line 77
    sget-object v7, Lch3;->c:Lmd0;

    .line 78
    .line 79
    if-ne v5, v7, :cond_8

    .line 80
    .line 81
    invoke-interface {v6}, Lu85;->b()V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_8
    sget-object v7, Lch3;->d:Lmd0;

    .line 86
    .line 87
    if-ne v5, v7, :cond_9

    .line 88
    .line 89
    invoke-interface {v6, v3}, Lu85;->onNext(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    const-class v8, Lt65;

    .line 98
    .line 99
    if-ne v7, v8, :cond_a

    .line 100
    .line 101
    check-cast v5, Lt65;

    .line 102
    .line 103
    iget-object v1, v5, Lt65;->X:Ljava/lang/Throwable;

    .line 104
    .line 105
    invoke-interface {v6, v1}, Lu85;->onError(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    :goto_2
    iput-boolean v0, p0, Lq37;->Z:Z

    .line 109
    .line 110
    return-void

    .line 111
    :catchall_2
    move-exception v1

    .line 112
    goto :goto_4

    .line 113
    :cond_a
    invoke-interface {v6, v5}, Lu85;->onNext(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 114
    .line 115
    .line 116
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :goto_4
    iput-boolean v0, p0, Lq37;->Z:Z

    .line 120
    .line 121
    invoke-static {v1}, Lvr3;->c0(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    iget-object p0, p0, Lq37;->X:Lu85;

    .line 125
    .line 126
    invoke-static {p1, v1}, Lma5;->a(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 127
    .line 128
    .line 129
    invoke-interface {p0, v1}, Lu85;->onError(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :goto_5
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 134
    throw p1

    .line 135
    :catchall_3
    move-exception v1

    .line 136
    iput-boolean v0, p0, Lq37;->Z:Z

    .line 137
    .line 138
    iget-object p0, p0, Lq37;->X:Lu85;

    .line 139
    .line 140
    invoke-static {v1, p0, p1}, Lvr3;->e0(Ljava/lang/Throwable;Lu85;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :goto_6
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 145
    throw p1
.end method
